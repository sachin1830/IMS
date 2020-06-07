package com.org.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherIssueBookDao 
{
	public String issueBook(TeacherIssueBookModel tbm) throws ClassNotFoundException, SQLException
	{
		 int bookid=tbm.getBookId();
 	     String bookname=tbm.getBookname();
 	     int regno=tbm.getRegno();
 	     String teachername=tbm.getTeachername();
 	     Connection con=DBConnection.createConnection();
	     String deletequery="delete from teacherbook where bookId="+bookid+"";
	     Statement deletestatement=con.createStatement();
		 int j=deletestatement.executeUpdate(deletequery);
		
		if(j>0)
		{
			String query="insert into issuebook(bookid,bookname,regno,name)values(?,?,?,?)";
    	    PreparedStatement statement=con.prepareStatement(query);
    	    statement.setInt(1, bookid);
    	    statement.setString(2,bookname);
    	    statement.setInt(3,regno);
    	    statement.setString(4,teachername);
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
