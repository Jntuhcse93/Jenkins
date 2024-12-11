public class addtwo{
public static void main (sString[] args){
	if(args.length<2){
		Syestem.out.println("Please provide two numbers as arguments");
		return;
	}
	//parse the numbers fromcommand -line arguments
	int num1= Interger.parseInt(args[0]);
	int num2= Interger.parseInt(args[1]);
	
	int sum = num1+num2;
	
	System.out.println("the sum of " + num1 + " and " + num2 +" is :" +sum);
	}
}
	
