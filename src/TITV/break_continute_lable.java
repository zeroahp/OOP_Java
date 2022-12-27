package TITV;

public class break_continute_lable {

	
	//break
//	public static void main(String[] args) {
//		int out, in;
//		outer : for(out = 0 ; out <10 ; out++) {
//					for(in = 0; in< 20 ;in++) {
//						if(in < 10)
//							break outer;
//					}
//					System.out.println("Ben trong vong lap out = "+ out + "va in = "+ in);
//				}
//		System.out.println("Ben ngoai vong lap out = "+ out + "va in = ");
//
//	}
	//continute
	public static void main(String[] args) {
		int out, in;
		outer : for(out = 2 ; out <=9 ; out++) {
					for(in = 1; in<= 10 ;in++) { 
						if(out < 5)
							continue outer;
						System.out.println(out + "x" +in+ "="+(out*in));
					}
					System.out.println("------------");
				}
	}
}
