package com.sdoward.shortcutolympics.week1;

public class ForthFifthAndSixthTask {

    //4. Bring up Action and option menu and display Extend Selection shortcut

    //5. Highlight first.substring(0, first.length() - 1) using Extend selection

    //6. Extract first.substring(0, first.length() - 1) into a method
    public String selection(String first, String second, String third, String forth) {
        return first.substring(0, first.length() - 1) + second
                + third + forth.replace("a", "b");
    }

}
