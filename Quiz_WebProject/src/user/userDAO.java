package user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.databaseUtil;

public class userDAO {
    public static int login(String LoginID, String Password) {
        String SQL = "SELECT Password FROM USERINFO WHERE LoginID = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = databaseUtil.getConnection();
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, LoginID);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                if(rs.getString(1).equals(Password)) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {if(conn != null) conn.close();} catch (Exception e) {e.printStackTrace();}
            try {if(pstmt != null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
            try {if(rs != null) rs.close();} catch (Exception e) {e.printStackTrace();}
        }
        return -2;
    }

    public static String[] getInfo(String LoginID) {
        String SQL = "SELECT UserName, LoginID, Password, Email, Age, Phone, NickName, Address, Date FROM USERINFO WHERE LoginID = ?";
        String[] info = new String[7];
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = databaseUtil.getConnection();
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, LoginID);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                info[0] = rs.getString(1);
                info[1] = rs.getString(2);
                info[2] = rs.getString(3);
                info[3] = rs.getString(4);
                info[4] = rs.getString(5);
                info[5] = rs.getString(6);
                info[6] = rs.getString(7);
                info[7] = rs.getString(8);
                info[8] = rs.getString(9);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return info;
    }

    public static int join(String UserName, String LoginID, String Password, String Email, String Age, String Phone, String NickName, String Address) {
    	String Date = "211103";
    	String SQL = "INSERT INTO USERINFO(UserName, LoginID, Password, Email, Age, Phone, NickName, Address, Date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = databaseUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, UserName);
            pstmt.setString(2, LoginID);
            pstmt.setString(3, Password);
            pstmt.setString(4, Email);
            pstmt.setString(5, Age);
            pstmt.setString(6, Phone);
            pstmt.setString(7, NickName);
            pstmt.setString(8, Address);
            pstmt.setString(9, Date);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static boolean checkID(String LoginID) {
        String SQL = "SELECT LoginID FROM USERINFO WHERE LoginID = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = databaseUtil.getConnection();
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, LoginID);
            rs = pstmt.executeQuery();
            if(rs.next()) return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean checkNickName(String NickName) {
        String SQL = "SELECT NickName FROM USERINFO WHERE NickName = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = databaseUtil.getConnection();
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, NickName);
            rs = pstmt.executeQuery();
            if(rs.next()) return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String getNickName(Integer UserID) {
        String SQL = "SELECT NickName FROM USERINFO WHERE UserID = ?";
        Connection conn = null;
        String Nickname = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = databaseUtil.getConnection();
            pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1, UserID);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                Nickname = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Nickname;
    }

}