package com.frasesmatonasjdbc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.frasesmatonasjdbc.model.Frase;
import com.frasesmatonasjdbc.model.Persona;

public class DatabaseManager {

	private Connection conn;
	
	public DatabaseManager(Connection conn)
	{
		this.conn=conn;
	}
	
	public void crearPersona (Persona persona) {
		String query ="insert into persona (nombre,edad,carrera)"
				+"values("+ persona.toString() + ") ";
		
		Statement stmnt= null;
		
		try 
		{
		stmnt =conn.createStatement();
		stmnt.executeQuery(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void crearFrase(Frase frase) {
		String query ="insert into frase (contenido,cantidad,fechaFesde)"
				+"values("+ frase.toString() + ") ";
		
		Statement stmnt= null;
		
		try 
		{
		stmnt =conn.createStatement();
		stmnt.executeQuery(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void crearFrasePersona(int idPersona, int idFrase) {
		
	}
	public List<Persona> consultarPersonas(){
		String query= "select * from persona";
		Statement stmnt= null;
		ResultSet rs= null;
		List<Persona> listPersonas = null;
		
		try {
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(query);
			listPersonas= new ArrayList<>();
			
			while (rs.next()) {
				//creando el modelo de datos
				Persona persona = new Persona();
				
				//agregando valores al modelo
				persona.setIdPersona(rs.getInt("getIdPersona"));
				persona.setNombre(rs.getString("nombre"));
				persona.setEdad(rs.getInt("edad"));
				persona.setCarrera(rs.getString("carrera"));
				persona.setFecha(rs.getDate("fecha"));
				
				//agregando el modelo a la lista
				listPersonas.add(persona);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listPersonas;
	}
	
	public List<Frase> consultarFrases(){
		return null;
	}
	
	public List<Frase> consultarFrase(int idPersona){
		return null;
	}
}
