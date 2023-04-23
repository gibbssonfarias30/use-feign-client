package com.backfcdev.useopenfeign.client;

import com.backfcdev.useopenfeign.config.FeignClientConfig;
import com.backfcdev.useopenfeign.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base.url}", configuration = FeignClientConfig.class)
public interface IUserFeignClient {
    @GetMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<UserDTO> getUsers();
}
