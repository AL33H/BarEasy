package br.com.bareasy.model;

import br.com.bareasy.model.enums.OrderStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class BarOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatusEnum status = OrderStatusEnum.CONSUMING;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes = "";

    @Column(name = "total")
    private BigDecimal total = BigDecimal.ZERO;

    @OneToMany()
    private List<BarOrderItem> items = new ArrayList<>();

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
        this.status = this.status.next();
    }

    public static BarOrder initializeOrder(BarTable barTable, BarConsumer consumer) {
        BarOrder barOrder = new BarOrder();
        barOrder.barTable = barTable;
        barOrder.consumer = List.of(consumer);
        return barOrder;
    }
}
