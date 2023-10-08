package ru.nadobnaya.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
    public static final String INCORRECT_USERNAME_OR_PASSWORD_ENTERED = "Incorrect username or password entered.",
            FIRST_ONBOARDING_SCREEN_TEXT = "The Free Encyclopedia …in over 300 languages",
            SECOND_ONBOARDING_SCREEN_TEXT = "New ways to explore",
            THIRD_ONBOARDING_SCREEN_TEXT = "Reading lists with sync",
            FOURTH_ONBOARDING_SCREEN_TEXT = "Send anonymous data",
            SOVCOMBANK = "Sovcombank";


    Faker faker = new Faker(Locale.ENGLISH);
    public String username = getUsername(),
            password = getPassword();

    private String getUsername() {
        return faker.name().username();
    }

    private String getPassword() {
        return faker.internet().password();
    }
}
