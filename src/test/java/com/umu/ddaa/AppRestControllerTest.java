package com.umu.ddaa;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AppRestControllerTest {

    @Test
    public void test_get_message() {
        AppRestController appRestController = new AppRestController();
        String message = appRestController.getMessage();
        assertThat(message, is("Hello Everyone"));
    }

    @Test
    public void test_add_two_numbers() {
        AppRestController appRestController = new AppRestController();
        assertThat(appRestController.addTwoNumbers(2,2), is(4));
    }
}
