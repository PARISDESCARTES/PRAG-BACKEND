package com.iman;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iman.domain.Compte;
import com.iman.domain.MembreAssociation;

@RestController
public class RestMembres {

	@Autowired
	private DaoMembres daoMembres;
	@Autowired
	private CompteDao daoComptes;
	
	@RequestMapping("/membres")
	public String getMembres(){
		List<MembreAssociation> listMembres = daoMembres.findAll();
		List<JSONObject> listAllMembres = new ArrayList<>();
		for (MembreAssociation membre : listMembres) {
			Compte compteMembre = daoComptes.findByIdCompte(membre.getIdCompte());
			JSONObject jo = new JSONObject();
			jo.put("id", membre.getIdMembreAssociation());
			jo.put("image", membre.getPhotoMembreAssociation());
			jo.put("prenom", compteMembre.getPrenomCompte());
			jo.put("nom", compteMembre.getNomCompte());
			jo.put("description", membre.getDescriptionMembreAssociation());
			jo.put("telephone", compteMembre.getTelephoneCompte());
			jo.put("email", compteMembre.getEmailCompte());
			listAllMembres.add(jo);
		}
		JSONObject jsf = new JSONObject();
		jsf.put("data", listAllMembres);
		String response = jsf.toString();
		return response;
	}
}
