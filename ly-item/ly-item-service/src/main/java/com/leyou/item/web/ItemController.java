package com.leyou.item.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keyou.item.pojo.Item;

@RestController
@RequestMapping("item")
public class ItemController {

	@PostMapping
	public ResponseEntity<Item> saveItem(Item item) {
		if(item.getPrice() == null) {
			throw new RuntimeException("价格不能为空");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
}
