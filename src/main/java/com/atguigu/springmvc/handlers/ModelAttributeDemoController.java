package com.atguigu.springmvc.handlers;

import com.atguigu.springmvc.dto.Address;
import com.atguigu.springmvc.dto.Country;
import com.atguigu.springmvc.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ModelAttributeDemoController {

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "Welcome to the Netherlands!");
    }

    @ModelAttribute("vincentuser")
    public User getVincentUser() {
        return new User("m3_username", "m3_passport", "m3@email.com",
                new Address(Country.Canada, "K3_province", "K3_city", "K3_detail"));
    }

    /**
     * http://localhost:22900/interview/testmodelattribute
     */
    @GetMapping("testmodelattribute")
    public String testModelAttribute() {
        return "modelattributedisplayInput";
    }
}
