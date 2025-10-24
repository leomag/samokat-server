package ru.isaev.samokat_service.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.isaev.samokat_service.model.entity.Order

@Repository
interface OrderRepository: JpaRepository<Order, Int>