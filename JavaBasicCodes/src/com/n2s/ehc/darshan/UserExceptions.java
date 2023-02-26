package com.n2s.ehc.darshan;

public class UserExceptions extends Exception {

	public UserExceptions(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

// Custom Constructors
class IvalidUserId extends UserExceptions{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public IvalidUserId() {
			super("Ivalid User Id");
			
		}
		public IvalidUserId(String message) {
			super(message);
			
		}
				
	}
class UserIdNotFound extends UserExceptions{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;


		public UserIdNotFound() {
			super("User Id Not Found");
			
		}


		public UserIdNotFound(String message) {
			super(message);
			
		}

		
	}
class InvalidEntry extends UserExceptions{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InvalidEntry() {
			super("Invalid Option Selected");
			// TODO Auto-generated constructor stub
		}

		public InvalidEntry(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
		
}


