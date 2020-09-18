package com.qr.qlg.stuboot.Service.Impl;

import com.qr.qlg.stuboot.Service.SnackService;
import com.qr.qlg.stuboot.dao.SnackDao;
import com.qr.qlg.stuboot.entity.Snack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SnackServiceImpl implements SnackService {
    @Autowired
    SnackDao snackDao;

    @Override
    public Snack searchById(Integer id) {
        return snackDao.findById(id).get();
    }

    @Override
    public boolean add(Snack snack) {
        Snack newStu=snackDao.save(snack);
        return newStu!=null;
    }

    @Override
    public List<Snack> search() {
        return snackDao.findAll();
    }

    @Override
    public boolean update(Snack stu) {
        Snack newStu=snackDao.save(stu);
        return newStu!=null;
    }


    @Override
    public boolean delete(Integer id) {
        snackDao.deleteById(id);
        return true;
    }

    @Override
    public Snack searchByName(String name) {
        return snackDao.searchByName(name);
    }

    @Override
    public boolean updateByName(Integer num, String name) {
        snackDao.updateByName(num,name);
        return true;
    }


    @Override
    public boolean updateById(Integer id, Integer num) {
        snackDao.updateById(id,num);

        return true;
    }

   /* @Override
    public List<Snack> search(Snack condition) {
        return snackDao.findByGender(condition.getGender());
    }*/

}
