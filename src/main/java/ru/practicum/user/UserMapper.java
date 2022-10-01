package ru.practicum.user;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class UserMapper {
    public static User ToUser(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setState(userDto.getState());
        return user;
    }

    public static UserDto ToUserDto(User user) {
        String regDate = DateTimeFormatter
                .ofPattern("yyyy.MM.dd hh:mm:ss")
                .withZone(ZoneOffset.UTC)
                .format(user.getRegistrationDate());

        return new UserDto(user.getId(), user.getEmail(), user.getFirstName(), user.getLastName(), regDate, user.getState());
    }
}
