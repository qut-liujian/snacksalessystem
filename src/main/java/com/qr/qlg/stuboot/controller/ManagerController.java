package com.qr.qlg.stuboot.controller;

import com.qr.qlg.stuboot.Service.ManagerService;
import com.qr.qlg.stuboot.Service.SnackService;
import com.qr.qlg.stuboot.entity.Manager;
import com.qr.qlg.stuboot.entity.Snack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("manager")
public class ManagerController {
    @Autowired
    ManagerService managerService;
    @RequestMapping("search")
    @ResponseBody
    public List<Manager> search(){
       List<Manager> list=managerService.search();
        System.out.println(list);
        return  list;
    }
    @RequestMapping("showadd")
    public String showadd(){
        return "bj/add";
    }

    @RequestMapping("add")
    @ResponseBody
    public String add(@RequestBody Manager bj){
        System.out.println(bj);
        boolean flag=managerService.add(bj);
        if(flag){
            return "redirect:search";
        }
        return "";
    }

    @RequestMapping("showUpdate")
    public ModelAndView showUpdate(Integer id){
        Manager banji=managerService.searchById(id);
        ModelAndView mv=new ModelAndView("bj/update");
        mv.addObject("data",banji);
        return  mv;
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(@RequestBody Manager banji){
        boolean flag=managerService.update(banji);
        if(flag){
            return "redirect:search";
        }
        return "";
    }
    @RequestMapping("searchById")
    @ResponseBody
    public Manager searchById(Integer id){
        Manager stu=managerService.searchById(id);

        return  stu;
    }

    @RequestMapping("searchByName")
    @ResponseBody
    public String searchByName(String name){
        String password=managerService.searchByName(name);
        System.out.println(password);
        return  password;
    }


    @RequestMapping("delete")
    public String delete(Integer id){
        boolean flag=managerService.delete(id);
        if(flag){
            return "redirect:search";
        }
        return "";
    }
}
