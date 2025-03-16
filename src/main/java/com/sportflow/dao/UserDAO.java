package com.sportflow.dao;

import com.sportflow.dto.RegisterDTO;
import com.sportflow.model.Member;
import com.sportflow.model.Trainer;
import com.sportflow.model.User;

import java.sql.*;

public class UserDAO extends ConnectToDB {

    private static final String GET_USER_BY_EMAIL = "SELECT * FROM users WHERE email = ?;";
    private static final String INSERT_INTO_USERS = "INSERT INTO users (firstName, lastName, email, password, isAdmin, role) VALUES (?, ?, ?, ?, ?, ?);";
    private static final String ADD_TRAINER = "INSERT INTO trainers (user_id, belongsTo) values (?, ?);";
    private static final String ADD_MAMBER = "INSERT INTO members (user_id, belongsTo, dateOfBirth) values (?, ?, ?);";
    private static final String UPDATE_USER_BY_ID = "UPDATE users\n" +
            "    SET firstName = ?,\n" +
            "    lastName = ?,\n" +
            "     email = ?\n" +
            "WHERE id = ?;";

    private static final String DELETE_USER_BY_ID = "DELETE FROM users WHERE id = ?";


    public UserDAO () {}

    public User getUserByEmail (String email) {
        User user = null;

        try (
                Connection con = getConnection();
                PreparedStatement stmt = con.prepareStatement(GET_USER_BY_EMAIL);
        ){
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user = rs.getString("role").equals("trainer") ? new Trainer() : new Member();
                user.setEmail(rs.getString("email"));
            }

        }
        catch ( SQLException e ){
            e.printStackTrace();
        }

        return user;

    }


    public void registerUser (RegisterDTO register, int belongsTo) {

        try (
                Connection con = getConnection();
                PreparedStatement stmt = con.prepareStatement(INSERT_INTO_USERS, Statement.RETURN_GENERATED_KEYS);
        ){

            stmt.setString(1, register.getFirstName());
            stmt.setString(2, register.getLastName());
            stmt.setString(3, register.getEmail());
            stmt.setString(4, register.getPassword());
            stmt.setBoolean(5, register.getIsAdmin());
            stmt.setString(6, register.getRole());
            System.out.println(stmt.toString());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                int userId = rs.getInt(1); // Typically, the first column returned is the generated id
                if ("trainer".equals(register.getRole())) addTrainer(userId, belongsTo);
                if ("member".equals(register.getRole())) addMember(userId, belongsTo, register.getDateOfBirth());
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addTrainer ( int trainerId, int belongsTo ) {
        try (
                Connection con = getConnection();
                PreparedStatement stmt = con.prepareStatement(ADD_TRAINER);
        ){
            System.out.println(belongsTo);
            stmt.setInt(1, trainerId);
            if (belongsTo > 0) {
                stmt.setInt(2, belongsTo);
            } else {
                stmt.setNull(2, Types.INTEGER);
            }
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addMember ( int memberId, int belongsTo, String dateOfBirth ) {
        try (
                Connection con = getConnection();
                PreparedStatement stmt = con.prepareStatement(ADD_MAMBER);
        ){
            stmt.setInt(1, memberId);
            if (belongsTo > 0) {
                stmt.setInt(2, belongsTo);
            } else {
                stmt.setNull(2, Types.INTEGER);
            }
            stmt.setString(3, dateOfBirth);
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User authenticateByEmail (String email) {
        User user = null;

        try (
                Connection con = getConnection();
                PreparedStatement stmt = con.prepareStatement(GET_USER_BY_EMAIL);
        ){
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String userEmail = rs.getString("email");
                String role = rs.getString("role");
                String password = rs.getString("password");

                user = rs.getString("role").equals("trainer") ? new Trainer() : new Member();
                user.setId(id);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setEmail(userEmail);
                user.setRole(role);
                user.setPassword(password);

            }
        }
        catch ( SQLException e ){
            e.printStackTrace();
        }

        return user;
    }

    public void deleteUserById(int userId) {
        try (
                Connection con = getConnection();
                PreparedStatement stmt = con.prepareStatement(DELETE_USER_BY_ID);
        ){

            stmt.setInt(1, userId);
            stmt.executeUpdate();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}






















