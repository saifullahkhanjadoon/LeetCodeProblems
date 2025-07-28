/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4/*
    
package leetcodeprob;

import java.util.Scanner;

public class SingleNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        System.out.println("");
        System.out.println("Enter numbers:\n");
        int[] num=new int[size];
        for (int i=0;i<num.length;i++)
        {
            System.out.println("Enter "+(i+1)+" element");
            num[i]=sc.nextInt();
        }
        int n=0;

        for(int i=0;i<num.length;i++) {
            int count=0;
            for(int j=0;j<num.length;j++) {
                if(num[i]==num[j]) {
                    count++;
                }
            }

            if(count==1) 
            {
                n=num[i];
                break;
            }
        }
        System.out.println("");
        System.out.println("Output: " + n);
    }
}
