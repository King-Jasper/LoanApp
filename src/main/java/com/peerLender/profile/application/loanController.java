package com.peerLender.profile.application;

import com.peerLender.profile.domain.model.LoanRequest;
import com.peerLender.profile.domain.model.User;
import com.peerLender.profile.dto.LoanRequestDto;
import com.peerLender.profile.dto.UserDto;
import com.peerLender.profile.loanService.LoanRequestService;
import com.peerLender.profile.repositories.LoanRequestRepository;
import com.peerLender.profile.repositories.UserRepository;
import com.peerLender.profile.userServicee.UserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Builder

@RequiredArgsConstructor
public class loanController {


    private final LoanRequestService loanRequestService;

    private final UserService userService;

    @PostMapping(value = "/loan/request")
    public ResponseEntity<LoanRequestDto> requestLoan(@RequestBody LoanRequestDto loanRequestDto) {
         LoanRequestDto  response = loanRequestService.createLoanRequest(loanRequestDto);
   return  new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto) {
        UserDto  response = userService.createUser(userDto);
        return  new ResponseEntity<>(response, HttpStatus.CREATED);
    }




//    @GetMapping(value = "/users")
//    public List<User> findUsers() {
//
//    }
}