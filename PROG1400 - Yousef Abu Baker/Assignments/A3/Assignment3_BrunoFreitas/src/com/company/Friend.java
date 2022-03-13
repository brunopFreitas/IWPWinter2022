package com.company;

public class Friend extends Person{

    private String foodToBring;
    private double invitedFriend = 99.99;
    private double unInvitedFriend =    399.99;

    public Friend(String firstName, String lastName, boolean isRegistered, String foodToBring) {
        super(firstName, lastName, isRegistered);
        this.foodToBring = foodToBring;
    }

    public String inviteToString () {
        if(super.isInvited()) {
            return "Yes.";
        } else {
            return "No.";
        }
    }

    public double getFriendCost() {
        if(super.isInvited()) {
            return this.invitedFriend;
        } else {
            return this.unInvitedFriend;
        }
    }

    public String toString() {

        return
                super.getFullName() +
                " is bringing " +
                this.foodToBring +
                ". Is he/she invited to the party? " +
                inviteToString();
    }
}
