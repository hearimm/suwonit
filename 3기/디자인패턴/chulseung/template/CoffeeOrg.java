package dp.template;

public class CoffeeOrg {
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	public void boilWater() {
		System.out.println("�� ���̴� ��");
	}

	public void brewCoffeeGrinds() {
		System.out.println("���͸� ���� Ŀ�Ǹ� ������� ��");
	}

	public void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}

	public void addSugarAndMilk() {
		System.out.println("������ ������ �߰��ϴ� ��");
	}

}
