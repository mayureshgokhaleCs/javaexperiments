import java.io.PrintStream;

public class Prog8
{
  public static void main(String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 1)
    {
      System.out.println("Usage: java Prog8 <serial code>");
      System.exit(1);
    }
    x localx = new x(paramArrayOfString[0]);
    localx.d();
    //convert hex to integer
    
    String exp="5d347e8987883486798a798687793479827b7d82797986797834887c7d87";
	char[] charA = exp.toCharArray();
    int i=0;
    	while(i<charA.length){
   char a=charA[i];
   String k=String.valueOf(a);
   char b=charA[i+1];
   String c=String.valueOf(a)+String.valueOf(b);
   String words=compute(c);
  System.out.print(words);
  i=i+2;
   
    	}
   
  }

private static String compute(String c) {
int a=Integer.parseInt(c, 16);  ;
a=a-20;
 return(Character.toString ((char) a));
}
}

