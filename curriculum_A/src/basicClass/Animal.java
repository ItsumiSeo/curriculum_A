package basicClass;

public class Animal {
	public static void main(String[] args) {
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		dog.inu = "動物の名前";
		System.out.println(dog.inu);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog();
		dog2.number = Integer.MIN_VALUE;
		System.out.println(dog2.number);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		System.out.println(java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s")));
	}
}