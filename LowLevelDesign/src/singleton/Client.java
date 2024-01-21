package singleton;

public class Client {
	public static void main(String[] args) {
		//get singlton object 
//		DBConnection dbConnection = DBConnection.getDBConnectionObject();
//		DBConnection dbConnection = DBConnection.getDbConnection();
		for(int i=1; i<=4; i++) {
			DBConnection dbConnection = DBConnection.getConnectionObject();
			dbConnection.isConnectionMade();
		}
	}
}
