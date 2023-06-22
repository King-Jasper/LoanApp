package com.peerLender.profile.domain.model;

import com.peerLender.profile.domain.model.utili.BaseTime;
import jakarta.persistence.*;


import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User  {
        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  long id;
    private  String firstName;
    private  String lastName;
    private  int age;
    private  String occupation;






}
