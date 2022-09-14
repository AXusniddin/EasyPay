package provider.beeline.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import provider.beeline.dto.ResponseDto;
import provider.beeline.dto.UserDto;
import provider.beeline.entity.User;
import provider.beeline.mapper.UserMapper;
import provider.beeline.repository.UserRepository;
import provider.beeline.repository.UserRepositoryImpl;
import provider.beeline.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsreServiceImpl implements UserService {

    public final UserRepository userRepository;
    public final UserRepositoryImpl repository;
    public final UserMapper mapper;


    @Override
    public ResponseDto paynet(UserDto userDto) {
        User user = userRepository.findByPhoneNumber(userDto.getPhoneNumber());
        if(user == null){
            return ResponseDto.builder().code(-1).data(user).build();
        }
        return ResponseDto.builder().code(0).data(user).build();
    }
}
