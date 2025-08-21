package Tv;

import Mv.j;
import Nv.h;
import Nv.k;
import Sv.d;
import Sv.i;
import com.google.android.gms.common.api.a;
import gw.C14416e;
import gw.InterfaceC14417f;
import gw.InterfaceC14418g;
import gw.J;
import gw.K;
import gw.L;
import gw.p;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 .2\u00020\u0001:\u0007G,/&*9\"B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010%J\u000f\u0010/\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u0010%J\u001d\u00104\u001a\u00020\u001c2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0019\u00109\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b;\u0010<R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010BR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010JR\u0018\u0010N\u001a\u000206*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u000206*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010Q¨\u0006S"}, d2 = {"LTv/b;", "LSv/d;", "Lokhttp3/OkHttpClient;", "client", "LSv/d$a;", "carrier", "Lgw/g;", "source", "Lgw/f;", "sink", "<init>", "(Lokhttp3/OkHttpClient;LSv/d$a;Lgw/g;Lgw/f;)V", "Lgw/J;", "v", "()Lgw/J;", "y", "Lokhttp3/HttpUrl;", "url", "", "length", "Lgw/K;", "x", "(Lokhttp3/HttpUrl;J)Lgw/K;", "w", "(Lokhttp3/HttpUrl;)Lgw/K;", "z", "Lgw/p;", "timeout", "", "s", "(Lgw/p;)V", "Lokhttp3/Request;", "request", "contentLength", "d", "(Lokhttp3/Request;J)Lgw/J;", "cancel", "()V", "e", "(Lokhttp3/Request;)V", "Lokhttp3/Response;", "response", "c", "(Lokhttp3/Response;)J", "b", "(Lokhttp3/Response;)Lgw/K;", "h", "a", "Lokhttp3/Headers;", "headers", "", "requestLine", "B", "(Lokhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/Response$a;", "g", "(Z)Lokhttp3/Response$a;", "A", "(Lokhttp3/Response;)V", "Lokhttp3/OkHttpClient;", "LSv/d$a;", "i", "()LSv/d$a;", "Lgw/g;", "Lgw/f;", "", "I", "state", "LTv/a;", "f", "LTv/a;", "headersReader", "Lokhttp3/Headers;", "trailers", "u", "(Lokhttp3/Response;)Z", "isChunked", "t", "(Lokhttp3/Request;)Z", "()Z", "isResponseComplete", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class b implements d {

    /* renamed from: i, reason: collision with root package name */
    private static final Headers f36888i = Headers.INSTANCE.b("OkHttp-Response-Body", "Truncated");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d.a carrier;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14418g source;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14417f sink;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Tv.a headersReader;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Headers trailers;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u00020\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0014\u0010\u001f\"\u0004\b\u001d\u0010 ¨\u0006\""}, d2 = {"LTv/b$a;", "Lgw/K;", "Lokhttp3/HttpUrl;", "url", "<init>", "(LTv/b;Lokhttp3/HttpUrl;)V", "Lgw/L;", "timeout", "()Lgw/L;", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "Lokhttp3/Headers;", "trailers", "", "b", "(Lokhttp3/Headers;)V", "a", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "Lgw/p;", "Lgw/p;", "getTimeout", "()Lgw/p;", "", "c", "Z", "()Z", "(Z)V", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private abstract class a implements K {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpUrl url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final p timeout;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f36899d;

        public a(b bVar, HttpUrl url) {
            Intrinsics.j(url, "url");
            this.f36899d = bVar;
            this.url = url;
            this.timeout = new p(bVar.source.getTimeout());
        }

        /* renamed from: a, reason: from getter */
        protected final boolean getClosed() {
            return this.closed;
        }

        public final void b(Headers trailers) {
            OkHttpClient okHttpClient;
            j cookieJar;
            Intrinsics.j(trailers, "trailers");
            if (this.f36899d.state == 6) {
                return;
            }
            if (this.f36899d.state != 5) {
                throw new IllegalStateException("state: " + this.f36899d.state);
            }
            this.f36899d.s(this.timeout);
            this.f36899d.trailers = trailers;
            this.f36899d.state = 6;
            if (trailers.size() <= 0 || (okHttpClient = this.f36899d.client) == null || (cookieJar = okHttpClient.getCookieJar()) == null) {
                return;
            }
            Sv.e.f(cookieJar, this.url, trailers);
        }

        protected final void c(boolean z10) {
            this.closed = z10;
        }

        @Override // gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            try {
                return this.f36899d.source.read(sink, byteCount);
            } catch (IOException e10) {
                this.f36899d.getCarrier().c();
                b(b.f36888i);
                throw e10;
            }
        }

        @Override // gw.K
        /* renamed from: timeout */
        public L getTimeout() {
            return this.timeout;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTv/b$b;", "Lgw/J;", "<init>", "(LTv/b;)V", "Lgw/L;", "timeout", "()Lgw/L;", "Lgw/e;", "source", "", "byteCount", "", "E1", "(Lgw/e;J)V", "flush", "()V", "close", "Lgw/p;", "a", "Lgw/p;", "", "b", "Z", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Tv.b$b, reason: collision with other inner class name */
    private final class C0812b implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p timeout;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        @Override // gw.J, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.sink.G0("0\r\n\r\n");
            b.this.s(this.timeout);
            b.this.state = 3;
        }

        @Override // gw.J, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            b.this.sink.flush();
        }

        public C0812b() {
            this.timeout = new p(b.this.sink.getTimeout());
        }

        @Override // gw.J
        public void E1(C14416e source, long byteCount) throws IOException {
            Intrinsics.j(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (byteCount == 0) {
                return;
            }
            b.this.sink.M2(byteCount);
            b.this.sink.G0("\r\n");
            b.this.sink.E1(source, byteCount);
            b.this.sink.G0("\r\n");
        }

        @Override // gw.J
        /* renamed from: timeout */
        public L getTimeout() {
            return this.timeout;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTv/b$c;", "LTv/b$a;", "LTv/b;", "Lokhttp3/HttpUrl;", "url", "<init>", "(LTv/b;Lokhttp3/HttpUrl;)V", "", "d", "()V", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "close", "e", "J", "bytesRemainingInChunk", "", "f", "Z", "hasMoreChunks", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    private final class c extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long bytesRemainingInChunk;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean hasMoreChunks;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f36905g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, HttpUrl url) {
            super(bVar, url);
            Intrinsics.j(url, "url");
            this.f36905g = bVar;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        private final void d() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                this.f36905g.source.i1();
            }
            try {
                this.bytesRemainingInChunk = this.f36905g.source.R3();
                String string = StringsKt.C1(this.f36905g.source.i1()).toString();
                if (this.bytesRemainingInChunk >= 0 && (string.length() <= 0 || StringsKt.W(string, ";", false, 2, null))) {
                    if (this.bytesRemainingInChunk == 0) {
                        this.hasMoreChunks = false;
                        b(this.f36905g.headersReader.a());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // Tv.b.a, gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j10 = this.bytesRemainingInChunk;
            if (j10 == 0 || j10 == -1) {
                d();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long j11 = super.read(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (j11 != -1) {
                this.bytesRemainingInChunk -= j11;
                return j11;
            }
            this.f36905g.getCarrier().c();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(b.f36888i);
            throw protocolException;
        }

        @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !k.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f36905g.getCarrier().c();
                b(b.f36888i);
            }
            c(true);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LTv/b$e;", "LTv/b$a;", "LTv/b;", "Lokhttp3/HttpUrl;", "url", "", "bytesRemaining", "<init>", "(LTv/b;Lokhttp3/HttpUrl;J)V", "Lgw/e;", "sink", "byteCount", "read", "(Lgw/e;J)J", "", "close", "()V", "e", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    private final class e extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long bytesRemaining;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f36907f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, HttpUrl url, long j10) {
            super(bVar, url);
            Intrinsics.j(url, "url");
            this.f36907f = bVar;
            this.bytesRemaining = j10;
            if (j10 == 0) {
                b(Headers.f154305c);
            }
        }

        @Override // Tv.b.a, gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.bytesRemaining;
            if (j10 == 0) {
                return -1L;
            }
            long j11 = super.read(sink, Math.min(j10, byteCount));
            if (j11 == -1) {
                this.f36907f.getCarrier().c();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b(b.f36888i);
                throw protocolException;
            }
            long j12 = this.bytesRemaining - j11;
            this.bytesRemaining = j12;
            if (j12 == 0) {
                b(Headers.f154305c);
            }
            return j11;
        }

        @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !k.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f36907f.getCarrier().c();
                b(b.f36888i);
            }
            c(true);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LTv/b$f;", "Lgw/J;", "<init>", "(LTv/b;)V", "Lgw/L;", "timeout", "()Lgw/L;", "Lgw/e;", "source", "", "byteCount", "", "E1", "(Lgw/e;J)V", "flush", "()V", "close", "Lgw/p;", "a", "Lgw/p;", "", "b", "Z", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    private final class f implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p timeout;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        public f() {
            this.timeout = new p(b.this.sink.getTimeout());
        }

        @Override // gw.J
        public void E1(C14416e source, long byteCount) throws IOException {
            Intrinsics.j(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            h.e(source.getSize(), 0L, byteCount);
            b.this.sink.E1(source, byteCount);
        }

        @Override // gw.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.s(this.timeout);
            b.this.state = 3;
        }

        @Override // gw.J, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            b.this.sink.flush();
        }

        @Override // gw.J
        /* renamed from: timeout */
        public L getTimeout() {
            return this.timeout;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LTv/b$g;", "LTv/b$a;", "LTv/b;", "Lokhttp3/HttpUrl;", "url", "<init>", "(LTv/b;Lokhttp3/HttpUrl;)V", "Lgw/e;", "sink", "", "byteCount", "read", "(Lgw/e;J)J", "", "close", "()V", "", "e", "Z", "inputExhausted", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    private final class g extends a {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean inputExhausted;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f36912f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, HttpUrl url) {
            super(bVar, url);
            Intrinsics.j(url, "url");
            this.f36912f = bVar;
        }

        @Override // Tv.b.a, gw.K
        public long read(C14416e sink, long byteCount) throws IOException {
            Intrinsics.j(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long j10 = super.read(sink, byteCount);
            if (j10 != -1) {
                return j10;
            }
            this.inputExhausted = true;
            b(Headers.f154305c);
            return -1L;
        }

        @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                b(b.f36888i);
            }
            c(true);
        }
    }

    private final boolean u(Response response) {
        return StringsKt.H("chunked", Response.j(response, "Transfer-Encoding", null, 2, null), true);
    }

    public b(OkHttpClient okHttpClient, d.a carrier, InterfaceC14418g source, InterfaceC14417f sink) {
        Intrinsics.j(carrier, "carrier");
        Intrinsics.j(source, "source");
        Intrinsics.j(sink, "sink");
        this.client = okHttpClient;
        this.carrier = carrier;
        this.source = source;
        this.sink = sink;
        this.headersReader = new Tv.a(source);
    }

    private final boolean t(Request request) {
        return StringsKt.H("chunked", request.d("Transfer-Encoding"), true);
    }

    private final J v() {
        if (this.state == 1) {
            this.state = 2;
            return new C0812b();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final K w(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            return new c(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final K x(HttpUrl url, long length) {
        if (this.state == 4) {
            this.state = 5;
            return new e(this, url, length);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final J y() {
        if (this.state == 1) {
            this.state = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final K z(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            getCarrier().c();
            return new g(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public final void A(Response response) throws IOException {
        Intrinsics.j(response, "response");
        long jK = k.k(response);
        if (jK == -1) {
            return;
        }
        K kX = x(response.getRequest().getUrl(), jK);
        k.o(kX, a.e.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        kX.close();
    }

    public final void B(Headers headers, String requestLine) throws IOException {
        Intrinsics.j(headers, "headers");
        Intrinsics.j(requestLine, "requestLine");
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        this.sink.G0(requestLine).G0("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.sink.G0(headers.h(i10)).G0(": ").G0(headers.p(i10)).G0("\r\n");
        }
        this.sink.G0("\r\n");
        this.state = 1;
    }

    @Override // Sv.d
    public void a() throws IOException {
        this.sink.flush();
    }

    @Override // Sv.d
    public K b(Response response) {
        Intrinsics.j(response, "response");
        if (!Sv.e.b(response)) {
            return x(response.getRequest().getUrl(), 0L);
        }
        if (u(response)) {
            return w(response.getRequest().getUrl());
        }
        long jK = k.k(response);
        return jK != -1 ? x(response.getRequest().getUrl(), jK) : z(response.getRequest().getUrl());
    }

    @Override // Sv.d
    public long c(Response response) {
        Intrinsics.j(response, "response");
        if (!Sv.e.b(response)) {
            return 0L;
        }
        if (u(response)) {
            return -1L;
        }
        return k.k(response);
    }

    @Override // Sv.d
    public J d(Request request, long contentLength) throws ProtocolException {
        Intrinsics.j(request, "request");
        RequestBody body = request.getBody();
        if (body != null && body.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (t(request)) {
            return v();
        }
        if (contentLength != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // Sv.d
    public void e(Request request) throws IOException {
        Intrinsics.j(request, "request");
        i iVar = i.f35830a;
        Proxy.Type type = getCarrier().getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String().getProxy().type();
        Intrinsics.i(type, "type(...)");
        B(request.getHeaders(), iVar.a(request, type));
    }

    @Override // Sv.d
    public boolean f() {
        return this.state == 6;
    }

    @Override // Sv.d
    public Response.a g(boolean expectContinue) throws IOException {
        int i10 = this.state;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            Sv.k kVarA = Sv.k.INSTANCE.a(this.headersReader.b());
            Response.a aVarJ = new Response.a().o(kVarA.protocol).f(kVarA.code).l(kVarA.message).j(this.headersReader.a());
            if (expectContinue && kVarA.code == 100) {
                return null;
            }
            int i11 = kVarA.code;
            if (i11 == 100) {
                this.state = 3;
                return aVarJ;
            }
            if (102 > i11 || i11 >= 200) {
                this.state = 4;
                return aVarJ;
            }
            this.state = 3;
            return aVarJ;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + getCarrier().getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String().getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String().getUrl().v(), e10);
        }
    }

    @Override // Sv.d
    public void h() throws IOException {
        this.sink.flush();
    }

    @Override // Sv.d
    /* renamed from: i, reason: from getter */
    public d.a getCarrier() {
        return this.carrier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(p timeout) {
        L delegate = timeout.getDelegate();
        timeout.j(L.f134518e);
        delegate.a();
        delegate.b();
    }

    @Override // Sv.d
    public void cancel() {
        getCarrier().cancel();
    }
}
