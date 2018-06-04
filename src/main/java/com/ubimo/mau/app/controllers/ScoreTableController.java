package com.ubimo.mau.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ubimo.mau.app.models.*;

@Controller
public class ScoreTableController {

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/table")
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
