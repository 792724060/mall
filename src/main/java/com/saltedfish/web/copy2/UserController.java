package com.saltedfish.web.copy2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saltedfish.pojo.User;
import com.saltedfish.service.UserService;
import com.saltedfish.util.Page4Navigator;
 
@RestController
public class UserController {
	@Autowired UserService userService;

    @GetMapping("/users")
    public Page4Navigator<User> list(@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
    	start = start<0?0:start;
    	Page4Navigator<User> page = userService.list(start,size,5); 
        return page;
    }
	    

        
}

