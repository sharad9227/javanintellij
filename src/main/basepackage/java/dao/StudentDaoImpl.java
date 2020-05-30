package dao;


import entities.StudentRegistrationEntity;
import interfaces.StudentDao;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.hibernate.Session;

@Repository
public  class StudentDaoImpl implements StudentDao {

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

@Override
public void registerStudent(StudentRegistrationEntity registerStudent)
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
    public boolean checkLogin(StudentRegistrationEntity validStudent) {
        return false;
    }









}