package com.mtit.communicationcenter;

import java.util.ArrayList;

import java.util.Scanner;
import com.mtit.stationary_service.*;

import cd_service.CDModel;
import cd_service.CD_Details;
import reload_service.Reload;
import reload_service.ReloadModel;

public class ServicesImpl {
	private static int StationarySubTotal = 0;
	private static int ReloadSubTotal = 0;
	private static int CDSubtotal = 0;
	private static int totalAmount = 0;
	private static String stationary_desision;
	private static String reload_desision;
	private static String CD_desision;
	private static int Services[] = new int[5];
	
	
	
	private static ArrayList<StationaryModel> Stationaries = new ArrayList<>();
	private static ArrayList<ReloadModel> Reloadcards = new ArrayList<>();
	private static ArrayList<CDModel> CDList = new ArrayList<>();
	
	public static int chooseServiceType() {
		System.out.println("code\tService");
		System.out.println("1\tStationary Service ");
		System.out.println("2\tReload Service ");
		System.out.println("3\tGraphic Service ");
		System.out.println("4\tBrowsing and Gaming  Service ");
		System.out.println("5\tCD Service ");
		System.out.println("6\tPrinting Service ");
		System.out.println("7\tPhotoCopy Service ");
		System.out.println("8\tScanning Service ");
		
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the code of the service you need to Procead : ");
		int x = input.nextInt();
		
		return x;
	

}
	public static void StationaryService(Stationary stationary) {
		Scanner input = new Scanner(System.in);
		
		do {
			stationary.DisplayStationeries();
			System.out.println();
			System.out.println();
			System.out.println("Enter the code of Stationary Item you need to Purchase ? ");
			int code = input.nextInt();
			if(code == 1) {
				StationaryModel stationarymodel = new StationaryModel();
				stationarymodel.setName("A4Paper-White");
				
				System.out.println("How many A4Papers do you need to purchase ?");
				int Qty = input.nextInt();
				stationarymodel.setQty(Qty);
				StationarySubTotal = stationary.calculateBill(Qty, stationary.A4paper_white);
				double calculateamount = (double)StationarySubTotal;
				stationarymodel.setSubTotal(calculateamount);
				totalAmount += StationarySubTotal;
				
			}else if(code == 2) {
					StationaryModel stationarymodel = new StationaryModel();
				
					
					stationarymodel.setName("A4Paper-Color");
					System.out.println("How many A4Papers do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.A4paper_color);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;	
				
			}else if(code == 3) {
				StationaryModel stationarymodel = new StationaryModel();
				
				
				stationarymodel.setName("Scissores");
				System.out.println("How many Scissores do you need to purchase ?");
				int Qty = input.nextInt();
				stationarymodel.setQty(Qty);
				StationarySubTotal = stationary.calculateBill(Qty, stationary.Scisores);
				double calculateamount = (double)StationarySubTotal;
				stationarymodel.setSubTotal(calculateamount);
				totalAmount += StationarySubTotal;	
				
			}else if(code == 4) {
				StationaryModel stationarymodel = new StationaryModel();
				
				
				stationarymodel.setName("Pencil");
				System.out.println("How many Pencil do you need to purchase ?");
				int Qty = input.nextInt();
				stationarymodel.setQty(Qty);
				StationarySubTotal = stationary.calculateBill(Qty, stationary.Pencil);
				double calculateamount = (double)StationarySubTotal;
				stationarymodel.setSubTotal(calculateamount);
				totalAmount += StationarySubTotal;	
				
			}else if(code == 5) {
				StationaryModel stationarymodel = new StationaryModel();
				
				
				stationarymodel.setName("Erasor");
				System.out.println("How many Erasor do you need to purchase ?");
				int Qty = input.nextInt();
				stationarymodel.setQty(Qty);
				StationarySubTotal = stationary.calculateBill(Qty, stationary.Erasor);
				double calculateamount = (double)StationarySubTotal;
				stationarymodel.setSubTotal(calculateamount);
				totalAmount += StationarySubTotal;
				
			}else if(code == 6) {
				
				
				stationary.DisplayExerciseBookSingleRule();
				System.out.println();
				System.out.println();
				System.out.println("Enter the code of ExerciseBooks  you need to Purchase ? ");
				int code2 = input.nextInt();
				
				if(code2 == 1) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-80Page-SingleRule");
					System.out.println("How many ExerciseBook-80Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_80Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
				}else if(code2 == 2) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-120Page-SingleRule");
					System.out.println("How many ExerciseBook-120Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_120Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 3) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-160Page-SingleRule");
					System.out.println("How many ExerciseBook-160Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_160Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 4) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-200Page-SingleRule");
					System.out.println("How many ExerciseBook-200Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_200Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 5) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-240Page-SingleRule");
					System.out.println("How many ExerciseBook-240Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_240Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 6) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-80Page-SingleRule");
					System.out.println("How many CRBook-80Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_80page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 7) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-120Page-SingleRule");
					System.out.println("How many CRBook-120Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_120page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 8) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-160Page-SingleRule");
					System.out.println("How many CRBook-160Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_160page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 9) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-200Page-SingleRule");
					System.out.println("How many CRBook-200Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_200page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 10) {
					StationaryModel stationarymodel = new StationaryModel();
					
				
					stationarymodel.setName("CRBook-240Page-SingleRule");
					System.out.println("How many CRBook-240Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_240page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else {
					   System.out.println("Please enter a valied code ....");
				   }
				
			}else if(code == 7) {
				stationary.DisplayExerciseBookSqureRule();;
				System.out.println();
				System.out.println();
				System.out.println("Enter the code of ExerciseBooks  you need to Purchase ? ");
				int code3 = input.nextInt();
				
				if(code3 == 1) {
					StationaryModel stationarymodel = new StationaryModel();
					
				
					stationarymodel.setName("ExerciseBook-80Page-SquareRule");
					System.out.println("How many ExerciseBook-80Page do you need to purchase ?");
					int Qty = input.nextInt();
				     stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_80Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
				}else if(code3 == 2) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-120Page-SquareRule");
					System.out.println("How many ExerciseBook-120Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_120Page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 3) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-160Page-SquareRule");
					System.out.println("How many ExerciseBook-160Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_160Page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 4) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-200Page-SquareRule");
					System.out.println("How many ExerciseBook-200Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_200Page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 5) {
					StationaryModel stationarymodel = new StationaryModel();
					
				
					stationarymodel.setName("ExerciseBook-240Page-SquareRule");
					System.out.println("How many ExerciseBook-240Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_240Page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 6) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-80Page-SquareRule");
					System.out.println("How many CRBook-80Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_80page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 7) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-120Page-SquareRule");
					System.out.println("How many CRBook-120Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_120page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 8) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-160Page-SquareRule");
					System.out.println("How many CRBook-160Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_160page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 9) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					 stationarymodel.setName("CRBook-200Page-SquareRule");
					System.out.println("How many CRBook-200Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_200page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 10) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					 stationarymodel.setName("CRBook-240Page-SquareRule");
					System.out.println("How many CRBook-240Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_240page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					totalAmount += StationarySubTotal;
					}else {
						   System.out.println("Please enter a valied code ....");
					   }
			   }else if(code == 8) {
				   	
				   
				    stationary.NoteBook();
					System.out.println();
					System.out.println();
					System.out.println("Enter the code of NoteBook you need to Purchase ? ");
					int code4 = input.nextInt();
					
					if(code4 == 1) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("NoteBook-40Page");
						System.out.println("How many NoteBook-40Page do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.NoteBook_40page);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
						
					}else if(code4 == 2) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("NoteBook-80Page");
						System.out.println("How many NoteBook-80Page do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.NoteBook_80page);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
						
					}else if(code4 == 3) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("NoteBook-120Page");
						System.out.println("How many NoteBook-120Page do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.NoteBook_120page);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
					}else {
						   System.out.println("Please enter a valied code ....");
					   }
					
					
			  }else if (code == 9) {
			    	   
				    stationary.AtlesPen();
					System.out.println();
					System.out.println();
					System.out.println("Enter the code of Pen you need to Purchase ? ");
					int code5 = input.nextInt();
					
					if(code5 == 1) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("BollPoint-Pen-Atlas");
						System.out.println("How many BollPoint-Pen-Atlas do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Atlas_Bollpoint);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 2) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("ButterGel-Pen-Atlas");
						System.out.println("How many ButterGel-Pen-Atlas do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Atlas_ButterGel);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
					}else if(code5 == 3) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("Gel-pen-Atlas");
						System.out.println("How many Gel-pen-Atlas do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Atlas_Gell);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 4) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("BollPoint-Pen-Linc");
						System.out.println("How many BollPoint-Pen-Linc do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_linc_Bollpoint);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 5) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("Gel-pen-Linc");
						System.out.println("How many Gel-pen-Linc do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_linc_Gel);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 6) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("BollPoint-Pen-Ten");
						System.out.println("How many BollPoint-Pen-Ten do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Ten_Bollpoint);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 7) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("Gel-pen-Ten");
						System.out.println("How many Gel-pen-Ten do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Ten_Gel);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						totalAmount += StationarySubTotal;
						
					}else {
						   System.out.println("Please enter a valied code ....");
					   }
					
					
					
			   }else {
				   System.out.println("Please enter a valied code ....");
			   }
			
			System.out.println();
			System.out.println("*** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.println("Do you need to perchse more items ? [Y/N] ");
			stationary_desision = input.next();
			
			
			
			
		}while(stationary_desision.equals("Y"));
		
		System.out.println("Bill amount : ");
		System.out.println();
		System.out.println("StationaryItem\t\tQuantity\t\t Amount");
		System.out.println();
		
		for(StationaryModel stationarymodel : Stationaries) {
			
				System.out.println("\t"+ stationarymodel.getName());
			
			
				System.out.println("\t"+ stationarymodel.getQty());
			
				System.out.println("\t"+ stationarymodel.getSubTotal());
		
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Total amount is : "+(double)totalAmount);
		System.out.println();
		
		Services[0] = totalAmount;
		
		
		}
	
	public static void ReloadService(Reload reload) {
				Scanner input = new Scanner(System.in);
				totalAmount = 0;
		
				do {
					reload.DisplayReloadCards();
					System.out.println();
					System.out.println();
					System.out.println("Enter the code of ReloadCard Type  you need to Purchase ? ");
					int reload_code = input.nextInt();
					
					if(reload_code  == 1) {
						reload.DisplayDialogCards();
						System.out.println();
						System.out.println();
						System.out.println("Enter the code of ReloadCard Type  you need to Purchase ? ");
						int reload_code1 = input.nextInt();
						
						if(reload_code1 == 1) {
							
							ReloadModel reloadmodel = new ReloadModel();
							
							
							reloadmodel.setName("Dialog-ReloadCard-50");
							System.out.println("How many Dialog-ReloadCard-50 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_50);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 2) {
							ReloadModel reloadmodel = new ReloadModel();
							
							
							reloadmodel.setName("Dialog-ReloadCard-100");
							System.out.println("How many Dialog-ReloadCard-100 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_100);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 3) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Dialog-DataCard-49");
							System.out.println("How many Dialog-DataCard-49 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_49);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 4) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Dialog-DataCard-99");
							System.out.println("How many Dialog-DataCard-99 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_99);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 5) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Dialog-DataCard-199");
							System.out.println("How many Dialog-DataCard-199 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_199);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 6) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Dialog-DataCard-249");
							System.out.println("How many Dialog-DataCard-249 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_249);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else {
							   System.out.println("Please enter a valied code ....");
						}
						
					}else if(reload_code  == 2) {
						
						reload.DisplayHutchCards();;
						System.out.println();
						System.out.println();
						System.out.println("Enter the code of ReloadCard Type  you need to Purchase ? ");
						int reload_code2 = input.nextInt();
						
						if(reload_code2 == 1) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-ReloadCard-50");
							System.out.println("How many Hutch-ReloadCard-50 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_50);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 2) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-ReloadCard-100");
							System.out.println("How many Hutch-ReloadCard-100 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_100);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 3) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-DataCard-48");
							System.out.println("How many Hutch-DataCard-48 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_48_hutch);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 4) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-DataCard-99");
							System.out.println("How many Hutch-DataCard-99 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_99);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 5) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-DataCard-198");
							System.out.println("How many Hutch-DataCard-198 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_198_hutch);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 6) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-DataCard-649");
							System.out.println("How many Hutch-DataCard-649 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_649_hutch);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else {
							   System.out.println("Please enter a valied code ....");
						}
						
					}else if(reload_code  == 3) {
						
						reload.DisplayMobitelCards();
						System.out.println();
						System.out.println();
						System.out.println("Enter the code of ReloadCard Type  you need to Purchase ? ");
						int reload_code3 = input.nextInt();
						
						if(reload_code3 == 1) {
							ReloadModel reloadmodel = new ReloadModel();
						
							reloadmodel.setName("Mobitel-ReloadCard-50");
							System.out.println("How many Mobitel-ReloadCard-50 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_50);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 2) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Mobitel-ReloadCard-100");
							System.out.println("How many Mobitel-ReloadCard-100 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_100);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 3) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Mobitel-DataCard-49");
							System.out.println("How many Mobitel-DataCard-49 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_49);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 4) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Mobitel-DataCard-99");
							System.out.println("How many Mobitel-DataCard-99 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_99);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 5) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Mobitel-DataCard-199");
							System.out.println("How many Mobitel-DataCard-199 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_199);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 6) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Mobitel-DataCard-249");
							System.out.println("How many Mobitel-DataCard-249 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_249);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							totalAmount += ReloadSubTotal;
							
						}else {
							   System.out.println("Please enter a valied code ....");
						}
						
					} else {
						   System.out.println("Please enter a valied code ....");
					   }
					
					System.out.println();
					System.out.println("*** Please enter [Y] if 'yes' and [N] if 'No' ***");
					System.out.println("Do you need to perchse more items ? [Y/N] ");
					reload_desision = input.next();
					
				}while(reload_desision.equals("Y"));
				
				System.out.println("Bill amount : ");
				System.out.println();
				System.out.println("ReloadCard\t\tQuantity\t\t Amount");
				System.out.println();
				
				for(ReloadModel reloadmodel : Reloadcards ) {
					
						System.out.print("\t"+ reloadmodel.getName());
					
						System.out.print("\t"+ reloadmodel.getQty());
					
						System.out.print("\t"+ reloadmodel.getSubTotal());
						System.out.println();
					
					
					
				}
				
				System.out.println();
				System.out.println("Total amount is : "+(double)totalAmount);
				System.out.println();
				
				Services[1] = totalAmount;
				
				
				
	}
	
	public static void CDService(CD_Details cdDetails) {
		Scanner input = new Scanner(System.in);
		totalAmount = 0;
		
		do {
			cdDetails.DisplayCDDetails();
			System.out.println();
			System.out.println();
			System.out.println("Enter the code of CD Type  you need to Purchase ? ");
			int CD_code = input.nextInt();
			
				if(CD_code == 1) {
					cdDetails.DisplayGamingCD();
					System.out.println();
					System.out.println();
					System.out.println("Enter the code of GamingCD Type  you need to Purchase ? ");
					int CD_code1 = input.nextInt();
					
					if(CD_code1 == 1) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("BattleShip");
						System.out.println("How many BattleShip-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.Battle_Ship);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
					}else if(CD_code1 == 2) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Axis and Allies");
						System.out.println("How many Axis and Allies-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.AxisandAllies);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code1 == 3) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Burn Cycle");
						System.out.println("How many Burn Cycle-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.BurnCycle);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code1 == 4) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Dark Castle");
						System.out.println("How many Dark Castle-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.DarkCastle);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code1 == 5) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Earth Command");
						System.out.println("How many Earth Command-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.Earth_Command);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else {
						   System.out.println("Please enter a valied code ....");
					}
				}else if(CD_code == 2) {
					
					cdDetails.DisplaySoftwareLicenceCD();;
					System.out.println();
					System.out.println();
					System.out.println("Enter the code of Software Licence CD Type  you need to Purchase ? ");
					int CD_code2 = input.nextInt();
					
					if(CD_code2 == 1) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Windows-7");
						System.out.println("How many Windows-7-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.windows_7);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
					}else if(CD_code2 == 2) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Windows-8");
						System.out.println("How many Windows-8-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.windows_8);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code2 == 3) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Windows-10");
						System.out.println("How many Windows-10-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.windows_10);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code2 == 4) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Windows-11");
						System.out.println("How many Windows-11-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.windows_11);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code2 == 5) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Virus Guards");
						System.out.println("How many Virus Guards-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.virus_gurd);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else {
						   System.out.println("Please enter a valied code ....");
					}
						
				}else if(CD_code == 3) {
					
					cdDetails.DisplayMoviesandCartoonsCD();;
					System.out.println();
					System.out.println();
					System.out.println("Enter the code of Movies or Cartoon CD Type  you need to Purchase ? ");
					int CD_code3 = input.nextInt();
					
					if(CD_code3 == 1) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Bat-Man-Dark Knight");
						System.out.println("How many Bat-Man-Dark Knight-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.batman_DarkKnight);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
					}else if(CD_code3 == 2) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Spider-Man-HomeComing");
						System.out.println("How many Spider-Man-HomeComing-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.Spiderman_homecoming);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code3 == 3) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Burn Cycle");
						System.out.println("How many Burn Cycle-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.BurnCycle);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code3 == 4) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Dark Castle");
						System.out.println("How many Dark Castle-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.DarkCastle);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code3 == 5) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Earth Command");
						System.out.println("How many Earth Command-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.Earth_Command);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else {
						   System.out.println("Please enter a valied code ....");
					}
					
				}else {
					   System.out.println("Please enter a valied code ....");
				}
				
				System.out.println();
				System.out.println("*** Please enter [Y] if 'yes' and [N] if 'No' ***");
				System.out.println("Do you need to perchse more items ? [Y/N] ");
				CD_desision = input.next();
					
				
			}while(CD_desision.equals("Y"));
		
					System.out.println("Bill amount : ");
					System.out.println();
					System.out.println("ReloadCard\t\tQuantity\t\t Amount");
					System.out.println();
		
					for(CDModel cdmodel : CDList) {
						
							System.out.print("\t"+cdmodel.getName());
						
							System.out.print("\t"+cdmodel.getQty());
						
							System.out.print("\t"+cdmodel.getSubTotal());
							
							System.out.println();
							
					}
		
					System.out.println();
					System.out.println("Total amount is : "+(double)totalAmount);
					System.out.println();
		
					Services[2] = totalAmount;
		
		
	}
	}

