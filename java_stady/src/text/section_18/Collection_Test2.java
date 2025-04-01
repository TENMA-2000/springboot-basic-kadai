package text.section_18;

import java.util.ArrayList;

public class Collection_Test2 {

	public static void main(String[] args) {
		
		ArrayList<String> humanList = new ArrayList<String>();
		
		humanList.add("Kato");
		humanList.add("Tanaka");
		humanList.add("Yamada");
		
		humanList.remove(0);
		
		for(int i = 0; i < humanList.size(); i++ ) {
			System.out.println(humanList.get(i));
		}

	}

}
