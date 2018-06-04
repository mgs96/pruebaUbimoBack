package com.ubimo.mau.app.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ubimo.mau.app.models.ScoreRange;
import com.ubimo.mau.app.models.ScoreTable;

@RestController
public class GreetingController {
	
	@RequestMapping("/greeting")
	@ResponseBody
	public ScoreTable postTable(@RequestBody ScoreTable table) {
		table.roundBounds();
		if (table.isValid()) {
			table.setIdentifier("ACEPTADO");
		} else {
			table.setIdentifier("INVALIDO");
		}
		System.out.println(table.toString());
		return table;
	}
}
