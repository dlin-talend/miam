package my.country;
/*Exercise M3*/
public enum Country {
	
	France("france"), Italy("italy"), China("china"), Spain("spain");
	
	
	private String label;
	Country(String label){
		this.label = label;
	}
	
	public String getLabel(){
		return this.label;
	}
}
