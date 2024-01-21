package singleton;

public class DBConnection {
	//two type of instantiation we will be creating 
	//1) early instantiation 2) lazy instantiation
	//1st way to doing this, but this is not a thread safe..this is not feasible for multi-threading environment
//	private static DBConnection dbConnection = null;//lazy loading
//	private static DBConnection dbConnection = new DBConnection();///early loading / instantiate
	private static DBConnection dbConnection = null;
	
	private DBConnection() {
		
	}
	
	public void isConnectionMade() {
		System.out.println("Yes Database connection made! Hurr.....:) ");
	}
	
//	public static DBConnection getDBConnectionObject() {
//		dbConnection = new DBConnection();
//		return dbConnection;
//	}
	
//	public static DBConnection getDbConnection() {
//		if(dbConnection == null) {
//			System.out.println("1st ");
//			return new DBConnection();
//		}
//		System.out.println("2nd ");
//		return dbConnection;
//	}
	
	//*********** this all won't work in multi-threaded environment so we should go for sysncronization technique to 
//	issue for multithreaded environment
	//use of syncronized key word at method level or object level (technique is mutex)
//	public static DBConnection getConnectionObject() {
//		System.out.println("1st ");
//		if(dbConnection == null) {
//			synchronized (DBConnection.class) {
//				System.out.println("2nd ");
//				dbConnection = new DBConnection();
//				return dbConnection; 
//			}
//		}
//		
//		
//		System.out.println("3rd ");
//		return dbConnection;
//	}
	
//	public static synchronized DBConnection getConnectionObject() {
//		System.out.println("1st ");
//		if(dbConnection == null) {
//				System.out.println("2nd ");
//				dbConnection = new DBConnection();
//				return dbConnection; 
//		}
//		
//		
//		System.out.println("3rd ");
//		return dbConnection;
//	}
	
	//this is still not an optimise feasible solution, because this is still reduce proformance
	//in the other words, performance will reduce, becase this will allow only one thread a time but other thread will remain in the
	//wait list unless previous thread completes their work this is increasing waiting time for other threads hence reducing performance
	//so, for this usecase we have only remain one solution..Double locking 
	
	public static DBConnection getConnectionObject() {
		System.out.println("1st ");
		if(dbConnection == null) {//we are checking here
			synchronized (DBConnection.class) {
				System.out.println("2nd ");
				if(dbConnection == null) {//we are checking here
					System.out.println("3rd ");
					dbConnection = new DBConnection();
				}
			}
		} 
		
		
		System.out.println("4th ");
		return dbConnection;
	}

	
	
	
}
