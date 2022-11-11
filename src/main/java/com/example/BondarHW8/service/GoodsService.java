package com.example.BondarHW8.service;

import com.example.BondarHW8.model.Goods;

import java.util.List;
import java.util.Optional;

public class GoodsService {

    Goods create(Goods goods);

    Goods update(Goods goods);

    List<Goods> getAll();

    Optional<Goods> getById(Long id);

    void delete(Long id);

    List<Goods> findGoodsByFinalYearOfAppointment(int finalYearOfAppointment);

    List<Goods> findGoodsByPriceLessThan();

    List<Goods> findGoodsByYearOfManufactureAndFinalYearOfAppointment(int yearOfManufacture, int finalYearOfAppointment);

}
