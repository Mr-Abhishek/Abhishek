
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Info student = new Student_Info();
		student.setStudent_Id(03);
		student.setFirstName("Ashok");
		student.setLastName("Singh");
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
	    session.getTransaction().commit();
		session.close();
		sessionFactory.close(); 
		
		System.out.println("Student Record Saved");
	
	}
	
	

}
