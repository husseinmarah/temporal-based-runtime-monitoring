package at.jku.se.mosumo.dronology.constraint;

import java.util.UUID;

import org.constraint.test.mqtt.MQTTMessage;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EsperEngineRun {
	private static Logger LOG = LoggerFactory.getLogger(EsperEngineRun.class);

	public static void main(String [] args) throws Exception {

        System.out.println((" == Starting main == "));
		EsperEngineRun esperEngineRun = new EsperEngineRun();		
		EsperEngineAPI esperEngineAPI = new EsperEngineAPI();
		esperEngineAPI.loadEsperEngine();
		esperEngineRun.loadMqttConfiguration();

	}
	
	public void loadMqttConfiguration() throws MqttException {

		MqttClient client = new MqttClient("tcp://localhost:1883",
				MqttClient.generateClientId(), new MqttDefaultFilePersistence("/tmp"));
		client.connect();

		MQTTMessage callback = new MQTTMessage();
		client.setCallback(callback);

        client.subscribe("VIRT1/State");
        client.subscribe("VIRT2/State");
        client.subscribe("VIRT3/State");
	}
	
}
