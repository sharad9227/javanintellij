package controllers;

import entities.StudentRegistrationEntity;
import interfaces.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@ComponentScan("controllers")
public class StudentRegistrationController

{

   @Autowired
   private StudentServiceInterface studentServiceInterface;


   @Qualifier("clientService")
   public void setStudentService(StudentServiceInterface studentServiceInterface){
      this.studentServiceInterface=studentServiceInterface;
   }
   @RequestMapping(value = "register",method = RequestMethod.POST,produces = "application/json; charset=UTF-8")

      public String registerStudent(HttpServletRequest request,@RequestBody StudentRegistrationEntity requestUserDetails){


      //StudentRegistrationEntity student=new StudentRegistrationEntity();
      studentServiceInterface.registerStudent(requestUserDetails);
      return "True";




   }




}
