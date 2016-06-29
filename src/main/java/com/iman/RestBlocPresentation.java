package com.iman;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iman.domain.BlocPresentation;

@RestController
public class RestBlocPresentation {

	@Autowired
	private DaoBlocPresentation dao;
	
	@RequestMapping("/bloc")
	public String getBlocs(){
		List<BlocPresentation> listBlocs = dao.findAll();
		List<JSONObject> listAllBlocs = new ArrayList<>();
		for (BlocPresentation blocPresentation : listBlocs) {
			JSONObject jo = new JSONObject();
			jo.put("id", blocPresentation.getIdBloc());
			jo.put("title", blocPresentation.getTitreBloc());
			jo.put("content", blocPresentation.getDescriptionBloc());
			jo.put("imageUrl", blocPresentation.getPhotoBloc());
			jo.put("type", blocPresentation.getTypeBloc());
			jo.put("style", blocPresentation.getStyleBloc());
			listAllBlocs.add(jo);
		}
		JSONObject jsf = new JSONObject();
		jsf.put("data", listAllBlocs);
		String response = jsf.toString();
		return response;
	}
}
