package reload_service;

public interface Reload {
	
	public int reload_100 = 100;
	public int reload_50 = 50;
	public int reload_49 = 49;
	public int reload_99 = 99;
	public int reload_199 = 199;
	public int reload_249 = 249;
	public int reload_48_hutch = 48;
	public int reload_198_hutch = 198;
	public int reload_649_hutch = 649;
	
	public void DisplayReloadCards();
	public void DisplayDialogCards();
	public void DisplayHutchCards();
	public void DisplayMobitelCards();
	public int calculateBill(int qty , int price);
	
	

}
