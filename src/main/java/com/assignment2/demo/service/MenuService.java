package com.assignment2.demo.service;

import com.assignment2.demo.dto.MenuItemDTO;
import com.assignment2.demo.model.*;
import com.assignment2.demo.repository.AdminRepository;
import com.assignment2.demo.repository.CategoryRepository;
import com.assignment2.demo.repository.MenuItemRepository;
import com.assignment2.demo.repository.RestaurantRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * Menu service.
 */
@Service
public class MenuService {

    private final CategoryRepository categoryRepository;
    private final MenuItemRepository menuItemRepository;
    private final RestaurantRepository restaurantRepository;
    private final AdminRepository adminRepository;
    Logger logger = Logger.getLogger(MenuService.class.getName());
    /**
     * Instantiates a new Menu service.
     *  @param categoryRepository   the category repository
     * @param menuItemRepository   the menu item repository
     * @param restaurantRepository the restaurant repository
     * @param adminRepository
     */
    public MenuService(CategoryRepository categoryRepository, MenuItemRepository menuItemRepository, RestaurantRepository restaurantRepository, AdminRepository adminRepository) {
        this.categoryRepository = categoryRepository;
        this.menuItemRepository = menuItemRepository;
        this.restaurantRepository = restaurantRepository;
        this.adminRepository = adminRepository;
    }


    /**
     * Insert menu item.
     *
     * @param menuITemDTO the menu item dto
     * @return boolean - true if menu item was inserted successfully and false otherwise
     */
    public Boolean insertMenuItem(MenuItemDTO menuITemDTO) {
        Optional<RestaurantAdministrator> admin = adminRepository.findByUsername(menuITemDTO.getAdmin());
        Optional<Restaurant> restaurant = restaurantRepository.findByAdministrator(admin.get());
        Optional <FoodCategory> category = categoryRepository.findByName(menuITemDTO.getCategory());
        if (menuITemDTO.getPrice() <=0){
            logger.warning("Menu item not valid");
            return false;

        }
        MenuItem newMenuItem = new MenuItem(menuITemDTO.getName(), menuITemDTO.getDescription(), menuITemDTO.getPrice());
        if (category.isPresent()) {

            newMenuItem.setCategory(category.get());
        }
        else {
            logger.warning("Menu item not valid");
            return false;
        }
        if (restaurant.isPresent()){
            newMenuItem.setRestaurant(restaurant.get());
        }
        else {
            logger.warning("Menu item not valid");
            return false;
        }

        System.out.println(newMenuItem.getName());
        System.out.println(newMenuItem.getPrice());
        System.out.println(newMenuItem.getDescription());
        System.out.println(newMenuItem.getCategory().getName());
        System.out.println(newMenuItem.getRestaurant().getName());
        menuItemRepository.save(newMenuItem);
        logger.warning("Menu item inserted in the DB");
        return true;
    }

    /**
     * Gets all food categories in the DB.
     *
     * @return the list of all food categories in the DB
     */
    public List<FoodCategory> getAllFoodCategories() {
        logger.info("Retrieving all mfood categories from the DB" );
        return categoryRepository.findAll();
    }

    /**
     * Get all menu items by restaurant name.
     *
     * @param name the name
     * @return the list of menu items for a restaurant
     */
    public List<MenuItem> getAllMenuItemsByRestaurantName(String name){
        logger.info("Retrieving all menu items for restaurant" + name);
        Optional<Restaurant> restaurant = restaurantRepository.findRestaurantByName(name);
        return menuItemRepository.findAllByRestaurant(restaurant.get());
    }
}
