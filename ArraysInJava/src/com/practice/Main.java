package com.practice;

public class Main {

    public static void main(String[] args) {
        // Reverse a string
    ReverseAString reverseObject= new ReverseAString();
    String input="My name is Riya Vats";
    reverseObject.reverseUsingString(input);
    reverseObject.reverseStringUsingStringBuilder(input);

    // Merge two arrays
    MergeSortedArrays mergeObject= new MergeSortedArrays();
    int a[]={0,3,4,31};
    int b[]={2,6,30};
    mergeObject.mergeWithoutFunction(b,a);
    mergeObject.mergeWithFunction(a,b);
    mergeObject.mergeArrays(a,b);
    }
}
