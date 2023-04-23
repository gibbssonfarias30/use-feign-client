package com.backfcdev.useopenfeign.service;

import com.backfcdev.useopenfeign.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();
}
