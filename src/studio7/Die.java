package studio7;

public class Die {
	private int sides;
	private int value;

	public static void main(String[] args) {
		Die toss = new Die(10000);
		toss.Print();
		
	}
	public Die(int sides)
	{
		this.sides = sides;
		int random = (int)(Math.random()*sides);
		this.value = random+1;
		
	}
	public void Print()
	{
		System.out.println("The die has " + this.sides + " sides and rolled a value of " + this.value);
	}

}
