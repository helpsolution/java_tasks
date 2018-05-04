import java.util.HashMap;
import java.util.Map;

public class Container {

    private Map<String, Object> container = new HashMap<String, Object>();


    public Object get(final String key) {
        return container.get(key);
    }

    public <T> T get (Class<T> type){
        return (T) container.get(type.getName());
    }

    public void add(final String key, final Object value) {
        container.put(key, value);
    }


    public void add(Object object){
        container.put(object.getClass().getName(), object);
    }

}
