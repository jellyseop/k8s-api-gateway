package com.welab.k8s_api_gateway.api.open;

import com.welab.k8s_api_gateway.common.dto.ApiResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api/gateway/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class GatewayController {

    @GetMapping("/hello")
    public ApiResponseDto<String> test() {
        return ApiResponseDto.createOk("hello k8s");
    }
}
