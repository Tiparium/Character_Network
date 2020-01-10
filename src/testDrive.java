
/**
 * Basically this is just here to make sure certain aspects of the program run and don't immediately crash.
 * @author Nainoa Faulkner-Jackson
 *
 */
public class testDrive {

	public static void main(String[] args) {
		testNetworkInsertion();
	}
	
	//Test to see if characters are added to the network properly
	public static void testNetworkInsertion() {
		net_char Barry = new net_char("Barry Bluejeans", "Human/Lich", "Is a lich, likes swimming", null);
		net_char Lup = new net_char("Lup Taaco", "Elf/Lich", "Is a lich, likes Barry", null);
		fullnetwork net = new fullnetwork();
		System.out.println(net.addChar(Barry));
		System.out.println(net.addChar(Barry));
		System.out.println(net.addChar(Lup));
		System.out.println(net.addChar(Lup));
		System.out.println(net.getChars().get(0));
		
		System.out.println(net.addConnection(Barry, Lup, 10, 8, 1, "Barry Likes Lup", "Lup is pretty fond of Barry"));
		System.out.println(net.addConnection(Barry, Lup, 10, 8, 1, "Barry Likes Lup", "Lup is pretty fond of Barry"));
		
	}

}
