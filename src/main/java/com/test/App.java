package com.test;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class App {

    public static void main(String[] args) {

        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27000");

        MongoDatabase database = mongoClient.getDatabase("devops");

        MongoCollection<Document> collection =
                database.getCollection("messages");

        Document document = new Document("message", "Boo yah!");

        collection.insertOne(document);

        System.out.println("Document inserted into MongoDB!");

        mongoClient.close();
    }
}