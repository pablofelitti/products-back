package com.products.model

import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "product")
class Product(@Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long?,
              @Column(name = "name", nullable = false) var name: String?,
              @Column(name = "description", nullable = true) var description: String?,
              @Column(name = "price", nullable = true) var price: BigDecimal?) {
    constructor() : this(null, null, null, null)
}