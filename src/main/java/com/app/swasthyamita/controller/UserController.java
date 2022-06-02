package com.app.swasthyamita.controller;

import com.app.swasthyamita.model.ResponseStatusDto;
import com.app.swasthyamita.model.userdto.UserLoginDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public ResponseEntity<ResponseStatusDto> userLogin(@RequestBody UserLoginDto userLoginDto) {
        ResponseStatusDto responseStatusDto = new ResponseStatusDto();

        return new ResponseEntity<ResponseStatusDto>(responseStatusDto, HttpStatus.OK);
    }
}
