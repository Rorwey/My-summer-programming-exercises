package BasicDemo;

public class Punny {
	int puppyAge;
	public Punny(String name) {
		System.out.println("С���������ǣ�"+name);		
	}
	public void setAge(int age){
		puppyAge = age;
	}
	
	public int getAge(){
		System.out.println("С��������Ϊ��"+puppyAge);
		return puppyAge;
	}
	
	public static void main(String [ ]args){
		Punny myPuppy = new Punny("����");
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("����ֵ��"+myPuppy.puppyAge);
	}
}
