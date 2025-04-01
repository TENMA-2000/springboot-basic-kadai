package text.section_09;

public class Lessen {

	public static void main(String[] args) {
		
		int ago = 3;
		String price = "";
		
		price = switch(ago) {
			case 1 -> "10代の料金は1000円";
			case 2 -> "20代の料金は2000円";
			case 3 -> "30代の料金は3000円";
			case 4 -> "40代の料金は4000円";
			case 5 -> "50代の料金は5000円";
			default -> "上記以外は500円";
		};
		
		System.out.println(price);

	}

}
