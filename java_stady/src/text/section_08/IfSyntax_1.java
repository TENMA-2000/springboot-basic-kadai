package text.section_08;

public class IfSyntax_1 {

	public static void main(String[] args) {
		
		//0～9のいずれかをランダムに生成（乱数を10倍して小数部分を切り捨て）
		int randNum = (int)(Math.random() * 10);
		
		//乱数randNumの値を出力
		System.out.println(randNum);
		
		//当たり外れ判定
		if( randNum == 9 ) {
			System.out.println("大当たりです");
		}

	}

}
