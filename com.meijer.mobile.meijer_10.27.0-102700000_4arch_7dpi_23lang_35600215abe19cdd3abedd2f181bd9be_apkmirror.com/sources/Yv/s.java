package Yv;

import Wv.d;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kw.I;
import kw.J;
import kw.K;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0016\u00103\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00104¨\u00066"}, d2 = {"LYv/s;", "LWv/d;", "Lokhttp3/OkHttpClient;", "client", "LWv/d$a;", "carrier", "LWv/g;", "chain", "LYv/n;", "http2Connection", "<init>", "(Lokhttp3/OkHttpClient;LWv/d$a;LWv/g;LYv/n;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Lkw/I;", "d", "(Lokhttp3/Request;J)Lkw/I;", "", "e", "(Lokhttp3/Request;)V", "h", "()V", "a", "", "expectContinue", "Lokhttp3/Response$a;", "g", "(Z)Lokhttp3/Response$a;", "Lokhttp3/Response;", "response", "c", "(Lokhttp3/Response;)J", "Lkw/J;", "b", "(Lokhttp3/Response;)Lkw/J;", "cancel", "LWv/d$a;", "i", "()LWv/d$a;", "LWv/g;", "LYv/n;", "LYv/u;", "LYv/u;", "stream", "LQv/r;", "LQv/r;", "protocol", "f", "Z", "canceled", "()Z", "isResponseComplete", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements Wv.d {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f41946h = Rv.k.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    private static final List<String> f41947i = Rv.k.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d.a carrier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Wv.g chain;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n http2Connection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile u stream;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Qv.r protocol;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile boolean canceled;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"LYv/s$a;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "", "LYv/c;", "a", "(Lokhttp3/Request;)Ljava/util/List;", "Lokhttp3/Headers;", "headerBlock", "LQv/r;", "protocol", "Lokhttp3/Response$a;", "b", "(Lokhttp3/Headers;LQv/r;)Lokhttp3/Response$a;", "", "CONNECTION", "Ljava/lang/String;", "HOST", "KEEP_ALIVE", "PROXY_CONNECTION", "TRANSFER_ENCODING", "TE", "ENCODING", "UPGRADE", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Yv.s$a, reason: from kotlin metadata */
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
            arrayList.add(new c(c.f41834g, request.getMethod()));
            arrayList.add(new c(c.f41835h, Wv.i.f39045a.c(request.getUrl())));
            String strD = request.d("Host");
            if (strD != null) {
                arrayList.add(new c(c.f41837j, strD));
            }
            arrayList.add(new c(c.f41836i, request.getUrl().getScheme()));
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strH = headers.h(i10);
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                String lowerCase = strH.toLowerCase(US);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                if (!s.f41946h.contains(lowerCase) || (Intrinsics.e(lowerCase, "te") && Intrinsics.e(headers.p(i10), "trailers"))) {
                    arrayList.add(new c(lowerCase, headers.p(i10)));
                }
            }
            return arrayList;
        }

        public final Response.a b(Headers headerBlock, Qv.r protocol) throws IOException {
            Intrinsics.j(headerBlock, "headerBlock");
            Intrinsics.j(protocol, "protocol");
            Headers.a aVar = new Headers.a();
            int size = headerBlock.size();
            Wv.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strH = headerBlock.h(i10);
                String strP = headerBlock.p(i10);
                if (Intrinsics.e(strH, ":status")) {
                    kVarA = Wv.k.INSTANCE.a("HTTP/1.1 " + strP);
                } else if (!s.f41947i.contains(strH)) {
                    aVar.d(strH, strP);
                }
            }
            if (kVarA != null) {
                return new Response.a().o(protocol).f(kVarA.code).l(kVarA.message).j(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    @Override // Wv.d
    public void cancel() {
        this.canceled = true;
        u uVar = this.stream;
        if (uVar != null) {
            uVar.g(a.f41821k);
        }
    }

    public s(OkHttpClient client, d.a carrier, Wv.g chain, n http2Connection) {
        Intrinsics.j(client, "client");
        Intrinsics.j(carrier, "carrier");
        Intrinsics.j(chain, "chain");
        Intrinsics.j(http2Connection, "http2Connection");
        this.carrier = carrier;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List<Qv.r> listD = client.D();
        Qv.r rVar = Qv.r.f31482g;
        this.protocol = listD.contains(rVar) ? rVar : Qv.r.f31481f;
    }

    @Override // Wv.d
    public void a() throws IOException {
        u uVar = this.stream;
        Intrinsics.g(uVar);
        uVar.getSink().close();
    }

    @Override // Wv.d
    public J b(Response response) {
        Intrinsics.j(response, "response");
        u uVar = this.stream;
        Intrinsics.g(uVar);
        return uVar.getSource();
    }

    @Override // Wv.d
    public long c(Response response) {
        Intrinsics.j(response, "response");
        if (Wv.e.b(response)) {
            return Rv.k.k(response);
        }
        return 0L;
    }

    @Override // Wv.d
    public I d(Request request, long contentLength) {
        Intrinsics.j(request, "request");
        u uVar = this.stream;
        Intrinsics.g(uVar);
        return uVar.getSink();
    }

    @Override // Wv.d
    public void e(Request request) throws IOException {
        Intrinsics.j(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.L0(INSTANCE.a(request), request.getBody() != null);
        if (this.canceled) {
            u uVar = this.stream;
            Intrinsics.g(uVar);
            uVar.g(a.f41821k);
            throw new IOException("Canceled");
        }
        u uVar2 = this.stream;
        Intrinsics.g(uVar2);
        K kW = uVar2.w();
        long readTimeoutMillis = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kW.g(readTimeoutMillis, timeUnit);
        u uVar3 = this.stream;
        Intrinsics.g(uVar3);
        uVar3.D().g(this.chain.getWriteTimeoutMillis(), timeUnit);
    }

    @Override // Wv.d
    public boolean f() {
        u uVar = this.stream;
        return uVar != null && uVar.v();
    }

    @Override // Wv.d
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

    @Override // Wv.d
    public void h() throws IOException {
        this.http2Connection.flush();
    }

    @Override // Wv.d
    /* renamed from: i, reason: from getter */
    public d.a getCarrier() {
        return this.carrier;
    }
}
