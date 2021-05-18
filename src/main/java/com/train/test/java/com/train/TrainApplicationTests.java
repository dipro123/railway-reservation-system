package com.train;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.train.dao.TrainDao;
import com.train.dao.UserDao;
import com.train.model.Train;
import com.train.model.User;

@SpringBootTest
class TrainApplicationTests {

	@Mock
	UserDao userDao;
	@Mock
	TrainDao trainDao;

	// ******************************** Test Cases for User*******************************
	@Test
	public void testAddUser() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		User user = new User("admin", "12345", "Admin", "Admin", "Address", "987654321", "xyz@gmail.com");
		when(userDao.addUser(user)).thenReturn(user);

		try {
			User user1 = userDao.addUser(user);
			assertEquals(user, user1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The exception is : " + e);
			e.printStackTrace();
		}

	}

	@Test
	public void testGetUsers() {
		// given
		User user = new User("admin", "12345", "Admin", "Admin", "Address", "987654321", "xyz@gmail.com");
		User user1 = new User("admin1", "123465", "Admin1", "Admin1", "Address1", "9876543210", "bcxyz@gmail.com");
		ArrayList<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user1);

		when(userDao.getUsers()).thenReturn(list);

		// when
		List<User> result = userDao.getUsers();

		// then
		assertEquals(result.size(), list.size());
		assertEquals(result.get(0).getFirstname(), list.get(0).getFirstname());
	}

	// ******************************** Test Cases for Train*******************************

	@Test
	public void testAddTrain() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		Train train = new Train(788, "Sonar Bangla Express", "Dhaka", "Chittagong", 500, 1200);
		when(trainDao.addTrain(train)).thenReturn(train);

		try {
			Train train1 = trainDao.addTrain(train);
			assertEquals(train, train1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The exception is : " + e);
			e.printStackTrace();
		}

	}

	@Test
	public void testGetTrains() {
		// given
		Train train = new Train(788, "Sonar Bangla Express", "Dhaka", "Chittagong", 500, 1200);
		Train train1 = new Train(741, "Turna Express", "Chittagong", "Dhaka", 500, 1100);
		ArrayList<Train> list = new ArrayList<Train>();
		list.add(train);
		list.add(train1);

		when(trainDao.getTrains()).thenReturn(list);

		// when
		List<Train> result = trainDao.getTrains();

		// then
		assertEquals(result.size(), list.size());
		assertEquals(result.get(0).getTrainname(), list.get(0).getTrainname());
	}

}
