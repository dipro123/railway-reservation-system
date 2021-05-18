package com.train.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.train.dao.TrainDao;
import com.train.model.Train;

@RestController
public class TrainController {

	@Autowired
	TrainDao trainDao;
	
	@RequestMapping(value = { "/addTrainView" })
	public ModelAndView addTrainPage() {
		return new ModelAndView("AddTrain");

	}

	@RequestMapping(value="/addTrain",method=RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
	public ModelAndView addTrain(Train train)
	{
		ModelAndView modelAndView = null;
		// User user1 = userDao.getUser(user.getUserId());
		List<Train> list = trainDao.getTrains();
		if (list != null && list.contains(train)) {
			modelAndView = new ModelAndView("AddTrain", "message", "Train is Present Already");
		} else {
			trainDao.addTrain(train);
			modelAndView = getTrains();
		}

		return modelAndView;
	}
	
	@RequestMapping(value="/viewTrain")
	public ModelAndView getTrains()
	{
		ModelAndView modelAndView = null;
		List<Train> trainList = trainDao.getTrains();
		if (trainList != null) {
			modelAndView = new ModelAndView("ViewTrain", "trainList", trainList);
		}
		else
		{
			modelAndView = new ModelAndView("ViewTrain", "message", "No Trains Found");
		}
		
		return modelAndView;
	}
	
	@RequestMapping(value="/updateTrain",method=RequestMethod.POST )
	public Map<String,Object> updateTrain(@RequestBody Train train)
	{
		Map<String,Object> response =new HashMap<String, Object>();
		Train train1 = null;
		try {
		train1 = trainDao.updateTrain(train);
		response.put("message","Train updated successfully!");
		}
		catch(Exception e) {
			response.put("message", "Update error"+e.toString());
		}
		
		response.put("train", train1);
		return response;
	}
	
}
