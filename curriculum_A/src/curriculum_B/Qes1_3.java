
package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
        String UserName;
        
        while(true) {
        	String input = scanner.next();
        	// 文字種チェック・・・入力可能な文字の種類は半角英数字とする。
        	if (input.matches("^[0-9a-zA-Z]+$")) {
        	break;
        	} else {
        	System.out.println("「半角英数字のみで名前を入力してください」");
        	}
        }
        
        
        while (true) {
            UserName = scanner.nextLine();
          //ユーザー名の文字数が10文字より大きい場合、再度入力を促す。
          //ユーザー名の文字数が0文字以下もしくはnullだった場合、再度入力を促す。
            if (0 < UserName.length() && UserName.length() <= 10) {
                break;
            } else if (UserName.length() <= 0) {
                System.out.println("「名前を入力してください」");
            } else {
                System.out.println("「名前を10文字以内にしてください」");
            }
        }
        
        //ユーザー名が正常な値だった場合、コンソールに出力する。
        System.out.println("ユーザー名「" + UserName + "」を登録しました");
        scanner.close();
		
		
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[] hands = {"グー","チョキ","パー"} ;
        System.out.print("名前: ");
        int man, pc, result, count = 0;
        while (true) {
            count++;
            System.out.print("0：グー、1：チョキ、2：パー");
            pc = rnd.nextInt(3);
            do {
                man = sc.nextInt();
            } while (man < 0 || 2 < man);
            System.out.println(UserName + "の手は「" + hands[man] + "」");
            System.out.println("相手の手は「" + hands[pc] + "」");
            result = (pc - man + 3) % 3;
            if (result == 0) {
                System.out.println("DROW あいこ もういっかい！");
                continue;
            } else if (result == 1) {
                System.out.println("おめでとう！");
                System.out.println("また遊んでね！");
                System.out.println("勝つまでにかかった回数は" + count + "回です！");
                break;
            } else {
                System.out.println("ざんねん！");
                System.out.println("惜しかったね！");
                System.out.println("また挑戦してね！");
            }
            break;
        }
        
        
      
		
        
        
        
        
	}

}
