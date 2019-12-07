package subi;

public class MostFrequentDigit {
	int Mostfrequentdigit(int input1,int input2,int input3,int input4)
	{
	    int h[]={0};
	    int i;
	    if(input1==0&&input2==0&&input3==0&&input4==0)
	        return 0;
	    if(input1==0)
	        h[0]++;
	    if(input2==0)
	        h[0]++;
	    if(input3==0)
	        h[0]++;
	    if(input4==0)
	        h[0]++;
	    while(input1>0)
	    {
	        h[input1%10]++;
	        input1/=10;
	    }
	    while(input2>0)
	    {
	        h[input2%10]++;
	        input2/=10;
	    }
	    while(input3>0)
	    {
	        h[input3%10]++;
	        input3/=10;
	    }
	    while(input4>0)
	    {
	        h[input4%10]++;
	        input4/=10;
	    }
	    int index=0,max=-1;
	    for(i=0;i<10;i++)
	    {
	        if(max<=h[i])
	        {
	            max=h[i];
	            index=i;
	        }
	    }
	    System.out.print(index);
	    return index;
	    
	    
	}

	public static void main(String[] args) {
		MostFrequentDigit i  = new MostFrequentDigit();
		i.Mostfrequentdigit(123,123,123,123);
		// TODO Auto-generated method stub

	}

}
