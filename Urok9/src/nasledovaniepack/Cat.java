package nasledovaniepack;
 
public class Cat extends Animal{
 
    private String color;
 
    public Cat(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="White";
    }
 
    public Cat(boolean veg, String food, int legs,String color){
        super(veg, food, legs);
        this.color=color;
    }
 
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getEats() {
    	System.out.println("Fish");
        return eats();
    }

	private String eats() {
		// TODO Auto-generated method stub
		return null;
	}
}