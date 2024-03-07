package curriculum_B;

import java.text.DecimalFormat;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//DecimalFormatを使い、3桁まで0埋め
		DecimalFormat df = new DecimalFormat("00");
		
		//for文の中にfor文を入れて多重ループ処理
		for (int i = 1; i <= 9; i++) {
			for(int j = 1;j <= 9; j++) {
				System.out.printf(df.format(i) + " * " + df.format(j) + " = " + df.format(i * j) + " || ");
			}
			System.out.println(" ");
		}
		
		
	}

}
