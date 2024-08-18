package balance;
import java.util.*;
public class Account 
{ 
long acc,bal;
String name;
public void read()throws Exception 
{ 
Scanner in = new Scanner(System.in);
System.out.println("Enter the name :");
name=in.nextLine();
System.out.println("Enter the account number :");
acc=Long.parseLong(in.nextLine());
System.out.println("Enter the account balance :");
bal=Long.parseLong(in.nextLine());
} 
public void disp() 
{ 
System.out.println("~~~~~~~~~~~~~~~~~");
System.out.println("--- Account Details ---");
System.out.println("~~~~~~~~~~~~~~~~~");
System.out.println("Name :"+name);
System.out.println("Account number :"+acc);
System.out.println("Balance :"+bal);
} 
} 
