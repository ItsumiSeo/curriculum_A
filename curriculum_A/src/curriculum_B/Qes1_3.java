
package curriculum_B;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	private static final Scanner scanner = new Scanner(System.in);
	private static final Random random = new Random();
	private static final Map<Integer, String> comment = createComment();

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String name = getUserName();

		int result = Janken.DRAW;
		int cnt = 0;
		while (result != Janken.WIN) {
		// nameの手は「パー」
		Janken user = Janken.HANDS[random.nextInt(Janken.HANDS.length)];
		System.out.printf("%sの手は「%s」%n", name, user.getHandCaption());
		// 相手の手は「グー」
		Janken cpu = Janken.HANDS[random.nextInt(Janken.HANDS.length)];
		System.out.printf("%sの手は「%s」%n", "相手", cpu.getHandCaption());
		System.out.println();
		// 結果表示
		result = user.battle(cpu);
		System.out.println(comment.get(result * 10 + cpu.getHandNo()));
		System.out.println();
		cnt++;
		}
		
		// ・じゃんけんを行った回数を表示してください
		System.out.printf("勝つまでにかかった合計回数は%d回です%n", cnt);
		}

		private static String getUserName() {
		// ・コンソールにユーザー名を入力できるようにしてください
		String name = scanner.nextLine();
		if (name == null || name.length() == 0) {
		// ・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		System.out.println("「名前を入力してください」");
		return getUserName();
		} else if (name.length() > 10) {
		// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		System.out.println("「名前を10文字以内にしてください」");
		return getUserName();
		} else if (!name.matches("[0-9a-zA-Z]*")) {
		// ・ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
			System.out.println("「半角英数字のみで名前を入力してください」");
			return getUserName();
			} else {
			// ・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
			System.out.printf("ユーザー名「%s」を登録しました%n", name);
			}
			return name;
			}

			private static Map<Integer, String> createComment() {
			Map<Integer, String> comment = new HashMap<>();
			String line = System.lineSeparator();
			for (Janken hand : Janken.HANDS) {
			comment.put(getKey(Janken.WIN, hand), "やるやん。" + line + "次は俺にリベンジさせて");
			comment.put(getKey(Janken.DRAW, hand), "DRAW あいこ もう一回しましょう！");
			}
			comment.put(getKey(Janken.LOOSE, Janken.ROCK), "俺の勝ち！" + line + "負けは次につながるチャンスです！" + line + "ネバーギブアップ！");
			comment.put(getKey(Janken.LOOSE, Janken.SCISSORS), "俺の勝ち！" + line + "たかがじゃんけん、そう思ってないですか？" + line + "それやったら次も、俺が勝ちますよ");
			comment.put(getKey(Janken.LOOSE, Janken.PAPER), "俺の勝ち！" + line + "なんで負けたか、明日まで考えといてください。" + line + "そしたら何かが見えてくるはずです");
			return comment;
			}

			private static Integer getKey(int winLoose, Janken hand) {
			return winLoose * 10 + hand.getHandNo();
			}
			}

/* Janken.java */
class Janken {
public static final int WIN = 2;
public static final int LOOSE = 1;
public static final int DRAW = 0;
// ・「0はグー、1：チョキ、2：パー」とすること
public static final int ROCK_NO = 0;
public static final int SCISSORS_NO = 1;
public static final int PAPER_NO = 2;
public static final String ROCK_CAPTION = "グー";
public static final String SCISSORS_CAPTION = "チョキ";
public static final String PAPER_CAPTION = "パー";

public static final Janken ROCK = new Janken(ROCK_NO, ROCK_CAPTION);
public static final Janken SCISSORS = new Janken(SCISSORS_NO, SCISSORS_CAPTION);
public static final Janken PAPER = new Janken(PAPER_NO, PAPER_CAPTION);
public static final Janken[] HANDS = {ROCK, SCISSORS, PAPER};

private int handNo;
private String handCaption;

private Janken(int handNo, String handCaption) {
this.handNo = handNo;
this.handCaption = handCaption;
}

public final int getHandNo() {
return handNo;
}

public final String getHandCaption() {
return handCaption;
}
public int battle(Janken enemy) {
return (this.handNo + 3 - enemy.getHandNo()) % 3;
}

/* Janken.java */
		
        
        
        
        
	}


