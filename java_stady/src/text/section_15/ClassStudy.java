package text.section_15;

public class ClassStudy {

	public static void main(String[] args) {
		
		Product shampoo = new Product("シャンプー", 800, 10);
		Product coffee = new Product("コーヒー", 500, 5);
		
		shampoo.takeOrder(7);
		
		coffee.takeOrder(3);
		
		shampoo.takeOrder(5);

	}

}
