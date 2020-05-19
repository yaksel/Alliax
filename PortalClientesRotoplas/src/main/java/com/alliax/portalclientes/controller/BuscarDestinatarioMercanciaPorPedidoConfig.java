package com.alliax.portalclientes.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.alliax.portalclientes.model.DestinatarioMercancia;

public class BuscarDestinatarioMercanciaPorPedidoConfig {

	private final static Logger logger = Logger.getLogger(BuscarDestinatarioMercanciaPorPedidoConfig.class);
	
	public DestinatarioMercancia buscarDestinatarioMercanciaPorPedido(String pedido){
		logger.info("BuscarDestinatariosMercanciasConfig - buscarDestinatarioMercanciaPorPedido, pedido: " + pedido);
		List<DestinatarioMercancia> result = new ArrayList<DestinatarioMercancia>();
		DestinatarioMercancia uno = new DestinatarioMercancia();
		uno.setNoDestinatario("1234567890");
		uno.setNombreSucursal("NombreSucursal1");
		uno.setCalleNumero("CalleNumero1");
		uno.setColonia("Colonia1");
		uno.setCodigoPostal("64610");
		uno.setPoblacion("Poblacion1");
		uno.setSociedad("Socieda1");
		uno.setOrganizacionVentas("9874563210");
		return uno;
	}
	
}
