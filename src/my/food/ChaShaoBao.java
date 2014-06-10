package my.food;

import java.util.ArrayList;
import java.util.List;


public class ChaShaoBao implements Food {

	List<String> ingredients = new ArrayList<String>();
	
	/* Exercise 1: implement Constructor */
	
	public ChaShaoBao(String pork,String oyster,String bread){
		ingredients.add(pork);
		ingredients.add(oyster);
		ingredients.add(bread);
	}
	
	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String getCountryOrigin() {
		return "ËÄ´¨";
	}

	@Override
	public Integer getCalory() {
		return 1500;
	}

}
