//Part-1 ServerSide.java 
import java.io.*; 
import java.net.*; 
public class ServerSide 
{ 
public static void main(String[]args) 
{ 
try 
{ 
ServerSocket ss=new ServerSocket(3306); 
Socket s=ss.accept();//establishes connection 
DataInputStream dis=new DataInputStream(s.getInputStream()); 
String str=(String)dis.readUTF(); 
System.out.println("message= "+str); 
ss.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e);
} 
} 
//Part-2 ClientSide.java 
import java.io.*; 
import java.net.*; 
public class ClientSide 
{ 
public static void main(String[] args) 
{ 
try 
{ 
Socket s=new Socket("localhost",3306); 
DataOutputStreamdout=new 
DataOutputStream(s.getOutputStream()); 
dout.writeUTF("Hello Server"); 
dout.flush(); 
dout.close(); 
s.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e);} 
} 
} 