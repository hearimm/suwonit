package dp.adapter;

public class TurkeyAdapter implements Duck {

	Turkey turkey;//�������̽��� �ٸ��� ������ Turkey��ü�� �ٷ� ����� ���� ����.

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
