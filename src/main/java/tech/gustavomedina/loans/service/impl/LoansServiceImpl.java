package tech.gustavomedina.loans.service.impl;

import org.springframework.stereotype.Service;
import tech.gustavomedina.loans.dto.LoanResponse;
import tech.gustavomedina.loans.dto.LoansRequest;
import tech.gustavomedina.loans.dto.LoansResponse;
import tech.gustavomedina.loans.enums.LoanType;
import tech.gustavomedina.loans.service.LoansService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoansServiceImpl implements LoansService {

    @Override
    public LoansResponse getLoans(LoansRequest loansRequest) {

        List<LoanResponse> loans = new ArrayList<>();

        if(loansRequest.income().compareTo(new BigDecimal(3000)) <= 0){

            addLoan(loans, LoanType.PERSONAL, 4D);
            addLoan(loans, LoanType.GUARANTEED, 3D);
        }

        if(loansRequest.income().compareTo(new BigDecimal(3000)) >= 0
                && loansRequest.income().compareTo(new BigDecimal(5000)) <= 0
                && loansRequest.age() < 30
                && loansRequest.location().equalsIgnoreCase("SP")){

            addLoan(loans, LoanType.PERSONAL, 4D);
            addLoan(loans, LoanType.GUARANTEED, 3D);
        }

        if(loansRequest.income().compareTo(new BigDecimal(5000)) >= 0){

            addLoan(loans, LoanType.CONSIGNMENT, 2D);
        }

        return LoansResponse.builder()
                .customer(loansRequest.name())
                .loans(loans)
                .build();
    }

    public void addLoan(List<LoanResponse> loans, LoanType loanType, double interestRate){
        var loan = LoanResponse.builder()
                .loanType(loanType)
                .interestRate(interestRate)
                .build();

        loans.add(loan);
    }

}
