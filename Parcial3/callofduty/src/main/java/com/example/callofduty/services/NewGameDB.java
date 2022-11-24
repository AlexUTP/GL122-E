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
}
