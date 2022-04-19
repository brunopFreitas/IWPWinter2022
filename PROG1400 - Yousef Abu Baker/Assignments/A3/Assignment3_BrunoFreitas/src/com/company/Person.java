package com.company;

abstract class Person {

    private String firstName;
    private String lastName;
    private boolean invited;

    public Person(String firstName, String lastName, boolean invited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.invited = invited;
    }

    public boolean isInvited() {
        return invited;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setInvited(boolean invited) {
        this.invited = invited;
    }
}
