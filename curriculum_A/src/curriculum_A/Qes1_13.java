package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//【概要】変数の初期化と宣言処理
		//【詳細】ローカル変数を初期化と宣言する
		byte ten = 0;
		short hyaku = 0;
		int sen = 0;
		long man = 0L;
		float syousuu = 0.0f;
		double syousuuten = 0.0d;
		char ei = '\u0000';
		String greeting = null;
		boolean bln = false;
		//【概要】変数初期化と代入処理
		//【詳細】ローカル変数を初期化し、値を代入する
		ten = 10;
		hyaku = 100;
		sen = 1000;
		man = 10000;
		syousuu = 9.5f;
		syousuuten =10.5;
		ei = 'a';
		greeting = "ハロー";
		bln = true;
		//【概要】コンソール出力処理
		//【詳細】代入した変数を使用し、コンソールへ出力する
		System.out.println(ten + hyaku + sen + man);
		System.out.println(ten + ten);
		System.out.println(ei + greeting + bln);
		System.out.println(ten + hyaku + sen + man + syousuu + syousuuten);
		System.out.println(ten * hyaku * sen * man);
		System.out.println(syousuuten / hyaku);
		System.out.println(ten - hyaku);
		//【概要】修正処理
		//【詳細】ハローJAVA2023からハローJAVA43へ修正する
		String num = "20";
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		num = "4";
		num1 = 3;
		System.out.println("ハローJAVA" + (num + num1));
		//【概要】変数代入と出力処理
		//【詳細】自己紹介文を変数に代入し、コンソールへ出力する
		String name = "山田太郎";
		int old = 18;
		double height = 170.5;
		float weight = 62.2f;
		String like = "寿司";
		System.out.println("初めまして" + (name) + "です");
		System.out.println("年齢は" + (old) + "歳です");
		System.out.println("身長は" + (height) + "cmです");
		System.out.println("体重は" + (weight) + "kgです");
		System.out.println("好きな食べ物は" + (like) + "です");
		//【概要】計算処理
		//【詳細】上記で使用した変数を用いてBMIを計算する
		System.out.println("BMIは" + String.format("%.1f", (weight / height *100 / height*100))+ "です");
		//【概要】変数の再代入処理
		//【詳細】上記で使用した変数を再代入し、コンソールへ出力しなおす
		name = "鈴木一郎";
		old = 24;
		height = 168.5;
		weight = 64.2f;
		like = "オムライス";
		System.out.println("初めまして" + (name) + "です");
		System.out.println("年齢は" + (old) + "歳です");
		System.out.println("身長は" + (height) + "cmです");
		System.out.println("体重は" + (weight) + "kgです");
		System.out.println("好きな食べ物は" + (like) + "です");
		System.out.println("BMIは" + String.format("%.1f", (weight / height *100 / height*100))+ "です");
		//【概要】自己代入処理
		//【詳細】上記で使用した変数を自己代入し、再度コンソールへ出力する
		old = old + 24;
		height = height + 168.5;
		weight = weight + 64.2f;
		System.out.println("年齢は" + (old) + "歳です");
		System.out.println("身長は" + (height) + "cmです");
		System.out.println("体重は" + (weight) + "kgです");
		System.out.println("好きな食べ物は" + (like) + "です");
		System.out.println("BMIは" + String.format("%.2f", (weight / height *100 / height*100))+ "です");
		//【概要】再代入処理
		//【詳細】上記で自己代入したものに再代入する
		old = old - 24;
		//【概要】条件分岐処理
		//【詳細】if文を使用せず、24歳以上ならtrueを返す
		bln = old >= 25? true : false;
		System.out.println(bln);
		//【概要】再代入処理
		//【詳細】上記で自己代入したものに再代入する
		height = height - 168.5;
		weight = weight - 64.2f;
		//【概要】文字列型への型変換処理
		//【詳細】年齢・身長・体重をStringへ変換する 
		String old2 = String.valueOf(old);
		String height2 = String.valueOf(height);
		String weight2 = String.valueOf(weight);
		System.out.println(old2 + height2 + weight2 );
		//【概要】整数型へ型変換処理
		//【詳細】年齢・身長をint型へ変換する
		int old3 = (int)old;
		int height3 = (int)height;
		System.out.println(old3);
		System.out.println(height3);
		//【概要】条件分岐処理
		//【詳細】上記で使用した年齢・身長が25もしくは160以上であればtrueを返す
		bln = old3 >= 25 || height3 >= 160 ? true : false;
		System.out.println(bln);

		
	}

}
