package D13;

import java.util.Arrays;

public class threeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s={1,1,1,1,2,3,4};
		
		System.out.println(threeCloest(s, 3));
		
	}
    public static String threeCloest(int[] a ,int num){
    	int len=a.length;
    	 Arrays.sort(a);
    	int res=Integer.MAX_VALUE;
    	int result=num;
    	int left = 0,right = 0;
    	int i;
    	for(i=0;i<len;i++){
    		if(i>0&&a[i]==a[i-1]){
    			continue;
    		}
    		int m=a[i];
    	     left=i+1;
    		 right=len-1;
    		while(left<right){
    			int n=a[left];
    			int k=a[right];
    			int sum=m+n+k;
    			if(sum==num){
    				return i+""+left+""+right;
    			}else{
    				if(Math.abs(num-sum)<=res){
    					res=Math.abs(num-sum);
    					result=sum;
    				}
    				
    				
    			if(sum<num){
    				left++;
    				while(a[left]==a[left-1]){
    					left++;
    				}
    
    			}
    			
    			if(sum>num){
    				right--;
    				while(a[right]==a[right+1]){
    					right--;
    				}
    				
    				
    				
    			}
    			
    			}
    			
    			
    		}
    		
    		
    		
    	}
    	
    	return i+""+left+""+right;
    }
	
	
	
	
	
	
	
}
