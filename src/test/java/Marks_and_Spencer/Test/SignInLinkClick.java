package Marks_and_Spencer.Test;

import org.testng.annotations.Test;

public class SignInLinkClick extends BaseClass {
    @Test
    public void signInLinkVerify() {
        pageFactory.getHomePage().signInLinkClickAndPageVerify("Sign In");
    }
}
