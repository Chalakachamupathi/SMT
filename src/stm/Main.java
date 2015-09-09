
package stm;
import javax.swing.JFrame;

class Student{
    //String w="sadf";
private int index;
private String firstName;
private String lastName;
private int age;
private String address;
public void setIndex(int ind){
index=ind;}
public int getIndex(){
return index;}

public void setFirstName(String ind){
firstName=ind;}

public String getFirstName(){
return firstName;}

public void setLastName(String ind){
lastName=ind;}

public String getLastName(){
return lastName;}

public void setAge(int ind){
age=ind;}
public int getAge(){
return age;}
public void setAddress(String ind){
address=ind;}
public String getAddress(){
return address;}
}

public class Main {
    
    public static void main(String[] args) {
       Main1JFrame mf=new Main1JFrame();System.out.println("9");
       mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mf.pack();System.out.println("10");
       mf.setVisible(true);  
       System.out.println("11");
    }
}
