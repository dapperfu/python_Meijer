package H7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LH7/b;", "", "", "version", "<init>", "(Ljava/lang/String;)V", "LF7/a;", "configRequest", "Lokhttp3/Request;", "a", "(LF7/a;)Lokhttp3/Request;", "Ljava/lang/String;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String version;

    public b(String version) {
        Intrinsics.j(version, "version");
        this.version = version;
    }

    public final Request a(F7.a configRequest) {
        Intrinsics.j(configRequest, "configRequest");
        return new Request.a().f().v(d.e(d.d(d.c(d.a(HttpUrl.INSTANCE.c(configRequest.getEndPointInfo().getUrl()).k(), configRequest.getEndPointInfo(), this.version, configRequest.getServerData().getConfig().getRevision()), configRequest.getRetryInfo()), configRequest.getServerId()))).b();
    }
}
