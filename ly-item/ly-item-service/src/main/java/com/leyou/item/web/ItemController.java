package com.leyou.item.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keyou.item.pojo.Item;
import com.leyou.common.enums.ExceptiomEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.service.ItemService;

@RestController
@RequestMapping("item")
public class ItemController {
	@Autowired
	private ItemService itemService;

	@PostMapping
	public ResponseEntity<Item> saveItem(Item item) {
		if(item.getPrice() == null) {
			throw new LyException(ExceptiomEnum.PRICE_NOT_BE_NULL);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(itemService.saveItem(item));
	}
}
