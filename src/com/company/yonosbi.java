package com.company;

import java.util.Calendar;
import java.util.Scanner;

 class Profile {
      String name;
      long phno;
      long accno;

      void details() {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the name");
          name = sc.nextLine();
          System.out.println("Enter the phone number");
          phno = sc.nextLong();
          System.out.println("Enter the account number");
          accno = sc.nextInt();
      }
  }
  class BalanceCheck {
      float balance = 0;
      float credit;
      float debit;
      int upino;

      float Balance() {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the upi no");
          upino = sc.nextInt();
           return balance = balance + credit - debit;
      }

  }
  class Transactions{
      float credit;
      float debit;
      String name;
      float balance;
  void Dedit(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Search the name/phone number");
      name = sc.nextLine();
      System.out.println("Enter the debit amount");
      debit = sc.nextFloat();
      System.out.println("Debited amount is " + debit);
  }
  void Credit(){
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the credit amount");
      credit = sc.nextFloat();
      System.out.println("Credited amount is "+ credit);
}
  void Transactions(){
      int n=20;
      balance =  credit - debit;
      for (int i = 1;i<n;i++){
      System.out.println(credit);
      System.out.println(debit);
      System.out.println(balance);
  }
  }
  }
class account{
    public static void main(String[] args) {
        Profile profile = new Profile();
        BalanceCheck bc = new BalanceCheck();
        Transactions trs = new Transactions();
        Calendar c = Calendar.getInstance();
        profile.details();
        bc.Balance();
        trs.Credit();
        trs.Dedit();
        trs.Transactions();
        System.out.println(c.getTime());
    }

}
