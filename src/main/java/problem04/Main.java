package problem04;

public class Main {

	static String map = "";

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		int a = 0; // 위치 
		int re = 0;
		
		randommap();
		
		while(a < 20) {
			m++;
			int randomint = (int)(Math.random() * 4 +1);
			System.out.println(m+". "+randomint);
			System.out.println(map);
			
			a = a + randomint;
			
			System.out.println(a);
			for (int i = 0; i < a; i++) {
				System.out.print(" ");
			}
			System.out.println("^");
			
			if(a >= 20) {
				a = 20;
				break;
				
			}
			
			if(map.charAt(a) == 'O') {
				n++;
				continue;
			}
			
			else {
				n++;
				re++;
				randommap();
				a = 0;
			}
			
		}
		
		System.out.println(m);
			
	}

	private static void randommap() {

		int num1 = 0;
		int num2 = 0;
		
		map = "";
		while (num1 < 10 || num2 < 10) {
			int intvalue = (int) (Math.random() * 2);

			if (intvalue == 1) {
				if (num1 < 10) {
					map = map + "#";
					num1++;
				}
			} else {
				if (num2 < 10) {
					map = map + "O";
					num2++;
				}
			}
		}
	}

}
