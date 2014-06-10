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
		return "Si Chuan";
	}

	@Override
	public Integer getCalory() {
		return 1500;
	}
	class Pork{
		private String name;
		
		private int calory;
		
		public Pork(String name,int calory){
			this.name = name;
			this.calory = calory;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCalory() {
			return calory;
		}

		public void setCalory(int calory) {
			this.calory = calory;
		}
	}
	class Oystersauce{
		private String name;
		
		private int calory;
		
		public Oystersauce(String name,int calory){
			this.name = name;
			this.calory = calory;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCalory() {
			return calory;
		}

		public void setCalory(int calory) {
			this.calory = calory;
		}
	}
	class Bread{
		private String name;
		
		private int calory;
		
		public Bread(String name,int calory){
			this.name = name;
			this.calory = calory;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCalory() {
			return calory;
		}

		public void setCalory(int calory) {
			this.calory = calory;
		}
	}
}
