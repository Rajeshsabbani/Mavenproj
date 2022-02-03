package testScipts;

import config.ActionKeywords1;
import utility1.ExelUtils1;

public class CallUtility1 {

		static String sPath;
		
		public static void main(String[] args) throws Exception {
			sPath = System.getProperty("user.dir")+("\\src\\test\\resources\\list1.xlsx");
			System.out.println(System.getProperty("user.dir"));
			ExelUtils1.setExcelFile(sPath, "sheet1");
			ActionKeywords1.openBrowser();
			ActionKeywords1.navigate();
			for (int iRow=0;iRow<=3;iRow++){
				String searchKeyword = ExelUtils1.getCellData(iRow, 0);
				System.out.println(searchKeyword);			
				ActionKeywords1.searchFunc(searchKeyword);
				ActionKeywords1.clickSearchBtn();
				ActionKeywords1.verifyTitle(searchKeyword);
				ActionKeywords1.navigateBack();
		}
			ActionKeywords1.closeBrowser();
		}
	}
