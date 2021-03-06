package reload_service;



public class ReloadImpl implements Reload{

	@Override
	public void DisplayReloadCards() {
		System.out.println("code\t\tItem");
		System.out.println("1\tDialog\t");
		System.out.println("2\tHutch\t");
		System.out.println("3\tMobitel\t");
		
	}

	@Override
	public void DisplayDialogCards() {
		System.out.println("code\t\tItem\tPrice");
		System.out.println("1\tDialog-ReloadCard-50\t"+Reload.reload_50);
		System.out.println("2\tDialog-ReloadCard-100\t"+Reload.reload_100);
		System.out.println("3\tDialog-DataCard-49\t"+Reload.reload_49);
		System.out.println("4\tDialog-DataCard-99\t"+Reload.reload_99);
		System.out.println("5\tDialog-DataCard-199\t"+Reload.reload_199);
		System.out.println("6\tDialog-DataCard-249\t"+Reload.reload_249);
		
		
	}

	@Override
	public void DisplayHutchCards() {
		System.out.println("code\t\tItem\tPrice");
		System.out.println("1\tHutch-ReloadCard-50\t"+Reload.reload_50);
		System.out.println("2\tHutch-ReloadCard-100\t"+Reload.reload_100);
		System.out.println("3\tHutch-DataCard-48\t"+Reload.reload_49);
		System.out.println("4\tHutch-DataCard-99\t"+Reload.reload_99);
		System.out.println("5\tHutch-DataCard-198\t"+Reload.reload_199);
		System.out.println("6\tHutch-DataCard-649\t"+Reload.reload_249);
		
		
	}

	@Override
	public void DisplayMobitelCards() {
		System.out.println("code\t\tItem\tPrice");
		System.out.println("1\tMobitel-ReloadCard-50\t"+Reload.reload_50);
		System.out.println("2\tMobitel-ReloadCard-100\t"+Reload.reload_100);
		System.out.println("3\tMobitel-DataCard-49\t"+Reload.reload_49);
		System.out.println("4\tMobitel-DataCard-99\t"+Reload.reload_99);
		System.out.println("5\tMobitel-DataCard-199\t"+Reload.reload_199);
		System.out.println("6\tMobitel-DataCard-249\t"+Reload.reload_249);
		
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

}
