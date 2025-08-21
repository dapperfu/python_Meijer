package Sv;

import Rv.o;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0003\u0010\u001fJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b.\u0010 R\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b/\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b0\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u0018R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010(¨\u00063"}, d2 = {"LSv/g;", "Lokhttp3/Interceptor$Chain;", "LRv/o;", "call", "", "Lokhttp3/Interceptor;", "interceptors", "", "index", "LRv/i;", "exchange", "Lokhttp3/Request;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(LRv/o;Ljava/util/List;ILRv/i;Lokhttp3/Request;III)V", "c", "(ILRv/i;Lokhttp3/Request;III)LSv/g;", "LMv/f;", "a", "()LMv/f;", "k", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "b", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "Lokhttp3/d;", "()Lokhttp3/d;", "()Lokhttp3/Request;", "Lokhttp3/Response;", "proceed", "(Lokhttp3/Request;)Lokhttp3/Response;", "LRv/o;", "e", "()LRv/o;", "Ljava/util/List;", "I", "d", "LRv/i;", "g", "()LRv/i;", "Lokhttp3/Request;", "i", "f", "h", "j", "calls", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class g implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Interceptor> interceptors;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Rv.i exchange;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Request request;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int calls;

    /* JADX WARN: Multi-variable type inference failed */
    public g(o call, List<? extends Interceptor> interceptors, int i10, Rv.i iVar, Request request, int i11, int i12, int i13) {
        Intrinsics.j(call, "call");
        Intrinsics.j(interceptors, "interceptors");
        Intrinsics.j(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i10;
        this.exchange = iVar;
        this.request = request;
        this.connectTimeoutMillis = i11;
        this.readTimeoutMillis = i12;
        this.writeTimeoutMillis = i13;
    }

    public static /* synthetic */ g d(g gVar, int i10, Rv.i iVar, Request request, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.index;
        }
        if ((i14 & 2) != 0) {
            iVar = gVar.exchange;
        }
        if ((i14 & 4) != 0) {
            request = gVar.request;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.connectTimeoutMillis;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.readTimeoutMillis;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.writeTimeoutMillis;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.c(i10, iVar, request, i11, i15, i16);
    }

    @Override // okhttp3.Interceptor.Chain
    public Mv.f a() {
        Rv.i iVar = this.exchange;
        if (iVar != null) {
            return iVar.j();
        }
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain b(int timeout, TimeUnit unit) {
        Intrinsics.j(unit, "unit");
        if (this.exchange == null) {
            return d(this, 0, null, null, 0, Nv.k.g("readTimeout", timeout, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public final g c(int index, Rv.i exchange, Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        Intrinsics.j(request, "request");
        return new g(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.d call() {
        return this.call;
    }

    /* renamed from: e, reason: from getter */
    public final o getCall() {
        return this.call;
    }

    /* renamed from: f, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: g, reason: from getter */
    public final Rv.i getExchange() {
        return this.exchange;
    }

    /* renamed from: h, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: i, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* renamed from: j, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public int k() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
        Intrinsics.j(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.calls++;
        Rv.i iVar = this.exchange;
        if (iVar != null) {
            if (!iVar.getFinder().getRoutePlanner().f(request.getUrl())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarD = d(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response responseIntercept = interceptor.intercept(gVarD);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.exchange == null || this.index + 1 >= this.interceptors.size() || gVarD.calls == 1) {
            return responseIntercept;
        }
        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return this.request;
    }
}
