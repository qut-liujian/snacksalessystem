package com.qr.qlg.stuboot.dao;

import com.qr.qlg.stuboot.entity.ShoppingCart;
import com.qr.qlg.stuboot.entity.Snack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ShoppingCartDao extends JpaRepository<ShoppingCart,Integer> {
  /*  @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update snack set num=?2  where id=?1 ", nativeQuery = true)
    int updateById(Integer id, Integer num);
*/


    //@Query(value="select * form student where gender=:gender",nativeQuery=true)//也可以自己加jpa语句
   // List<Snack> findByGender(String gender);//jpa提供了规则findBy+实体属性，还有findBy*And/or*
}
