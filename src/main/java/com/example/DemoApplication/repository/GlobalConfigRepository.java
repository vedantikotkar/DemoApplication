//package com.example.DemoApplication.repository;
//
//import com.example.DemoApplication.entity.GlobalConfig;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface GlobalConfigRepository extends JpaRepository<GlobalConfig, Long> {
//
//}


package com.example.DemoApplication.repository;

import com.example.DemoApplication.entity.GlobalConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalConfigRepository extends JpaRepository<GlobalConfig, Long> {

}
