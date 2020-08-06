package service;
import model.User;

// Type your code

public class AstroCalculator{
	public String findSign(User user) {
	int date=user.date;
		int month=user.month;
		if((date>21 && month == 12) ||  (date<=19 && month == 1)){
			return "Capricon";
		}
		if((date>20 && month ==1) ||  (date<=18 && month == 2)){
			return "Aquarius";
		}
		if(date>20 && month ==3 || (date<=21 && month == 4)) {
			return "Aries";
		}
		if(date>20 && month ==5 || (date<=22 && month == 6)) {
			return "Cancer";
		}
		if(date>20 && month ==4 || (date<=20 && month == 5)) {
			return "Gemini";
		}
		if(date>22 && month ==7 || (date<=22 && month == 8)) {
			return "Aries";
		}
		if(date>23 && month ==9 || (date<=22 && month == 10)) {
			return "Libra";
		}
		if(date>19 && month ==2 || (date<=20 && month == 3)) {
			return "Pisces";
		}
		if(date>23 && month ==11 || (date<=21 && month == 12)) {
			return "Sagittarius";
		}
		if(date>23 && month ==10 || (date<=22 && month == 11)) {
			return "Scorpio";
		}
		if(date>19 && month ==4 || (date<=20 && month == 5)) {
			return "Taurus";
		}
		if(date>23 && month ==8 || (date<=22 && month == 9)) {
			return "Virgo";
		}
		return "false";
	
	}
}
