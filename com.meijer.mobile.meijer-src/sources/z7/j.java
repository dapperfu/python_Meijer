package z7;

import G7.RetryInfo;
import Y7.EndPointInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Lz7/j;", "", "<init>", "()V", "LY7/a;", "endpoint", "", "reason", "LG7/a;", "c", "(LY7/a;Ljava/lang/String;)LG7/a;", "b", "(LY7/a;)LG7/a;", "", "a", "(LY7/a;)V", "", "Ljava/util/Map;", "retryStateByEndpoint", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<EndPointInfo, RetryInfo> retryStateByEndpoint = new LinkedHashMap();

    public final void a(EndPointInfo endpoint) {
        Intrinsics.j(endpoint, "endpoint");
        this.retryStateByEndpoint.remove(endpoint);
    }

    public final RetryInfo b(EndPointInfo endpoint) {
        Intrinsics.j(endpoint, "endpoint");
        return this.retryStateByEndpoint.get(endpoint);
    }

    public final RetryInfo c(EndPointInfo endpoint, String reason) {
        Intrinsics.j(endpoint, "endpoint");
        Intrinsics.j(reason, "reason");
        RetryInfo retryInfo = this.retryStateByEndpoint.get(endpoint);
        RetryInfo retryInfo2 = new RetryInfo((retryInfo != null ? retryInfo.getCount() : 0) + 1, reason);
        this.retryStateByEndpoint.put(endpoint, retryInfo2);
        return retryInfo2;
    }
}
