//////package com.example.DemoApplication.service;
//////
//////
//////
//////import com.example.DemoApplication.entity.GlobalConfig;
//////import com.example.DemoApplication.repository.GlobalConfigRepository;
//////import org.springframework.beans.factory.annotation.Autowired;
//////import org.springframework.stereotype.Service;
//////
//////import java.util.List;
//////import java.util.Optional;
//////
//////@Service
//////public class GlobalConfigService {
//////
//////    @Autowired
//////    private GlobalConfigRepository globalConfigRepository;
//////
//////    public List<GlobalConfig> findAll() {
//////        return globalConfigRepository.findAll();
//////    }
//////
//////    public Optional<GlobalConfig> findById(String id) {
//////        return globalConfigRepository.findById(id);
//////    }
//////
//////    public GlobalConfig save(GlobalConfig globalConfig) {
//////        return globalConfigRepository.save(globalConfig);
//////    }
//////
//////    public void deleteById(String id) {
//////        globalConfigRepository.deleteById(id);
//////    }
//////}
////
////
////
////package com.example.DemoApplication.service;
////
////import com.example.DemoApplication.entity.GlobalConfig;
////import com.example.DemoApplication.repository.GlobalConfigRepository;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import java.util.List;
////import java.util.Optional;
////
////@Service
////public class GlobalConfigService {
////
////    @Autowired
////    private GlobalConfigRepository globalConfigRepository;
////
////    public List<GlobalConfig> findAll() {
////        return globalConfigRepository.findAll();
////    }
////
////    public Optional<GlobalConfig> findById(Long id) {
////        return globalConfigRepository.findById(id);
////    }
////
////    public GlobalConfig save(GlobalConfig globalConfig) {
////        return globalConfigRepository.save(globalConfig);
////    }
////
////    public void deleteById(Long id) {
////        globalConfigRepository.deleteById(id);
////    }
////}
//
//
//
//package com.example.DemoApplication.service;
//
//import com.example.DemoApplication.entity.GlobalConfig;
//import com.example.DemoApplication.repository.GlobalConfigRepository;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.core.Authentication;
////import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Service;
//
//import java.sql.Timestamp;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class GlobalConfigService {
//
//    private final GlobalConfigRepository globalConfigRepository;
//
//    @Autowired
//    public GlobalConfigService(GlobalConfigRepository globalConfigRepository) {
//        this.globalConfigRepository = globalConfigRepository;
//    }
//
//    public List<GlobalConfig> findAll() {
//        return globalConfigRepository.findAll();
//    }
//
//    public Optional<GlobalConfig> findById(Long id) {
//        return globalConfigRepository.findById(id);
//    }
//
//    public GlobalConfig save(GlobalConfig globalConfig) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName();
//
//        if (globalConfig.getId() == null) {
//            // New entity
//            globalConfig.setCreatedBy(username);
//            globalConfig.setCreatedOn(new Timestamp(System.currentTimeMillis()));
//        } else {
//            // Existing entity
//            globalConfig.setModifiedBy(username);
//            globalConfig.setModifiedOn(new Timestamp(System.currentTimeMillis()));
//        }
//
//        return globalConfigRepository.save(globalConfig);
//    }
//
//    public void deleteById(Long id) {
//        globalConfigRepository.deleteById(id);
//    }
//}




package com.example.DemoApplication.service;

import com.example.DemoApplication.entity.GlobalConfig;
import com.example.DemoApplication.repository.GlobalConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GlobalConfigService {

    private final GlobalConfigRepository globalConfigRepository;

    @Autowired
    public GlobalConfigService(GlobalConfigRepository globalConfigRepository) {
        this.globalConfigRepository = globalConfigRepository;
    }

    public List<GlobalConfig> findAll() {
        return globalConfigRepository.findAll();
    }

    public Optional<GlobalConfig> findById(Long id) {
        return globalConfigRepository.findById(id);
    }

    public GlobalConfig save(GlobalConfig globalConfig) {
        return globalConfigRepository.save(globalConfig);
    }

    public void deleteById(Long id) {
        globalConfigRepository.deleteById(id);
    }
}
