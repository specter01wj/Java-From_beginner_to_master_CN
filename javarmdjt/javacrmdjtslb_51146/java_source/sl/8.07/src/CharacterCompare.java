public class CharacterCompare {
	public static void main(String args[]) {
		Character char1 = new Character('h');
		Character char2 = new Character('H');
		boolean b = char1.equals(char2);
		System.out.println(b);
		Character char3 = char1.toLowerCase(char1);
		Character char4 = char2.toLowerCase(char2);
		boolean bb = char3.equals(char4);
		System.out.println(bb);
	}
}