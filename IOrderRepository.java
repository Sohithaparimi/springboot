package com.mastek.eshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.eshop.model.Orders;
@Repository
public interface IOrderRepository extends CrudRepository<Orders, Integer> {

}
