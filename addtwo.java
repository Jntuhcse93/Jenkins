public class addtwo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments");
            return;
        }
        
        // Parse the numbers from command-line arguments
        int num1 = Integer.parseInt(args[0]);  // Corrected typo here
        int num2 = Integer.parseInt(args[1]);  // Corrected typo here
        
        int sum = num1 + num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
