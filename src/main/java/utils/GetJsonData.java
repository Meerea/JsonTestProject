package utils;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class GetJsonData {

        public static JSONObject teamRCB;
        public static int countForeignPlayers=0;
        public static int countWicketKeeper=0;

    public static void readJsonData(String inputFile) {
        try {
            JSONParser jsonparser = new JSONParser();
            FileReader reader = new FileReader("./src/main/resources/testData/" + inputFile + ".json");
            Object obj = jsonparser.parse(reader);
            teamRCB = (JSONObject) obj;
        }catch(Exception e) {
            findExceptions(e);
        }
    }
    public static void getData(){
        try {
            if(teamRCB!=null) {
                JSONArray players = (JSONArray) teamRCB.get("player");
                for(int i=0;i<players.size();i++) {
                    JSONObject player=(JSONObject)players.get(i);
                    String country=(String)player.get("country");
                    if(!country.equals("India")) countForeignPlayers++;
                    String role=(String)player.get("role");
                    if(role.equals("Wicket-keeper")) countWicketKeeper++;
                }
            }else {
                System.out.println("No data available");
            }
        }catch(Exception e) {
            findExceptions(e);
        }
    }

    private static void findExceptions(Exception e) {
        System.out.println("Exception Text: "+e.getMessage());
        System.out.println("Stack Trace Logs: "+e.getStackTrace());
    }
}

