public class LectureNote extends Note {
	
		private String classID;
        private String institution;
        String description;
        private static int numNotes = 0;
        
        //default constructor
        public LectureNote(){
        	super(null, null);
        	classID = "no class ID" ;
        	institution = "no institution";
        }
        //5 argument constructor
        public LectureNote(String id, String i, Date newDate, Time newTime, String description) {
        	super(newTime, newDate);
        	classID = id;
        	institution = i;
        	this.description = description;
        	
        }

        public String getclassID() {
            return classID;
        }
        
        public String getDescription() {
        	return description;
        }
        
        public void setclassID(String classID) {
            this.classID = classID;
        }
        public String getinstitution() {
            return institution;
        }

        public void setDescription(String description) {
        	this.description = description;
        }
        public void setInstitution(String institution) {
            this.institution = institution;
        }
        
       public static int getNumNote() {
    	   return numNotes;
       }
       
       public static void updateNumNote() {
    	   numNotes++;
       }
       
       
       @Override
       public String toString() {
    	   return super.toString() +
    			  
    			  "\n\nInstitution: " + institution
    	   		+ "\nClass id: " + classID +
    	   		  "\n\nDescription:\n" + description;
       }
       
    }