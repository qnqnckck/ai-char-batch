package com.soksok.aichargebatch.address.repository;

import com.soksok.aichargebatch.address.dto.Areas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AreasRepository extends JpaRepository<Areas, String> {
//    @Query("SELECT a FROM AREAS a WHERE a.name1=?1 AND a.name2=?2 AND a.name3 IS NULL")
//    Optional<Areas> findAreasByNameField(String name1, String name2);
//
//    @Query("SELECT a FROM AREAS a WHERE a.name1=?1 AND a.name2=?2 AND a.name3=?3 AND a.name4  IS NULL")
//    Optional<Areas> findAreasByNameField(String name1, String name2, String name3);
//
//    @Query("SELECT a FROM AREAS a WHERE a.name1=?1 AND a.name2=?2 AND a.name3=?3 AND a.name4=?4 AND a.name5 IS NULL")
//    Optional<Areas> findAreasByNameField(String name1, String name2, String name3, String name4);
//
//    @Query("SELECT a FROM AREAS a WHERE a.name1=?1 AND a.name2=?2 AND a.name3=?3 AND a.name4=?4 AND a.name5=?5")
//    Optional<Areas> findAreasByNameField(String name1, String name2, String name3, String name4, String name5);
}
