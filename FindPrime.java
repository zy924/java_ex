public class FindPrime{
	public static int[] creat_nums(int i){
		int[] nums = new int[i-2];
		for(int j=0;j<i-2;j+=1){
			nums[j]=j+2;}
		return nums;
		}

	public static void main(String args[]){
	System.out.println("***2-10000 prime***");
	int n = 0;
	outer: for(int i=3;i<10000;i+=2){    //even number will not be a prime
		int[] nums = creat_nums(i);		//creat array
		for(int j:nums){                 //Enhanced for loop
			if(i%j==0)
				continue outer;
	}
		System.out.print(" "+i);
		n++;
		if (n<10)							//creat a new line when n>=10
			continue;
		System.out.println( );
		n=0;
	}
	System.out.println( );
	}
}