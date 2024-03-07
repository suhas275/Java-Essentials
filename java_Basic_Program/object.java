public class object implements Cloneable   
{   
@Override  
protected Object clone() throws CloneNotSupportedException   
{   
//invokes the clone() method of the super class      
return super.clone();   
}   
String str = "New Object Created";   
public static void main(String[] args)   
{  
//creating an object of the class     
object obj1 = new object();   
//try catch block to catch the exception thrown by the method  
try  
{  
//creating a new object of the obj1 suing the clone() method  
object obj2 = (object) obj1.clone();   
System.out.println(obj2.str);   
}   
catch (CloneNotSupportedException e)   
{   
e.printStackTrace();   
}   
}   
}  
// Output:

// New Object Created