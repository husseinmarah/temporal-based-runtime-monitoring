package org.constraint.test.mqtt;

import java.util.Date;
import java.util.Iterator;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.emfjson.jackson.errors.JSONException;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.logging.Logger;

import at.jku.se.mosumo.dronology.constraint.EsperEngineAPI;


public class MQTTMessage implements MqttCallback {
	static boolean status = false;
    private static Object object;

	EsperEngineAPI esperEngineAPI = new EsperEngineAPI();
    private final static Logger LOG = Logger.getLogger(MQTTMessage.class.getName());
	public void messageArrived(String topic, MqttMessage mqttMessage)
			throws Exception {

		JSONObject jsonObj = new JSONObject(new String(mqttMessage.getPayload()));

		
		
//		   double speedVariable = jsonObj.getDouble("groundspeed");
		 if (topic.equals("VIRT1/State")){
		       double groundspeedVariable;
		       int voltageVariable;
		          try{
			   if (jsonObj.has("groundspeed") == true) {
				 groundspeedVariable = jsonObj.getDouble("groundspeed");
					} else {
				 groundspeedVariable =Double.valueOf(hasElement(jsonObj, "groundspeed").toString()).doubleValue();		 
		       }
			   if (jsonObj.has("voltage") == true) {
				 voltageVariable = jsonObj.getInt("voltage");
					} else {
				 voltageVariable =Integer.valueOf(hasElement(jsonObj, "voltage").toString()).intValue();		 
		       }
		       System.out.println("groundspeed: " + groundspeedVariable +"  "+ "voltage: " + voltageVariable); 
			   esperEngineAPI.sendSpeedEvent("VIRT1", groundspeedVariable, voltageVariable);
			    } catch (Exception e) {
						System.err.println("Still not ready");
				}
		       }
		       if (topic.equals("VIRT2/State")){
		       double groundspeedVariable;
		       int voltageVariable;
		          try{
			   if (jsonObj.has("groundspeed") == true) {
				 groundspeedVariable = jsonObj.getDouble("groundspeed");
					} else {
				 groundspeedVariable =Double.valueOf(hasElement(jsonObj, "groundspeed").toString()).doubleValue();		 
		       }
			   if (jsonObj.has("voltage") == true) {
				 voltageVariable = jsonObj.getInt("voltage");
					} else {
				 voltageVariable =Integer.valueOf(hasElement(jsonObj, "voltage").toString()).intValue();		 
		       }
		       System.out.println("groundspeed: " + groundspeedVariable +"  "+ "voltage: " + voltageVariable); 
			   esperEngineAPI.sendSpeedEvent("VIRT2", groundspeedVariable, voltageVariable);
			    } catch (Exception e) {
						System.err.println("Still not ready");
				}
		       }
		       if (topic.equals("VIRT3/State")){
		       int n_satellitesVariable;
		          try{
			   if (jsonObj.has("n_satellites") == true) {
				 n_satellitesVariable = jsonObj.getInt("n_satellites");
					} else {
				 n_satellitesVariable =Integer.valueOf(hasElement(jsonObj, "n_satellites").toString()).intValue();		 
		       }
		       System.out.println("n_satellites: " + n_satellitesVariable); 
			   esperEngineAPI.sendSatellitesEvent("VIRT3", n_satellitesVariable);
			    } catch (Exception e) {
						System.err.println("Still not ready");
				}
		       }
		
//		if (hasElement(jsonObj, "groundspeed") && topic.equals("VIRT2/State")) {
//			double speedVariable = Double.valueOf(object.toString()).doubleValue();
//			System.out.println("speed: " + speedVariable);
//			esperEngineAPI.sendSpeedEvent("VIRT2", speedVariable, null);
//		}
//
//		if (hasElement(jsonObj, "voltage") && topic.equals("VIRT3/State")) {
//			int voltageVariable = Integer.valueOf(object.toString()).intValue();
//			System.out.println("voltage: " + voltageVariable);
//
//			esperEngineAPI.sendVoltageEvent("VIRT3", voltageVariable, null);
//
//		}
	}

	public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
		System.out.println("Delivered");
	}

	public void connectionLost(Throwable throwable) {
		System.out.println("The connection to MQTT broker has been lost!" + throwable);
	}
	public static Object hasElement(JSONObject json, String key) {

		boolean exists = json.has(key);
		if (exists==true)
		{
			status=true;
		    object=json.get(key);
		}

		Iterator<?> keys;
		String nextKey;

		if (exists==false) {
			keys = json.keys();
			while (keys.hasNext()) {
				nextKey = (String) keys.next();
				if (json.get(nextKey) instanceof JSONObject) {
					object = hasElement(json.getJSONObject(nextKey), key);
				}
			}
		}

		return object;
	}
	

}
