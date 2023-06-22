package com.peerLender.profile.dto;

import com.peerLender.profile.domain.model.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoanRequestDto {

    private  int amount;
    private User borrowerId;
    private int daysToRepay;
    private  double interestRate;

}
