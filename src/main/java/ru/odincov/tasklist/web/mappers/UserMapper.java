package ru.odincov.tasklist.web.mappers;

import org.mapstruct.Mapper;
import ru.odincov.tasklist.domain.user.User;
import ru.odincov.tasklist.web.dto.user.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);

}
