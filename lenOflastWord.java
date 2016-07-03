public static int lengthofWord(String s){
		
		if(s.isEmpty()) return 0;
		int j=s.length()-1;
		while(j>=0&&s.toCharArray()[j]==' ') j--;
		if(j<0) return 0; //一个单词
		for(int i=j;i>0;i--){
			if(s.toCharArray()[i]==' ') return j-i;
		    if(s.toCharArray()[i]!=' '&&i==0) return j-i+1;
		
		}
		return 0;
	}