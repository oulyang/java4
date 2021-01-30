package m1d304;
/*
public class customer implements Menu{
	public void Potato() {
		System.out.println("diancai");
	}
	public void Egg() {
		System.out.println("点菜 鸡蛋");
	}

}
*/
//接口调用者
public class customer{
	private Menu FoodMenu;
	
	public void order() {
		Menu m1=this.getFoodMenu();
		m1.Egg();
		m1.Potato();
	}
	public customer(){
		
	}
	public customer(Menu FoodMenu) {
		this.FoodMenu=FoodMenu;
	}
	public Menu getFoodMenu() {
		return FoodMenu;
	}
	public void setFoodMenu(Menu foodMenu) {
		this.FoodMenu = foodMenu;
	}
	
/*
	public void Potato() {
		System.out.println("diancai");
	}
	public void Egg() {
		System.out.println("点菜 鸡蛋");
	}
	*/

}
