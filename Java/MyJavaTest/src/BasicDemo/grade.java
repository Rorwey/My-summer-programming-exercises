package BasicDemo;

public class grade {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int Chinese = 90;
		int English = 75;
		int Math = 90;
		int Art = 85;
		int Avg = (Chinese + English + Math + Art) / 4;
		if ((Avg > 0) && (Avg <= 100)) {
			System.out.println("���ѧ��������ƽ���ɼ��ǣ�" + Avg);

			if ((Avg > 90) && (Avg <= 100)) {
				System.out.println("���ѧ��Ӧ��A������");
			} else if ((Avg > 80) && (Avg <= 90)) {
				System.out.println("���ѧ��Ӧ��B������");
			} else if ((Avg > 70) && (Avg <= 80)) {
				System.out.println("���ѧ��Ӧ��C����-");
			} else if ((Avg >= 60) && (Avg <= 70)) {
				System.out.println("���ѧ��Ӧ��D������");
			} else {
				System.out.println("���ѧ��Ӧ��E��������");
			}
		}
	}

}
