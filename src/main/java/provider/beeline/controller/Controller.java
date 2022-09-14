package provider.beeline.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import provider.beeline.dto.ResponseDto;
import provider.beeline.dto.UserDto;
import provider.beeline.service.UserService;

@RestController
@RequestMapping("/beeline")
@RequiredArgsConstructor
public class Controller {

    private final UserService userService;

    @GetMapping()
    public ResponseDto phone(@RequestBody UserDto userDto){
        return userService.paynet(userDto);
    }
}
