import java.util.*;  
class ArrayListDemo1{  
 public static void main(String args[]){  
   
  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
  al.add("Aditi");//adding object in arraylist  
  al.add("Akruti");  
  al.add("Rizwana");  
  al.add("Anita");  
  
  Iterator itr=al.iterator();//getting Iterator from arraylist to traverse elements  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
