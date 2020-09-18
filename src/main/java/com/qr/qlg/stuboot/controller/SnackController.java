package com.qr.qlg.stuboot.controller;

import com.qr.qlg.stuboot.Service.SnackService;
import com.qr.qlg.stuboot.entity.Snack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("snack")
public class SnackController {
    @Autowired
    SnackService snackService;
    @RequestMapping("search")
    @ResponseBody
    public List<Snack> search(){
       List<Snack> list=snackService.search();
        System.out.println(list);
        return  list;
    }
    @RequestMapping("showadd")
    public String showadd(){
        return "bj/add";
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(@RequestBody Snack bj){
        System.out.println(bj);
        boolean flag=snackService.add(bj);
        if(flag){
            return "redirect:search";
        }
        return "";
    }

    @RequestMapping("showUpdate")
    public ModelAndView showUpdate(Integer id){
        Snack banji=snackService.searchById(id);
        ModelAndView mv=new ModelAndView("bj/update");
        mv.addObject("data",banji);
        return  mv;
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(@RequestBody Snack banji){
        boolean flag=snackService.update(banji);
        if(flag){
            return "redirect:search";
        }
        return "";
    }
    @RequestMapping("searchById")
    @ResponseBody
    public Snack searchById(Integer id){
        Snack stu=snackService.searchById(id);
        System.out.println(stu);
        return  stu;
    }
    @RequestMapping("searchByName")
    @ResponseBody
    public Snack searchByName(String name){
        Snack snack=snackService.searchByName(name);
        System.out.println(snack);
        return  snack;
    }


    @RequestMapping("updateById")
@ResponseBody
    public boolean updateById(Integer id,Integer num){

        boolean flag=snackService.updateById(id,num);


       return true;
    }

    @RequestMapping("updateByName")
    @ResponseBody
    public boolean updateByName(Integer num,String name){

        boolean flag=snackService.updateByName(num,name);


        return true;
    }


    @RequestMapping("delete")
    public String delete(Integer id){
        boolean flag=snackService.delete(id);

        if(flag){
            return "redirect:search";
        }
        return "";
    }
}
