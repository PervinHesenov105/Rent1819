/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.rent.main.config;

import az.rent.main.dao.impl.CarDaoImpl;
import az.rent.main.dao.inter.CarDaoInter;

/**
 *
 * @author USER
 */
public class Context {
    
    
    public static CarDaoInter instanceCarDao(){
        return (CarDaoInter) new CarDaoImpl();
    }
    
   
}
