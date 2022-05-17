package com.Bridgelabz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnValid() {

        UserRegistration user = new UserRegistration();
        boolean result = user.firstName("Swapnil");
        assertEquals(true, result);

    }

    @Test
    void givenLastName_WhenProper_ShouldReturnValid() {

        UserRegistration user = new UserRegistration();
        boolean result = user.lastName("Pawar");
        assertEquals(true, result);

    }

    @Test
    void givenEmail_WhenProper_ShouldReturnValid() {

        UserRegistration user = new UserRegistration();
        boolean result = user.email("abc@gmail.com.aa.au");
        assertEquals(true, result);


    }

    @Test
    void givenMobileNumber_WhenProper_ShouldReturnValid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.mobileNumber("91 8657169656");
        assertEquals(true, result);

    }

    @Test
    void givenRuleOne_WhenProper_ShouldReturnValid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.ruleOne("abcdefghi");
        assertEquals(true, result);
    }

    @Test
    void givenRuleTwo_WhenProper_ShouldReturnValid() {

        UserRegistration user = new UserRegistration();
        boolean result = user.ruleTwo("Abcdefghi");
        assertEquals(true, result);
    }

    @Test
    void givenRuleThird_WhenProper_ShouldReturnValid() {

        UserRegistration user = new UserRegistration();
        boolean result = user.ruleThird("Abcdegh1");
        assertEquals(true, result);
    }

    @Test
    void givenRuleFourth_WhenProper_ShouldReturnValid() {
        UserRegistration user = new UserRegistration();
        boolean result = user.ruleFourth("Abcdegh1@");
        assertEquals(true, result);
    }
}
