package g6;

import com.adobe.marketing.mobile.util.DataReaderException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14328a {
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(Class<T> cls, Object obj) throws DataReaderException {
        if (obj == 0) {
            return null;
        }
        try {
            if (!Number.class.isAssignableFrom(cls) || !(obj instanceof Number)) {
                return (String.class.equals(cls) && (obj instanceof String)) ? obj : cls.cast(obj);
            }
            Number number = (Number) obj;
            if (b(cls, number)) {
                throw new DataReaderException("Value overflows type " + cls);
            }
            if (Byte.class.equals(cls)) {
                return (T) Byte.valueOf(number.byteValue());
            }
            if (Short.class.equals(cls)) {
                return (T) Short.valueOf(number.shortValue());
            }
            if (Integer.class.equals(cls)) {
                return (T) Integer.valueOf(number.intValue());
            }
            if (Long.class.equals(cls)) {
                return (T) Long.valueOf(number.longValue());
            }
            if (Double.class.equals(cls)) {
                return (T) Double.valueOf(number.doubleValue());
            }
            if (Float.class.equals(cls)) {
                return (T) Float.valueOf(number.floatValue());
            }
            return null;
        } catch (ClassCastException e10) {
            throw new DataReaderException(e10);
        }
    }

    private static boolean b(Class<?> cls, Number number) {
        if (Double.class.equals(cls)) {
            return false;
        }
        if (Float.class.equals(cls)) {
            if (!(number instanceof Double)) {
                return false;
            }
            double dDoubleValue = number.doubleValue();
            return dDoubleValue < 1.401298464324817E-45d || dDoubleValue > 3.4028234663852886E38d;
        }
        if (Long.class.equals(cls)) {
            if (!(number instanceof Double) && !(number instanceof Float)) {
                return false;
            }
            double dDoubleValue2 = number.doubleValue();
            return dDoubleValue2 < -9.223372036854776E18d || dDoubleValue2 > 9.223372036854776E18d;
        }
        if (Integer.class.equals(cls)) {
            if ((number instanceof Double) || (number instanceof Float)) {
                double dDoubleValue3 = number.doubleValue();
                return dDoubleValue3 < -2.147483648E9d || dDoubleValue3 > 2.147483647E9d;
            }
            long jLongValue = number.longValue();
            return jLongValue < -2147483648L || jLongValue > 2147483647L;
        }
        if (Short.class.equals(cls)) {
            if ((number instanceof Double) || (number instanceof Float)) {
                double dDoubleValue4 = number.doubleValue();
                return dDoubleValue4 < -32768.0d || dDoubleValue4 > 32767.0d;
            }
            long jLongValue2 = number.longValue();
            return jLongValue2 < -32768 || jLongValue2 > 32767;
        }
        if (!Byte.class.equals(cls)) {
            return false;
        }
        if ((number instanceof Double) || (number instanceof Float)) {
            double dDoubleValue5 = number.doubleValue();
            return dDoubleValue5 < -128.0d || dDoubleValue5 > 127.0d;
        }
        long jLongValue3 = number.longValue();
        return jLongValue3 < -128 || jLongValue3 > 127;
    }

    public static double c(Map<String, ?> map, String str) throws DataReaderException {
        Double d10 = (Double) k(Double.class, map, str);
        if (d10 != null) {
            return d10.doubleValue();
        }
        throw new DataReaderException("Map contains null value for key");
    }

    public static int d(Map<String, ?> map, String str) throws DataReaderException {
        Integer num = (Integer) k(Integer.class, map, str);
        if (num != null) {
            return num.intValue();
        }
        throw new DataReaderException("Map contains null value for key");
    }

    public static String e(Map<String, ?> map, String str) throws DataReaderException {
        return (String) k(String.class, map, str);
    }

    public static List<String> f(Map<String, ?> map, String str) throws DataReaderException {
        return h(String.class, map, str);
    }

    public static Map<String, String> g(Map<String, ?> map, String str) throws DataReaderException {
        return j(String.class, map, str);
    }

    public static <T> List<T> h(Class<T> cls, Map<String, ?> map, String str) throws DataReaderException {
        if (cls == null) {
            throw new DataReaderException("Class type is null");
        }
        if (map == null || str == null) {
            throw new DataReaderException("Map or key is null");
        }
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            throw new DataReaderException("Value is not a list");
        }
        List<T> list = (List) obj;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!cls.isInstance(it.next())) {
                throw new DataReaderException("List entry is not of expected type");
            }
        }
        return list;
    }

    public static <T> List<Map<String, T>> i(Class<T> cls, Map<String, ?> map, String str) throws DataReaderException {
        if (cls == null) {
            throw new DataReaderException("Class type is null");
        }
        if (map == null || str == null) {
            throw new DataReaderException("Map or key is null");
        }
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            throw new DataReaderException("Value is not a list");
        }
        List<Map<String, T>> list = (List) obj;
        for (Map<String, T> map2 : list) {
            if (!(map2 instanceof Map)) {
                throw new DataReaderException("List entry is not of expected type");
            }
            for (Map.Entry<String, T> entry : map2.entrySet()) {
                if (!(entry.getKey() instanceof String)) {
                    throw new DataReaderException("Map entry is not of expected type");
                }
                if (entry.getValue() != null && !cls.isInstance(entry.getValue())) {
                    throw new DataReaderException("Map entry is not of expected type");
                }
            }
        }
        return list;
    }

    public static <T> Map<String, T> j(Class<T> cls, Map<String, ?> map, String str) throws DataReaderException {
        if (cls == null) {
            throw new DataReaderException("Class type is null");
        }
        if (map == null || str == null) {
            throw new DataReaderException("Map or key is null");
        }
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Map)) {
            throw new DataReaderException("Value is not a map");
        }
        Map<String, T> map2 = (Map) obj;
        for (Map.Entry<String, T> entry : map2.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new DataReaderException("Map entry is not of expected type");
            }
            if (entry.getValue() != null && !cls.isInstance(entry.getValue())) {
                throw new DataReaderException("Map entry is not of expected type");
            }
        }
        return map2;
    }

    private static <T> T k(Class<T> cls, Map<String, ?> map, String str) throws DataReaderException {
        if (map == null || str == null) {
            throw new DataReaderException("Map or key is null");
        }
        return (T) a(cls, map.get(str));
    }

    public static boolean l(Map<String, ?> map, String str, boolean z10) {
        return ((Boolean) u(Boolean.class, map, str, Boolean.valueOf(z10))).booleanValue();
    }

    public static int m(Map<String, ?> map, String str, int i10) {
        return ((Integer) u(Integer.class, map, str, Integer.valueOf(i10))).intValue();
    }

    public static long n(Map<String, ?> map, String str, long j10) {
        return ((Long) u(Long.class, map, str, Long.valueOf(j10))).longValue();
    }

    public static String o(Map<String, ?> map, String str, String str2) {
        return (String) u(String.class, map, str, str2);
    }

    public static List<String> p(Map<String, ?> map, String str, List<String> list) {
        return r(String.class, map, str, list);
    }

    public static Map<String, String> q(Map<String, ?> map, String str, Map<String, String> map2) {
        return t(String.class, map, str, map2);
    }

    public static <T> List<T> r(Class<T> cls, Map<String, ?> map, String str, List<T> list) {
        List<T> listH;
        try {
            listH = h(cls, map, str);
        } catch (DataReaderException unused) {
            listH = null;
        }
        if (listH != null) {
            return listH;
        }
        return list;
    }

    public static <T> List<Map<String, T>> s(Class<T> cls, Map<String, ?> map, String str, List<Map<String, T>> list) {
        List<Map<String, T>> listI;
        try {
            listI = i(cls, map, str);
        } catch (DataReaderException unused) {
            listI = null;
        }
        if (listI != null) {
            return listI;
        }
        return list;
    }

    public static <T> Map<String, T> t(Class<T> cls, Map<String, ?> map, String str, Map<String, T> map2) {
        Map<String, T> mapJ;
        try {
            mapJ = j(cls, map, str);
        } catch (DataReaderException unused) {
            mapJ = null;
        }
        if (mapJ != null) {
            return mapJ;
        }
        return map2;
    }

    private static <T> T u(Class<T> cls, Map<String, ?> map, String str, T t10) {
        Object objK;
        try {
            objK = k(cls, map, str);
        } catch (DataReaderException unused) {
            objK = null;
        }
        if (objK != null) {
            return (T) objK;
        }
        return t10;
    }
}
