import java.math.*;


public class Neuron {

	private float inputVal;
	private float outputVal;
	private float outputErr;
	public Neuron()
	{
		
		
	}
	void activateSigmoid ()
	{
		double val = (double)inputVal;
		outputVal = (float)(1/(Math.exp(-val)+1));

	};
	//Performs a sigmoid activation on a neuron's input and computes its output. 

	void computeOutputError ( float targetValue )
	{
		outputErr = outputVal - targetValue; 
		
	};
	//Computes the output error of a neuron in an output neuron layer by comparing the neuron's current output with the targetValue. 

	float getInput (){return inputVal;};
	//Returns the input value of a neuron. 

	float getOutput (){return outputVal;};
//	Returns the output value of a neuron. 

	void setInput(float inputV){inputVal=inputV;}

	float getOutputError (){ return outputErr;};
	//Returns the output error value of a neuron. 

	void init ( float input )
	{	
		inputVal = input;
	};
	//Initializes a neuron with an input value.
}
