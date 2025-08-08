package Recursion;

//Question 9: Draw Triangle?
//****
//***
//**
//*
public class Question9 {
    public static int triangle(int n){
     if(n==0){
        return 1;
     }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        return triangle(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        triangle(n);
    }
}
