package interfaces;


import entities.StudentRegistrationEntity;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    //register|add student
    void registerStudent(StudentRegistrationEntity studentReg);
    //checking login
    boolean checkLogin(StudentRegistrationEntity validStudent);

}
