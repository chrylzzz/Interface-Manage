package com.lnsoft.module.ems.kafka.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebService;
@WebService
public interface KafkaService {

	//只传topic
	ArrayList<HashMap<String,String>> conKafka(String topic);
	//topic，lctype
	ArrayList<HashMap<String,String>> conKafkaByLc(String topic,String type);

	ArrayList<String> queryLcType(String lcType);
	//监听-对外
	void insertKafkaVisit(HashMap<String, Object> visitMap);
	HashMap<String, Object> queryKafkaVisitAll(Integer page, Integer rows);
	//emsWay
	ArrayList<String> readEMSByCityLcTypeDateFromWs(String city, String lcType, String date);
}
