import java.util.*;
class Extraction {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		String temp="",output="";
		char c=' ';
		boolean flag=false;
		int sum=0;
		for(int i=0;i<input.length();i++){
			if(Character.isDigit(c=input.charAt(i))) 
				flag=true;
			if(!Character.isDigit(c)) {
				if(flag) 
					temp+=" ";
				flag=false;
			}
			if(flag)
				temp+=c;
		}
		temp+=" ";
		s=new Scanner(temp);
		int i=0;
		while(s.hasNext()) {
			System.out.print((i=s.nextInt())+"+");
			sum+=i;
		}
		System.out.println("="+sum);
	}
}