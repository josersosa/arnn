
public class NeuronLayer {

	Neuron [] neuronLayer;
	NeuronLayer backLayer;
	WeightMatrix wmx;
	int size;
	boolean inputLayer;
	
	public NeuronLayer(int sizeL , WeightMatrix i_wmx)
	{
		neuronLayer  = new Neuron[sizeL];
		wmx= i_wmx;
	}
	
	void computeLayerError ( Pattern pattern )
	{
		int i;
		int size = neuronLayer.length;
		
		for(i=0;i<size;i++)
		{
			neuronLayer[i].computeOutputError((float)pattern.l_pattern[i]);
		}		
		
	}
	//Computes the output error values of all neurons in a layer by comparing the output with a target pattern. 

	void computeOutput ()
	{
		int i;
		int size = neuronLayer.length;
		
		if(!inputLayer){
			
			for(i=0;i<size;i++)
			{
				float [] inputWeights = wmx.getInputWeights(i);
				int j;
				float tmpVal=0;
				for(j=0;j<inputWeights.length;j++)
				{
					tmpVal = tmpVal + (inputWeights[j]*backLayer.neuronLayer[j].getOutput());
				}
				neuronLayer[i].setInput(tmpVal);
				neuronLayer[i].activateSigmoid();
			}
		}
	}
	//Computes the output values of all neurons in a layer. 

	float[] getLayerError (){return null;}
	//Returns the output error values of all neurons in a layer. 

	float[] getOutput (){return null;}
	//Returns the output values of all neurons in a layer. 

	void setInput ( InputValue value ){}
	//Sets a value as an input to a neuron layer. 
	//Only used by the input layer of a Kohonen Feature Map. 

	void setInput ( Pattern pattern ){}
	//Sets a pattern as an input to a neuron layer. 
	//Only used by the input layer of a Backpropagation Net. 

	int size (){return size;}
	//Returns the number of neurons in a layer.
}
