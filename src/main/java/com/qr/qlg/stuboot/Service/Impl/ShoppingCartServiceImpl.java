package com.qr.qlg.stuboot.Service.Impl;

import com.qr.qlg.stuboot.Service.ShoppingCartService;
import com.qr.qlg.stuboot.Service.SnackService;
import com.qr.qlg.stuboot.dao.ShoppingCartDao;
import com.qr.qlg.stuboot.dao.SnackDao;
import com.qr.qlg.stuboot.entity.ShoppingCart;
import com.qr.qlg.stuboot.entity.Snack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    ShoppingCartDao snackDao;

    @Override
    public ShoppingCart searchById(Integer id) {
        return snackDao.findById(id).get();
    }

    @Override
    public boolean add(ShoppingCart snack) {
        ShoppingCart newStu=snackDao.save(snack);
        return newStu!=null;
    }

    @Override
    public List<ShoppingCart> search() {
        return snackDao.findAll();
    }

    @Override
    public boolean update(ShoppingCart stu) {
        ShoppingCart newStu=snackDao.save(stu);
        return newStu!=null;
    }


    @Override
    public boolean delete(Integer id) {
        snackDao.deleteById(id);
        return true;
    }


  /*  @Override
    public boolean updateById(Integer id, Integer num) {
        snackDao.updateById(id,num);

        return true;
    }
*/
   /* @Override
    public List<Snack> search(Snack condition) {
        return snackDao.findByGender(condition.getGender());
    }*/

}
