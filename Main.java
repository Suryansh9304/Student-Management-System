package StudentManagement;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      ArrayList<IIT> studentAccount = new ArrayList();
      Scanner sc = new Scanner(System.in);
      new Random();

      while(true) {
         while(true) {
            System.out.println("Hi if you want to add a new Student Account click on 1 or \nIf you want to show your details click 2 or \nIf you want to check your Fee Balance click 3 or \nEnter 4 for updating Student name \nEnter 5 for updating Student Password \nEnter 6 for updating Student Roll Number \nEnter 7 for Exit");
            int num = sc.nextInt();
            switch (num) {
               case 1:
                  sc.nextLine();
                  System.out.println("Enter Student name:");
                  String StudentName = sc.nextLine();
                  System.out.println("Enter Student id:");
                  String StudentID = sc.nextLine();
                  System.out.println("Enter phone number:");
                  String PhoneNumber = sc.nextLine();
                  System.out.println("Enter Course:");
                  String Course = sc.nextLine();
                  System.out.println("Enter Roll Number:");
                  String Roll_Number = sc.nextLine();
                  System.out.println("Enter Branch:");
                  String Branch = sc.nextLine();
                  System.out.println("Enter Year:");
                  String year = sc.nextLine();
                  System.out.println("Enter Password:");
                  String password = sc.next();
                  System.out.println("Enter Initial Fees Amount:");
                  String initialFeesAmount = sc.next();
                  IIT newStudentAccount = new IIT(StudentName, StudentID, PhoneNumber, Course, Roll_Number, Branch, year, password, initialFeesAmount);
                  studentAccount.add(newStudentAccount);
                  break;
               case 2:
                  IIT selectedAccount = selectAccount(sc, studentAccount);
                  if (selectedAccount != null) {
                     System.out.println("Enter Your Password");
                     int userPassword = sc.nextInt();
                     System.out.println("This is your Student details");
                  }
               case 3:
            }
         }
      }
   }

   private static IIT selectAccount(Scanner sc, ArrayList<IIT> studentAccount) {
      return null;
   }
}
