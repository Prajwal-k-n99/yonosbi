package com.company;

  class yonosbi {
     String name;
     long phno;
     long accno;
     double balance = 0;
     double credit;
     double debit;
  double balance(){
      return balance = balance + credit - debit ;
  }
  void details(){
      System.out.println(name);
      System.out.println(phno);
      System.out.println(accno);
  }
  double credit(){
      return credit;
  }
  double debit(){
      return debit;
  }
}
class bank{
    public static void main(String[] args) {
        yonosbi myyono = new yonosbi();
        myyono.name = "Prajwal";
        myyono.balance() ;
        myyono.phno = 702629235;
        myyono.accno = 24586314;
        myyono.debit();
        myyono.credit();
    }

}
