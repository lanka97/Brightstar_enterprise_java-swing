//package brightstar.SubFrames;


import brightstar.connection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class autoGenarateIDs{	
    
	public static ArrayList<String> getExpIDs() throws SQLException, ClassNotFoundException{

        
                ArrayList<String> arrayList = new ArrayList<String>();
                
                
                String findIDQuery = "SELECT complainId FROM machinemaintenance1"; // table = id tika danna ona table eka Eg: invoiceId nan invoice table eka denna
                
                PreparedStatement ps;
                
                
                //DBConnection db = new DBConnection();
                
                ps = DBConnection.getDBconnection().prepareStatement(findIDQuery);
                
                ResultSet resultSet = ps.executeQuery();
                
                while (resultSet.next()) {
                    arrayList.add(resultSet.getString(1));
                }
           return arrayList;
	
        }
	
	
	
	public static String generateExpIDs(ArrayList<String> arrayList) {

		String id;
		int next = arrayList.size();
		next++;
		id = "C" + next; // Methana thamai ID eke format eka hadenne. Invoice ekkata "I0" kiyala patan ganna one nan id = "I0" kiyala meka wenas karanna.
		if (arrayList.contains(id)) {
			next++;
			id = "C100" + next;
		}
		return id;
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	