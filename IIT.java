package StudentManagement;

public class IIT {
   String Student_name;
   String Student_id;
   String Course;
   String Branch;
   String Roll_number;
   String Phone_number;
   String Year;
   String Fees_amount;
   String Password;

   public IIT(String student_name, String student_id, String course, String branch, String roll_number, String year, String fees_amount, String password, String phone_number) {
      this.Student_name = student_name;
      this.Student_id = student_id;
      this.Course = course;
      this.Branch = branch;
      this.Roll_number = roll_number;
      this.Year = year;
      this.Fees_amount = fees_amount;
      this.Password = password;
      this.Phone_number = phone_number;
   }

   public String getStudent_name() {
      return this.Student_name;
   }

   void show_my_details(String user_password) {
      if (user_password == this.Password) {
         System.out.println("student_name::" + this.Student_name);
         System.out.println("student_id::" + this.Student_id);
         System.out.println("course::" + this.Course);
         System.out.println("branch::" + this.Branch);
         System.out.println("roll_number::" + this.Roll_number);
         System.out.println("year::" + this.Year);
         System.out.println("fees_amount::" + this.Fees_amount);
         System.out.println("password::" + this.Password);
         System.out.println("                                       ");
         System.out.println("                                       ");
         System.out.println("===================================================");
      } else {
         System.out.println("PASSWORD IS WRONG...:(   ..try again...!");
         System.out.println("=================================================");
      }

   }

   void check_fees(String user_password) {
      if (user_password == this.Password) {
         System.out.println(this.Fees_amount);
         System.out.println("                                       ");
         System.out.println("                                       ");
         System.out.println("===================================================");
      } else {
         System.out.println("PASSWORD IS WRONG...:(   ..try again...!");
         System.out.println("=================================================");
      }

   }

   void updateStudent_name(int otp, int user_input_otp, String new_Student_name) {
      if (otp == user_input_otp) {
         this.Student_name = new_Student_name;
         System.out.println("STUDENT NAME has been updated successfully, The New Student Name is :" + this.Student_name);
      } else {
         System.out.println("OTP is Wrong... :(  ");
      }

   }

   void updateStudent_password(int otp, int user_input_otp, String new_password) {
      if (otp == user_input_otp) {
         this.Student_name = new_password;
         System.out.println("PASSWORD has been updated successfully, The New Password is :" + this.Password);
      } else {
         System.out.println("OTP is Wrong... :(  ");
      }

   }

   void updateRoll_number(int otp, int user_input_otp, String new_roll_number) {
      if (otp == user_input_otp) {
         this.Student_name = new_roll_number;
         System.out.println("ROLL NUMBER has been updated successfully, The New Roll Number is :" + this.Roll_number);
      } else {
         System.out.println("OTP is Wrong... :(  ");
      }

   }
}
