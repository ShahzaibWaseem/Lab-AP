import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FeeSlipDatabase {
	public static void main( String[] args ){
         FeeSlips shahzaib = new FeeSlips();
         shahzaib.setId(2);
         shahzaib.setregNumber(3113);
         shahzaib.setfirstName("Kamran");
         shahzaib.setlastName("Ijaz");
         shahzaib.setfeeMonth("January");
         shahzaib.setcurrentDate("15-11-2018");
         
         Configuration con = new Configuration().configure().addAnnotatedClass(FeeSlips.class);
         SessionFactory factory = con.buildSessionFactory();
         
         /*Inserting Data*/
         Session session = factory.openSession();
         Transaction t = session.beginTransaction();
         session.save(shahzaib);
         t.commit();

         session.save(shahzaib);
         System.out.println("Record Successfully Saved!!!");
         
         /***** Viewing Data *****/
         List<FeeSlips> records = (List<FeeSlips>)session.createQuery("FROM feeslips").list();
         Iterator<FeeSlips> iter = records.iterator();
         while(iter.hasNext()){
        	 FeeSlips rec = iter.next();
        	 System.out.println(rec.getfirstName());
         }
         
         /***** Deleting Data *****/
         records = (List<FeeSlips>)session.createQuery("FROM feeslips WHERE id=\'1\'").list();
         iter = records.iterator();
         while(iter.hasNext()){
        	 t = session.beginTransaction();
        	 FeeSlips rec = iter.next();
        	 session.delete(rec);
        	 t.commit();
         }
         
    }
}