package dp.template;

public class Coffee extends CaffeineBeverage {
	@Override
	void brew() {
		System.out.println("���͸� ���� Ŀ�Ǹ� ������� ��");
	}

	@Override
	public void addCondiments() {
		System.out.println("������ ������ �߰��ϴ� ��");
	}
}
