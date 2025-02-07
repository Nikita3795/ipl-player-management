package com.ipl.dao;

import com.ipl.model.Player;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {
    private Connection conn;

    public PlayerDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipl", "root", "password");
    }

    public void addPlayer(Player player) throws SQLException {
        String sql = "INSERT INTO players (name, jerseyNumber, team, role) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, player.getName());
        stmt.setInt(2, player.getJerseyNumber());
        stmt.setString(3, player.getTeam());
        stmt.setString(4, player.getRole());
        stmt.executeUpdate();
    }

    public List<Player> getPlayers() throws SQLException {
        List<Player> players = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM players");
        while (rs.next()) {
            players.add(new Player(rs.getInt("id"), rs.getString("name"), rs.getInt("jerseyNumber"), rs.getString("team"), rs.getString("role")));
        }
        return players;
    }

    public void deletePlayer(int id) throws SQLException {
        String sql = "DELETE FROM players WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
}
