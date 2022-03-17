package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int friendsInvited=0;
        double friendInvitedCost=0;
        int friendsNotInvited=0;
        double friendNotInvitedPrice=0;
        double totalExpenses=0;
        double totalEarned=0;
        double grossProfit=0;
        String financialReport;
        String jumpLine = "\n";
        ArrayList<Friend> partyFriend = new ArrayList<Friend>();

        JOptionPane.showMessageDialog(null,
                "Welcome to the Assignment 4: Party Picker.\n" +
                "Please insert the name of your friends and the type of food they are bringing.\n" +
                "Indicate whether they are actually invited to the party or not.");

        //Loop for filling friends
        do {
            String firstName = JOptionPane.showInputDialog(null, "First name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String lastName = JOptionPane.showInputDialog(null, "Last name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String partyFood = JOptionPane.showInputDialog(null, "Food", "Party Picker", JOptionPane.QUESTION_MESSAGE);

            boolean isInvited = false;
            Object[] choices = {"Invited", "Not Invited"};
            int invited = JOptionPane.showOptionDialog(null, "Is your friend isInvited to the party?", "Party Picker",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
            if (invited == 0) {
                isInvited = true;
            }

            partyFriend.add(new Friend(firstName, lastName, isInvited, partyFood));

            //Use a Confirm dialog to see if the user wants to enter another guest. Continue if yes (0), otherwise, stop looping
        } while (JOptionPane.showConfirmDialog(null, "Enter another guest?", "Party Picker", JOptionPane.YES_NO_OPTION) == 0);

        //Calculating costs
        for (Friend currFriend : partyFriend) {
            if(currFriend.isInvited()) {
                friendsInvited++;
                friendInvitedCost+=currFriend.getFriendCost();
            } else {
                friendsNotInvited++;
                friendNotInvitedPrice+= currFriend.getFriendCost();
            }
        }

        totalExpenses = friendInvitedCost;
        totalEarned = friendNotInvitedPrice;
        grossProfit = totalEarned - totalExpenses;

        //finacial report
        financialReport =
                "Total guests are: " +
                partyFriend.size() +
               jumpLine +
               friendsInvited + " invited" +
               jumpLine +
               friendsNotInvited + " not invited" +
               jumpLine +
               "Total Expenses: $" + Math.round(totalExpenses) +
               jumpLine +
               "Total Earned: $" + Math.round(totalEarned) +
                jumpLine +
                "Gross Profit: $" + Math.round(grossProfit) +
                jumpLine +
                "Done by Bruno Freitas";

        //Build a string for the final report
        String report = "Friends confirmed:\n";

        //Building partyFriend report
        for (Friend currFriend : partyFriend) {
            report += "\n" + currFriend.toString();
        }

        //Print the reports in a Message dialog.
        JOptionPane.showMessageDialog(null, "\n" + report + "\n" + financialReport);
    }
}
