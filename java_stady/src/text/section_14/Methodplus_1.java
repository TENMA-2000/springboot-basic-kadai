package text.section_14;

public class Methodplus_1 {

	public static void main(String[] args) {
		
		addPostage(1000);
		
		addPostage(1200);

	}
	
	public static void addPostage( final int price) {
		int total = price + 500;
		System.out.println("送料込みの料金は" + total +"円");
	}

}
