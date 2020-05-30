package service;

import entities.StudentRegistrationEntity;
import interfaces.StudentDao;
import interfaces.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentServiceInterface {

    private  StudentDao dao;
@Autowired
    public void setStudentDao(StudentDao dao) {
        this.dao = dao;
    }



    @Override
    @Transactional
    public void registerStudent(StudentRegistrationEntity student) {
        this.dao.registerStudent(student);
    }




    @Override

    public boolean checkLogin (StudentRegistrationEntity student) {
        return this.dao.checkLogin(student);
    }


}
