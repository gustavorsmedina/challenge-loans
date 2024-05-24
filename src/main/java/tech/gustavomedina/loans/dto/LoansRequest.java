package tech.gustavomedina.loans.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;

public record LoansRequest(
        @Min(value = 18, message = "Age must be greater than 18.")
        @NotNull(message = "Age can't be null.")
        Integer age,

        @CPF(message = "Invalid CPF.")
        @NotBlank(message = "CPF can't be blank.")
        String cpf,

        @NotBlank(message = "Name can't be blank.")
        String name,

        @Positive(message = "Income must be positive.")
        @NotNull(message = "Income can't be null.")
        BigDecimal income,

        @NotBlank(message = "Location can't be blank.")
        String location) {
}
