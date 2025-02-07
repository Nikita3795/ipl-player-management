package com.ipl.main;

import com.ipl.dao.PlayerDAO;
import com.ipl.model.Player;
import java.sql.SQLException;
import java.util.List;

public class IPLMain {
    public static void main(String[] args) {
        try {
            PlayerDAO dao = new PlayerDAO();

            // Adding a player
            dao.addPlayer(new Player(0, "Virat Kohli", 18, "RCB", "Batsman"));
            dao.addPlayer(new Player(0, "MS Dhoni", 7, "CSK", "Wicketkeeper"));

            // Retrieving players
            List<Player> players = dao.getPlayers();
            for (Player p : players) {
                System.out.println(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
