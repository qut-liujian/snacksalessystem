package com.qr.qlg.stuboot.Service.Impl;

import com.qr.qlg.stuboot.Service.ManagerService;
import com.qr.qlg.stuboot.dao.ManagerDao;
import com.qr.qlg.stuboot.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    ManagerDao managerDao;

    @Override
    public Manager searchById(Integer id) {
        return managerDao.findById(id).get();
    }

    @Override
    public boolean add(Manager stu) {
        Manager newStu=managerDao.save(stu);
        return newStu!=null;
    }

    @Override
    public List<Manager> search() {
        return managerDao.findAll();
    }

    @Override
    public boolean update(Manager stu) {
        Manager newStu=managerDao.save(stu);

        return newStu!=null;
    }


    @Override
    public boolean delete(Integer id) {
        managerDao.deleteById(id);
        return true;
    }

    @Override
    public String searchByName(String name) {
        return managerDao.searchByName(name);
    }
/*
    @Override
    public List<Manager> search(Student condition) {
        return managerDao.findByGender(condition.getGender());
    }*/

}
