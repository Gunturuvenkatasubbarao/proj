package com.ltts.project.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.project.model.Booking;
import com.ltts.project.model.RoomDetails;


@Repository
public class RoomDao {
	@Autowired
	private EntityManager em;
	
	@Autowired
	private SessionFactory sf;
	
	
	public boolean InsertRoomDetails(RoomDetails r) {
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(r);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
//		finally {
//			sf.close();
//	}
//		
		return b;
	}
	public List<RoomDetails> getAllRoomDetails(){
		Session session=sf.openSession();
        session.beginTransaction();
        
        List<RoomDetails> li=sf.openSession().createCriteria(Booking.class).list();
        //List<ProductsModel> product=sessionFactory.openSession().createCriteria(ProductsModel.class).list();
        
        session.getTransaction().commit();
     
		return li;
		
	}
	

	
	}
