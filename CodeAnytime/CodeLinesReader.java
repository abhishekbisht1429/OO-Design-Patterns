import java.io.*;
class CodeLinesReader {
	public static void main(String[] args) {
		BufferedReader bR=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file Name : ");
		try(PushbackInputStream pbis=new PushbackInputStream(new FileInputStream(bR.readLine()))) {
			int c,lastPrinted=0,whitespace=0;
			System.out.println("************************Contents of the File***************************");
			while((c=pbis.read())!=-1) {
				switch(c) {
					case 13 : pbis.read();//skip 10 
					          if((c=pbis.read())==13) {
								  while((c=pbis.read())==10||c==13) {
									  //this loop will skip the unnecessary lines
								  }
							  }
							  if(c==-1) 
								  break;
							  else
							      pbis.unread(c);
							  //System.out.print("lastPrinted : "+lastPrinted);
							  if(lastPrinted!=10&&lastPrinted!=0) {
							      System.out.println();
								  lastPrinted=10;
							  }
					          break;
							 

					case 9  :   whitespace=9;
					case 32 :   whitespace=32;
					            if(!(lastPrinted==10))
									System.out.print((char)whitespace);
						        break;
					case 47 : if((c=pbis.read())==47) {
						        while((c=pbis.read())!=13) {
									  //skip single line comment
								 }
								 if(c==-1)
								  break;
							     pbis.unread(c);//push back 13
					          }
							  else if(c==42) {
								  while(true) {
									  //This loop is to skip multi-line comments
									  c=pbis.read();
									  if(c==42) {
										  if((c=pbis.read())==47) {
											  break;
										  }
										  else
											  pbis.unread(c);
									  }
								  }
							  }
							  //pbis.unread(c);
							  break; 
					default : System.out.print((char)c);
					          lastPrinted=c;
					          break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}