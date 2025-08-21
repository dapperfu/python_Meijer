package L9;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0012¨\u0006\u0014"}, d2 = {"LL9/k;", "LL9/e;", "Ljava/lang/Class;", "klass", "", "callerMethodName", "", "", "parameters", "status", "<init>", "(Ljava/lang/Class;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "", "a", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "data", "()Ljava/lang/String;", "topic", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> data;

    public k(Class<?> klass, String callerMethodName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Intrinsics.j(klass, "klass");
        Intrinsics.j(callerMethodName, "callerMethodName");
        this.data = MapsKt.r(TuplesKt.a("className", klass.getSimpleName()), TuplesKt.a("methodName", callerMethodName));
        if (map != null) {
            getData().put("parameters", map);
        }
        if (map2 != null) {
            getData().put("status", map2);
        }
    }

    @Override // L9.e
    public String a() {
        return "log_status";
    }

    @Override // L9.e
    public Map<String, Object> getData() {
        return this.data;
    }

    public /* synthetic */ k(Class cls, String str, Map map, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, str, map, (i10 & 8) != 0 ? null : map2);
    }
}
