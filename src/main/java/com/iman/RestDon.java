package com.iman;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iman.domain.Compte;
import com.iman.domain.Don;
import com.iman.domain.Enfant;
import com.iman.domain.Mecene;

@RestController
public class RestDon {

	@Autowired
	private CompteDao daoComptes;
	
	@Autowired
	private DaoDon daoDon;
	
	@Autowired
	private EnfantDao daoEnfant;
	
	@Autowired
	private DaoMecene daoMecene;
	
	@RequestMapping("/dons")
	public String getDons(){
		List<Don> listDons = daoDon.findAll();
		List<JSONObject> listAllDons = new ArrayList<>();
		for (Don don : listDons) {
			Enfant enfant = daoEnfant.findByIdEnfant(don.getIdEnfant());
			Mecene mecene = daoMecene.findByIdMecene(don.getIdMecene());
			Compte compteEnfant = daoComptes.findByIdCompte(enfant.getIdCompte());
			Compte compteMecene = daoComptes.findByIdCompte(mecene.getIdCompte());
			JSONObject jo = new JSONObject(don);
			JSONObject je = new JSONObject(enfant);
			JSONObject jm = new JSONObject(mecene);
			je.put("prenom", compteEnfant.getPrenomCompte());
			je.put("nom", compteEnfant.getNomCompte());
			jm.put("prenom", compteMecene.getPrenomCompte());
			jm.put("nom", compteMecene.getNomCompte());
			jo.put("enfant", je);
			jo.put("mecene", jm);
			listAllDons.add(jo);
		}
		JSONObject jsf = new JSONObject();
		jsf.put("data", listAllDons);
		String response = jsf.toString();
		return response;
	}
}
