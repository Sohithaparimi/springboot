package com.mastek.eshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.eshop.model.OrderItem;
@Repository
public interface IOrderItemRepository extends CrudRepository<OrderItem, Integer> {

}
