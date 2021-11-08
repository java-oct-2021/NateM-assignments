package com.ncm.controllerViews.validators;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ncm.controllerViews.models.User;
import com.ncm.controllerViews.repositories.UserRepository;

@Component
public class UserValidator implements Validator {
	
	@Autowired
	private UserRepository userRepo;
    
    // 1
	@Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    
    // 2
    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            // 3
            errors.rejectValue("password", "Match","Password Does not match");
        }  
        
        if(this.userRepo.findByEmail(user.getEmail()) != null) {
        	errors.rejectValue("email", "Unique","Email address already exist");
        }
        
    }
}