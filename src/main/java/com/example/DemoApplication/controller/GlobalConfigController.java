//
//package com.example.DemoApplication.controller;
//
//import com.example.DemoApplication.entity.GlobalConfig;
//import com.example.DemoApplication.service.GlobalConfigService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
///**
// * Controller for managing Global Configs.
// */
//@RestController
//@RequestMapping("/api/global-configs")
//public class GlobalConfigController {
//
//    private final GlobalConfigService globalConfigService;
//
//    @Autowired
//    public GlobalConfigController(GlobalConfigService globalConfigService) {
//        this.globalConfigService = globalConfigService;
//    }
//
//    /**
//     * Retrieves all Global Configs.
//     *
//     * @return List of Global Configs.
//     */
//    @GetMapping
//    public List<GlobalConfig> getAllGlobalConfigs() {
//        return globalConfigService.findAll();
//    }
//
//    /**
//     * Retrieves a Global Config by ID.
//     *
//     * @param id ID of the Global Config.
//     * @return Optional Global Config.
//     */
//    @GetMapping("/{id}")
//    public Optional<GlobalConfig> getGlobalConfigById(@PathVariable String id) {
//        return globalConfigService.findById(Long.valueOf(id));
//    }
//
//    /**
//     * Creates a new Global Config.
//     *
//     * @param globalConfig Global Config to create.
//     * @return Created Global Config.
//     */
////    @PostMapping
////    public GlobalConfig createGlobalConfig(@RequestBody GlobalConfig globalConfig) {
////        return globalConfigService.save(globalConfig);
////    }
//    @PostMapping
//    public ResponseEntity<GlobalConfig> createGlobalConfig(@RequestBody GlobalConfig globalConfig) {
//        GlobalConfig savedConfig = globalConfigService.save(globalConfig);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedConfig);
//    }
//
//
//    /**
//     * Updates an existing Global Config.
//     *
//     * @param id ID of the Global Config.
//     * @param globalConfig Global Config to update.
//     * @return Updated Global Config.
//     */
//    @PutMapping("/{id}")
//    public GlobalConfig updateGlobalConfig(@PathVariable String id, @RequestBody GlobalConfig globalConfig) {
//        globalConfig.setId(Long.valueOf(id));
//        return globalConfigService.save(globalConfig);
//    }
//
//    /**
//     * Deletes a Global Config by ID.
//     *
//     * @param id ID of the Global Config.
//     */
//    @DeleteMapping("/{id}")
//    public void deleteGlobalConfig(@PathVariable String id) {
//        globalConfigService.deleteById(Long.valueOf(id));
//    }
//}



package com.example.DemoApplication.controller;

import com.example.DemoApplication.entity.GlobalConfig;
import com.example.DemoApplication.service.GlobalConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controller for managing Global Configs.
 */
@RestController
@RequestMapping("/api/global-configs")
public class GlobalConfigController {

    private final GlobalConfigService globalConfigService;

    @Autowired
    public GlobalConfigController(GlobalConfigService globalConfigService) {
        this.globalConfigService = globalConfigService;
    }

    @GetMapping
    public List<GlobalConfig> getAllGlobalConfigs() {
        return globalConfigService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalConfig> getGlobalConfigById(@PathVariable String id) {
        Optional<GlobalConfig> config = globalConfigService.findById(Long.valueOf(id));
        return config.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<GlobalConfig> createGlobalConfig(@RequestBody GlobalConfig globalConfig) {
        GlobalConfig savedConfig = globalConfigService.save(globalConfig);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedConfig);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalConfig> updateGlobalConfig(@PathVariable String id, @RequestBody GlobalConfig globalConfig) {
        globalConfig.setId(String.valueOf(Long.valueOf(id)));
        GlobalConfig updatedConfig = globalConfigService.save(globalConfig);
        return ResponseEntity.ok(updatedConfig);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGlobalConfig(@PathVariable String id) {
        globalConfigService.deleteById(Long.valueOf(id));
        return ResponseEntity.noContent().build();
    }
}
