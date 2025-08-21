package I9;

import com.google.maps.android.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/json/JSONObject;", "", "key", "d", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "b", "(Ljava/lang/String;)Ljava/lang/String;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        if (Intrinsics.e(str, BuildConfig.TRAVIS)) {
            return null;
        }
        return str;
    }

    public static final Long c(JSONObject jSONObject, String key) {
        Intrinsics.j(jSONObject, "<this>");
        Intrinsics.j(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return Long.valueOf(jSONObject.getLong(key));
    }

    public static final String d(JSONObject jSONObject, String key) {
        Intrinsics.j(jSONObject, "<this>");
        Intrinsics.j(key, "key");
        if (jSONObject.isNull(key)) {
            return null;
        }
        return jSONObject.getString(key);
    }
}
