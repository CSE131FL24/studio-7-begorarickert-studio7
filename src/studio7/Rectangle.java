package studio7;

public class Rectangle {
	private int length;
	private int width;
	private int area;
	private boolean isSquare;
	private boolean isLarger;
	public static void main(String[] args) 
	{
		Rectangle info = new Rectangle(10,8,100);
		Rectangle infoTwo = new Rectangle(100,100,100);
		info.info();
		infoTwo.info();
		
		
	}
	public Rectangle(int length, int width, int compareArea)
	{
		this.length = length;
		this.width = width;
		if(width==length)
		{
			this.isSquare=true;
		}
		else
		{
			
			this.isSquare=false;
		}
		this.area = length*width;
		if(this.area>compareArea)
		{
			this.isLarger = true;
		}
		else
		{
			this.isLarger = false;
		}
	}
	public void info()
	{
		System.out.println("Length: " + this.length + " Width: " + this.width + " Area: " + this.area + " Is a Sqaure: " + this.isSquare + " Is it larger than the other rectangle: "+ this.isLarger);
	}
	
}