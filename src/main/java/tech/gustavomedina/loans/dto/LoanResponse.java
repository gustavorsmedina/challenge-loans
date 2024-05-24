package tech.gustavomedina.loans.dto;

import lombok.Builder;
import tech.gustavomedina.loans.enums.LoanType;

@Builder
public record LoanResponse(LoanType loanType, Double interestRate) {
}
