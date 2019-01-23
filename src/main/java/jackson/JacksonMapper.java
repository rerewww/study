package jackson;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.Map;

/**
 * Created by son on 2019-01-24.
 */
public class JacksonMapper {
    private ObjectMapper mapper = new ObjectMapper();

    public Map<String, String> jsonStringToMap(final String str) throws IOException {
        Map<String, String> map = mapper.readValue(str, new TypeReference<Map<String, String>>(){});
        return map;
    }

    public Model jsonStringToModelClass(final String str) throws IOException {
        return mapper.readValue(str, Model.class);
    }
}
