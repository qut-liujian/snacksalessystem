package com.qr.qlg.stuboot.Service;

import com.qr.qlg.stuboot.entity.Manager;

import java.util.List;

public interface ManagerService {
    Manager searchById(Integer id);

    boolean add(Manager snack);

    List<Manager> search();

    boolean update(Manager snack);

    boolean delete(Integer id);
    String searchByName(String name);
}
