package D7;

import E7.RetryInfo;
import W7.EndPointInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x7.LocalServerData;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LD7/a;", "", "LW7/a;", "endPointInfo", "Lx7/f;", "serverData", "LE7/a;", "retryInfo", "", "serverId", "<init>", "(LW7/a;Lx7/f;LE7/a;Ljava/lang/Integer;)V", "a", "LW7/a;", "()LW7/a;", "b", "Lx7/f;", "c", "()Lx7/f;", "LE7/a;", "()LE7/a;", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo endPointInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalServerData serverData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final RetryInfo retryInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer serverId;

    public a(EndPointInfo endPointInfo, LocalServerData serverData, RetryInfo retryInfo, Integer num) {
        Intrinsics.j(endPointInfo, "endPointInfo");
        Intrinsics.j(serverData, "serverData");
        this.endPointInfo = endPointInfo;
        this.serverData = serverData;
        this.retryInfo = retryInfo;
        this.serverId = num;
    }

    /* renamed from: a, reason: from getter */
    public final EndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    /* renamed from: b, reason: from getter */
    public final RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    /* renamed from: c, reason: from getter */
    public final LocalServerData getServerData() {
        return this.serverData;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getServerId() {
        return this.serverId;
    }
}
