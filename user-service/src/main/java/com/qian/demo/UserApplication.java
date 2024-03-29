package com.qian.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author qxz
 */
@MapperScan("com.qian.demo.mapper")
@SpringBootApplication
public class UserApplication {

    public static final Logger logger = LoggerFactory.getLogger(UserApplication.class);
    public static void main(String[] args) {
        // MQ发消息
        ApplicationContext context = SpringApplication.run(UserApplication.class, args);
//        DefaultMQProducer producer = context.getBean(DefaultMQProducer.class);
//        try {
//            String mqBody = "mqBody";
//            String topic = "alibaba";
//            String tag = "aliyun";
//            for (int i = 0; i < 10; i++) {
//                Message message = new Message(topic,tag + i, mqBody.getBytes());
//                SendResult sendResult = producer.send(message);
//                Thread.sleep(100);
//                logger.info("发送消息：body:{},topic:{},tags:{}",mqBody,topic,tag+i);
//            }
//        } catch (MQClientException | RemotingException | MQBrokerException | InterruptedException e) {
//            e.printStackTrace();
//        }

//        producer.shutdown();
//        logger.info("Producer shutdown!");
    }

}