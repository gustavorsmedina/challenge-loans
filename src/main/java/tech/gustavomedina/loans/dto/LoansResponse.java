package tech.gustavomedina.loans.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record LoansResponse(String customer, List<LoanResponse> loans) {
}