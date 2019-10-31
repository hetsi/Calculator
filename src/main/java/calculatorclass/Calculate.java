package calculatorclass;
import java.util.Scanner;



	public class Calculate {

		public static void main(String[] args) {
			Calculate calc = new Calculate();
			//calc.Operation();
		}
		
		public void Operation() {
			Scanner scan = new Scanner(System.in);
			int selection = 0;
			double fst = 0,sec = 0;
			boolean isFstNum = false, isSecNum = false;
			
			System.out.println("Make you operation selection");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			
			if(scan.hasNextInt()) {
				selection = scan.nextInt();
			}
				System.out.println("Enter first num:");
				if(scan.hasNextDouble()) {
					fst = scan.nextDouble();
					System.out.println("Enter second num:");
					if(scan.hasNextDouble()) {
						sec = scan.nextDouble();
						if(selection == 1) {
							Addition add = new Addition();
							System.out.println("Result : " + add.Add(fst, sec));
						}
						else if(selection == 2) {
							Subtraction sub = new Subtraction();
							System.out.println("Result : " + sub.Subtract(fst, sec));
						}
						else if(selection == 3) {
							Multiplication mul = new Multiplication();
							System.out.println("Result : " + mul.Multiply(fst, sec));
						}
						else if(selection == 4) {
							Division div = new Division();
							System.out.println("Result : " + div.Divide(fst, sec));
						}
						else if(selection == 5) {
							Modulus module = new Modulus();
							System.out.println("Result : " + module.Module(fst, sec));
						}
						else {
							System.out.println("Input is not supported");
						}
					}
					else {
						System.out.println("Value is not supported");
						scan.next();
					}
				}
				else {
					System.out.println("Value is not supported");
					scan.next();
				}
		}
	}


