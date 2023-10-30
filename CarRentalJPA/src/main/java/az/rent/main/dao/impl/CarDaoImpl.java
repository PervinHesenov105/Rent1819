/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.rent.main.dao.impl;


import az.rent.main.config.AbstractPU;
import az.rent.main.dao.inter.CarDaoInter;
import az.rent.main.entity.Car;
import java.util.List;
import javax.persistence.EntityManager;


/**
 *
 * @author Perfect
 */
public class CarDaoImpl extends AbstractPU implements CarDaoInter {

    @Override
    public void insert(Car car) {
        EntityManager em = createEM();
        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();
        close(em);

    }

    @Override
    public void update(Car car) {
        EntityManager em = createEM();
        em.getTransaction().begin();
        em.merge(car);
        em.getTransaction().commit();
        close(em);
    }

    @Override
    public void delete(int id) {
        EntityManager em = createEM();
        Car c = em.find(Car.class, id);
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
        close(em);
    }

    @Override
    public Car getCarById(int id) {

        EntityManager em = createEM();
        Car c = em.find(Car.class, id);
        close(em);
        return c;
    }

    @Override
    public List<Car> getAllCar() {
        EntityManager em = createEM();
        List<Car> list = em.createQuery("select c from Car c").getResultList();
        close(em);
        return list;
    }

}
