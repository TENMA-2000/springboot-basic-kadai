package text.section_11;

public class WhileSyntax_1 {

	public static void main(String[] args) {
		
		int dice = 1; //さいころの目
		
		//6の目が出るまで処理を繰り返し続ける
		while( dice != 6) {
			//サイコロを振る（1～6の目をランダムに生成）
			dice = (int)( Math.ceil(Math.random() * 6));
			System.out.println("サイコロの目は" + dice);
		}

	}

}
