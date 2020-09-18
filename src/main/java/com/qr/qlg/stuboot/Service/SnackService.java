package com.qr.qlg.stuboot.Service;

import com.qr.qlg.stuboot.entity.Snack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SnackService {
    Snack searchById(Integer id);

    boolean add(Snack snack);

    List<Snack> search();

    boolean update(Snack snack);

    boolean delete(Integer id);

    Snack searchByName(String name);
    boolean updateByName(Integer num,String name);
boolean updateById(Integer id,Integer num);
}
