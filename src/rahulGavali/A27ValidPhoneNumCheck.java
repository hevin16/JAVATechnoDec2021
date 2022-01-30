package rahulGavali;
/*Assignment 27: 21st Jan'2022 
WAP to validate the phone number which is starting from number 9/8/7 and which 
should fit in the below mentioned valid patterns. 
Valid Patters (considering initial number is 9 ): 
	1) +91 9765463742 
	2) 976 546 37 42 
	3) 09765463742 
	4) 9765463742*/

public class A27ValidPhoneNumCheck {

	boolean isDigit(String phoneNum) {
		for (int index = 0; index < phoneNum.length(); index++) {
			char ch = phoneNum.charAt(index);
			if (!Character.isDigit(ch))
				return false;
		}
		return true;
	}

	boolean startsWithValidSet(char ch) {
		if (ch == '9' || ch == '8' || ch == '7') {
			return true;
		} else
			return false;
	}

	void validNumCheck(String phoneNum) {
		switch (phoneNum.length()) {
		case 14:
			if (phoneNum.startsWith("+91")) {
				if (startsWithValidSet(phoneNum.charAt(4))) {
					if (isDigit(phoneNum.substring(4))) {
						System.out.println(phoneNum + " is a valid number");
					} else
						System.out.println(phoneNum + " is not a valid number");
				} else
					System.out.println(phoneNum + " is not a valid number");
			} else
				System.out.println(phoneNum + " is not a valid number");
			break;

		case 13:
			if (startsWithValidSet(phoneNum.charAt(0))) {
				String newPhoneNum = phoneNum.replaceAll(" ", "");
				if (isDigit(newPhoneNum)) {
					System.out.println(phoneNum + " is a valid number");
				} else
					System.out.println(phoneNum + " is not a valid number");
			} else
				System.out.println(phoneNum + " is not a valid number");
			break;

		case 11:
			if (startsWithValidSet(phoneNum.charAt(1))) {
				if (isDigit(phoneNum))
					System.out.println(phoneNum + " is a valid number");
				else
					System.out.println(phoneNum + " is not a valid number");
			} else
				System.out.println(phoneNum + " is not a valid number");
			break;

		case 10:
			if (startsWithValidSet(phoneNum.charAt(0))) {
				if (isDigit(phoneNum))
					System.out.println(phoneNum + " is a valid number");
				else
					System.out.println(phoneNum + " is not a valid number");
			} else
				System.out.println(phoneNum + " is not a valid number");
			break;

		default:
			System.out.println(phoneNum + " is not a valid number");
		}
	}

	public static void main(String[] args) {
		A27ValidPhoneNumCheck phoneNumCheck = new A27ValidPhoneNumCheck();
		phoneNumCheck.validNumCheck("+91 9765463742");
		phoneNumCheck.validNumCheck("976 546 37 42");
		phoneNumCheck.validNumCheck("09765463742");
		phoneNumCheck.validNumCheck("9765463742");
	}
}