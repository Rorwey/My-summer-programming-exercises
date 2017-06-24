package BasicDemo;

public class grade {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int Chinese = 90;
		int English = 75;
		int Math = 90;
		int Art = 85;
		int Avg = (Chinese + English + Math + Art) / 4;
		if ((Avg > 0) && (Avg <= 100)) {
			System.out.println("这个学生的所有平均成绩是：" + Avg);

			if ((Avg > 90) && (Avg <= 100)) {
				System.out.println("这个学生应得A，优秀");
			} else if ((Avg > 80) && (Avg <= 90)) {
				System.out.println("这个学生应得B，良好");
			} else if ((Avg > 70) && (Avg <= 80)) {
				System.out.println("这个学生应得C，良-");
			} else if ((Avg >= 60) && (Avg <= 70)) {
				System.out.println("这个学生应得D，及格");
			} else {
				System.out.println("这个学生应得E，不及格");
			}
		}
	}

}
