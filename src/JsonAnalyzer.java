import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonAnalyzer {
    private final JsonObject jsonObject;

    public JsonAnalyzer(String jsonResponse) {
        this.jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
    }

    public String getResult() {
        return jsonObject.get("result").getAsString();
    }

    public String getDocumentation() {
        return jsonObject.get("documentation").getAsString();
    }

    public String getTermsOfUse() {
        return jsonObject.get("terms_of_use").getAsString();
    }

    public long getTimeLastUpdateUnix() {
        return jsonObject.get("time_last_update_unix").getAsLong();
    }

    public String getTimeLastUpdateUtc() {
        return jsonObject.get("time_last_update_utc").getAsString();
    }

    public long getTimeNextUpdateUnix() {
        return jsonObject.get("time_next_update_unix").getAsLong();
    }

    public String getTimeNextUpdateUtc() {
        return jsonObject.get("time_next_update_utc").getAsString();
    }

    public String getBaseCode() {
        return jsonObject.get("base_code").getAsString();
    }

    public JsonObject getConversionRates() {
        return jsonObject.get("conversion_rates").getAsJsonObject();
    }
}
