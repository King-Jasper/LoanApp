package com.peerLender.profile.userServicee;

import com.peerLender.profile.domain.model.User;
import com.peerLender.profile.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
