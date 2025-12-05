package com.e_commerce.service.retaurant;

import com.e_commerce.dto.order.orderDTO.OrderDTO;
import com.e_commerce.entity.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public interface RestaurantService {
    Restaurant create(Restaurant restaurant);

    List<Restaurant> getAll();

    Restaurant getById(Integer id);

    void delete(Integer id);

    List<OrderDTO> getOrders(Integer restaurantId);

    BigDecimal getTotalRevenue(Integer restaurantId, LocalDateTime startDateTime, LocalDateTime endDateTime);
}
