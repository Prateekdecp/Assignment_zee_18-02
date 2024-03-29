package com.learning.service;

import java.util.List;
import java.util.Optional;

import com.learning.dto.Food;
import com.learning.dto.TYPE;
import com.learning.exception.AlreadyExistsException;
import com.learning.exception.IdNotFoundException;

public interface FoodService {
	public Food addFood(Food food) throws AlreadyExistsException;
	public Food getFoodById(Integer id) throws IdNotFoundException;
	public Optional<List<Food>> getAllFood();
	public String deleteFoodById(Integer id) throws IdNotFoundException;
	public Food updateFoodById(Integer id,Food food) throws IdNotFoundException;
	public Optional<List<Food>> getFoodByType(TYPE type);
}
