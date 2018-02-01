package dp.decorator;
/*
 * ��ü�� ����(dynamic)���� ���� Ŭ������ �̿��� Ȯ���Ѵ�.
 * ���ٽ��� ���ڷ����� ������ ����ؼ� �����ϰ� ��� Ȯ���� �� �� ������, ��� ���� ���ڷ����� Ŭ�������� � ����� �����ϴ��� �˰� �־�� �ϰ� ������ Ŭ�������� ���� ����� ���� ����
 */
public class TestDecoratorMain {

	public static void main(String[] args) {
		// �׳� �밨�� ��Ű �����
		Cookie braveCookie = new BraveCookie();

		// ������ ���� �밨�� ��Ű �����
		Cookie milkBraveCookie = new MilkTopping(braveCookie);

		// ������ ���ݸ��� ���� �밨�� ��Ű �����
		Cookie chocolateMilkBraveCookie = new ChocolateTopping(milkBraveCookie);

		// ������ ������ �ѹ� �� ���� �밨�� ��Ű �����
		Cookie chocolateDoubleMilkBraveCookie = new MilkTopping(chocolateMilkBraveCookie);

		System.out.println(chocolateDoubleMilkBraveCookie.getName());

		// �Ҵ� ��Ű �����
		Cookie SodaCookie = new Cookie() {
			@Override
			public String getName() {
				return "�Ҵ� ��Ű";
			}
		};

		// ���ݸ��� �ι� ���� �Ҵ� ��Ű �����
		SodaCookie = new ChocolateTopping(new ChocolateTopping(SodaCookie));

		System.out.println(SodaCookie.getName());

	}

}
