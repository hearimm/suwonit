package dp.template;

public class Tea extends CaffeineBeverage {
	@Override
	void brew() {
		System.out.println("���� ������� ��");
	}

	@Override
	public void addCondiments() {
		System.out.println("������ �߰��ϴ� ��");
	}

}
