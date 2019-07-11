import java.util.*;


public class PhoneBook {

	public static void main(String[] args) {

		SLList newList = new SLList();
		
		Scanner in = new Scanner(System.in); 
		String fileName = "";

		String menu;
		boolean done = false;

		do {
			System.out.println();
			System.out.format("---------------------------%n");
			System.out.format(" press (A) for add contact \n press (D) for delete \n press (M) for email Search \n press (P) for print List \n press (S) for search \n press (E) for exit%n");	
			System.out.format("---------------------------%n");
			System.out.format("Please Enter a command: ");
			menu = in.nextLine().toUpperCase();

			switch (menu) {
				case "A": 
					System.out.println("Add an entry");
					
					System.out.print("Enter a FIRST and LAST Name: ");
					String name = in.nextLine();

					System.out.print("Enter an EMAIL ADDRESS: ");
					String email = in.nextLine();

					System.out.print("Enter a PHONE NUMBER: ");
					String phoneNumber = in.nextLine();
                                        
                                        System.out.print("Enter a HOME NUMBER: ");
                                        String homeNumber = in.nextLine();
                                        
                                        System.out.print("Enter a WORK NUMBER: ");
                                        String workNumber = in.nextLine();
	
					newList.add(name, email, phoneNumber, homeNumber, workNumber); 
					break;
				case "D": 
					System.out.print("Enter index number to delete: ");
					int delete = in.nextInt();
					newList.delete(delete);
					break;
				case "M": 
					System.out.print("Enter an E-mail to search for: ");
					String sEmail = in.nextLine();
					newList.emailSearch(sEmail);
					break; 
				case "P": 
					System.out.println("Print Phonebook");
					newList.printList();
					break; 
				
				case "S": 
					System.out.print("Enter a Name to search for: ");
					String sName = in.nextLine();
					newList.nameSearch(sName);
					break;
                                case "U":
                                        
				
				case "E": 
					System.out.println("Exiting!");
					done = true;
					break;
				default: 
					System.out.println("Unknown entry");
			}

		}  while (!done);
		System.out.println("Thanks for using ABook!");

	}
}
