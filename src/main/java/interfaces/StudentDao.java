package interfaces;

import bean.StudentBean;
import entities.StudentRegistrationEntity;

public interface StudentDao {
    //register|add student
    void registerStudent(StudentBean studentReg);
    //checking login
    boolean checkLogin(StudentRegistrationEntity validStudent);

}
