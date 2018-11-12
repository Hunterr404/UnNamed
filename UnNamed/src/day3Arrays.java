
public class day3Arrays {

	public static void main(String[] args) {
		int FirstArray[][]= {{12,13,14,15},{2,3,4},{2,4,6,86,88,95}};
		int SecondArray[][]= {{88,86,84},{71,61},{12,23,2}};
		System.out.println("This is the first Array");
		Display(FirstArray);
		System.out.println("This is the second Array");
		Display(SecondArray);
		}
		public static void Display(int x[][]) {
			for(int row=0; row<x.length;row++) {
				for(int column=0; column<x[row].length; column++) {
					System.out.print(x[row][column]+ "\t");
				}
				System.out.println();
			}
		}
		}

