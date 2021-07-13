package at.jku.se.mosumo.dronology.constraint;

import java.util.Iterator;
import java.util.UUID;

import org.constraint.test.mqtt.MQTTMessage;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Run2 {
	private static Logger LOG = LoggerFactory.getLogger(Run2.class);
	static boolean status = false;
	private static JsonResourceFactory factory;
	private static ObjectMapper mapper;
	public static void main(String[] args) throws Exception {

		System.out.println("== Starting main ==");

		
		String mqttMessage="{\"mode\":\"STABILIZE\",\"armable\":\"true\",\"armed\":\"false\",\"n_satellites\": 10,\"groundspeed\":0.0,\"batterystatus\":{\"current\":0.0,\"voltage\":12.587,\"level\":4.0},\"location\":{\"x\":41.714775,\"y\":-86.238825,\"z\":-0.05},\"velocity\":{\"x\":0.01,\"y\":-0.01,\"z\":0.01},\"attitude\":{\"x\":-0.006369109731167555,\"y\":-0.008277646265923977,\"z\":-0.01969406194984913},\"status\":\"STANDBY\"}"; 
		
		String mqttMessage2="{\"current\":0,\"level\":4,\"voltage\":12.587}";

		JSONObject jsonObj = new JSONObject(new String(mqttMessage));

		System.out.println("ww"+jsonObj); //Ret
		System.out.println("welcome"+hasKey(jsonObj, "current")); //Ret
		mapper = new ObjectMapper();
		factory = new JsonResourceFactory(mapper);
		System.out.println("mapper: "+mapper);
		System.out.println("factory: "+factory);
		
		
		JsonNode data = factory.getMapper().readTree(mqttMessage);

	    Iterator<JsonNode> it = data.iterator();

			System.out.println("yess: "+data.get("batterystatus"));	

	}
	
	public static boolean hasKey(JSONObject json, String key) {

		boolean exists = json.has(key);
		if (exists==true)
		{
			status=true;
			System.out.println("value  " + json.get(key));
		}

		Iterator<?> keys;
		String nextKey;

		if (exists==false) {
			keys = json.keys();
			while (keys.hasNext()) {
				nextKey = (String) keys.next();
				if (json.get(nextKey) instanceof JSONObject) {
					exists = hasKey(json.getJSONObject(nextKey), key);
				}
			}
		}

		return status;
	}
	
}
