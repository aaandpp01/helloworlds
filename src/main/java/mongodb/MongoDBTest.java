package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;

import java.util.Arrays;

public class MongoDBTest {

	public static void main(String args[]) {

		try {

			// To connect to mongodb server
			MongoClient mongo = new MongoClient("localhost", 27017);

			// Now connect to your databases
			DB db = mongo.getDB("bwptest");
			System.out.println("Connect to database successfully...");

			DBCollection mycoltest = db.createCollection("mycoltest", null);
			System.out.println("Collection created successfully...");

			DBCollection mycol = db.getCollection("mycol");
			System.out.println("Collection mycol selected successfully...");

			DBCursor cursor = mycoltest.find();

			BasicDBObject query = new BasicDBObject();
			query.put("title", new BasicDBObject("$eq", "MongoDB"));

			DBCursor check = mycoltest.find(query);
			if (!check.hasNext()) {
				BasicDBObject doc = new BasicDBObject("title", "MongoDB")
						.append("description", "database").append("likes", 100)
						.append("url", "github.com").append("by", "bwp");

				mycoltest.insert(doc);
			}

			System.out.println("Document inserted successfully...");

			int i = 1;

			while (cursor.hasNext()) {
				System.out.println("Inserted Document: " + i);
				DBObject updateDocument = cursor.next();
				System.out.println(updateDocument);
				
				i++;
			}
			
			DBObject removeone = mycoltest.findOne(query);
			System.out.println("Deleting Document with ID: " + removeone.get("_id"));
			mycoltest.remove(removeone);
			System.out.println("Deleted Document");
			
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}