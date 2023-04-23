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

    @Override
    public UserDTO save(UserDTO user) {
        return client.saveUser(user);
    }

    @Override
    public UserDTO update(Integer id, UserDTO user) {
        return client.updateUser(id, user);
    }

    @Override
    public void delete(Integer id) {
        client.deleteUser(id);
    }
}
