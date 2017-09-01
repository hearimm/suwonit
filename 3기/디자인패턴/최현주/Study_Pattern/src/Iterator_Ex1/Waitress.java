package Iterator_Ex1;

public class Waitress {
	IMenu pancakeHouseMenu;
    IMenu dinerMenu;
    IMenu cafeMenu;

    public Waitress(IMenu pancakeHouseMenu, IMenu dinerMenu)
    {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
//        this.cafeMenu = cafeMenu;
	}

	public void printMenu()
	{
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
//        Iterator cafeIterator = cafeMenu.createIterator();

        System.out.println("�޴�\n----��ħ �޴�\n");
		printMenu(pancakeIterator);
		System.out.println("\n���� �޴�");
		printMenu(dinerIterator);
//		System.out.println("\n���� �޴�");
//        printMenu(cafeIterator);
    }

	private void printMenu(Iterator iterator)
	{
		while(iterator.hasNext())
		{
			MenuItem menuItem = (MenuItem)iterator.next();

			System.out.println(menuItem.GetName() + ", " + menuItem.GetPrice() + "--" + menuItem.GetDescription());
		}
	}
}
