package L9;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b¨\u0006\u0014"}, d2 = {"LL9/a;", "LL9/e;", "", "eventName", "", "eventAttributes", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "", "", "b", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "data", "topic", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String eventName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> data;

    public a(String eventName, Map<String, String> map) {
        Intrinsics.j(eventName, "eventName");
        this.eventName = eventName;
        this.data = MapsKt.r(TuplesKt.a("eventName", eventName));
        if (map == null || map.isEmpty()) {
            return;
        }
        getData().put("eventAttributes", map);
    }

    @Override // L9.e
    public String a() {
        return "log_app_event";
    }

    @Override // L9.e
    public Map<String, Object> getData() {
        return this.data;
    }
}
