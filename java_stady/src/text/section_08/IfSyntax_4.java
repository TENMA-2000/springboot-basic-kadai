package text.section_08;

public class IfSyntax_4 {

	public static void main(String[] args) {
		//0～4のいずれかをランダムに生成
		int randNum = (int)(Math.random() * 5);
		
		//乱数randNumの値を出力
		System.out.println(randNum);
		
		//randNumが[1より大きい]かつ[3より小さい]
		if((1 < randNum)&&(randNum <3 )) {
			System.out.println("randNumは1より大きい、かつ3より小さい値です");
		}else {
			System.out.println("and条件が成り立ちません");
		}
		
		//randNumが[1に等しい]または[3に等しい]
		if((randNum == 1)||(randNum == 3)) {
			System.out.println("randNumは1、または3です");
		}else {
			System.out.println("or条件が成り立ちません");
		}

	}

}
