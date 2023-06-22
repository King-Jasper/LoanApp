package com.peerLender.profile.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {
    private  String firstName;
    private  String lastName ;
    private  int age;
    private  String occupation;
}
