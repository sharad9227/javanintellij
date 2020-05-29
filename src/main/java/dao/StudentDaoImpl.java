package dao;


import bean.StudentBean;
import entities.StudentEntity;
import entities.StudentRegistrationEntity;
import interfaces.StudentDao;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.hibernate.Session;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

public static final Logger logger= LoggerFactory.getLogger(StudentDaoImpl.class);

private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
/*get email id
    StudentDaoImpl student =new StudentDaoImpl();
    private static EntityManagerFactory entityManagerFactory =
   Persistence.createEntityManagerFactory("persistence");

    public static void main(String[] args) {
        try {
            //   persistStudents();
            findStudentsByID(1);
        } finally {
            entityManagerFactory.close();
        }
    }



    private static void findStudentsByID(int ID1) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createQuery("from  StudentEntity e  ");
        //query.setParameter("IDone", ID1);
        List<StudentEntity> resultList = query.getResultList();
        for (StudentEntity item: resultList) {
            System.out.println(item.getEmailId());
        }
        em.close();
    }*/


public void registerStudent(StudentBean registerStudent)
{

    try {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(registerStudent);
        logger.info("Person saved successfully, Person Details=" + registerStudent);
    }

    catch (Exception exception)
    {
        System.out.println(exception);
    }
}


@Override
public boolean checkLogin(StudentRegistrationEntity loginDetails)
{

return true;
}






}