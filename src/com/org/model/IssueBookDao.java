package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class IssueBookDao {
    public String issueBook(IssueBookModel ibm) throws ClassNotFoundException, SQLException
        {
    	    int bookid=ibm.getBookId();
    	    String bookname=ibm.getBookname();
    	    int regno=ibm.getRegno();
    	    String studentname=ibm.getStudentname();
    	    Connection con=DBConnection.createConnection();
    	    String deletequery="delete from book where bookId="+bookid+"";
    		Statement deletestatement=con.createStatement();
    		int j=deletestatement.executeUpdate(deletequery);
    		
    		if(j>0)
    		{
    			String query="insert into issuebook(bookid,bookname,regno,name)values(?,?,?,?)";
        	    PreparedStatement statement=con.prepareStatement(query);
        	    statement.setInt(1, bookid);
        	    statement.setString(2,bookname);
        	    statement.setInt(3,regno);
        	    statement.setString(4,studentname);
        	    int i=statement.executeUpdate();
        	    if(i>0)
        	    {
        	    	return "success";
        	    }
        	    else
        	    {
        	    	return "fail";
        	    }
    		}
    		else
    		{
    			return "fail";
    		}
    	    
        }
}
