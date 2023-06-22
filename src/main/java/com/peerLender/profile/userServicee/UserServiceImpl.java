package com.peerLender.profile.userServicee;

import com.peerLender.profile.domain.model.User;
import com.peerLender.profile.dto.UserDto;
import com.peerLender.profile.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto) {
     User user     = mapToEntity(userDto);
     User newUser = userRepository.save(user);
        return mapToDto(newUser);
    }

    private UserDto mapToDto(User newUser) {
        return UserDto.builder()
                .firstName(newUser.getFirstName())
                .lastName(newUser.getLastName())
                .age(newUser.getAge())
                .occupation(newUser.getOccupation())
                .build();
    }

    private User mapToEntity(UserDto userDto) {

        return User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .occupation(userDto.getOccupation())
                .age(userDto.getAge())
                .build();

    }


}
