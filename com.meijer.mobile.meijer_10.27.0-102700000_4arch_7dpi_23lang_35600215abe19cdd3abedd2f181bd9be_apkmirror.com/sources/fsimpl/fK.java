package fsimpl;

import com.fullstory.util.Log;
import com.google.maps.android.BuildConfig;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

/* loaded from: classes14.dex */
public class fK {
    public static String a(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, obj, null, false);
        return sb2.toString();
    }

    public static String a(Object obj, String str) {
        return String.format("%s/%s", str, b(obj));
    }

    private static String a(String str) {
        return str == null ? "    " : str + "    ";
    }

    private static void a(StringBuilder sb2, Object obj, String str) {
        sb2.append(obj.getClass().getComponentType().getName()).append("[]{ ");
        int length = Array.getLength(obj);
        String strA = a(str);
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            a(sb2, Array.get(obj, i10), strA, true);
        }
        sb2.append(" }");
    }

    private static void a(StringBuilder sb2, Object obj, String str, boolean z10) {
        if (str != null && !z10) {
            sb2.append(str);
        } else if (str == null) {
            str = "";
        }
        if (obj == null) {
            sb2.append(BuildConfig.TRAVIS);
            return;
        }
        if (obj instanceof CharSequence) {
            sb2.append('\"').append(obj).append('\"');
            return;
        }
        if (obj instanceof Map) {
            a(sb2, (Map) obj, str);
            return;
        }
        if (obj.getClass().isArray()) {
            a(sb2, obj, str);
            return;
        }
        if (obj instanceof Collection) {
            a(sb2, (Collection) obj, str);
        } else if (obj.getClass().getName().startsWith("java.lang.")) {
            sb2.append(obj);
        } else {
            sb2.append(b(obj)).append('(').append(obj).append(')');
        }
    }

    private static void a(StringBuilder sb2, Collection collection, String str) {
        sb2.append(b(collection)).append("[ ");
        String strA = a(str);
        boolean z10 = true;
        for (Object obj : collection) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            a(sb2, obj, strA, true);
        }
        sb2.append(" ]");
    }

    private static void a(StringBuilder sb2, Map map, String str) {
        sb2.append("{\n");
        String strA = a(str);
        for (Map.Entry entry : map.entrySet()) {
            sb2.append(strA).append(b(entry.getKey())).append(": ");
            a(sb2, entry.getValue(), strA, true);
            sb2.append('\n');
        }
        sb2.append(str).append("}");
    }

    public static void a(Supplier supplier) {
        if (Log.API_TRACE) {
            android.util.Log.i(Log.TAG, "API Trace: " + ((String) supplier.get()));
        }
    }

    public static String b(Object obj) {
        return obj == null ? BuildConfig.TRAVIS : ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Character) || (obj instanceof CharSequence)) ? obj.toString() : String.format("%s@%s", obj.getClass().getName(), Integer.valueOf(System.identityHashCode(obj)));
    }

    public static void b(Supplier supplier) {
        if (Log.DISABLE_LOGGING) {
            return;
        }
        a(supplier);
    }

    public static String c(Object obj) {
        return obj == null ? BuildConfig.TRAVIS : String.format("\"%s\"", obj);
    }

    public static String d(Object obj) {
        return obj == null ? BuildConfig.TRAVIS : obj.toString();
    }
}
