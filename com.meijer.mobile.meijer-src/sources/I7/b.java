package I7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lorg/json/JSONObject;", "", "name", "", "a", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "", "b", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "c", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "value", "d", "(Ljava/lang/Object;)Ljava/lang/Integer;", "e", "(Ljava/lang/Object;)Ljava/lang/Long;", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {
    public static final Integer a(JSONObject jSONObject, String name) {
        Intrinsics.j(jSONObject, "<this>");
        Intrinsics.j(name, "name");
        return d(jSONObject.opt(name));
    }

    public static final Long b(JSONObject jSONObject, String name) {
        Intrinsics.j(jSONObject, "<this>");
        Intrinsics.j(name, "name");
        return e(jSONObject.opt(name));
    }

    public static final String c(JSONObject jSONObject, String name) {
        Intrinsics.j(jSONObject, "<this>");
        Intrinsics.j(name, "name");
        return f(jSONObject.opt(name));
    }

    private static final Integer d(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf((int) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final Long e(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
