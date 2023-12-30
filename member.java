import java.util.*;
public class member {
	public static int memberCount = 0;
	public static String[][] members = new String[100][7];
	public static void main(String[] args) {
		for(;;) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		members[memberCount][0]=name;
		System.out.println("Enter surname: ");
		String surname = sc.next();
		members[memberCount][1]=surname;
		System.out.println("Enter country: ");
		String country = sc.next();
		members[memberCount][2]=country;
		System.out.println("Enter education level: ");
		String education_level = sc.next();
		members[memberCount][3]=education_level;
		System.out.println("Enter username: ");
		String username = sc.next();
		for(;;) {
		while (!checkUsername(username)) {
			System.out.println("Enter a valid username: ");
			username = sc.next();
		}
		members[memberCount][4]=username;
			break;
		}
		System.out.println("Enter email: ");
		String email = sc.next();
		for(;;) {
			while(!checkEmail(email)) {
				System.out.println("Enter a valid email: ");
				email = sc.next();
			}
			    members[memberCount][5]=email;
				break;
			}
		System.out.println("Enter password: ");
		String password = sc.next();
		for(;;) {
			if (checkPassword(password)==false) {
				System.out.println("Enter a valid password: ");
				password = sc.next();
			}else {
				members[memberCount][6]=password;
				break;
			}
			}
		addMember();
		}
	}
	    public static boolean checkUsername(String username) {
	        	for(int i =0;i<memberCount;i++) {
	        		 if (members[i][4] != null && members[i][4].equals(username)) {
	                     return false;
	                 }
	        	}
	        return true;
	    }

	    public static boolean checkEmail(String email) {
	    	String emailformat1 = "@gmail.com";
	    	String emailformat2 = "@hotmail.com";
	    	String emailformat3 = "@yahoo.com";
	        int atCount = 0;
	        int dotCount = 0;
	        for (int i = 0; i < email.length(); i++) {
	            if (email.charAt(i) == '@') {
	                atCount++;
	            } else if (email.charAt(i) == '.') {
	                dotCount++;
	            }
	        }
	        for(int i=0;i<memberCount;i++) {
	        	if(members[i][5] != null && members[i][5].equals(email)) {
	        		return false;
	        	}
	        }
	        return atCount == 1 && dotCount > 0 && 
	        		email.endsWith(emailformat1)
	        		||email.endsWith(emailformat2)
	        		||email.endsWith(emailformat3);
	    }

	    public static boolean checkPassword(String password) {
	        int letterCount = 0;
	        int numberCount = 0;
	        int specialCount = 0;
	        for (int i = 0; i < password.length(); i++) {
	            char c = password.charAt(i);
	            if (Character.isLetter(c)) {
	                letterCount++;
	            } else if (Character.isDigit(c)) {
	                numberCount++;
	            } else{
	                specialCount++;
	            }
	        }
	        return password.length() >= 6 && password.length() <= 10 
	        		&& letterCount >= 2 && numberCount >= 2 && specialCount >= 1;
	    }

	    public static void addMember() {
	    	System.out.println("Member added.");
	    	memberCount++;
	    }
}
