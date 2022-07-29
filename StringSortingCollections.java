package com.company;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Sort a = new Sort();
        a.Sorting();
    }
}
class Sort{
    public static void Sorting() {
        ArrayList<String> Sort = new ArrayList<String>();
        System.out.println("Enter the Number of Elements");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,temp;
        for (i = 0; i < n; i++) {
            Sort.add(in.next());
        }
        Collections.sort(Sort);
        System.out.println(Sort);
    }
}
