package ru.isaev.samokat_service.service

import org.springframework.stereotype.Service
import ru.isaev.samokat_service.model.dto.RequestOrderDto
import ru.isaev.samokat_service.model.entity.Order
import ru.isaev.samokat_service.repository.OrderRepository

@Service
class OrderService(private val orderRepository: OrderRepository) {

    fun createOrder(requestOrderDto: RequestOrderDto): Order {
        val order = Order(
            price = requestOrderDto.price
        )
        return orderRepository.save(order)
    }
}