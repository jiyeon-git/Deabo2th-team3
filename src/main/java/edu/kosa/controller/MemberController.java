package edu.kosa.controller;

import edu.kosa.model.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Log4j2
@RequestMapping
@Controller
@RequiredArgsConstructor
public class MemberController {

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String loginSubmit() {
        return "login";
    }

    @GetMapping("/join")
    public String joinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String joinSubmit(@RequestParam Map<String, String> map) {
        // insert하는 서비스 호출
        return "redirect:/";
    }
}
