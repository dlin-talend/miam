package my.stomach;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;

import my.food.ChaShaoBao;
import my.food.DanDanMian;
import my.food.Food;
import my.food.Pizza;

public class Stomach {
/*hello my last test*/
	List<Food> foodsInside = new ArrayList<Food>();
	/*make it clear*/
	public Stomach() {
		foodsInside.add(new ChaShaoBao());
		foodsInside.add(new ChaShaoBao("pork", "oyster", "bread"));
		/* Exercise 2 : add your food */
		foodsInside.add(new Pizza()); //want more Pizza
		foodsInside.add(new DanDanMian()); //want more Pizza
		foodsInside.add(new Pizza()); //want more Pizza
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("My stomach contains " + foodsInside.size() + " food(s):\n\n");
		for (Food food : foodsInside) {
			sb.append(foodsInside.indexOf(food) + 1 + ")");
		
			/* Display the name of the food object */
			sb.append(food.getClass().getSimpleName() + ":");
			sb.append("\n");
			
			/* Display the list of ingredients */
			sb.append(food.getIngredients());
			sb.append("\n\n");
			
			/* Display the list of country areas */
			sb.append(food.getCountryOrigin());
			sb.append("\n\n");
			
			/* Exercise 3: Display the country of origin see class Country */ 
			
		}
		return sb.toString();
	}
}
