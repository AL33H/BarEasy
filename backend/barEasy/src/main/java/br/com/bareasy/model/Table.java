package br.com.bareasy.model;

import br.com.bareasy.model.enums.TableStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Table {

    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "status")
    private TableStatusEnum status;

    @Column(name = "qr_code")
    private String qrCode;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
