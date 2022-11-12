package com.example.BondarHW8.service.Impl;

import com.example.BondarHW8.model.Goods;
import com.example.BondarHW8.repository.GoodsRepository;
import com.example.BondarHW8.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {


    private final GoodsRepository goodsRepository;

    @Autowired
    public GoodsServiceImpl(GoodsRepository goodsRepository){
        this.goodsRepository = goodsRepository;
    }

    @Override
    public Goods create(Goods goods) {
        return goodsRepository.save(goods);
    }

    @Override
    public Goods update(Goods goods) {
        return null;
    }

    @Override
    public List<Goods> getAll() {
        return (List<Goods>) goodsRepository.findAll();
    }

    @Override
    public Optional<Goods> getById(Long id) {
        return goodsRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        goodsRepository.deleteById(id);
    }

    @Override
    public List<Goods> findGoodsByFinalYearOfAppointment(int finalYearOfAppointment) {
        return goodsRepository.findGoodsByFinalYearOfAppointmentLessThan(finalYearOfAppointment);
    }

    @Override
    public List<Goods> findGoodsByPriceLessThan() {
        return goodsRepository.findGoodsByPriceLessThan(50);
    }

    @Override
    public List<Goods> findGoodsByYearOfManufactureAndFinalYearOfAppointment(int yearOfManufacture, int finalYearOfAppointment) {
        return goodsRepository.findGoodsByYearOfManufactureAndFinalYearOfAppointment(yearOfManufacture, finalYearOfAppointment);
    }

}
