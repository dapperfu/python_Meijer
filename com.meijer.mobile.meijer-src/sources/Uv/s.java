package Uv;

import Sv.d;
import gw.J;
import gw.K;
import gw.L;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0016\u00103\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00104¨\u00066"}, d2 = {"LUv/s;", "LSv/d;", "Lokhttp3/OkHttpClient;", "client", "LSv/d$a;", "carrier", "LSv/g;", "chain", "LUv/n;", "http2Connection", "<init>", "(Lokhttp3/OkHttpClient;LSv/d$a;LSv/g;LUv/n;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Lgw/J;", "d", "(Lokhttp3/Request;J)Lgw/J;", "", "e", "(Lokhttp3/Request;)V", "h", "()V", "a", "", "expectContinue", "Lokhttp3/Response$a;", "g", "(Z)Lokhttp3/Response$a;", "Lokhttp3/Response;", "response", "c", "(Lokhttp3/Response;)J", "Lgw/K;", "b", "(Lokhttp3/Response;)Lgw/K;", "cancel", "LSv/d$a;", "i", "()LSv/d$a;", "LSv/g;", "LUv/n;", "LUv/u;", "LUv/u;", "stream", "LMv/r;", "LMv/r;", "protocol", "f", "Z", "canceled", "()Z", "isResponseComplete", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s implements Sv.d {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f39171h = Nv.k.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    private static final List<String> f39172i = Nv.k.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.a carrier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Sv.g chain;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n http2Connection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile u stream;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Mv.r protocol;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"LUv/s$a;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "", "LUv/c;", "a", "(Lokhttp3/Request;)Ljava/util/List;", "Lokhttp3/Headers;", "headerBlock", "LMv/r;", "protocol", "Lokhttp3/Response$a;", "b", "(Lokhttp3/Headers;LMv/r;)Lokhttp3/Response$a;", "", "CONNECTION", "Ljava/lang/String;", "HOST", "KEEP_ALIVE", "PROXY_CONNECTION", "TRANSFER_ENCODING", "TE", "ENCODING", "UPGRADE", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Uv.s$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<c> a(Request request) {
            Intrinsics.j(request, "request");
            Headers headers = request.getHeaders();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new c(c.f39059g, request.getMethod()));
            arrayList.add(new c(c.f39060h, Sv.i.f35830a.c(request.getUrl())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new c(c.f39062j, strD));
            }
            arrayList.add(new c(c.f39061i, request.getUrl().getScheme()));
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strH = headers.h(i10);
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                String lowerCase = strH.toLowerCase(US);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                if (!s.f39171h.contains(lowerCase) || (Intrinsics.e(lowerCase, "te") && Intrinsics.e(headers.p(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, headers.p(i10)));
                }
            }
            return arrayList;
        }

        public final Response.a b(Headers headerBlock, Mv.r protocol) throws IOException {
            Intrinsics.j(headerBlock, "headerBlock");
            Intrinsics.j(protocol, "protocol");
            Headers.a aVar = new Headers.a();
            int size = headerBlock.size();
            Sv.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strH = headerBlock.h(i10);
                String strP = headerBlock.p(i10);
                if (Intrinsics.e(strH, ":status")) {
                    kVarA = Sv.k.INSTANCE.a("HTTP/1.1 " + strP);
                } else if (!s.f39172i.contains(strH)) {
                    aVar.d(strH, strP);
                }
            }
            if (kVarA != null) {
                return new Response.a().o(protocol).f(kVarA.code).l(kVarA.message).j(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    @Override // Sv.d
    public void cancel() {
        this.canceled = true;
        u uVar = this.stream;
        if (uVar != null) {
            uVar.g(a.f39046k);
        }
    }

    public s(OkHttpClient client, d.a carrier, Sv.g chain, n http2Connection) {
        Intrinsics.j(client, "client");
        Intrinsics.j(carrier, "carrier");
        Intrinsics.j(chain, "chain");
        Intrinsics.j(http2Connection, "http2Connection");
        this.carrier = carrier;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List<Mv.r> listD = client.D();
        Mv.r rVar = Mv.r.f20504g;
        this.protocol = listD.contains(rVar) ? rVar : Mv.r.f20503f;
    }

    @Override // Sv.d
    public void a() throws IOException {
        u uVar = this.stream;
        Intrinsics.g(uVar);
        uVar.getSink().close();
    }

    @Override // Sv.d
    public K b(Response response) {
        Intrinsics.j(response, "response");
        u uVar = this.stream;
        Intrinsics.g(uVar);
        return uVar.getSource();
    }

    @Override // Sv.d
    public long c(Response response) {
        Intrinsics.j(response, "response");
        if (Sv.e.b(response)) {
            return Nv.k.k(response);
        }
        return 0L;
    }

    @Override // Sv.d
    public J d(Request request, long contentLength) {
        Intrinsics.j(request, "request");
        u uVar = this.stream;
        Intrinsics.g(uVar);
        return uVar.getSink();
    }

    @Override // Sv.d
    public void e(Request request) throws IOException {
        Intrinsics.j(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.J0(INSTANCE.a(request), request.getBody() != null);
        if (this.canceled) {
            u uVar = this.stream;
            Intrinsics.g(uVar);
            uVar.g(a.f39046k);
            throw new IOException("Canceled");
        }
        u uVar2 = this.stream;
        Intrinsics.g(uVar2);
        L lW = uVar2.w();
        long readTimeoutMillis = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lW.g(readTimeoutMillis, timeUnit);
        u uVar3 = this.stream;
        Intrinsics.g(uVar3);
        uVar3.D().g(this.chain.getWriteTimeoutMillis(), timeUnit);
    }

    @Override // Sv.d
    public boolean f() {
        u uVar = this.stream;
        return uVar != null && uVar.v();
    }

    @Override // Sv.d
    public Response.a g(boolean expectContinue) throws IOException {
        u uVar = this.stream;
        if (uVar == null) {
            throw new IOException("stream wasn't created");
        }
        Response.a aVarB = INSTANCE.b(uVar.B(expectContinue), this.protocol);
        if (expectContinue && aVarB.getCode() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // Sv.d
    public void h() throws IOException {
        this.http2Connection.flush();
    }

    @Override // Sv.d
    /* renamed from: i, reason: from getter */
    public d.a getCarrier() {
        return this.carrier;
    }
}
