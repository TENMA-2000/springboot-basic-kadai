package text.section_08;

public class IfSyntax_3 {

	public static void main(String[] args) {
		// 0～9のいずれかをランダムに生成
		int randNum = (int)(Math.random() * 10);
		
		//乱数randNumの値を出力
		System.out.println(randNum);
		
		//当たりはずれの処理
		if( randNum == 9) {
			System.out.println("大当たりです");
		} else if( randNum == 8 ) {
			System.out.println("当たりです");
		}else {
			System.out.println("はずれです");
		}

	}

}
