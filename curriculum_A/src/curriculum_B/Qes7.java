package curriculum_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes7 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("生徒の人数を入力してください（2以上)：");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		List<生徒> list = new ArrayList<>();
		for (int i = 0; i< n; i++) {
			System.out.print((i + 1) + "人目の『英語』の点数を入力してください：");
			int 英語  = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print((i + 1) + "人目の『数学』の点数を入力してください：");
			int 数学 = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print((i + 1) + "人目の『理科』の点数を入力してください：");
			int 理科 = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print((i + 1) + "人目の『社会』の点数を入力してください：");
			int 社会 = scanner.nextInt();
			scanner.nextLine();
			
			list.add(new 生徒(i + 1,英語,数学,理科,社会));
			System.out.println();
			
		}
		
		list.forEach(生徒::平均点出力);
		System.out.println();
		
		System.out.printf("英語の平均点は %.2f 点です。%n", list.stream().mapToInt(生徒::英語).average().getAsDouble());
		System.out.printf("数学の平均点は %.2f 点です。%n", list.stream().mapToInt(生徒::数学).average().getAsDouble());
		System.out.printf("理科の平均点は %.2f 点です。%n", list.stream().mapToInt(生徒::理科).average().getAsDouble());
		System.out.printf("社会の平均点は %.2f 点です。%n", list.stream().mapToInt(生徒::社会).average().getAsDouble());
		System.out.printf("全体の平均点は %.2f 点です。%n", list.stream().mapToDouble(生徒::平均点).average().getAsDouble());
		
	}

}

	record 生徒(int cnt,int 英語,int 数学,int 理科,int 社会) {
	public int 合計点() {
		return 英語 + 数学 + 理科 + 社会;
	}
	
	public double 平均点() {
		return 合計点() / 4.0;
	}
	
	public void 平均点出力() {
		System.out.printf("%d人目の平均点は %.2f 点です。%n",cnt,平均点());
	}
	
	
}

