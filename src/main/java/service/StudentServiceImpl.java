package service;

import bean.StudentBean;
import entities.StudentRegistrationEntity;
import interfaces.StudentDao;
import interfaces.StudentServiceInterface;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentServiceInterface {

private StudentDao studentDao;
    public void setPersonDAO(StudentDao student) {
        this.studentDao = student;
    }

    @Transactional
    public void registerStudent(StudentBean student) {
        this.studentDao.registerStudent(student);
    }




    @Override

    public boolean checkLogin (StudentRegistrationEntity student) {
        return this.studentDao.checkLogin(student);
    }


}
