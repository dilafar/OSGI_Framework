package com.mtit.stationary_service;

public interface Stationary {
	public int A4paper_white = 4;
	public int A4paper_color = 6;
	public int ExerciseBook_80Page = 40;
	public int ExerciseBook_120Page = 80;
	public int ExerciseBook_160Page = 100;
	public int ExerciseBook_200Page = 120;
	public int ExerciseBook_240Page = 150;
	public int CRBook_80page = 100;
	public int CRBook_120page = 140;
	public int CRBook_160page = 180;
	public int CRBook_200page = 220;
	public int CRBook_240page = 260;
	public int NoteBook_40page = 35;
	public int NoteBook_80page = 70;
	public int NoteBook_120page = 100;
	public int Scisores = 50;
	public int Pencil = 20;
	public int Erasor = 10;
	public int Pen_Atlas_Bollpoint = 20;
	public int Pen_Atlas_Gell = 30;
	public int Pen_Atlas_ButterGel = 25;
	public int Pen_linc_Bollpoint = 30;
	public int Pen_linc_Gel = 40;
	public int Pen_Ten_Bollpoint = 10;
	public int Pen_Ten_Gel = 20;
	
	public int calculateBill(int qty , int price);
	
	public void DisplayStationeries();
	public void DisplayExerciseBookSingleRule();
	public void DisplayExerciseBookSqureRule();
	public void NoteBook();
	public void AtlesPen();

	
	
	

}
