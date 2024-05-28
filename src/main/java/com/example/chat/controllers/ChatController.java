package com.example.chat.controllers;

import com.example.chat.dao.AdminRepository;
import com.example.chat.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;



//    @GetMapping("/main")
//    public String getMain(){
//        return "main";
//    }
//
//    @GetMapping("/login")
//    public String getLogin(){
//        return "login";
//    }
//
//    @GetMapping("/customer/{id}")
//    public String getCustomerById(){
//        return "id";
//    }
//
//    @PostMapping("/customer")
//    public String postCustomer(){
//        return "createCustomer";
//    }
//
//    @GetMapping("/dialogs/{id}")
//    public String getDialogsById(){
//        return "dialogs";
//    }
//
//    @GetMapping("/dialog/{id}")
//    public String getDialogById(){
//        return "dialog";
//    }
//
//    @DeleteMapping("/dialog/{id}")
//    public String deleteDialogById(){
//        return "delete";
//    }
//
//    @PostMapping("/dialog")
//    public String postDialog(){
//        return "dialog";
//    }
//
//    @PostMapping("/message")
//    public String postMessage(){
//        return "message";
//    }
//
//    @DeleteMapping("/message/{id}")
//    public String deleteMessage(){
//        return "";
//    }
    // TODO: 28.04.2024
}
