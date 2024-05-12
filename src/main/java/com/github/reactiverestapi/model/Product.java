package com.github.reactiverestapi.model;

import java.math.BigDecimal;

public record Product(long id, String reference, String size, boolean active, BigDecimal price) {}
