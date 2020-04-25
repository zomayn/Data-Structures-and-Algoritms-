package com.practice;

public class ReverseAString {

    public void reverseUsingString(String input) {
        /*
        checking if the input is correct i.e:
        1. If length of the string is more than 2 else it's just one char
        2. else condition has the logic for the reversing of a string.
        */
        if (input.length() < 2) {
            System.out.println("Reversed String is: " + input);
        } else {
            String reverse="";

            for(int i=input.length()-1;i>=0;i--){
                reverse= reverse+input.charAt(i);
            }
            System.out.println("Reversed String using String is: " + reverse);
        }
    }

    public void reverseStringUsingStringBuilder(String input){
        if (input.length() < 2) {
            System.out.println("Reversed String is: " + input);
        } else {
            StringBuilder reverse= new StringBuilder();

            for(int i=input.length()-1;i>=0;i--){
                reverse.append(input.charAt(i));
            }
            System.out.println("Reversed String using String Builder is: " + reverse.toString());
        }
    }


}
