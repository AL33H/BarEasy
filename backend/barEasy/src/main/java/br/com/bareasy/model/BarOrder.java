package br.com.bareasy.model;

import br.com.bareasy.model.enums.OrderStatusEnum;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class BarOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatusEnum status;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name = "total")
    private BigDecimal total;

    @OneToMany()
    private List<BarOrderItem> items;

    @OneToOne
    @JoinColumn(name = "table_id")
    private BarTable barTable;

    @OneToMany
    @JoinColumn(name = "consumers")
    private List<BarConsumer> consumer;

    @Column(name = "created_at")
    @CreationTimestamp()
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp()
    private LocalDateTime updatedAt;

    public void nextState() {
        this.status.next();
    }
}
