import java.util.*;  
public class LinkedListDemo1{  
 public static void main(String args[]){  
   
  LinkedList<String> al=new LinkedList<String>();  
 al.add("Aditi");//adding object in arraylist  
  al.add("Akruti");  
  al.add("Rizwana");  
  al.add("Anita");
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
