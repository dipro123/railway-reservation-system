package com.train.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.train.dao.UserDao;
import com.train.model.User;

@RestController
public class UserController {

	@Autowired
	UserDao userDao;

	@RequestMapping(value = { "", "/", "UserLogin", "userLogout" })
	public ModelAndView homePage() {
		return new ModelAndView("UserLogin");

	}

	@RequestMapping(value = { "/userHome" })
	public ModelAndView hPage() {
		return new ModelAndView("UserHome");

	}

	@RequestMapping(value = "/UserRegister")
	public ModelAndView registerPage() {
		return new ModelAndView("UserRegister");

	}

	@RequestMapping(value = "/Login", method = RequestMethod.POST, consumes = { "application/x-www-form-urlencoded" })
	public ModelAndView loginUser(User user) {
		ModelAndView modelAndView = null;
		List<User> list = userDao.getUsers();
		for (User user2 : list) {
			if (user2.getUname().equals(user.getUname()) && user2.getPword().equals(user.getPword())) {
				modelAndView = new ModelAndView("UserHome", "message", "User Logged in Successfully");
			} else {
				modelAndView = new ModelAndView("UserLogin", "message", "Invalid Credentials");
			}
		}
		return modelAndView;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = {
			"application/x-www-form-urlencoded" })
	public ModelAndView registerUser(User user) {
		ModelAndView modelAndView = null;
		// User user1 = userDao.getUser(user.getUserId());
		List<User> list = userDao.getUsers();
		if (list != null && list.contains(user)) {
			modelAndView = new ModelAndView("UserRegister", "message", "Already Registered! Please Retry");
		} else {
			userDao.addUser(user);
			modelAndView = new ModelAndView("UserLogin", "message", "Registration Successful");
		}

		return modelAndView;

	}

	@RequestMapping(value = "/users")
	public @ResponseBody List<User> getUsers() {

		return userDao.getUsers();
	}

}
