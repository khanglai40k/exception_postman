package com.devteria.identify_service.dto.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// DTO giúp kiểm soát dữ liệu nào được gửi ra ngoài và dữ liệu nào được chấp nhận từ bên ngoài, giảm nguy cơ lộ thông tin nhạy cảm.
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreationRequest {
        private String userName;
        @Size(min = 8, message = "Password must be at least 8 characters")
        private String password;
        private String firstName;

        private String lastName;
        private LocalDate dob;


}
