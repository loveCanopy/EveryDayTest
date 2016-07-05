package D13;



//数组，找出连续的一段，其和最大
//使用动态规划 sum[i]=max(num[i],sum[i-1]+num[i])

public class maxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxArray(a));
        
	}

	
	public static int maxArray(int[] a){
		
		int len=a.length;
		int res=0;
		int[] sum=new int[len];
		for(int i=1;i<len-1;i++){
			sum[i]=Math.max(sum[i-1]+a[i],a[i]);
			res=Math.max(sum[i], res);
		}
	return res;	
	}
	
	
	
}
