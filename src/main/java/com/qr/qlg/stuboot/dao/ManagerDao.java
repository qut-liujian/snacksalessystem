package com.qr.qlg.stuboot.dao;

import com.qr.qlg.stuboot.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ManagerDao extends JpaRepository<Manager,Integer> {
    @Transactional

    @Query(value ="select password from manager where name=?1", nativeQuery = true)
    String searchByName(String name);
}
