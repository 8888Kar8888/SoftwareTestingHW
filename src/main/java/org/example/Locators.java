package org.example;

import org.openqa.selenium.By;

public class Locators {
    // Account button to open the login or register modal
   /* + */ public static final By ACCOUNT_BUTTON = By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/span[1]");

    // Username or email field in the login/register modal
    public static final By USERNAME_FIELD = By.cssSelector("#username");

    // Password field in the login/register modal
    public static final By PASSWORD_FIELD = By.cssSelector("#password");

    // Login button in the login/register modal
    public static final By LOGIN_BUTTON = By.xpath("//button[contains(text(),'Log in')]"); // XPath that targets button by its text

    public static final By LOGIN_ERROR_MESSAGE = By.xpath("//body/div/div/div[2]/div/div/article/div/div/div/ul/li");

    public static final By ORGANIC_MASCARA_2 = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/rs-fullwidth-wrap[1]/rs-module-wrap[1]/rs-module[1]/rs-bullets[1]/rs-bullet[2]");

    public static final By SPECIAL_OFFER_BUTTON = By.cssSelector("#slider-4-slide-10-layer-9");

    public static final By QUANTITY_OF_MEMBERS_BUTTON = By.cssSelector("#members-select");

    public static final By PERSONS_QUANTITY_30to35_OPTION = By.xpath("//option[contains(text(),'30-35 անձի համար')]");

    public static final By THREE_FLOOR_CAKE_OPTION = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[3]/img[1]");

    public static final By CHOCOLATE_OPTION_BISQUIT = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/img[1]");

    public static final By CHOCOLATE_OPTION_CREME = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[3]/img[1]");

    public static final By CAKE_NUCLEUS = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[2]/img[1]");

    public static final By CAKE_COLOR_FIELD = By.cssSelector("#martepancolor-data");

    public static final By SPECIAL_OFFER_NAME_FIELD = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[9]/div[1]/p[2]/span[1]/input[1]");

    public static final By SPECIAL_OFFER_PHONE_FIELD = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[9]/div[2]/p[2]/span[1]/input[1]");

    public static final By SPECIAL_OFFER_NOTE_FIELD = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[10]/div[1]/p[2]/span[1]/textarea[1]");

    public static final By SPECIAL_OFFER_SUBMIT_BUTTON = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/p[1]/input[3]");

    public static final By SUCCESS_MESSAGE = By.xpath("//div[contains(text(),'Thank you for your message. It has been sent.')]");

    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//a[contains(text(),'Create an Account')]");

    public static final By REGISTER_EMAIL_FIELD = By.cssSelector("#reg_email");

    public static final By REGISTER_PASSWORD_FIELD = By.cssSelector("#reg_password");

    public static final By REGISTER_BUTTON = By.tagName("button");

    public static final By FROM_LOGIN_TO_REGISTER_BUTTON = By.xpath("//a[contains(text(),'Register')]");

    public static final By HOMEPAGE_LOGO_BUTTON = By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");

    public static final By CATEGORY_BUTTON = By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]");

    public static final By CROISSANTS_OPTION_BUTTON = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]/span[1]");

    public static final By CROISSANTS_1_BUTTON = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/a[1]/img[1]");

    public static final By PRODUCT_PAGE_INCREASE_QUANTITY_BUTTON = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[3]");

    public static final By PRODUCT_PAGE_DECREASE_QUANTITY_BUTTON = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");

    public static final By PRODUCT_PAGE_ADD_TO_CART_BUTTON = By.xpath("//button[contains(text(),'Ավելացնել զամբյուղ')]");

    public static final By CATEGORY_PAGE_PASTRY_BUTTON = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/span[1]/span[1]");

    public static final By PASTRY_2_BUTTON = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/a[1]/img[1]");

    public static final By PRODUCT_CART_LOGO_BUTTON = By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[3]/div[4]/a[1]/span[1]");

    public static final By CATEGORY_PAGE_BREAD_BUTTON = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]/span[1]");

    public static final By CATEGORY_PAGE_BREAD_BUTTON_NUMBER_4 = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[4]/div[1]/a[1]/img[1]");

    public static final By CATEGORY_PAGE_SEARCH_FIELD = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/aside[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]");

    public static final By CATEGORY_PAGE_MAROOSH_LOGO_BUTTON = By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");

    public static final By OFFER_PAGE_CAKE_2_FLOOR = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[2]/img[1]");

    public static final By PRODUCT_PAGE_MARUSH_HOME_BUTTON = By.xpath("//header/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");

    public static final By EMAIL_ERROR_FIELD = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[9]/div[1]/p[2]/span[1]/span[1]");

    public static final By PHONE_ERROR_FIELD = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[9]/div[2]/p[2]/span[1]/span[1]");

    public static final By ADDED_EL_LOCATION = By.xpath("//a[contains(text(),'Ցուցադրել')]");
}

