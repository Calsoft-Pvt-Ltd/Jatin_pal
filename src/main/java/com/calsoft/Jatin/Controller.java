package com.calsoft.Jatin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
* Controller entrypoint for the application
* @author Jatin
**/
 
@RestController
public class Controller {
 
 
	/**
	 * Get API to launch homePage
	 * @author Jatin
	 **/
    @GetMapping("/home")
    public String homePage(){
        return "Welcome Interns! This is Home page";
    }
}