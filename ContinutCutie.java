import java.util.ArrayList;
import java.util.List;


interface Component
{	
	void showPrice();
}

class Leaf implements Component
{
	int price;
	String name;
	
	public Leaf(String name, int price) {
		super();
		this.price = price;
		this.name = name;
	}


	public void showPrice()
	{
		System.out.println(name + " : " + price + " $");
	}
	
}

class Composite implements Component
{
	String name;
	List<Component> components = new ArrayList<>();
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponent(Component com)
	{
		components.add(com);
	}
	
	public void showPrice()
	{
		System.out.println(name);
		for(Component c : components)
		{
			c.showPrice();
		}
	}

}