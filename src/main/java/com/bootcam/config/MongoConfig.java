package com.bootcam.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import com.mongodb.MongoClient;


@SuppressWarnings("deprecation")
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		return new MongoClient("mongo", 27017);
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "mongodb-cliente";
	}
	
	protected String getMapingBasePackage() {
		return "com.bootcam.entities";
	}
	
	

}
