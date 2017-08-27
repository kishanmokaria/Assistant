package assistant;

public class MathFunc {
	char in;
	int intCal (int a,char c ,int b) {
		if (c == '+') {
			return a + b;
		}
		else if (c == '-') {
			return a - b;
		}
		else if (c == '/') {
			return a / b;
		}
		else if (c == '*') {
			return a * b;
		}
		else 
			return 0;
	}
	float floatCal (float a,char c ,float b) {
		if (c == '+') {
			return a + b;
		}
		else if (c == '-') {
			return a - b;
		}
		else if (c == '/') {
			return a / b;
		}
		else if (c == '*') {
			return a * b;
		}
		else 
			return 0;
	}
	double doubleCal (double a,char c ,double b) {
		if (c == '+') {
			return a + b;
		}
		else if (c == '-') {
			return a - b;
		}
		else if (c == '/') {
			return a / b;
		}
		else if (c == '*') {
			return a * b;
		}
		else 
			return 0;
	}
	
}
