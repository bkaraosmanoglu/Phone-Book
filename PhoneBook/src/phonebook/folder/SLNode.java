import java.io.Serializable;



public class SLNode implements Serializable {

	private String name;
	private String email;
	private String phoneNumber;
        private String homeNumber;
        private String workNumber;
	private SLNode next;
	
	public SLNode() {
		next = null;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
        public String getEmail() {
		return email;
	}

	
        public void setEmail(String email) {
		this.email = email;
	}

	
        public String getPhoneNumber() {
		return phoneNumber;
	}

	
        public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
        
        public String getHomeNumber(){
                return homeNumber;
        }
        
        public void setHomeNumber(String homeNumber) {
                this.homeNumber = homeNumber;
        }
        
        public String getWorkNumber() {
                return workNumber;
        }
        
        public void setWorkNumber(String workNumber){
                this.workNumber=workNumber;
        }

	public SLNode getNext() {
		return next;
	}

	public void setNext(SLNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Name = " + name + ", Email = " + email + ", Phone Number = "
				+ phoneNumber + ",Home Phone Number =" + homeNumber + ",Work Phone Number =" + workNumber;
	}
}
