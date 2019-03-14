package com.JavaWebIntentoCuatro.controllers;

import com.JavaWebIntentoCuatro.entitys.Consulta;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class Consumo {

	public final static String URL = "http://192.165.30.136:8082";
	public final static String URLL = "http://192.165.30.79:8080";
	public final static String PATH = "/actualizar_tarjeta/";
	public final static String PATHH = "/tarjeta/";

	public static String conection(Consulta consulta) {
		try {
//			ClientConfig client = new DefaultClientConfig();
//			client.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
//			Client cliente = Client.create(client);
////			WebResource webR = cliente.resource(URL + PATH + consulta.getMonto() + "/" + consulta.getTipoTransaccion()
////					+ "/" + consulta.getTarjeta_id());
//			WebResource webR = cliente.resource(URL + PATH + consulta.getTarjeta_id());
//			ClientResponse response = webR.type("application/json").post(ClientResponse.class);
//			String data = response.getEntity(String.class);
//			return data;
			return "-------------------------- sirve"+ consulta.toString();
		} catch (Exception e) {
			return null;
		}

	}

}
