package BasicDemo;
/**
 * 这是一个多重条件语句的示例
 * 1、当achievements等于100，则奖励笔记本电脑；
 * 2、当achievements大于90而小于100，就奖励MP4
 * 3、当achievements大于80而小于90，奖励网卡
 * 4、当achievements大于60而小于80，不给予奖励
 * 5、当achievements小于60，暑假补习*/
public class conditional {

	public static void main(String[] args) {
		int achievement=85;
		if(achievement ==100){
			System.out.println("奖励一台电脑");
		}
		else if((achievement >=90)&&(achievement<100)){
			System.out.println("奖励一台MP4");
		}
		else if((achievement >=80)&&(achievement<90)){
			System.out.println("奖励一块网卡");
		}
		else if((achievement >=60)&&(achievement<80)){
			System.out.println("没有奖励");
		}
		else if(achievement<60){
			System.out.println("需要补习");
		}
	}

}
