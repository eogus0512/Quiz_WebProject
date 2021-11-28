package question;
import java.sql.*;
import properties.DBConnect;

public class QuestionDAO {
	public static QuestionDTO getFlagQuestion(int questionNumber) {
		String SQL = "SELECT * FROM FLAG_QUESTION WHERE FlagQuestionNumber = ?";
		try {
			Connection conn = DBConnect.makeConn();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, String.valueOf(questionNumber));
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				QuestionDTO instance = new QuestionDTO();
				instance.setFlagQuestion(rs);
				return instance;
				
			} else //0이면 해당문제 없음
				return new QuestionDTO(0);
			
		} catch (SQLException e) { 	//-2면 DB에러
			return new QuestionDTO(-2);
		}
	}
	
	public static int getMaxNumber(int type) {
		String SQL = "";
		switch(type) {
		case 0 :
			SQL = "SELECT MAX(FlagQuestionNumber) FROM FLAG_QUESTION";
			break;
		case 1 :
			SQL = "SELECT MAX(CapitalQuestionNumber) FROM CAPITAL_QUESTION";
			break;
		case 2 :
			SQL = "SELECT MAX(CommonQuestionNumber) FROM COMMON_QUESTION";
			break;
		case 3 :
			SQL = "SELECT MAX(HistoryQuestionNumber) FROM HISTORY_QUESTION";
			break;
		}
		
		try {
			Connection conn = DBConnect.makeConn();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			
			if (rs.next())
				return rs.getInt(1);
			else
				return 0;
		} catch (SQLException e) {
			System.out.println("getMaxNumber에서 오류 !");
			e.printStackTrace();
			return -1;
		}
	}
	
	public static QuestionDTO getQuestion(int questionNumber, int type) {
		//type의 값에 따라 1 = 수도, 2 = 상식, 3 = 역사
		
		String SQL;
		switch(type) {
		case 1 : 
			SQL = "SELECT * FROM CAPITAL_QUESTION WHERE CapitalQuestionNumber = ?";
			break;
			
		case 2 : 
			SQL = "SELECT * FROM COMMON_QUESTION WHERE CommonQuestionNumber = ?";
			break;
			
		case 3 :
			SQL = "SELECT * FROM HISTORY_QUESTION WHERE HistoryQuestionNumber = ?";
			break;
			
		default :	//-1이면 type 잘못 입력됨.
			return new QuestionDTO(-1);
		}
		try {
			Connection conn = DBConnect.makeConn();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, String.valueOf(questionNumber));
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				QuestionDTO instance = new QuestionDTO();
				instance.setQuestion(rs);
				return instance;
				
			} else //0이면 해당하는 문제 없음
				return new QuestionDTO(0);
			
		} catch (SQLException e) { //-2면 DB에러
			return new QuestionDTO(-2);
		}
	}
	
	public static int makeQuestion(QuestionDTO instance, int type) {
		String SQL = "";
		switch(type) {
		case 0 :
			SQL = "INSERT INTO FLAG_QUESTION VALUES(?, ?, ?, ?, ?, ?, ?)";
			break;
			
		case 1 : 
			SQL = "INSERT INTO CAPITAL_QUESTION VALUES(?, ?, ?, ?, ?, ?, ?)";
			break;
			
		case 2 : 
			SQL = "INSERT INTO COMMON_QUESTION VALUES(?, ?, ?, ?, ?, ?, ?)";
			break;
			
		case 3 :
			SQL = "INSERT INTO HISTORY_QUESTION VALUES(?, ?, ?, ?, ?, ?, ?)";
			break;
		}
		try {
			Connection conn = DBConnect.makeConn();	
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, String.valueOf(instance.questionNumber));
			pstmt.setString(2, instance.questionContent);
			pstmt.setString(3, instance.example1);
			pstmt.setString(4, instance.example2);
			pstmt.setString(5, instance.example3);
			pstmt.setString(6, instance.example4);
			pstmt.setString(7, String.valueOf(instance.answer));
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("makeQuestion에서 오류 발생");
			e.printStackTrace();
			
			return -1;
		}
	}
}
