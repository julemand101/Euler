package euler.problems;

public interface IProblem {
	public int getID();
	
	public String getDescription();
	
	public double getAnswer();
	
	public double test(boolean verbose);
}
