package com.example.BondarHW8.repository;

import com.example.BondarHW8.model.Goods;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public class GoodsRepository extends CrudRepository<Goods, Long> {

    List<Goods> findGoodsByFinalYearOfAppointmentLessThan(int finalYearOfAppointment);

    List<Goods> findGoodsByPriceLessThan(int price);

    @Query("SELECT y FROM Product y WHERE y.yearOfManufacture =:yearOfManufacture AND y.finalYearOfAppointment =:finalYearOfAppointment")
    List<Goods> findGoodsByYearOfManufactureAndFinalYearOfAppointment(int yearOfManufacture, int finalYearOfAppointment);
}
