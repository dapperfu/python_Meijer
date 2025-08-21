package Ts;

import at.InterfaceC6294a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\r\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0011\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LTs/a;", "Lat/a;", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "retryCount", "maxRetries", "", "minDelaySeconds", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;IIJ)V", "a", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "b", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "c", "I", "getRetryCount", "()I", "d", "setMaxRetries", "(I)V", "e", "J", "()J", "setMinDelaySeconds", "(J)V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements InterfaceC6294a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Request request;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Response response;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int retryCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int maxRetries;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long minDelaySeconds;

    public a(Request request, Response response, int i10, int i11, long j10) {
        Intrinsics.j(request, "request");
        Intrinsics.j(response, "response");
        this.request = request;
        this.response = response;
        this.retryCount = i10;
        this.maxRetries = i11;
        this.minDelaySeconds = j10;
    }

    /* renamed from: a, reason: from getter */
    public final int getMaxRetries() {
        return this.maxRetries;
    }

    /* renamed from: b, reason: from getter */
    public final long getMinDelaySeconds() {
        return this.minDelaySeconds;
    }

    public /* synthetic */ a(Request request, Response response, int i10, int i11, long j10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, response, i10, (i12 & 8) != 0 ? 3 : i11, (i12 & 16) != 0 ? 1L : j10);
    }
}
