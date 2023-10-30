/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package az.rent.main.main;

import az.rent.main.config.Context;
import az.rent.main.dao.inter.CarDaoInter;
import az.rent.main.entity.Car;

/**
 *
 * @author USER
 */
public class CarRentalJPA {

    public static void main(String[] args) {

        CarDaoInter cdao = Context.instanceCarDao();
        Car c = cdao.getCarById(1);
        System.out.println(c);

    }
}
