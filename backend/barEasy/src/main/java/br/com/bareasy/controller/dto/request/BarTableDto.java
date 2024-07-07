package br.com.bareasy.controller.dto.request;

import br.com.bareasy.model.BarTable;
import br.com.bareasy.model.enums.TableStatusEnum;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link BarTable}
 */
public record BarTableDto(Long id, int number, TableStatusEnum status, String qrCode, LocalDateTime createdAt,
                          LocalDateTime updatedAt) implements Serializable {
}
