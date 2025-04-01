package text.section_15;

public class Product {

	private String name = "";
	private int price = 0;
	private int stock = 0;

	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;

		System.out.println("【商品データ生成】" + this.name);
		System.out.println("価格:" + this.price +
				"円（税込）／在庫数:" + this.stock);
	}

	public void takeOrder(final int number) {
		System.out.println("【注文処理開始】");
		System.out.println("商品名:" + this.name);
		System.out.println("単品価格:" + this.price + "円（税込）");
		System.out.println("注文数:" + number +
				"／在庫数:" + this.stock);

		if (this.stock < number)

		{
			System.out.println(this.name + "は在庫不足です");
			return;
		}

		int total = this.price * number;
		System.out.println(number + "点で合計" + total + "円（税込）です");

		this.stock -= number;
		System.out.println(this.name + "の残り在庫は" + this.stock);

	}

}
