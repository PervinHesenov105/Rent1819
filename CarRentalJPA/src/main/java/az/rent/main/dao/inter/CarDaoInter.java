/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.rent.main.dao.inter;

import az.rent.main.entity.Car;
import java.util.List;

/**
 *
 * @author USER
 */
public interface CarDaoInter {
     void insert(Car car);
    void update(Car car);
    void delete(int id);
    Car getCarById(int id);
    List<Car> getAllCar();
}