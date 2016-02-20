import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Transaction1 {

	public static void main(String args[]){
		 SessionFactory sf = HibernateUtil.getSessionFactory();
	        Session ses = sf.openSession();
	  
	        Transaction t = ses.beginTransaction();

	        
	        Point pt1 = new Point("1","2","kasa kay");
	        Point pt2 = new Point("2","4","kasa kay");
	        
	        ses.save(pt1);
	        ses.save(pt2);
	        
	        t.commit();
	        
	}
}
