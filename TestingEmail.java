package com.Bridgelabz;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class TestingEmail {

        public String mail;
        public boolean expectedResult;


        void EmailTest(String mail, boolean expectedResult) {
            this.mail = mail;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Collection emailExpectedResult() {
            return Arrays.asList(new Object[][]{
                    {"abc@yahoo.com", true},
                    {"abc-100@yahoo.com", true},
                    {"abc.100@yahoo.com", true},
                    {"abc111@abc.com", true},
                    {"abc-100@abc.net", true},
                    {"abc.100@abc.com.au", true},
                    {"abc@1.com", true},
                    {"abc@gmail.com.com", false},
                    {"abc+100@gmail.com", true},
                    {"abc", false},
                    {"abc@.com.my", false},
                    {"abc123@gmail.a", false},
                    {"abc123@.com", false},
                    {"abc123@.com.com", false},
                    {".abc@abc.com", false},
                    {"abc()*@gmail.com", false},
                    {"abc@%*.com", false},
                    {"abc..2002@gmail.com", false},
                    {"abc.@gmail.com", false},
                    {"abc@abc@gmail.com", false},
                    {"abc@gmail.com.1a", false},
                    {"abc@gmail.com.aa.au", false}
            });
        }

        @Test
        void givenEmailIds_withExpectedResult_shouldPassAllTestCases() {
            UserRegistration user = new UserRegistration();
            boolean result = user.email(this.mail);
            assertEquals(this.expectedResult, result);
        }
}
