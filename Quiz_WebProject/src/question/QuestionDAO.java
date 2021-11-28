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
}
