package com.ait.vis.mongo.embeded.api.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private String name;
	private int quantity;
	private int price;
}
