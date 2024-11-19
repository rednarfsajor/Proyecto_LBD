/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulos;

import java.sql.Connection;

/**
 *
 * @author Frander
 */
public class General {
   public static Conexion db= new Conexion();
   public static Connection database=db.conectar();
}
