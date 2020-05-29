package interfaces;

import bean.StudentBean;
import entities.StudentRegistrationEntity;

public interface StudentServiceInterface {

    //register|add student
    void registerStudent(StudentBean bean);
    //checking login
    boolean checkLogin(StudentRegistrationEntity validStudent);




}
