package test;

public class Datepicker {
	
	//selecting date with different formats you can give with any one following
   // selectDate("23 Jun 1991");

    //selectDate("23-06-1991");
    //selectDate("23/Jun/1991");
    //selectDate("23/06/1991");
    //selectDate("23 Jun 1991");

	public void selectDate(String format) {
		//driver.findElement(By.className("ui-datepicker-trigger")).click();
		// identifying format
		String date[] = null;
		if (format.contains("-")) {
			date = format.split("-");
		} else if (format.contains("/")) {
			date = format.split("/");
		} else if (format.contains(" ")) {
			date = format.split(" ");
		}
		// Splitting data
		String day = date[0];
		String month = date[1];
		String year = date[2];
		// Selecting data based on format
		if (month.length() == 2) {
			// selecting month if you are giving input format as dd-mm-yyyy
			//new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByIndex(Integer.parseInt(month) - 1);
		} else if (month.length() != 2) {
			// selecting month if you are giving input format as dd-mmm-yyyy
			//new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		}
		// selecting year
		//new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"))).selectByVisibleText(year);

		// click on day
		//driver.findElement(By.linkText(day)).click();
	}
}
