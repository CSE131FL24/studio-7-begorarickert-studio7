package studio7;

public class Fraction {
	private int fractionNum;
	private int fractionDem;
	private int fractionNumAdd;
	private int fractionDemAdd;
	private int fractionNumMul;
	private int fractionDemMul;
	private int fractionNumSim;
	private int fractionDemSim;
	public static void main(String[] args) {
		Fraction call = new Fraction(80,100,4,6);
		call.Print();
	}
	
	public Fraction(int numOne, int demOne, int numTwo, int demTwo)
	{
		this.fractionNum=numOne;
		this.fractionDem=demOne;
		this.fractionNumAdd = numOne*demTwo+numTwo*demOne;
		this.fractionDemAdd = demOne*demTwo;
		this.fractionNumMul = numOne*numTwo;
		this.fractionDemMul = demOne*demTwo;
		int gcd = findGCD(numOne, demOne);  // find the greatest common divisor
		this.fractionNumSim=numOne/gcd;
		this.fractionDemSim=demOne/gcd;
	        
	}
	 private static int findGCD(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return findGCD(b, a % b);  // recursive call to find GCD
	    }
	 public void Print()
	 {
		 System.out.println("The inital num: "+this.fractionNum+" The intial dem: " +this.fractionDem +" Add Num: "+ this.fractionNumAdd+" Add Dem: "+this.fractionDemAdd+" Mul Num: "+this.fractionNumMul+" MulDem: " +this.fractionDemMul+" Simp sim: "+this.fractionNumSim+ " Sim Dem: " +this.fractionDemSim);
	 }

}
