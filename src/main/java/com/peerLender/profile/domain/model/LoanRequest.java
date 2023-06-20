package com.peerLender.profile.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
@Getter
@Setter
@Builder
public class LoanRequest {
    private final int amount;
    private final User borrower;
    private final Duration RepaymentTerm;
    private final double interestRate;


}
