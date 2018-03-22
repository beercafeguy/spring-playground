package com.beercafeguy.spring.springbootstarter;

import com.beercafeguy.spring.springbootstarter.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}


}


@RestController
@RequestMapping("/api/home")
class HomeController{

	@GetMapping("/start")
	public String home(){
		return "Home Page";
	}

	@GetMapping(value = "/user/{id}")
	public User getUser(@PathVariable Integer id){
	    return new User(id,"Hem");
    }
}