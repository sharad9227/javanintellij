package controllers;

import bean.StudentBean;
import entities.StudentRegistrationEntity;
import interfaces.StudentDao;
import interfaces.StudentServiceInterface;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import service.StudentServiceImpl;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")

public class StudentRegistrationController

{
   @Autowired(required=true)
   private StudentDao dao;

   @Qualifier(value="studentService")
public void setStudentService(StudentDao StudentDao){
   this.dao = StudentDao;
}

   @RequestMapping(value = "/register",method = RequestMethod.POST,produces = "application/json; charset=UTF-8",
           consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})

      public String registerStudent(HttpServletRequest request,@RequestBody StudentBean requestUserDetails){


      //StudentRegistrationEntity student=new StudentRegistrationEntity();
      dao.registerStudent(requestUserDetails);
      return "True";




   }




}
