package com.train.dao;

import java.util.List;

import com.train.model.Train;


public interface TrainDao
{
	
	public Train addTrain(Train train);
	
	public Train updateTrain(Train train);
	
	public List<Train> getTrains();

}