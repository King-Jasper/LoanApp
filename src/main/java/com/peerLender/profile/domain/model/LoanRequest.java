package com.peerLender.profile.domain.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.Duration;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LoanRequest {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private  int amount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id" )
    private User borrowerId;
    private int daysToRepay;
    private  double interestRate;
}
