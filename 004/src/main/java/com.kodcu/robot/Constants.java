package com.kodcu.robot;

import org.springframework.stereotype.Component;

/**
 * @author : Altug Bilgin Altintas - altug@kodcu.com
 */

public class Constants {

    public static int limit = 5;

    public static int getLimit() {
        return limit;
    }

    public static void setLimit(int limit) {
        Constants.limit = limit;
    }
}
