package Tv;

import Qv.r;
import Rv.k;
import Tv.d;
import Vv.o;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kw.C15328e;
import kw.InterfaceC15329f;
import kw.InterfaceC15330g;
import kw.J;
import kw.K;
import kw.w;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LTv/a;", "Lokhttp3/Interceptor;", "Lokhttp3/b;", "cache", "<init>", "(Lokhttp3/b;)V", "LTv/c;", "cacheRequest", "Lokhttp3/Response;", "response", "a", "(LTv/c;Lokhttp3/Response;)Lokhttp3/Response;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/b;", "getCache$okhttp", "()Lokhttp3/b;", "b", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements Interceptor {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.b cache;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"LTv/a$a;", "", "<init>", "()V", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "b", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "", "fieldName", "", "d", "(Ljava/lang/String;)Z", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Tv.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers b(Headers cachedHeaders, Headers networkHeaders) {
            Headers.a aVar = new Headers.a();
            int size = cachedHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strH = cachedHeaders.h(i10);
                String strP = cachedHeaders.p(i10);
                if ((!StringsKt.H("Warning", strH, true) || !StringsKt.W(strP, "1", false, 2, null)) && (c(strH) || !d(strH) || networkHeaders.get(strH) == null)) {
                    aVar.d(strH, strP);
                }
            }
            int size2 = networkHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strH2 = networkHeaders.h(i11);
                if (!c(strH2) && d(strH2)) {
                    aVar.d(strH2, networkHeaders.p(i11));
                }
            }
            return aVar.f();
        }

        private final boolean c(String fieldName) {
            return StringsKt.H("Content-Length", fieldName, true) || StringsKt.H("Content-Encoding", fieldName, true) || StringsKt.H("Content-Type", fieldName, true);
        }

        private final boolean d(String fieldName) {
            return (StringsKt.H("Connection", fieldName, true) || StringsKt.H("Keep-Alive", fieldName, true) || StringsKt.H("Proxy-Authenticate", fieldName, true) || StringsKt.H("Proxy-Authorization", fieldName, true) || StringsKt.H("TE", fieldName, true) || StringsKt.H("Trailers", fieldName, true) || StringsKt.H("Transfer-Encoding", fieldName, true) || StringsKt.H("Upgrade", fieldName, true)) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Tv/a$b", "Lkw/J;", "Lkw/e;", "sink", "", "byteCount", "read", "(Lkw/e;J)J", "Lkw/K;", "timeout", "()Lkw/K;", "", "close", "()V", "", "a", "Z", "cacheRequestClosed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean cacheRequestClosed;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC15330g f35498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f35499c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC15329f f35500d;

        b(InterfaceC15330g interfaceC15330g, c cVar, InterfaceC15329f interfaceC15329f) {
            this.f35498b = interfaceC15330g;
            this.f35499c = cVar;
            this.f35500d = interfaceC15329f;
        }

        @Override // kw.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.cacheRequestClosed && !k.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                this.f35499c.abort();
            }
            this.f35498b.close();
        }

        @Override // kw.J
        public long read(C15328e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            try {
                long j10 = this.f35498b.read(sink, byteCount);
                if (j10 != -1) {
                    sink.g(this.f35500d.getBufferField(), sink.getSize() - j10, j10);
                    this.f35500d.s0();
                    return j10;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f35500d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.cacheRequestClosed) {
                    throw e10;
                }
                this.cacheRequestClosed = true;
                this.f35499c.abort();
                throw e10;
            }
        }

        @Override // kw.J
        /* renamed from: timeout */
        public K getTimeout() {
            return this.f35498b.getTimeout();
        }
    }

    private final Response a(c cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        b bVar = new b(response.getBody().getSource(), cacheRequest, w.c(cacheRequest.getBody()));
        return response.p().b(new Wv.h(Response.j(response, "Content-Type", null, 2, null), response.getBody().getContentLength(), w.d(bVar))).c();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        okhttp3.g eventListener;
        Intrinsics.j(chain, "chain");
        okhttp3.d dVarCall = chain.call();
        okhttp3.b bVar = this.cache;
        Response responseB = bVar != null ? bVar.b(Tv.b.b(chain.request())) : null;
        d dVarB = new d.b(System.currentTimeMillis(), chain.request(), responseB).b();
        Request networkRequest = dVarB.getNetworkRequest();
        Response cacheResponse = dVarB.getCacheResponse();
        okhttp3.b bVar2 = this.cache;
        if (bVar2 != null) {
            bVar2.u(dVarB);
        }
        o oVar = dVarCall instanceof o ? (o) dVarCall : null;
        if (oVar == null || (eventListener = oVar.getEventListener()) == null) {
            eventListener = okhttp3.g.f154358b;
        }
        if (responseB != null && cacheResponse == null) {
            Rv.h.f(responseB.getBody());
        }
        if (networkRequest == null && cacheResponse == null) {
            Response responseC = new Response.a().q(chain.request()).o(r.f31479d).f(HttpResponseStatus.ERROR_GATEWAY_TIMEOUT).l("Unsatisfiable Request (only-if-cached)").r(-1L).p(System.currentTimeMillis()).c();
            eventListener.C(dVarCall, responseC);
            return responseC;
        }
        if (networkRequest == null) {
            Intrinsics.g(cacheResponse);
            Response responseC2 = cacheResponse.p().d(Rv.c.a(cacheResponse)).c();
            eventListener.b(dVarCall, responseC2);
            return responseC2;
        }
        if (cacheResponse != null) {
            eventListener.a(dVarCall, cacheResponse);
        } else if (this.cache != null) {
            eventListener.c(dVarCall);
        }
        try {
            Response responseProceed = chain.proceed(networkRequest);
            if (responseProceed == null && responseB != null) {
            }
            if (cacheResponse != null) {
                if (responseProceed != null && responseProceed.getCode() == 304) {
                    Response responseC3 = cacheResponse.p().j(INSTANCE.b(cacheResponse.getHeaders(), responseProceed.getHeaders())).r(responseProceed.getSentRequestAtMillis()).p(responseProceed.getReceivedResponseAtMillis()).d(Rv.c.a(cacheResponse)).m(Rv.c.a(responseProceed)).c();
                    responseProceed.getBody().close();
                    okhttp3.b bVar3 = this.cache;
                    Intrinsics.g(bVar3);
                    bVar3.p();
                    this.cache.w(cacheResponse, responseC3);
                    eventListener.b(dVarCall, responseC3);
                    return responseC3;
                }
                Rv.h.f(cacheResponse.getBody());
            }
            Intrinsics.g(responseProceed);
            Response responseC4 = responseProceed.p().d(cacheResponse != null ? Rv.c.a(cacheResponse) : null).m(Rv.c.a(responseProceed)).c();
            if (this.cache != null) {
                Request requestB = Tv.b.b(networkRequest);
                if (Wv.e.b(responseC4) && d.INSTANCE.a(responseC4, requestB)) {
                    Response responseA = a(this.cache.i(responseC4.p().q(requestB).c()), responseC4);
                    if (cacheResponse != null) {
                        eventListener.c(dVarCall);
                    }
                    return responseA;
                }
                if (Wv.f.a(networkRequest.getMethod())) {
                    try {
                        this.cache.j(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseC4;
        } finally {
            if (responseB != null) {
                Rv.h.f(responseB.getBody());
            }
        }
    }

    public a(okhttp3.b bVar) {
        this.cache = bVar;
    }
}
