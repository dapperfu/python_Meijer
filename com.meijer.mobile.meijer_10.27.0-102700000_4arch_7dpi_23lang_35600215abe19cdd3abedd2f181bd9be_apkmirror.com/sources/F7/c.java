package F7;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.j;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LF7/c;", "", "", "version", "Lkotlin/Function0;", "", "timestampProvider", "", "useCompression", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V", "LD7/b;", "dataRequest", "Lokhttp3/Request;", "a", "(LD7/b;)Lokhttp3/Request;", "Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function0;", "c", "Z", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<Long> timestampProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean useCompression;

    public c(String version, Function0<Long> timestampProvider, boolean z10) {
        Intrinsics.j(version, "version");
        Intrinsics.j(timestampProvider, "timestampProvider");
        this.version = version;
        this.timestampProvider = timestampProvider;
        this.useCompression = z10;
    }

    public final Request a(D7.b dataRequest) {
        byte[] bArrE;
        j jVarA;
        a aVar;
        Intrinsics.j(dataRequest, "dataRequest");
        if (this.useCompression) {
            bArrE = C7.a.a(dataRequest.getBody());
            jVarA = j.INSTANCE.a("application/octet-stream");
            aVar = a.f10299c;
        } else {
            bArrE = StringsKt.E(dataRequest.getBody());
            jVarA = j.INSTANCE.a("application/json;charset=UTF-8");
            aVar = a.f10298b;
        }
        byte[] bArr = bArrE;
        j jVar = jVarA;
        Headers.a aVarA = new Headers.a().a("accept-encoding", "gzip");
        return new Request.a().p(RequestBody.Companion.s(RequestBody.INSTANCE, bArr, jVar, 0, 0, 6, null)).n(aVarA.f()).v(d.e(d.d(d.c(d.b(d.a(HttpUrl.INSTANCE.c(dataRequest.getEndPointInfo().getUrl()).k(), dataRequest.getEndPointInfo(), this.version, dataRequest.getServerData().getConfig().getRevision()), bArr, aVar, dataRequest.getIsPriority() ? "high" : null, this.timestampProvider), dataRequest.getRetryInfo()), dataRequest.getServerId()))).b();
    }
}
