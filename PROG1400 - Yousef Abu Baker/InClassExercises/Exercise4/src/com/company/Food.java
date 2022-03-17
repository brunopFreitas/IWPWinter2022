package com.company;

public class Food {
    private String name;
    private String type;

    public Food (String foodName, String foodType) {
        this.name = foodName;
        this.type = foodType;
    }

    public String whatHaveIEaten() {
        return "You just ate " +
                this.name;
    }

    public String iDontLikeThis() {
        return "I will not eat that! " +
                "I hate " + this.name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
