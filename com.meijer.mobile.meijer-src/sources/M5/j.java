package M5;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a3\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000f\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a%\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u00012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\t*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "", "", "", "masks", "", "c", "(Ljava/util/Map;[Ljava/lang/String;)J", "prefix", "", "flattenListAndArray", "a", "(Ljava/util/Map;Ljava/lang/String;Z)Ljava/util/Map;", "i", "(Ljava/util/Map;)Ljava/lang/String;", "g", "key", "value", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "elements", "delimiter", "f", "(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;", "e", "(Ljava/lang/Object;)Z", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {
    public static final /* synthetic */ Map a(Map map, String prefix, boolean z10) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(prefix, "prefix");
        if (prefix.length() > 0) {
            prefix = prefix + '.';
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = prefix + ((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof Map) {
                Map map2 = (Map) value;
                if (n.a(map2.keySet())) {
                    linkedHashMap.putAll(a(map2, str, z10));
                }
            }
            if ((value instanceof List) && z10) {
                linkedHashMap.putAll(i.a((List) value, str));
            } else if ((value instanceof Object[]) && z10) {
                linkedHashMap.putAll(i.b((Object[]) value, str));
            } else {
                linkedHashMap.put(str, value);
            }
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Map b(Map map, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(map, str, z10);
    }

    public static final /* synthetic */ long c(Map map, String[] strArr) {
        Intrinsics.j(map, "<this>");
        Unit unit = null;
        Map mapB = b(map, null, false, 3, null);
        StringBuilder sb2 = new StringBuilder();
        if (strArr != null) {
            for (Comparable comparable : ArraysKt.U0(strArr)) {
                String str = (String) comparable;
                if (str.length() > 0 && !e(mapB.get(str))) {
                    sb2.append(str);
                    sb2.append(":");
                    sb2.append(String.valueOf(mapB.get(str)));
                }
            }
            unit = Unit.f143329a;
        }
        if (unit == null) {
            for (Map.Entry entry : MapsKt.i(mapB).entrySet()) {
                if (!e(entry.getValue())) {
                    sb2.append((String) entry.getKey());
                    sb2.append(":");
                    sb2.append(String.valueOf(entry.getValue()));
                }
            }
        }
        return p.b(sb2.toString());
    }

    public static /* synthetic */ long d(Map map, String[] strArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            strArr = null;
        }
        return c(map, strArr);
    }

    private static final boolean e(Object obj) {
        if (obj != null) {
            return (obj instanceof String) && ((CharSequence) obj).length() == 0;
        }
        return true;
    }

    private static final String f(Iterable<?> iterable, String str) {
        return CollectionsKt.B0(iterable, str, null, null, 0, null, null, 62, null);
    }

    public static final String g(Map<String, ? extends Object> map) throws JSONException {
        Intrinsics.j(map, "<this>");
        try {
            String string = new JSONObject(map).toString(4);
            Intrinsics.i(string, "{\n        JSONObject(this).toString(4)\n    }");
            return string;
        } catch (Exception unused) {
            return map.toString();
        }
    }

    private static final String h(String str, String str2) {
        if (str == null || StringsKt.s0(str) || str2 == null) {
            return null;
        }
        return '&' + str + '=' + str2;
    }

    public static final /* synthetic */ String i(Map map) {
        Intrinsics.j(map, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            String strA = q.a(str);
            if (strA != null) {
                String strH = h(strA, value instanceof List ? q.a(f((Iterable) value, ",")) : q.a(value != null ? value.toString() : null));
                if (strH != null) {
                    sb2.append(strH);
                }
            }
        }
        if (sb2.length() > 0) {
            return sb2.substring(1).toString();
        }
        String string = sb2.toString();
        Intrinsics.i(string, "builder.toString()");
        return string;
    }
}
