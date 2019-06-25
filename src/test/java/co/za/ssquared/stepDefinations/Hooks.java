package co.za.ssquared.stepDefinations;

import  cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public  void beforeValidation()
    {
        //this is displayed before the mobile tag
        System.out.println("Mobile before hook");
    }

    @After("@MobileTest")
    public void AfterValidation(){
        //this is displayed after the mobile tag
        System.out.println("After mobile hook");
    }
    @Before("@WebTest")
    public  void beforeWebValidation()
    {
        //this is displayed before the mobile tag
        System.out.println("Mobile web hook");
    }

    @After("@WebTest")
    public void AfterWebValidation(){
        //this is displayed after the mobile tag
        System.out.println("After web  hook");
    }
}
