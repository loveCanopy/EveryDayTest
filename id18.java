package D13;
public class id18{

	  public static void main(String[] args) {
	  	
	  	id18 test=new id18();
	  	System.out.println(test.getValidateCode("21012419950215101"));
	  }


	   int[] weight={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};

	   char[] validate={'1','0','X','9','8','7','6','5','4','3','2'};

	  public char getValidateCode(String id){
	 
	  	int sum=0;
	  	int mode=0;
	  	for(int i=0;i<id.length();i++){

	  		sum=sum+Integer.parseInt(String.valueOf(id.charAt(i)))*weight[i];

	  	}
	    mode=sum%11;
	    return validate[mode];

	  }


	}