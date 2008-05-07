import java.util.*;

public class WeightMatrix {
	
	int xSize , ySize;
	boolean withBias;
	float [][] weightMatrix;
	float [] Biases;
	public WeightMatrix(int i_xSize, int i_ySize, boolean i_withBias)
	{
		this.xSize= i_xSize;
		this.ySize = i_ySize;
		this.withBias = i_withBias;
		weightMatrix = new float[xSize][ySize];
		
		
	}
	
	void changeWeights ( float[] precLayer, float[] succLayer, double learningRate )
	{
		
		
	}
	//Changes all weights using the Backpropagation learning algorithm. 
	//Only used by BackpropagationNet. 

	/*void changeWeightsKFM ( float[] precLayer, float[] succLayer, double learningRate )
	{
		
	}*/
	//Changes all weights using the Selforganization learning algorithm. 
	//Only used by KohonenFeatureMap. 

	float[] getBiases ()
	{
		return Biases;
	}
	//Returns the values of all biases in a weight matrix. 

	float[] getInputWeights ( int targetNeuron )
	{
		
		float [] inputWeights = new float[xSize] ;
		int i;
		for(i=0;i<xSize;i++)
		{
			inputWeights[i] = weightMatrix[i][targetNeuron];
		}

		return inputWeights;
	}
	//Returns the values of all incoming weights that lead to the neuron with number targetNeuron. 

	float[] getOutputWeights ( int sourceNeuron )
	{
		float [] outputWeights = new float[ySize] ;
		
		int i ;
		for(i=0;i<xSize;i++)
		{
			outputWeights[i] = weightMatrix[sourceNeuron][i];
		}

		return outputWeights;
		
	}
	//Returns the values of all outgoing weights that lead away from the neuron with number sourceNeuron. 

	float[][] getWeights ()
	{
		return weightMatrix;
	}
	//Returns the values of all weights in a weight matrix. 

	void init ()
	{
		int i,j;
		
		
		for(i=0;i<xSize;i++)
		{
			for(j=0;j<ySize;j++)
			{
				weightMatrix[i][j]=RandUtils.getRange(0.0f, 1.0f);				
			}
			
		}
		
		
	}
	//Initializes all weights with values ranging from -1.0 to 1.0. 

	void init ( float[][] weight )
	{
		
	}
	//Initializes all weights with specified values stored in weight. 
	
	/*
	void init ( InputValue[] iv, int dimension )
	{
		
		
	}
	//Initializes all weights with InputValues stored in iv that have the dimension dimension. 
	//Only used by KohonenFeatureMap. 
	*/
	
	int size ()
	{
		return xSize*ySize;
	}
	//Returns the number of weights in a weight matrix.

	
}
