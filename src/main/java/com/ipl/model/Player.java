package com.ipl.model;

public class Player {
    private int id;
    private String name;
    private int jerseyNumber;
    private String team;
    private String role;

    public Player(int id, String name, int jerseyNumber, String team, String role) {
        this.id = id;
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.team = team;
        this.role = role;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getJerseyNumber() { return jerseyNumber; }
    public void setJerseyNumber(int jerseyNumber) { this.jerseyNumber = jerseyNumber; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Player [id=" + id + ", name=" + name + ", jerseyNumber=" + jerseyNumber + ", team=" + team + ", role=" + role + "]";
    }
}
