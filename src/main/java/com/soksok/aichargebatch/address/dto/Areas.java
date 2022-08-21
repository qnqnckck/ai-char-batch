package com.soksok.aichargebatch.address.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "AREAS")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Areas {
    @Id
    @Column(name="AREA_ID")
    String areaId;
    @Column(name="NAME1")
    String name1;
    @Column(name="NAME2")
    String name2;
    @Column(name="NAME3")
    String name3;
    @Column(name="NAME4")
    String name4;
    @Column(name="NAME5")
    String name5;
    @Column(name="REG_ID")
    String regId;
    @Column(name="REG_NAME")
    String regName;
    @Column(name="REG_DATE")
    LocalDateTime regDate;
    @Column(name="MOD_ID")
    String modId;
    @Column(name="MOD_NAME")
    String modName;
    @Column(name="MOD_DATE")
    LocalDateTime modDate;
    @Column(name="IS_DELETED")
    int isDeleted;
    @Column(name="ORDER_NO")
    int orderNo;
    @Column(name="LONGITUDE")
    Double longitude;
    @Column(name="LATITUDE")
    Double latitude;
}
