package com.controller;

import com.iman.CompteDao;
import com.iman.EnfantDao;
import com.iman.domain.Compte;
import com.iman.domain.Enfant;
import org.jooq.tools.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sébastien on 27/06/2016.
 */
@Controller
@RequestMapping("/iman/medical")
public class HomeMedical {

    @Autowired
    private CompteDao compteDao;

    @Autowired
    private EnfantDao enfantDao;

    @RequestMapping(value="/auth/{login}/{mdp}", method = RequestMethod.POST)
    public List<Enfant> getListEnfant(@PathVariable String login,
                                      @PathVariable String mdp ){

        if(StringUtils.isBlank(login) || StringUtils.isBlank(mdp)){return null;}
        Compte compte = new Compte();
        compte = compteDao.findByLoginCompteAndPasswordCompte(login,mdp);
        if(compte != null) {return null;}
        List<Enfant> listeEnfant = new LinkedList<Enfant>();
      //  if(compte.isAdmin())
        
        return null;
    }

}
