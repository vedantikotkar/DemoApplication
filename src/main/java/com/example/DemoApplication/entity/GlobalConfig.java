////
////package com.example.DemoApplication.entity;
////
////import jakarta.persistence.*;
////import com.fasterxml.jackson.annotation.JsonProperty;
////import lombok.Setter;
////
////import java.sql.Timestamp;
////
////@Entity
////@Table(name = "global_config")
////public class GlobalConfig {
////
////    @Setter
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    @Column(name = "id", nullable = false, updatable = false)
////    private Long id;
////
////
////    @Column(name = "`key`", nullable = false)
////    private String key;
////
////    @Column(name = "value", nullable = false)
////    private String value;
////
////    @JsonProperty("active")
////    @Column(name = "is_active", nullable = false)
////    private boolean isActive;
////
////    @JsonProperty("deleted")
////    @Column(name = "is_deleted", nullable = false)
////    private boolean isDeleted;
////
////    @Column(name = "ref_id")
////    private String refId;
////
////    @Column(name = "expires_on")
////    private Timestamp expiresOn;
////
////    @Column(name = "created_on")
////    private Timestamp createdOn;
////
////    @Column(name = "modified_on")
////    private Timestamp modifiedOn;
////
////    @Column(name = "created_by")
////    private String createdBy;
////
////    @Column(name = "modified_by")
////    private String modifiedBy;
////
////    // Getters and Setters
////
////    public Long getId() {
////        return id;
////    }
////
////    public String getKey() {
////        return key;
////    }
////
////    public void setKey(String key) {
////        this.key = key;
////    }
////
////    public String getValue() {
////        return value;
////    }
////
////    public void setValue(String value) {
////        this.value = value;
////    }
////
////    public boolean isActive() {
////        return isActive;
////    }
////
////    public void setActive(boolean isActive) {
////        this.isActive = isActive;
////    }
////
////    public boolean isDeleted() {
////        return isDeleted;
////    }
////
////    public void setDeleted(boolean isDeleted) {
////        this.isDeleted = isDeleted;
////    }
////
////    public String getRefId() {
////        return refId;
////    }
////
////    public void setRefId(String refId) {
////        this.refId = refId;
////    }
////
////    public Timestamp getExpiresOn() {
////        return expiresOn;
////    }
////
////    public void setExpiresOn(Timestamp expiresOn) {
////        this.expiresOn = expiresOn;
////    }
////
////    public Timestamp getCreatedOn() {
////        return createdOn;
////    }
////
////    public void setCreatedOn(Timestamp createdOn) {
////        this.createdOn = createdOn;
////    }
////
////    public Timestamp getModifiedOn() {
////        return modifiedOn;
////    }
////
////    public void setModifiedOn(Timestamp modifiedOn) {
////        this.modifiedOn = modifiedOn;
////    }
////
////    public String getCreatedBy() {
////        return createdBy;
////    }
////
////    public void setCreatedBy(String createdBy) {
////        this.createdBy = createdBy;
////    }
////
////    public String getModifiedBy() {
////        return modifiedBy;
////    }
////
////    public void setModifiedBy(String modifiedBy) {
////        this.modifiedBy = modifiedBy;
////    }
////}
//
//
//
//
//
//package com.example.DemoApplication.entity;
//
//import jakarta.persistence.*;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.Setter;
//
//import java.sql.Timestamp;
//
//@Entity
//@Table(name = "global_config")
//public class GlobalConfig {
//
//    @Setter
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false, updatable = false)
//    private Long id;
//
//    @Column(name = "`key`", nullable = false)
//    private String key;
//
//    @Column(name = "value", nullable = false)
//    private String value;
//
//    @JsonProperty("active")
//    @Column(name = "is_active", nullable = false)
//    private boolean isActive;
//
//    @JsonProperty("deleted")
//    @Column(name = "is_deleted", nullable = false)
//    private boolean isDeleted;
//
//    @Column(name = "ref_id")
//    private String refId;
//
//    @Column(name = "expires_on")
//    private Timestamp expiresOn;
//
//    @Column(name = "created_on")
//    private Timestamp createdOn;
//
//    @Column(name = "modified_on")
//    private Timestamp modifiedOn;
//
//    @Column(name = "created_by")
//    private String createdBy;
//
//    @Column(name = "modified_by")
//    private String modifiedBy;
//
//    // Getters and Setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public void setKey(String key) {
//        this.key = key;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public boolean isActive() {
//        return isActive;
//    }
//
//    public void setActive(boolean isActive) {
//        this.isActive = isActive;
//    }
//
//    public boolean isDeleted() {
//        return isDeleted;
//    }
//
//    public void setDeleted(boolean isDeleted) {
//        this.isDeleted = isDeleted;
//    }
//
//    public String getRefId() {
//        return refId;
//    }
//
//    public void setRefId(String refId) {
//        this.refId = refId;
//    }
//
//    public Timestamp getExpiresOn() {
//        return expiresOn;
//    }
//
//    public void setExpiresOn(Timestamp expiresOn) {
//        this.expiresOn = expiresOn;
//    }
//
//    public Timestamp getCreatedOn() {
//        return createdOn;
//    }
//
//    public void setCreatedOn(Timestamp createdOn) {
//        this.createdOn = createdOn;
//    }
//
//    public Timestamp getModifiedOn() {
//        return modifiedOn;
//    }
//
//    public void setModifiedOn(Timestamp modifiedOn) {
//        this.modifiedOn = modifiedOn;
//    }
//
//    public String getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(String createdBy) {
//        this.createdBy = createdBy;
//    }
//
//    public String getModifiedBy() {
//        return modifiedBy;
//    }
//
//    public void setModifiedBy(String modifiedBy) {
//        this.modifiedBy = modifiedBy;
//    }
//}



package com.example.DemoApplication.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;

@Entity
@Table(name = "global_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalConfig {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "`key`", nullable = false)
    private String key;

    @Column(name = "value", nullable = false)
    private String value;

    @JsonProperty("active")
    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @JsonProperty("deleted")
    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;

    @Column(name = "ref_id")
    private String refId;

    @Column(name = "expires_on")
    private Timestamp expiresOn;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "modified_on")
    private Timestamp modifiedOn;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modified_by")
    private String modifiedBy;
}
