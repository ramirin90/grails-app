package interviewcalls

class Call {
	String position
	String description
    Interviewer interviewer
	Candidate candidate
	Date date
	String status
	String observations
	
	
	    static constraints = {
			 position  nullable: false
			 description nullable: false
			 candidate  nullable: false
			 interviewer nullable: true
			 date nullable: false
			 status nullable: false
			 observations nullable: true
		
		}
}
