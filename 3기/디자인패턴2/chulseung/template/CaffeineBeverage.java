package dp.template;
/*
 * http://jusungpark.tistory.com/24
 */
public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("�� ���̴� ��");
	}

	void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}

	boolean customerWantsCondiments() { // �� �޼ҵ�� ����Ŭ�������� �ʿ信 ����
		return true; // �������̵� �Ҽ� �ִ� �޼ҵ��̹Ƿ� ��ũ�̴�.
	}
	
}