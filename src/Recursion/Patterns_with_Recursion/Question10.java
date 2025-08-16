package Recursion;
//Question 10:Draw Triangle?
//*
//**
//***
//****
//*****
public class Question10 {
    public static void triangle(int row,int column){
     if (row==0){
         return;
     }
     if (column<row){
         triangle(row,column+1);
         System.out.print("*");
     }else {
         triangle(row-1,0);
         System.out.println();
     }
    }
    public static void main(String[] args) {
        triangle(5,0);
    }
}
