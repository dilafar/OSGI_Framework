package cd_service;



public class CD_DetailsImpl implements CD_Details{

	@Override
	public void DisplayCDDetails() {
		System.out.println("code\tItem\t");
		System.out.println("1\tGaming - CD\t");
		System.out.println("2\tSoftwareLicence - CD\t");
		System.out.println("3\tMovies & Cartoons - CD\t");
		
	}

	@Override
	public void DisplayGamingCD() {
		System.out.println("code\tItem\tPrice");
		System.out.println("1\tBattleShip\t"+CD_Details.Battle_Ship);
		System.out.println("2\tAxis and Allies\t"+CD_Details.AxisandAllies);
		System.out.println("3\tBurn Cycle\t"+CD_Details.BurnCycle);
		System.out.println("4\tDark Castle\t"+CD_Details.DarkCastle);
		System.out.println("5\tEarth Command\t"+CD_Details.Earth_Command);
		
	}

	@Override
	public void DisplaySoftwareLicenceCD() {
		System.out.println("code\tItem\tPrice");
		System.out.println("1\tWindows-7\t"+CD_Details.windows_7);
		System.out.println("2\tWindows-8\t"+CD_Details.windows_8);
		System.out.println("3\tWindows-10\t"+CD_Details.windows_10);
		System.out.println("4\tWindows-11\t"+CD_Details.windows_11);
		System.out.println("5\tVirus Guards\t"+CD_Details.virus_gurd);
		
	}

	@Override
	public void DisplayMoviesandCartoonsCD() {
		System.out.println("code\tItem\tPrice");
		System.out.println("1\tBat-Man-Dark Knight\t"+CD_Details.batman_DarkKnight);
		System.out.println("2\tSpider-Man-HomeComing\t"+CD_Details.Spiderman_homecoming);
		System.out.println("3\tIron-Man\t"+CD_Details.Iron_man);
		System.out.println("4\tAvengers-EndGame\t"+CD_Details.Avengers_Endgame);
		System.out.println("5\tBlack Panther\t"+CD_Details.Black_Panther);
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

}
