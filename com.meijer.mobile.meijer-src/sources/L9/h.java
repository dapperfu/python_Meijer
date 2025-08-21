package L9;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"LL9/h;", "LL9/e;", "", "queueSize", "<init>", "(I)V", "", "", "", "a", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "data", "()Ljava/lang/String;", "topic", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> data;

    @Override // L9.e
    public String a() {
        return "log_offline_queue_size";
    }

    @Override // L9.e
    public Map<String, Object> getData() {
        return this.data;
    }

    public h(int i10) {
        this.data = MapsKt.g(TuplesKt.a("queueSize", Integer.valueOf(i10)));
    }
}
