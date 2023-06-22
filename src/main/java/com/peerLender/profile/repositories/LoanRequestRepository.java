package com.peerLender.profile.repositories;

import com.peerLender.profile.domain.model.LoanRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  LoanRequestRepository extends JpaRepository<LoanRequest, Long> {
}
