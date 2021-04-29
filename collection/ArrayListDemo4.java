import java.util.*;  
class ArrayListDemo4{  
 public static void main(String args[]){  
   
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Aditi");//adding object in arraylist  
  al.add("Akruti");  
  al.add("Rizwana");  
    
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Surendra");  
  al2.add("Nilesh");  
    
  al.addAll(al2);    
  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
