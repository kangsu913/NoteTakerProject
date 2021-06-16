import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NoteTaker {
	
	public static void main(String[] args) throws IOException {
		
		String noteType = " ";
		String choice = " ";
		Scanner input = new Scanner(System.in);
		
		ArrayList<LectureNote> lectureNotes = new ArrayList<LectureNote>();
		ArrayList<ShoppingList> shoppingLists = new ArrayList<ShoppingList>();
		
		PrintWriter output = new PrintWriter("note.txt");
		
		System.out.println("Welcome to NoteTaker");
		while(noteType.charAt(0) != 'X'){
			System.out.println("\nWould you like to take <Lecture notes> or make a <Shopping List> ?");
			System.out.print("Enter L for Lecture Notes" +
							"\nEnter S for Shopping List"
						+   "\nChoice: ");
			noteType = input.next();
		
			if(noteType.equalsIgnoreCase("L")) {
				
				System.out.print("\nWould you like to write new note or retrieve a note?" + 
								 "\nNew note: N     retrieve note: R" + 
								 "\nChoice:");
				choice = input.next();
				input.nextLine();
				if(choice.equalsIgnoreCase("n")) {
					
					System.out.print("\nInstitution: ");
					String ins = input.nextLine();
					
					System.out.print("class ID: ");
					String id = input.nextLine();
					
					
					//Setting Date
					System.out.print("\nDate of note:"
							+ 	   "\nyear: ");
					int year = input.nextInt();
					System.out.print("month: ");
					int month = input.nextInt();
					System.out.print("day: ");
					int day = input.nextInt();
					Date date = new Date(year, month, day);
			
					//Setting Time
					System.out.print("\nTime of Note: "
							+ 		 "\nHour: ");
					int hour = input.nextInt();
					input.nextLine();
					System.out.print("Minute: ");
					int minute = input.nextInt();
					Time time = new Time(hour, minute);
					input.nextLine();
					
					System.out.println("\nDescription of Note: ");
					String event = input.nextLine();
					
					LectureNote temp = new LectureNote(id, ins, date, time, event );
					lectureNotes.add(temp);
					LectureNote.updateNumNote();
					output.print(lectureNotes.get(0).toString());
					output.close();
				}
			
			
			} else if(noteType.charAt(0) == 'S') {
				
			} else if(noteType.charAt(0) == 'X') {
				System.out.println("Goodbye, have a great day!");
			}
		}
	}
	
	

	
}
