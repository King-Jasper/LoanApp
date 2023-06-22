package com.peerLender.profile.loanServiceImpl;

import com.peerLender.profile.domain.model.LoanRequest;
import com.peerLender.profile.dto.LoanRequestDto;
import com.peerLender.profile.loanService.LoanRequestService;
import com.peerLender.profile.repositories.LoanRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanRequestServiceImp implements LoanRequestService {

    private  final LoanRequestRepository loanRequestRepository;
    @Override
    public LoanRequestDto createLoanRequest(LoanRequestDto loanRequestDto) {
        LoanRequest loanRequest = mapToEntity(loanRequestDto);
        var newLoanRequest = loanRequestRepository.save(loanRequest);
        return mapToDto(newLoanRequest);
    }




    private LoanRequestDto mapToDto(LoanRequest newLoanRequest) {
        return  LoanRequestDto.builder()
                .amount(newLoanRequest.getAmount())
                .borrowerId(newLoanRequest.getBorrowerId())
                .interestRate(newLoanRequest.getInterestRate())
                .daysToRepay(newLoanRequest.getDaysToRepay())

                .build();

    }

    private LoanRequest mapToEntity(LoanRequestDto loanRequestDto) {
        return  LoanRequest.builder()
                .amount(loanRequestDto.getAmount())
                .borrowerId(loanRequestDto.getBorrowerId())
                .interestRate(loanRequestDto.getInterestRate())
                .daysToRepay(loanRequestDto.getDaysToRepay())

                .build();


    }
}
