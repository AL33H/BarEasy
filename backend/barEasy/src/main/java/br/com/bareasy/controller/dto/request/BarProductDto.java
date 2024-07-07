package br.com.bareasy.controller.dto.request;

import br.com.bareasy.model.BarProduct;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DTO for {@link BarProduct}
 */
public record BarProductDto(Long id, String name, String description, boolean active, BigDecimal price,
                            LocalDateTime createdAt, LocalDateTime updatedAt) implements Serializable {
}
