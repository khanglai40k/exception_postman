package com.devteria.identify_service.dto.request;

//  chuẩn hoá api trả veef nó cụ thể hơn chứ ko phải message nữa

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//những cais nafo null thì ko show
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ApiResponse <T>{ // <> là kiêu nó linh hoạt tham số T là linh hoạt kiu dữ liệu
    private  int code = 1000;
    private String message;
    private T result;
}
