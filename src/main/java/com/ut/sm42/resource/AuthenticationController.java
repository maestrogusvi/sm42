package com.ut.sm42.resource;

import com.ut.sm42.dto.UserDTO;
import com.ut.sm42.exception.BusinessException;
import com.ut.sm42.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;
import com.ut.sm42.repository.UserRepository;
import com.ut.sm42.response.GenericResponse;
import com.ut.sm42.service.impl.AuthenticationServiceImpl;

import static com.ut.sm42.constants.AuthenticationConstants.URL_PRIVATE_AUTHETICATION;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS })
@RequestMapping(path = URL_PRIVATE_AUTHETICATION, produces= MediaType.APPLICATION_JSON_VALUE)
public class AuthenticationController {

    @Autowired
    private AuthenticationServiceImpl auhtenticationService;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/login")
    public GenericResponse login(@RequestParam("user") String username, @RequestParam("password") String pwd) throws BusinessException {

        return new GenericResponse(200,"success", AuthenticationServiceImpl.loginAuthentication(username,pwd));
    }

    @PostMapping("/api/v1/user")
    public @ResponseBody
    UserDTO newUser(@RequestBody User user) {
        return auhtenticationService.createUser(user);
    }


    @GetMapping({ URL_PRIVATE_AUTHETICATION, "/voltux" })
    public String index(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s!", jwt.getSubject());
    }

    @GetMapping("/api/v1/especialrequest/test")
    String test(){
        return "Success";
    }



}
