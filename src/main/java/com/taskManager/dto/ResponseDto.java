package com.taskManager.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseDto<T> {
    private String message;
    private int statusCode;
    private T data;  
}
