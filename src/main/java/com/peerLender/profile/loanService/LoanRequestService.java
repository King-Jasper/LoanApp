package com.peerLender.profile.loanService;

import com.peerLender.profile.dto.LoanRequestDto;

public interface LoanRequestService {

    LoanRequestDto createLoanRequest(LoanRequestDto loanRequestDto);
}
