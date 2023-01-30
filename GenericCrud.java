import java.util.Map;

public class GenericCrud {

    public static<K, T> T consultar(K k, Map<K, T> map) {
        return map.get(k);
    };

    public static<K, T> void cadastrar(K k, T t, Map<K, T> map) {
        map.put(k, t);
    };

    public static<K, T> void atualizar(K k, T t, Map<K, T> map) {
        map.replace(k, t);
    };

    public static<K, T> void deletar(K k, Map<K, T> map) {
        map.remove(k);
    };

}