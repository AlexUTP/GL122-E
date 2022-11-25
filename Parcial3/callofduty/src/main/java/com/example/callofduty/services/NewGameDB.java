package com.example.callofduty.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.example.callofduty.models.NewGame;

public class NewGameDB {
    Connection  _cn;
    public NewGameDB(){
        _cn = new connection().openDb();
    }
    public List<NewGame> ObtenerNewGame(){
        try {
            Statement stnt = _cn.createStatement();
            String query = "SELECT * FROM NewGame";
            List<NewGame> newgame = new ArrayList<>();
            ResultSet result = stnt.executeQuery(query);
            
            while(result.next()){
                NewGame new_game = new NewGame(
                    result.getString("url"),
                    result.getString("name"),
                    result.getString("description")
                );
                new_game.add(newgame);
            }
                } catch (Exception e) {
            System.out.println("Ocurrio una excepcion.");
        }
        return null;
    }
}
