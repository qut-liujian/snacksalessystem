package com.qr.qlg.stuboot.Service;

import com.qr.qlg.stuboot.entity.ShoppingCart;
import com.qr.qlg.stuboot.entity.Snack;

import java.util.List;

public interface ShoppingCartService {
    ShoppingCart searchById(Integer id);

    boolean add(ShoppingCart snack);

    List<ShoppingCart> search();

    boolean update(ShoppingCart snack);

    boolean delete(Integer id);


//boolean updateById(Integer id, Integer num);
   // List<Snack> search(Snack condition);
}
