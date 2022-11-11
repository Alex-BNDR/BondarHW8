package com.example.BondarHW8.web;


import com.example.BondarHW8.model.Goods;
import com.example.BondarHW8.service.GoodsService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/products/")
public class GoodsController {

    private GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @PostMapping(value = "/goods")
    @ResponseStatus(HttpStatus.CREATED)
    public Goods create(@RequestBody Goods goods) {
        return goodsService.create(goods);
    }

    @PutMapping("/update")
    public Goods update(@RequestBody Goods goods) {
        return goodsService.update(goods);
    }

    @GetMapping(value = "/goods")
    public List<Goods> getAll() {
        return goodsService.getAll();
    }

    @DeleteMapping(value = "/goods")
    public void delete(@RequestParam Long id) {
        goodsService.delete(id);
    }

    @GetMapping(value = "/goods/{id}")
    public Optional<Goods> getById(@PathVariable Long id) {
        return goodsService.getById(id);
    }

    @GetMapping(value = "/goods/final")
    public List<Goods> getByFinalYearOfAppointment(@RequestParam int years) {
        return goodsService.findGoodsByFinalYearOfAppointment(years);
    }

    @GetMapping("/cheap")
    public List<Goods> getGoodsLess50() {
        return goodsService.findGoodsByPriceLessThan();
    }

    @GetMapping("/findByYears/{first}/{second}")
    public List<Goods> findGoodsByYearOfManufactureAndFinalYearOfAppointment(@PathVariable int first, @PathVariable int second) {
        return goodsService.findGoodsByYearOfManufactureAndFinalYearOfAppointment(first, second);
    }
}
