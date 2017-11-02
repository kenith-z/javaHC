package cn.edu.gzccc.soiec.st2016.c07.zhangguancheng;
/**
 * 
 * @author zhang
 *
 */
public class Longlong {
	/**加数*/
	private String lTOne;
	/**被加数*/
	private String lTTwo;
	/**相加结果倒叙*/
	private String result="";
	/**进位*/
	private int carry=0;
	public Longlong(String lTOne,String lTTwo){
	   this.lTOne=lTOne;
	   this.lTTwo=lTTwo;
}
	
	
	
	public void plus(){
	   String str="";
	   for(int l=0;l<Math.abs(lTTwo.length()-lTOne.length());l++){
	            str+="0";
	    }
	   if(lTOne.length()<lTTwo.length()){
	   
		   lTOne=str+lTOne;
	   }
	   else{
		   lTTwo=str+lTTwo;
	   }
	   for(int i=lTOne.length()-1;i>=0;i--){
	    int a=lTOne.charAt(i)-48;
	    int b=lTTwo.charAt(i)-48;
	   
	    int res=0;
	    if(a+b+carry>=10){
	    
	     res=a+b+carry-10;
	     result+=res;
	     carry=1;
	    
	    }
	    else{
	   
	     res=a+b+carry;
	     result+=res;
	     carry=0;
	    
	    }
	   }
	   if(carry>0){
	    result+=carry;
	   }
	   for(int i=result.length()-1;i>=0;i--){
	    System.out.print(result.charAt(i));
	   }
	}


	public void reduCtion(){
		   String str="";
		   String c="";
		   int q = 0;
		   for(int l=0;l<Math.abs(lTTwo.length()-lTOne.length());l++){
		            str+="0";
		    }
		   if(lTOne.length()<lTTwo.length()){
		   
			   lTOne=str+lTOne;
			   c=lTTwo;
			   lTTwo=lTOne;
			   lTOne=c;
			   q=1;
		   }
		   else{
			   lTTwo=str+lTTwo;
		   }
		   for(int i=lTOne.length()-1;i>=0;i--){
			   
		    int a=lTOne.charAt(i)-48;
		    int b=lTTwo.charAt(i)-48;
		    a+=carry;
		    int res=0;
		    if(a-b<0){
		    
		     res=10+a-b;
		     result+=res;
		     carry=-1;
		    
		    }
		    else{
		   
		     res=a-b;
		     result+=res;
		     carry=0;
		    
		    }
		   }//字符串反转
		   String st = new StringBuilder(result).reverse().toString(); 
		   //正则表达式去0
		   st=st.replaceAll("^(0+)", "");
		   if(1==q){
			    st="-"+st;
			   }
		   System.out.println(st);
		   
		   
		   
		}
 
}
