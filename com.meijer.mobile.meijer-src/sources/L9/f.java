package L9;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a9\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LL9/e;", "LK9/a;", "logLevel", "", "currentThreadName", "wrapperInfo", "", "", "b", "(LL9/e;LK9/a;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "a", "(LL9/e;)Ljava/lang/String;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {
    public static final String a(e eVar) {
        Intrinsics.j(eVar, "<this>");
        return "topic='" + eVar.a() + "', data=" + eVar.getData();
    }

    public static final Map<String, Object> b(e eVar, K9.a logLevel, String currentThreadName, String str) {
        Intrinsics.j(eVar, "<this>");
        Intrinsics.j(logLevel, "logLevel");
        Intrinsics.j(currentThreadName, "currentThreadName");
        Map<String, Object> mapR = MapsKt.r(TuplesKt.a("level", logLevel.name()), TuplesKt.a("thread", currentThreadName));
        if (str != null) {
            mapR.put("wrapper", str);
        }
        mapR.putAll(eVar.getData());
        return mapR;
    }
}
