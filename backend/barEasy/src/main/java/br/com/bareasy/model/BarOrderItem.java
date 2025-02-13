package br.com.bareasy.model;

import br.com.bareasy.model.enums.OrderItemStatusEnum;
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

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class BarOrderItem implements Serializable {

    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "barorder_id")
    private BarOrder barOrder;

    @ManyToOne
    @JoinColumn(name = "barproduct_id")
    private BarProduct product;

    @Enumerated(EnumType.STRING)
    private OrderItemStatusEnum status;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "subtotal")
    private BigDecimal subtotal;

    @Column(name = "created_at")
    @CreationTimestamp()
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp()
    private LocalDateTime updatedAt;

}
