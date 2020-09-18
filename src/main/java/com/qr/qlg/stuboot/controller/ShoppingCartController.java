package com.qr.qlg.stuboot.controller;

import com.qr.qlg.stuboot.Service.ShoppingCartService;
import com.qr.qlg.stuboot.Service.SnackService;
import com.qr.qlg.stuboot.entity.ShoppingCart;
import com.qr.qlg.stuboot.entity.Snack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("cart")
public class ShoppingCartController {
    @Autowired
    ShoppingCartService snackService;
    @RequestMapping("search")
    @ResponseBody
    public List<ShoppingCart> search(){
       List<ShoppingCart> list=snackService.search();
        System.out.println(list);
        return  list;
    }
    @RequestMapping("showadd")
    public String showadd(){
        return "bj/add";
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(@RequestBody ShoppingCart bj){
        System.out.println(bj);
        boolean flag=snackService.add(bj);
        if(flag){
            return "redirect:search";
        }
        return "";
    }

    @RequestMapping("showUpdate")
    public ModelAndView showUpdate(Integer id){
        ShoppingCart banji=snackService.searchById(id);
        ModelAndView mv=new ModelAndView("bj/update");
        mv.addObject("data",banji);
        return  mv;
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(@RequestBody ShoppingCart banji){
        boolean flag=snackService.update(banji);
        if(flag){
            return "redirect:search";
        }
        return "";
    }
    @RequestMapping("searchById")
    @ResponseBody
    public ShoppingCart searchById(Integer id){
        ShoppingCart stu=snackService.searchById(id);

        return  stu;
    }


   /* @RequestMapping("updateById")
@ResponseBody
    public boolean updateById(Integer id,Integer num){

        boolean flag=snackService.updateById(id,num);


       return true;
    }*/
    @RequestMapping("delete")
    public String delete(Integer id){
        boolean flag=snackService.delete(id);

        if(flag){
            return "redirect:search";
        }
        return "";
    }
}
