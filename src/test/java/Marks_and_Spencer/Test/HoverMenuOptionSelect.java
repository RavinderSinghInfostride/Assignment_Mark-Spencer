package Marks_and_Spencer.Test;

import org.testng.annotations.Test;

public class HoverMenuOptionSelect extends BaseClass {
    @Test
    public void hoverMenuOptionSelect() {
        pageFactory.getHomePage().menuOptionSelectAndPageVerify();
    }
}
