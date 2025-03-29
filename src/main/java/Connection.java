import com.mongodb.client.*;
import org.bson.Document;

import java.util.Arrays;
import java.util.Iterator;

public class Connection {
    public static void main(String[] args) {
       MongoClient client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase db = client.getDatabase("23704871");
        MongoCollection<Document> MongoCollection = db.getCollection("scores");

        ScoreDAO scoreDAO = new ScoreDAO(MongoCollection);

        Score score1 = new Score("SCR040", "SV001","SUB001", Arrays.asList(9.0,6.5,7.5), 9.5, 9.0);
        scoreDAO.addScore(score1);
        System.out.println("Đã thêm điểm số mới!");

        Score updatedScore =new Score("SCR040", "SV001","SUB001", Arrays.asList(10.0,10.0,10.0), 9.5, 9.0);
        scoreDAO.updateScore("SCR040", updatedScore);
        System.out.println("Đã cập nhật điểm số!");

        scoreDAO.deleteEnroll("SCR040");

       client.close();
    }

}