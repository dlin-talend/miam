package my.food;

import java.util.ArrayList;
import java.util.List;

import my.country.Country;

public class DanDanMian implements Food {
	List<String> ingredients = new ArrayList<String>();

	/* Exercise 1: implement Constructor */
	public DanDanMian(){
		ingredients.add("noodle");
		ingredients.add("spices");
		ingredients.add("peanuts");
	}
	
	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String getCountryOrigin() {
		return Country.Italy.getLabel();
	}

//	@Override
//	public Integer getCalory() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
