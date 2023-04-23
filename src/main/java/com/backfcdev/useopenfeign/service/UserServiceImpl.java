package com.backfcdev.useopenfeign.service;

import com.backfcdev.useopenfeign.client.IUserFeignClient;
import com.backfcdev.useopenfeign.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements IUserService {

    private final IUserFeignClient client;

    @Override
    public List<UserDTO> findAll() {
        return client.getUsers();
    }
}
