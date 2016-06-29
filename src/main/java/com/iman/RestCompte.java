package com.iman;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iman.domain.Compte;

@RestController
public class RestCompte {

	@Autowired
	private CompteDao dao;
	
	@RequestMapping("/compteTest")
	public String getCompteByPrenom(@RequestParam(value="prenom") String prenom){
		List<Compte> listPrenom = dao.findByPrenomCompte(prenom);
		List<JSONObject> listComptes = new ArrayList<>();
		for (Compte compte : listPrenom) {
			JSONObject jo = new JSONObject(compte);
			listComptes.add(jo);
		}
		JSONObject jsf = new JSONObject();
		jsf.put("data", listComptes);
		return jsf.toString();
	}
}
