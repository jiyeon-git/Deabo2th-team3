package edu.kosa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import edu.kosa.service.CRUDService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequestMapping
@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final CRUDService service;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/join")
    public String joinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String joinSubmit(@RequestParam Map<String, String> map) {
        service.create(map);
        return "redirect:/";
    }
    
   @GetMapping("/update")
   public String updateForm() {
	   return "update";
   }
   
   @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
   @PostMapping("/update")
   public String updateSubmit(@RequestParam Map<String, String> map) {
	   service.update(map);
	   
	   return "login";   
   }
   
}
