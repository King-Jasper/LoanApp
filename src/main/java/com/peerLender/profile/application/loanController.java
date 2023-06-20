package com.peerLender.profile.application;

import com.peerLender.profile.domain.model.LoanRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loanController {
    @PostMapping(value="loan/request")
    public void requestLoan(@RequestBody final LoanRequest loanRequest){
        System.out.println(loanRequest);
    }
}
