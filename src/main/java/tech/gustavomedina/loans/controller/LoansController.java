package tech.gustavomedina.loans.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.gustavomedina.loans.dto.LoansRequest;
import tech.gustavomedina.loans.dto.LoansResponse;
import tech.gustavomedina.loans.service.LoansService;

@RestController
@RequestMapping("/v1/customer-loans")
@RequiredArgsConstructor
public class LoansController {

    private final LoansService loansService;

    @PostMapping
    public ResponseEntity<LoansResponse> getLoans(@RequestBody @Valid LoansRequest loansRequest){
        var loans = loansService.getLoans(loansRequest);
        return ResponseEntity.ok(loans);
    }

}
