/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Ruban
 */
public class stringoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,choice,pos;
        String s;
        char b;
        Scanner obj=new Scanner(System.in);
        stringOperations sobj=new stringOperations();
        
       do{
           System.out.println("Enter \n1 to append string at end\n2 to insert at position\n3 to search string\n4 to print string starting with the given character\n5 to view the list");
           choice=obj.nextInt();
           switch(choice){
               case 1:
                   System.out.println("Enter String to append");
                   s=obj.next();
                   sobj.append(s);
                   break;
               case 2:
                   System.out.println("Enter String to add and its position");
                   s=obj.next();
                   pos=obj.nextInt();
                   sobj.insert(s, pos);
                   break;
               case 3:
                   System.out.println("Enter String to search");
                   s=obj.next();
                   sobj.search(s);
                   break;
               case 4:
                   System.out.println("Enter a character");
                   b=obj.next().charAt(0);
                   sobj.startsWith(b);
                   break;
               case 5:
                   System.out.println(sobj.list);
                   break;
               default:
                   System.out.println("Enter 1 or 2 or 3 or 4");
                   break;
                   
           }
           
          System.out.println("Enter 1 to continue "); 
          n=obj.nextInt();
       }while(n==1);
    }
    
}
class stringOperations{
    ArrayList list=new ArrayList<>();//creations of arraylist
    
    
    //function to add at end
    void append(String s){
           list.add(s);
     System.out.println(list);     
       
    }
    
    //function to add at given position 
    void insert(String s,int pos){
      list.add(pos-1, s);
      System.out.println(list);
    }
    
    //function to search particular string
    void search(String s){
        
      boolean n=list.contains(s);
      if(n)
       System.out.println("String "+s+" is present");  
      else
          System.out.println("String "+s+" is not present"); 
      System.out.println(list);
    }
    
    //function to print string starting with the given character
    void startsWith(char s){
      System.out.println("the words start with "+s+" are");
      for(int i=0;i<list.size();i++){
          String a=(String)list.get(i);
          if(a.charAt(0)==s)
              System.out.println(a);
          
      }
    }
    
}
