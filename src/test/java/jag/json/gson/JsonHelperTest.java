package jag.json.gson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JsonHelperTest {

    @Test
    public void shouldSerializeDeserialize() {
        JsonHelper jsonHelper = JsonHelper.instance();
        Object testData = createTestData();
        String json = jsonHelper.toJson(testData);
        assertEquals(testData, jsonHelper.fromJson(json, Object.class));
    }

    private Map<String, Object> createTestData() {
        Map<String, Object> data = new HashMap<>();
        data.put("Integers", Arrays.asList(1.0, 2.0, 3.0, 4.0));
        data.put("Strings", Arrays.asList("Strings1", "Strings2", "Strings3"));
        return data;
    }
}