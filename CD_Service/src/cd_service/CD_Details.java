package cd_service;

public interface CD_Details {
	
	public int Battle_Ship = 500;
	public int AxisandAllies = 650;
	public int BurnCycle = 800;
	public int DarkCastle = 1000;
	public int Earth_Command = 1200;
	
	public int windows_7 = 4000;
	public int windows_8 = 4000;
	public int windows_10 = 4000;
	public int windows_11 = 4000;
	public int virus_gurd = 4000;
	
	public int batman_DarkKnight = 200;
	public int Spiderman_homecoming = 200;
	public int Iron_man = 200;
	public int Avengers_Endgame = 200;
	public int Black_Panther = 200;
	
	public void DisplayCDDetails();
	public void DisplayGamingCD();
	public void DisplaySoftwareLicenceCD();
	public void DisplayMoviesandCartoonsCD();
	public int calculateBill(int qty , int price);
	
	

}
