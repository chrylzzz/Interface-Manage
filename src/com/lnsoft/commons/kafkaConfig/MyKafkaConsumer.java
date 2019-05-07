package com.lnsoft.commons.kafkaConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lnsoft.commons.dynamicDataSource.DataSourceConst;
import com.lnsoft.commons.dynamicDataSource.DataSourceContextHolder;
import com.lnsoft.module.ems.kafka.service.KafkaService;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.message.MessageAndMetadata;
import kafka.serializer.StringDecoder;
import kafka.utils.VerifiableProperties;

/**
 * 
 * 此方法为了获取想要的kafka数据
 * 
 * @author Administrator
 *
 */
@Component
public class MyKafkaConsumer  {

	@Autowired
	private KafkaService kafkaService;

	private static final Logger logger = LoggerFactory.getLogger(MyKafkaConsumer.class);
	private static ConsumerConnector consumer;
//	static {
//		Properties props = new Properties();
//		boolean flag=true;
//		// zookeeper集群
//		if (consumer == null) {
//			props.put("zookeeper.connect",
//					"10.141.17.33:2181,10.141.17.34:2181,10.141.17.35:2181,192.168.17.19:2181,192.168.17.20:2181");
//			// kafka服务器
//			props.put("bootstrap.servers", "192.168.17.40:9092,192.168.17.41:9092,192.168.17.42:9092");
//			// group.id
//			props.put("group.id", "log_app_chi");
//			props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//			props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//			props.put("enable.auto.commit", true);
//			props.put("auto.commit.interval.ms", "1000");
//			props.put("auto.offset.reset", "smallest");
//			props.put("serializer.class", "kafka.serializer.StringEncoder");
//			ConsumerConfig config = new ConsumerConfig(props);
//			consumer = Consumer.createJavaConsumerConnector(config);
//		}
//	}

/*	public MyKafkaConsumer() {
		 Properties props = new Properties();
		 // zookeeper集群
		 props.put("zookeeper.connect",
		 "10.141.17.33:2181,10.141.17.34:2181,10.141.17.35:2181,192.168.17.19:2181,192.168.17.20:2181");
		 // kafka服务器
		 props.put("bootstrap.servers",
		 "192.168.17.40:9092,192.168.17.41:9092,192.168.17.42:9092");
		 // group.id
		 props.put("group.id", "log_app_2");
		 props.put("key.deserializer",
		 "org.apache.kafka.common.serialization.StringDeserializer");
		 props.put("value.deserializer",
		 "org.apache.kafka.common.serialization.StringDeserializer");
		 props.put("enable.auto.commit", true);
		 props.put("auto.commit.interval.ms", "1000");
		 props.put("auto.offset.reset", "smallest");
		 props.put("serializer.class", "kafka.serializer.StringEncoder");
		 ConsumerConfig config = new ConsumerConfig(props);
		 consumer = Consumer.createJavaConsumerConnector(config);
	}*/

	/**
	 * city查
	 * 
	 * @param topic
	 * @return
	 */
	public ArrayList<HashMap<String, String>> con(String topic) {

		// 1. 指定Topic
		Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
		topicCountMap.put(topic, Integer.valueOf(1));
		// 2. 指定数据的解码器
		StringDecoder keyDecoder = new StringDecoder(new VerifiableProperties());
		StringDecoder valueDecoder = new StringDecoder(new VerifiableProperties());

		Map consumerMap = /* this. */consumer.createMessageStreams(topicCountMap, keyDecoder, valueDecoder);
		List streams = (List) consumerMap.get(topic);
		//
		ArrayList<HashMap<String, String>> allData = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> oneData = new HashMap<String, String>();
		System.out.println("======================");
		for (int i = 0; i < streams.size(); ++i) {
			KafkaStream stream = (KafkaStream) streams.get(i);
			ConsumerIterator it = stream.iterator();
			while (it.hasNext()) {// 有数据，就更新，写业务
				MessageAndMetadata mda = it.next();// 有数据就更新
				try {
					logger.debug("开始监听:{}", mda.message());
					// 所有数据全部都要
					oneData = KafkaDataUtil.allData(mda.key().toString(), mda.message().toString());
					System.out.println(mda.key());
					allData.add(oneData);
					for (Map<String, String> map : allData) {
						for (Map.Entry<String, String> s : map.entrySet()) {
							System.out.println(map.get(s) + "=1==");
							System.out.println(s.getKey() + "=2==");
							System.out.println(s.getValue() + "=3==");
						}
					}
					logger.debug("监听结束:", mda.message());
					return allData;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return allData;
	}

	/**
	 * city和cltype查
	 * 
	 * @param topic
	 * @param lcType
	 * @return
	 */
	public ArrayList<HashMap<String, String>> conByLcType(String topic, String lcType) {
		// 1. 指定Topic
		Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
		topicCountMap.put(topic, Integer.valueOf(1));
		// 2. 指定数据的解码器
		StringDecoder keyDecoder = new StringDecoder(new VerifiableProperties());
		StringDecoder valueDecoder = new StringDecoder(new VerifiableProperties());

		Map consumerMap = /* this. */consumer.createMessageStreams(topicCountMap, keyDecoder, valueDecoder);
		List streams = (List) consumerMap.get(topic);
		// list里装map
		DataSourceContextHolder.setDataSourceType(DataSourceConst.C3P0_20);
		System.out.println(lcType+"=========================================");
		List<String> keyIds = kafkaService.queryLcType(lcType);
		ArrayList<HashMap<String, String>> allData = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> oneData = new HashMap<String, String>();
		System.out.println("======================");
		for (int i = 0; i < streams.size(); ++i) {
			KafkaStream stream = (KafkaStream) streams.get(i);
			ConsumerIterator it = stream.iterator();
			while (it.hasNext()) {// 有数据，就更新，写业务
				MessageAndMetadata mda = it.next();// 有数据就更新
				try {
					logger.debug("开始监听:", mda.message());
					// mda.key() => pmsln&1304657
					// Q只有多个keyid
					String keyid = KafkaDataUtil.splitString(mda.key().toString());
					// System.out.println(keyid);
					for (String s : keyIds) {
						if (s.equals(keyid)) {
							// mda.key().toString() 实时数据，并未直接传入lc类型 q i
							// u...等，在此处传
							oneData = KafkaDataUtil.allData(mda.key().toString(), mda.message().toString());
							// System.out.println(mda.key());
							allData.add(oneData);
							return allData;
						}
					}
					for (Map<String, String> map : allData) {
						for (Map.Entry<String, String> s : map.entrySet()) {
							System.out.println(map.get(s) + "=1==");
							System.out.println(s.getKey() + "=2==");
							System.out.println(s.getValue() + "=3==");
						}
					}
					logger.debug("监听结束:", mda.message());

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return allData;
	}


	// public static void main(String[] args) {
	// MyKafkaConsumer mc = new MyKafkaConsumer();
	// // mc.conByLcType("wjd", "Q");
	// // mc.con("wjd");
	// }
}
