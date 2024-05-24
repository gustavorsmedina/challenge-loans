package tech.gustavomedina.loans.service;

import tech.gustavomedina.loans.dto.LoansRequest;
import tech.gustavomedina.loans.dto.LoansResponse;

public interface LoansService{

    LoansResponse getLoans(LoansRequest loansRequest);

}
