package com.peerLender.profile.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder

public class User {


    private final String firstName;
    private final String lastName;
    private final int age;
    private final String occupation;



}
