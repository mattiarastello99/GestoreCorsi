package it.polito.tdp.corsi.db;

import it.polito.tdp.corsi.model.Corso;

public class testDAO {

	public static void main(String[] args) {
		CorsoDAO dao = new CorsoDAO();
		System.out.println(dao.getStudentiByCorso(new Corso("01K", null, null, null)));

	}

}
