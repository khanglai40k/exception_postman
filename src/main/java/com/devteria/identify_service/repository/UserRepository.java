package com.devteria.identify_service.repository;

import com.devteria.identify_service.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//thao tác CRUD ko cần viết công lệnh vì cái thằng Jpa.. nó có sẵn các method CRUD rồi
@Repository
public interface UserRepository extends JpaRepository<User, String> {  //tham số đầu là cái tên bảng, tham số 2 là kiểu dữ liệu


//    định nghĩa method tồn tại username
    boolean existsByUserName(String userName);
}
