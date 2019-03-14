
package com.JavaWebIntentoCuatro.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
//import javax.inject.Named;

import com.JavaWebIntentoCuatro.entitys.Consulta;

/**
 * @author carl.mora
 *
 */
//@Named(value = "testController")
@ManagedBean(name = "testController")
@ViewScoped
public class ClientesController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public final static String URL = "http://192.165.30.82:8082";
	public final static String PATH = "/actualizar_tarjeta/";

	private Consulta consulta;

	public ClientesController() {
		super();
	}

	@PostConstruct
	public void init() {
		this.consulta = new Consulta();

	}

	public Consulta getConsulta() {
		return consulta;
	}
	
	/**
	 * set object
	 * @param consulta Object assign
	 */
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	
	// METODO PARA TRAER LOS DATOS DE LOS MICROSERVICISO (ESTADO= No FUNCIONA NECESITA DE UNA LIBRERIA "client.config" de jersey )
	/**
	 * 
	 */
	public void transaccion() {
         try {
        	 System.out.println(consulta.toString());
        	 String response = Consumo.conection(consulta);
     		System.out.println(response);
		} catch (Exception e) {
			System.out.println("Error no found the client");
		}
		
	}
	
	
	// CONSULTA TRANSACCIONPRUEBA (ESTA EN FUNCIONAMIENTO )
	public void transaccionPrueba() {
		 try {

	            URL url = new URL(URL + PATH + consulta.getMonto() + "/" + consulta.getTipoTransaccion() + "/" + consulta.getTarjeta_id() );
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            conn.setRequestMethod("GET");
	            conn.setRequestProperty("Accept", "application/json");
	            if (conn.getResponseCode() != 200) {
	                throw new RuntimeException("Failed : HTTP Error code : "
	                        + conn.getResponseCode());
	            }
	            InputStreamReader in = new InputStreamReader(conn.getInputStream());
	            BufferedReader br = new BufferedReader(in);
	            String output;
	            while ((output = br.readLine()) != null) {
	                System.out.println(output);
	            }
	            consulta = null;
	            conn.disconnect();

	        } catch (Exception e) {
	            System.out.println("Exception in NetClientGet:- " + e);
	        }
	    }
		 // FIN DEL LA CONSULTA DEL SERVICIO 	

	

}
