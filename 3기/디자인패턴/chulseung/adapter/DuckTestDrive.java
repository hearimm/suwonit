package dp.adapter;
/*
 * Ŭ���̾�Ʈ���� ����͸� ����ϴ� ���.

1. Ŭ���̾�Ʈ���� Ÿ�� �������̽��� ����Ͽ� �޼ҵ带 ȣ�������ν� ����Ϳ� ��û�� �Ѵ�.
2. ����Ϳ����� ���Ƽ �������̽��� ����Ͽ� �� ��û�� ���Ƽ �� ���� �ϳ� �̻��� �޼ҵ带 ȣ��� ��ȯ�Ѵ�.
3. Ŭ���̾�Ʈ������ ȣ�� ����� �ޱ� ������ �߰��� ����Ͱ� �� �ִ����� ���� ���� ���Ѵ�.


��ó: http://jusungpark.tistory.com/22 [������������]
 */
public class DuckTestDrive {

	public static void main(String[] args) {

		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("The Duck says...");
		testDuck(duck);

		System.out.println("The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
