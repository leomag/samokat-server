package ru.isaev.samokat_service.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.isaev.samokat_service.model.dto.RequestOrderDto
import ru.isaev.samokat_service.model.entity.Order
import ru.isaev.samokat_service.service.OrderService

@RestController
@RequestMapping("/api/v1/order")
class OrderController(private val orderService: OrderService) {


    @PostMapping
    fun createOrder(@RequestBody requestOrderDto: RequestOrderDto): ResponseEntity<Order> {
        val created = orderService.createOrder(requestOrderDto)
        return ResponseEntity.status(201).body(created)
    }
}