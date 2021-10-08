
public class labnr2 {
	public static void main(String[] args) {
		Box B1 = new Box();
		Box B2 = new Box(3);
		Box B3 = new Box(3,15,12);
		
		System.out.println("First Box");
		System.out.println("Box's size: " + B1.showRes());
		System.out.println("Box's surface area: " + B1.aria() + " cm2");
		System.out.println("Box's volume: " + B1.volume() + " cm3");
		
		System.out.println("\nSecond Box");
		System.out.println("Box's size: " + B2.showRes());
		System.out.println("Box's surface area: " + B2.aria() + " cm2");
		System.out.println("Box's volume: " + B2.volume() + " cm3");
		
		System.out.println("\nThird Box");
		System.out.println("Box's size: " + B3.showRes());
		System.out.println("Box's surface area: " + B3.aria() + " cm2");
		System.out.println("Box's volume: " + B3.volume() + " cm3");
		
		
		
		Queue q1 = new Queue(5);
		Queue q2 = new Queue();
		System.out.println("\n\nFirst Queue");
		
		q2.push(21);
		q2.push(15);
		q2.push(5);
		q2.push(10);
		
		q2.pop();
		q2.empty();
		q2.full();
		
		System.out.println("\n\nNext Queue");
		
		
		q1.push(20);
		q1.push(13);
		q1.push(18);
		q1.push(69);
		q1.push(66);
		
		q1.empty();
		q1.full();
	}
}
