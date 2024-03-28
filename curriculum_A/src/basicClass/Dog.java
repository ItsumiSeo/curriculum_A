package basicClass;

public class Dog {

	// Q1：フィールドに動物の名前の変数を定義してください。
	String inu;
	// Q2：フィールドに動物の数の変数を定義してください。
	int number;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		this.inu = "犬";
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(String inu, int number) {
		this.inu = inu;
		this.number = number;
	}
}
