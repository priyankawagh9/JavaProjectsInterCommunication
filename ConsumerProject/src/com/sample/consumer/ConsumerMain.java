package com.sample.consumer;

import com.sample.producer.ProducerMain;

public class ConsumerMain {
	public static void main(String[] args) {
		ProducerMain producerMain = new ProducerMain();
		System.out.println(producerMain.getName());
	}

}
