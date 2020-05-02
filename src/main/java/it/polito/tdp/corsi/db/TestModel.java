package it.polito.tdp.corsi.db;

import it.polito.tdp.corsi.model.Model;

public class TestModel {

	public static void main(String[] args) {
		Model model = new Model();
        System.out.println(model.getCorsiByPeriodo(1));
	}

}
