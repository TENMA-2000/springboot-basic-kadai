package text.section_17;

public class Keisyo_Main1 {

	public static void main(String[] args) {
		
		//Keisyo_Kato1クラスのオブジェクトを作る
		Keisyo_Kato1 kato = new Keisyo_Kato1();
		
		
		//体重を設定する
		kato.weight = 70.0;
		//慎重を設定する（BMIでは１６０cmは１．６と表します。）
		kato.height = 1.6;
		
		//BMIを計算する
		double bmi = kato.calcBmi(kato.weight, kato.height);
		//BMIを出力する
		System.out.println("BMIは" + bmi);
		
		

	}

}
