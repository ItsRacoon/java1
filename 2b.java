//Part – 2 Main Class 
class BankBal 
{ 
public static void main(String ar[]) 
{ 
try 
{ 
balance.Account a=new balance.Account();
a.read(); //calling the method of Account class
a.disp();
} 
catch (Exception e) 
{ 
System.out.println(e);
} 
} 
} 