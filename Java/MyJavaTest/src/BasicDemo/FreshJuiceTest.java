package BasicDemo;


/**这是一个枚举的事例
 * */
public class FreshJuice {
	enum FreshJuiceSize{Small,Medium,Large}
	FreshJuiceSize size;
}

public class FreshJuiceTest{
	public static void main(String [ ]args){
		FreshJuiceTest juice = new FreshJuiceTest();
		juice.size = FreshJuiceSize.FreshJuiceSize.Medium;
	}
}
