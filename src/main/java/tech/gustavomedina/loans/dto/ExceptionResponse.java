package tech.gustavomedina.loans.dto;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Map;

@Builder
public record ExceptionResponse(
        LocalDateTime date,
        String status,
        String message,
        String path,
        Map<String, String> params) {
}
