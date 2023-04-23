package com.backfcdev.useopenfeign.controller;

import com.backfcdev.useopenfeign.dto.UserDTO;
import com.backfcdev.useopenfeign.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final IUserService userService;

    @GetMapping
    ResponseEntity<List<UserDTO>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

}
