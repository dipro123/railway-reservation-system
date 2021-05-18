/**
 * 
 */
package com.train.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.train.model.Train;

/**
 *
 */
@Repository
public class TrainDaoImpl implements TrainDao {
	
	/** Initialize the LOGGER object */
	private static final Log logger = LogFactory.getLog(UserDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Train addTrain(Train train) {
		// TODO Auto-generated method stub
		logger.info("Inserting train in database");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(train);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			logger.error("Exception while inserting the Train: " + ex);
			throw ex;
		} finally {
			session.close();
		}
		logger.info("Train Added Successfully.");
		return train;
	}

	@Override
	public Train updateTrain(Train train) {
		// TODO Auto-generated method stub
		logger.info("Updating Train in database");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(train);
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			logger.error("Exception while updating the train: " + ex);
			throw ex;
		} finally {
			session.close();
		}
		logger.info("Train Updated Successfully.");
		return train;
	}

	@Override
	public List<Train> getTrains() {
		// TODO Auto-generated method stub
		logger.info("Getting List of trains From The Database");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List<Train> trainList = new ArrayList<Train>();
		try {
			tx = session.beginTransaction();
			trainList = session.createQuery("from Train", Train.class).list();
			tx.commit();

		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			logger.error("Exception while retrieving the Train list : " + ex);
			throw ex;
		} finally {
			session.close();
		}
		logger.info("Trains List Retrieved Successfully.");
		return trainList;
	}
	
	

}
