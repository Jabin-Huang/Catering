package me.catering.demo.web.food;

import me.catering.demo.domain.entity.Food;
import me.catering.demo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodRestController {

    private final FoodService foodService;

    @Autowired
    public FoodRestController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping()
    public Iterable<Food> listAllSellingFoodsByShopId(@RequestParam(value="shopId")int shopId) {
        return foodService.getSellingFoodsByShopId(shopId);
    }

    @GetMapping("/{foodId}")
    public Food getFoodDetail(@PathVariable int foodId) {
        return foodService.getFoodById(foodId);
    }
}
