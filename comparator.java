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
public class comparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s[]=new student[20];//array of 20 objects
        int i;
        ArrayList studentList=new ArrayList<>();//creation of array list
        
        for (i=0;i<20;i++){
            System.out.println("Enter student"+(i+1)+"details");
            s[i]=new student(); //creation of individual student details
            studentList.add(s[i]);//appending to the arraylist
        }
        Collections.sort(studentList,new rollnoSort());
        //list after sorting
        System.out.println(studentList);
    }
    
}


class student{
    String name;
    int rollno;
    int cgpa;
    
    //constructor to get info from user
    public student() {
        System.out.println("\nEnter NAME ROLLNO CGPA");
        Scanner obj=new Scanner(System.in);
        name =obj.next();
        rollno =obj.nextInt() ;
        cgpa = obj.nextInt();
    }

    @Override
    public String toString() {
        return  "rollno=" + rollno + " name=" + name + " cgpa=" + cgpa ;
    }
    
    
}

//class rollnosort to sort on the basis of rollno
class rollnoSort implements Comparator<student>{
    
    public int compare(student s1,student s2){
     return s1.rollno-s2.rollno;   //comparing the roll no
    } 
    }
    

