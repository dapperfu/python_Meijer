package D7;

import E7.RetryInfo;
import W7.EndPointInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x7.LocalServerData;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"LD7/b;", "", "LW7/a;", "endPointInfo", "", "body", "", "isPriority", "Lx7/f;", "serverData", "LE7/a;", "retryInfo", "", "serverId", "<init>", "(LW7/a;Ljava/lang/String;ZLx7/f;LE7/a;Ljava/lang/Integer;)V", "a", "LW7/a;", "b", "()LW7/a;", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "f", "()Z", "d", "Lx7/f;", "()Lx7/f;", "e", "LE7/a;", "()LE7/a;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo endPointInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String body;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isPriority;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LocalServerData serverData;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RetryInfo retryInfo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Integer serverId;

    public b(EndPointInfo endPointInfo, String body, boolean z10, LocalServerData serverData, RetryInfo retryInfo, Integer num) {
        Intrinsics.j(endPointInfo, "endPointInfo");
        Intrinsics.j(body, "body");
        Intrinsics.j(serverData, "serverData");
        this.endPointInfo = endPointInfo;
        this.body = body;
        this.isPriority = z10;
        this.serverData = serverData;
        this.retryInfo = retryInfo;
        this.serverId = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final EndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    /* renamed from: c, reason: from getter */
    public final RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    /* renamed from: d, reason: from getter */
    public final LocalServerData getServerData() {
        return this.serverData;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getServerId() {
        return this.serverId;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsPriority() {
        return this.isPriority;
    }
}
