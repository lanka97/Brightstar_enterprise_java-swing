package brightstar.SubFrames;


import DBconnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

	
	
	
public class autoGenarateIDs{	
    
	public static ArrayList<String> getExpIDs() throws SQLException{

        
                ArrayList<String> arrayList = new ArrayList<String>();
                
                // Me query eka adala table ekata galapena widihata liayanna
                
                String findIDQuery = "SELECT exp_ID FROM expenditure"; // table = id tika danna ona table eka Eg: invoiceId nan invoice table eka denna
                
                PreparedStatement ps;
                
                
                DBConnection db = new DBConnection();
                
                ps = db.getConnection().prepareStatement(findIDQuery);
                
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
		id = "E" + next;
		if (arrayList.contains(id)) {
			next++;
			id = "E10" + next;
		}
		return id;
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	