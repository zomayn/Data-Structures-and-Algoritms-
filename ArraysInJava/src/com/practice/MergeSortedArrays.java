package com.practice;
import java.util.Arrays;

public class MergeSortedArrays {
    public void mergeWithoutFunction(int a[], int b[]){
        //a[]= [0,3,4] and b[]=[4,6,30]
        int size= a.length+b.length;//size =6
        int mergedArray[]= new int[size];
        int pos=0;

        for(int element:a){
            mergedArray[pos]=element;
            pos++;
        }
        for(int element:b){
            mergedArray[pos]=element;
            pos++;
        }
        //sorting the array
        Arrays.sort(mergedArray);

        //printing the array
        System.out.println("Merged Array is: ");
        System.out.println(Arrays.toString(mergedArray));
        for(int element:mergedArray){
            System.out.print(element+" ");
        }
    }

    public void mergeWithFunction(int a[], int b[]){
        int mergedArray[]=new int[a.length+b.length];
        int lengthOfA= a.length;
        int lengthOfB= b.length;

        System.arraycopy(a,0,mergedArray,0,lengthOfA);
        System.arraycopy(b,0,mergedArray,lengthOfA,lengthOfB);

        Arrays.sort(mergedArray);
        System.out.println();
        System.out.println("Merged Array with arraycopy() method is: "+ Arrays.toString(mergedArray));
    }

    public void mergeArrays(int a[], int b[]){

        int n1= a.length;
        int n2= b.length;
        int mergedArray[]= new int[n1+n2];
        int i=0,j=0,k=0;

        //comparing the values of the a and b arrays and then adding them to the mergedArray
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                mergedArray[k++]=a[i++];
            } else {
                mergedArray[k++]=b[j++];
            }

        }

        // Adding the remaining values of arrays of mergeArray. this is due to unequal size of the arrays
        while (i<n1){
            mergedArray[k++]=a[i++];
        }
        while (j<n2){
            mergedArray[k++]=b[j++];
        }
        // printing the array
        System.out.println(Arrays.toString(mergedArray));

    }
}
