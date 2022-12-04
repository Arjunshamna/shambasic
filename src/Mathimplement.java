
public class Mathimplement {

	public static void main(String[] args) {
		Math m=new Math(4,67);
		
		System.out.println(" Add:" + m.add()  + " Sub:"+ m.sub() + " Div:"+ m.div());
	
	
		
		Math n=new Math(6,5);
		
		System.out.println(" Add:" + n.add()  + " Sub:"+ n.sub() + " Div:"+ n.div());
		
		System.out.println(" Add:" + n.add(3,4)  );
		
		System.out.println(" Add:" + Math.add(2,2)  );
		
		
		System.out.println(" Reverse String: " + UtilClass.reverseString("asdfghj"));
		


	}

}
