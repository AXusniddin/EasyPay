package provider.beeline.service;

import provider.beeline.dto.ResponseDto;
import provider.beeline.dto.UserDto;

public interface UserService {
    ResponseDto paynet(UserDto userDto);

}
