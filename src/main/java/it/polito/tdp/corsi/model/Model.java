package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	//il modello usa il metodo del DAO
	private CorsoDAO  corsoDAO;
	
	public Model() {
		corsoDAO = new CorsoDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(Integer pd){
		
		return corsoDAO.getCorsiByPeriodo(pd);
	}

	public Map<Corso, Integer> getIscrittiByPeriodo(Integer pd) {
	
		return corsoDAO.getIscrittiByPeriodo(pd);
	}
}
