package com.peerLender.profile.domain.model.utili;

import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
@Getter
@Setter
@Builder

public class BaseTime {

    @CreationTimestamp
    private Date createdAt;


}
