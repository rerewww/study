package jackson;

import org.junit.Test;

import java.io.IOException;
import java.util.Map;

/**
 * Created by son on 2019-01-24.
 */
public class JacksonTest {
    private JacksonMapper jacksonMapper = new JacksonMapper();

    /**
     * {
     *     name: son.
     *     age: 15
     * }
     * @throws IOException
     */
    @Test
    public void jsonStringToMap() throws IOException {
        String json = "{\"name\":\"son\",\"age\":15}";
        Map<String, String> result = jacksonMapper.jsonStringToMap(json);
        System.out.println(result);
    }

    /**
     * {
     *     code: ok,
     *     message: msg,
     *     result: {
     *         value: [{
     *             name: son
     *         }]
     *     }
     * }
     * @throws IOException
     */
    @Test
    public void jsonStringToModelClass() throws IOException {
        String json = "{\"code\":\"ok\",\"message\":\"msg\",\"resultMap\":{\"value\":[{\"name\":\"son\"}]}}";
        Model model = jacksonMapper.jsonStringToModelClass(json);
        System.out.println(model);
    }

    /**
     * {
     *     code: ok,
     *     message: msg,
     *     result: [{
     *         name: son
     *     }]
     * }
     * @throws IOException
     */
    @Test
    public void jsonStringToModelClass2() throws IOException {
        String json = "{\"code\":\"ok\",\"message\":\"msg\",\"resultList\":[{\"name\":\"son\"},{\"name\":\"kwon\"}]}";
        Model model = jacksonMapper.jsonStringToModelClass(json);
        System.out.println(model);
    }
}
