package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	private static final int MAX = 11;
	private static Scanner scanner = new Scanner(System.in);
	private static Random r = new Random();
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] strs= scanner.nextLine().split("、");
		for(String str:strs) {
			int n = r.nextInt(MAX);
			String cap = str + "の残りの台数は" + n + "台です";
			switch(str) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				break;
			case "テレビ":
			case "ディスプレイ":
				cap = "ディスプレイ".equals(str)?str + "の残りの台数は" + (MAX - n) + "台です":cap;
				break;
			default:
				cap = "『" + str + "』は指定ではありません";
			}
			System.out.println(cap);
		}
		
	}

}
