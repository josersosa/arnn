
public abstract class NeuralNet {

	
	boolean displayNow()
	{
		return true;
		
	}
	
	boolean finishedLearning()
	{
		return false;
		 
	}
	
	String getElapsedTime()
	{
		return null;
	}
	
	int getLearningCycle()
	{
		return 1;
	}
	
	double getLearningRate()
	{
		return 0;
	}
	
	int getMaxLearningCycles()
	{
		return 1;
	}
	
	void resetTime (){}
	//Resets the net's learning time. 

	void setDisplayStep ( int displayStep ){}
	//Sets a value that indicates the interval to display the net. 

	void setLearningRate ( double learningRate ){}
	//Sets the learning rate of a neural net. 

	void setMaxLearningCycles ( int maxLearningCycles ){}
	//Sets the number of learning cycles, the net shall perform. 
	//If -1, the net has no maximum cycle.
	
}
