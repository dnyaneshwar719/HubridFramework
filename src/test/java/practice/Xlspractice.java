package practice;

import genericUtil.EcelfileUtil;

public class Xlspractice {
public static void main(String[] args) throws Throwable {
	EcelfileUtil e=new EcelfileUtil();
	System.out.println(e.readDatafromExcel("Sheet1", 0, 0));
	System.out.println(e.readDatafromExcel("Sheet1", 0, 1));
	System.out.println(e.readDatafromExcel("Sheet1", 0, 2));
}
}
