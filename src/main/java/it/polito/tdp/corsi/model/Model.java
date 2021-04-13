package it.polito.tdp.corsi.model;

import java.util.HashMap;
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
	
	public List<Studente> getStudentiByCorso(String codice){
		return corsoDAO.getStudentiByCorso(new Corso(codice, null, null, null));
	}

	public boolean esisteCorso(String codice) {
		
		return corsoDAO.esisteCorso(new Corso(codice, null, null, null));
	}
	
	public Map<String, Integer> getDivisioneCDS (String codice) {
		//dato il corso con codice ABC mi aspetto GES->50 INF->40 MEC->30
		Map<String, Integer> divisione = new HashMap<String, Integer>();
		List<Studente> studenti = this.getStudentiByCorso(codice);
		
//SOLUZIONE1:
//		for(Studente s : studenti) {
//			if(s.getCds()!=null &&!s.getCds().equals(""))
//				if(divisione.get(s.getCds()) == null) {
//					divisione.put(s.getCds(), 1);
//				}
//				else {
//					divisione.put(s.getCds(), divisione.get(s.getCds()+1));
//				}
//		}
//		
		return corsoDAO.getDivisioneStudenti(new Corso(codice, null, null, null));
	}
}
