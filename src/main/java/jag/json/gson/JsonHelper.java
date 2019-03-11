package jag.json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JsonHelper {
    private final Gson gson;

    public static JsonHelper instance() {
        return new JsonHelper(new GsonBuilder().create());
    }

    public String toJson(Object o) {
        return gson.toJson(o);
    }

    public <Type> Type fromJson(String json, Class<Type> klazz) {
        return gson.fromJson(json, klazz);
    }
}
