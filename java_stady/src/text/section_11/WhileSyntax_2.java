package text.section_11;

public class WhileSyntax_2 {

	public static void main(String[] args) {
		
		int dice = 1; //サイコロの目
		int cnt = 0; //繰り返す回数
		
		//6が出るまでの処理を繰り返す
		while( dice != 6) {
			
			//くりかえ回数が5回以上になったら強制終了
			if( 5 <= cnt) {
				System.out.println("5回に達したため強制終了します");
				break;
			}
			
			//サイコロを振る（1～6の目をランダムで生成）
			dice = (int)(Math.ceil(Math.random() * 6));
			System.out.println("サイコロの目は" + dice);
			
			//1回サイコロ振ったので。繰り返し回数を1プラス
			cnt++;
		}

	}

}
