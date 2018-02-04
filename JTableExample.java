import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


class JTableExample extends JFrame{
	public JTableExample(){
		try{
  // 			Connection conn = DriverManager.getConnection(
		//               "jdbc:mysql://localhost:3306/BIM5th", "root", "rrijal53"); 
		//         Statement stmt = conn.createStatement();	
		// 	String sql = "SELECT * FROM Student";
		// 	ResultSet r = stmt.executeQuery(sql);
			
		// DefaultTableModel model = new DefaultTableModel();
		// model.addColumn("Name");
		// model.addColumn("Address");
		// model.addColumn("Phone");
		// String[] anc = {"Roshan", "RIja;", "12345"};
		// model.addRow(anc);
		// 	while(r.next()){
		// 		System.out.println(r.getString("name"));

		// 		String[] row = {r.getString("name"), r.getString("address"), r.getString("phone")};
		// 		model.addRow(row);
		// 	}

		// JTable j = new JTable(model);
		// JScrollPane jsp = new JScrollPane(j);
		// add(jsp);
	
			String[] columns = {"Name", "Address"};
			String[][] data = { 
					{"ROSHAN", "ABC"}, {"ABC", "ABC"}, {"ROshsdsd", "sdsjhsd"}
			};
			JTable jTable = new JTable(data, columns);
			JScrollPane jsp = new JScrollPane(jTable);
		 add(jsp);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JTableExample();
	}
}