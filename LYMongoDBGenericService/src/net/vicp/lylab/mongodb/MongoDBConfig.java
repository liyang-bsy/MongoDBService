package net.vicp.lylab.mongodb;

import java.util.Arrays;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;

public class MongoDBConfig {
	// MongoDB主机名称或IP
	private static String server;
	// MongoDB端口
	private static int port;
	// 数据库名称
	private static String database;
	// 数据库访问所需的用户名
	private static String user;
	// 对应的密码
	private static String password;
	// MongoDB本体
	private static MongoClient mongoClient;
	
	private static boolean init()
	{
		if(mongoClient != null) return false;
		try {
			MongoCredential credential = MongoCredential.createCredential(
					MongoDBConfig.getUser(),
					MongoDBConfig.getDatabase(),
					MongoDBConfig.getPassword().toCharArray());
			MongoDBConfig.mongoClient = new MongoClient(
					new ServerAddress(MongoDBConfig.getServer() + ":" + MongoDBConfig.getPort()),
					Arrays.asList(credential));
			MongoDBConfig.mongoClient.setWriteConcern(WriteConcern.NORMAL);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static MongoClient getMongo() {
		if(MongoDBConfig.mongoClient == null) MongoDBConfig.init();
		return MongoDBConfig.mongoClient;
	}

	public static String getServer() {
		return server;
	}

	public static void setServer(String server) {
		MongoDBConfig.server = server;
	}

	public static int getPort() {
		return port;
	}

	public static void setPort(int port) {
		MongoDBConfig.port = port;
	}

	public static String getDatabase() {
		return database;
	}

	public static void setDatabase(String database) {
		MongoDBConfig.database = database;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		MongoDBConfig.user = user;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		MongoDBConfig.password = password;
	}

	public static MongoClient getMongoClient() {
		return mongoClient;
	}

	public static void setMongoClient(MongoClient mongoClient) {
		MongoDBConfig.mongoClient = mongoClient;
	}
}
