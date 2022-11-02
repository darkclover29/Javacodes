import java.util.*;
public class lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("LIST OF LAB PROGRAMS CREATED TILL NOW");
        System.out.println("1 _Addition");
        System.out.println("2 _Addition with user input");
        System.out.println("3 _Overloading (volume of cylinder)");
        System.out.println("4 _Overriding");
        System.out.println("5 _Inheritance");
        System.out.println("6 _Interface");
        System.out.println("7 _Threads");
        System.out.println("Press a number ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : add();
            break;
            case 2 : addition();
            break;
            case 3 : cylinder();
            break;
            case 4 : over();
            break;
            case 5 : inheritance();
            break;
            case 6 : inter();
            break;
            case 7 : thread();
            break;
            default : System.out.println("Wrong button");
        }
    
    }
    public static void add(){
        int a =10;
        int b =30;
        System.out.println("Result = "+ (a+b));
    }
    public static void addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result = "+ (a+b));
    }
    public static void cylinder(){
           Overloading obj = new Overloading();
           obj.volume(10, 5);
           obj.volume(4.5f, 9.8f);
    }
    public static void over(){
        B obj = new B();
        obj.print();
    }
    public static void inheritance(){
        System.out.println("Press 1 for Undergraduate \nPress 2 for Postgraduate");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
       if (choice ==1) {
        Undergraduate ug = new Undergraduate();
         ug.setdetails();
         ug.setbranch();
         ug.getdetails();
         ug.getbranch();
        
       } else {
        Postgraduate pg = new Postgraduate();
         pg.setdetails();
         pg.setspecial();
         pg.getdetails();
         pg.getspecial();
        
       }
        
    }
    public static void inter(){
       Circle obj = new Circle();
       obj.setradius();
       obj.getresult();

    }
    public static void thread(){
           Mythread obj = new Mythread();
           obj.start();
    }
}
class Overloading{
        public void volume(int r ,int h){
            
            float volume = (float)Math.PI*(r*r)*h;
            System.out.println("Volume of cylinder = " + volume);

        }
        public void volume(float r ,float h){
            
            float volume = (float)Math.PI*(r*r)*h;
            System.out.println("Volume of cylinder = " + volume);

        }
}
class A{
        public void print(){
            System.out.println("I'm from class A");
        }
}

class B extends A{      
    //print() is overrided so anytime print is called from B obj this print will be called 
    public void print(){
        System.out.println("I'm from class B");
    }
}

class Student{
    String name ,number;
    public void setdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = sc.nextLine();
        System.out.println("Enter your number :");
        number = sc.nextLine();
    }
    public void getdetails(){
        System.out.println("Name : " +name);
        System.out.println("Number : " +number);
    }
    
}
class Undergraduate extends Student{
    String branch;
    public void setbranch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Branch :");
        branch = sc.nextLine();
     }
     public void getbranch(){
        System.out.println("Branch : " +branch);
     }
}
class Postgraduate extends Student{
    String special;
    public void setspecial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your specialization :");
        special = sc.nextLine();
     }
     public void getspecial(){
        System.out.println("Specialization : " + special);
     }
}

interface area{  //interface contains only definition of function 
    public void setradius();
    public void getresult();
} 
class Circle implements area{  //interface is implements and not extended
    double radius,result;
    public void setradius(){
        System.out.println("Enter radius of circle :");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
    }
    public void getresult(){
        result = Math.PI*(radius*radius);
        System.out.println("Area of circle = "+result);
    }
}
class Mythread extends Thread{   //class extends Thread to use thread functions such as run
    public void run(){

        for( int i=0 ; i<=10 ; i++){
            try {
                sleep(1000); //proceess going to sleep for 1sec
            } catch (Exception e) {
                System.out.println(e);
            }
            
            System.out.println("Thread running");
        }
    }
}
