package com.example.nikhil.harrypotter;

import java.util.Date;

//Creating the objects for getting the display information needed for the Adapters and page
public class Model {
    String name;
    String desc;
    String quote;
    String skill;
    String patronus;
    String description;

    int wicon;
    int icon;



    //constructor
    public Model(String name, String desc,String description,String quote,String patronus,String skill,int icon,int wicon) {
        this.name = name;
        this.desc = desc;
        this.description = description;
        this.quote = quote;
        this.patronus = patronus;
        this.skill = skill;
        this.icon = icon;
        this.wicon = wicon;


    }

    //getter
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return description;
    }
    public String getDesc() {
        return this.desc;
    }
    public int getIcon() {
        return this.icon;
    }
    public String getQuote() {
        return this.quote;
    }
    public String getSkill() {
        return this.skill;
    }
    public String getPatronus() {
        return this.patronus;
    }
    public int getWicon() {
        return this.wicon;
    }



        public static final String KEY_ANIM_TYPE = "anim_type";
        public static final String KEY_TITLE    = "anim_title";

        public enum TransitionType {
            ExplodeJava, ExplodeXML
        }
}
