package com.zhe.spring_social_network.controller;


import com.zhe.spring_social_network.model.DTO.UserDTO;
import com.zhe.spring_social_network.model.entities.User;
import com.zhe.spring_social_network.model.entities.UserProfile;
import com.zhe.spring_social_network.service.UserProfileService;
import com.zhe.spring_social_network.service.UserService;
import com.zhe.spring_social_network.validator.UserValidator;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    //services
    @Autowired
    private UserService userService;

    @Autowired
    private UserProfileService profileService;

    //validators
    @Autowired
    private UserValidator userValidator;

    //everything else
    @Autowired
    ModelMapper mapper;



    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new UserDTO());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") UserDTO userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        User user = mapper.map(userForm, User.class);
        //logger needed
        userService.save(user);
        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }


    @GetMapping("/{name}/profile")
    public String profile(Model model, @PathVariable String name) {
        UserProfile userProfile = profileService.findByUsername(name);
        model.addAttribute("profile", userProfile);
        return "userprofile";
    }
}
