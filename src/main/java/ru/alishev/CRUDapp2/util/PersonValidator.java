package ru.alishev.CRUDapp2.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.alishev.CRUDapp2.models.Person;
import ru.alishev.CRUDapp2.services.PeopleService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class PersonValidator implements Validator {
    private final PeopleService peopleService;
    @Autowired
    public PersonValidator(PeopleService peopleService) {
        this.peopleService = peopleService;
    }
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        String dataOfBirth = String.valueOf(person.getDateOfBirth());
        System.out.println(!dataOfBirth.matches("\\d{2}/\\d{2}/\\d{4}"));
        if (!dataOfBirth.matches("\\d{2}/\\d{2}/\\d{4}")){
            errors.rejectValue("yearOfBirth", "", "The date must match the expression");
        }//пока не работает

        
        /*if (personDAO.show(person.getEmail()).isPresent()){
            errors.rejectValue("email", "", "This email is already taken");

        }*/
    }
}