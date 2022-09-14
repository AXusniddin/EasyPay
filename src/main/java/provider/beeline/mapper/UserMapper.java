package provider.beeline.mapper;

import org.mapstruct.Mapper;
import provider.beeline.dto.UserDto;
import provider.beeline.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDto userDto);

    UserDto toDto(User user);
}
