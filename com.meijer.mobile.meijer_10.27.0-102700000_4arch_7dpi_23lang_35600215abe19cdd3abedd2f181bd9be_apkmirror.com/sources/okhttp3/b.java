package okhttp3;

import Qv.r;
import Tv.f;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kw.AbstractC15335l;
import kw.AbstractC15337n;
import kw.B;
import kw.C15328e;
import kw.C15331h;
import kw.I;
import kw.InterfaceC15329f;
import kw.InterfaceC15330g;
import kw.J;
import kw.o;
import kw.w;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.internal.platform.c;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00046:\u0014\u0019B)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0018\u00010\u0010R\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0013H\u0000¢\u0006\u0004\b,\u0010&J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020-¢\u0006\u0004\b0\u0010/R\u001a\u00104\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103R\"\u00109\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00105\u001a\u0004\b6\u0010/\"\u0004\b7\u00108R\"\u0010<\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b:\u0010/\"\u0004\b;\u00108R\u0016\u0010=\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u0010?\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105R\u0016\u0010A\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00105¨\u0006B"}, d2 = {"Lokhttp3/b;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lkw/B;", "directory", "", "maxSize", "Lkw/l;", "fileSystem", "LUv/d;", "taskRunner", "<init>", "(Lkw/B;JLkw/l;LUv/d;)V", "(Lkw/l;Lkw/B;J)V", "Ljava/io/File;", "(Ljava/io/File;J)V", "LTv/f$b;", "LTv/f;", "editor", "", "a", "(LTv/f$b;)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "b", "(Lokhttp3/Request;)Lokhttp3/Response;", "response", "LTv/c;", "i", "(Lokhttp3/Response;)LTv/c;", "j", "(Lokhttp3/Request;)V", "cached", "network", "w", "(Lokhttp3/Response;Lokhttp3/Response;)V", "flush", "()V", "close", "LTv/d;", "cacheStrategy", "u", "(LTv/d;)V", "p", "", "h", "()I", "g", "LTv/f;", "getCache$okhttp", "()LTv/f;", "cache", "I", "d", "m", "(I)V", "writeSuccessCount", "c", "l", "writeAbortCount", "networkCount", "e", "hitCount", "f", "requestCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements Closeable, Flushable {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tv.f cache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int writeSuccessCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int writeAbortCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int networkCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokhttp3/b$a;", "Lokhttp3/ResponseBody;", "LTv/f$d;", "LTv/f;", "snapshot", "", "contentType", "contentLength", "<init>", "(LTv/f$d;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/j;", "()Lokhttp3/j;", "", "()J", "Lkw/g;", "source", "()Lkw/g;", "a", "LTv/f$d;", "()LTv/f$d;", "b", "Ljava/lang/String;", "c", "d", "Lkw/g;", "bodySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a extends ResponseBody {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f.d snapshot;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String contentType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String contentLength;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15330g bodySource;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/b$a$a", "Lkw/o;", "", "close", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        public static final class C2394a extends o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f154174a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2394a(J j10, a aVar) {
                super(j10);
                this.f154174a = aVar;
            }

            @Override // kw.o, kw.J, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f154174a.getSnapshot().close();
                super.close();
            }
        }

        public a(f.d snapshot, String str, String str2) {
            Intrinsics.j(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = w.d(new C2394a(snapshot.b(1), this));
        }

        /* renamed from: a, reason: from getter */
        public final f.d getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getF154150b() {
            String str = this.contentLength;
            if (str != null) {
                return Rv.h.C(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public j getF154149a() {
            String str = this.contentType;
            if (str != null) {
                return j.INSTANCE.b(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source, reason: from getter */
        public InterfaceC15330g getBodySource() {
            return this.bodySource;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u001b*\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u00020\u0004*\u00020\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lokhttp3/b$b;", "", "<init>", "()V", "Lokhttp3/Headers;", "", "", "d", "(Lokhttp3/Headers;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "e", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "Lokhttp3/HttpUrl;", "url", "b", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Lkw/g;", "source", "", "c", "(Lkw/g;)I", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "g", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "a", "(Lokhttp3/Response;)Z", "f", "(Lokhttp3/Response;)Lokhttp3/Headers;", "VERSION", "I", "ENTRY_METADATA", "ENTRY_BODY", "ENTRY_COUNT", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: okhttp3.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean a(Response response) {
            Intrinsics.j(response, "<this>");
            return d(response.getHeaders()).contains("*");
        }

        @JvmStatic
        public final String b(HttpUrl url) {
            Intrinsics.j(url, "url");
            return C15331h.INSTANCE.d(url.getUrl()).N().E();
        }

        public final int c(InterfaceC15330g source) throws IOException {
            Intrinsics.j(source, "source");
            try {
                long jR2 = source.r2();
                String strH1 = source.h1();
                if (jR2 >= 0 && jR2 <= 2147483647L && strH1.length() <= 0) {
                    return (int) jR2;
                }
                throw new IOException("expected an int but was \"" + jR2 + strH1 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final Headers f(Response response) {
            Intrinsics.j(response, "<this>");
            Response networkResponse = response.getNetworkResponse();
            Intrinsics.g(networkResponse);
            return e(networkResponse.getRequest().getHeaders(), response.getHeaders());
        }

        public final boolean g(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            Intrinsics.j(cachedResponse, "cachedResponse");
            Intrinsics.j(cachedRequest, "cachedRequest");
            Intrinsics.j(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.getHeaders());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!Intrinsics.e(cachedRequest.q(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private final Set<String> d(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (StringsKt.H("Vary", headers.h(i10), true)) {
                    String strP = headers.p(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.J(StringCompanionObject.f142841a));
                    }
                    Iterator it = StringsKt.Z0(strP, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.y1((String) it.next()).toString());
                    }
                }
            }
            if (treeSet == null) {
                return SetsKt.e();
            }
            return treeSet;
        }

        private final Headers e(Headers requestHeaders, Headers responseHeaders) {
            Set<String> setD = d(responseHeaders);
            if (setD.isEmpty()) {
                return Headers.f153997c;
            }
            Headers.a aVar = new Headers.a();
            int size = requestHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strH = requestHeaders.h(i10);
                if (setD.contains(strH)) {
                    aVar.a(strH, requestHeaders.p(i10));
                }
            }
            return aVar.f();
        }
    }

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u0000 @2\u00020\u0001:\u0001\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001fR\u00020\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00105\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010'R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<¨\u0006A"}, d2 = {"Lokhttp3/b$c;", "", "Lkw/J;", "rawSource", "<init>", "(Lkw/J;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lkw/g;", "source", "", "Ljava/security/cert/Certificate;", "b", "(Lkw/g;)Ljava/util/List;", "Lkw/f;", "sink", "certificates", "", "d", "(Lkw/f;Ljava/util/List;)V", "LTv/f$b;", "LTv/f;", "editor", "e", "(LTv/f$b;)V", "Lokhttp3/Request;", "request", "", "a", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "LTv/f$d;", "snapshot", "c", "(LTv/f$d;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "varyHeaders", "", "Ljava/lang/String;", "requestMethod", "LQv/r;", "LQv/r;", "protocol", "", "I", "code", "f", "message", "g", "responseHeaders", "Lokhttp3/i;", "h", "Lokhttp3/i;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "k", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class c {

        /* renamed from: l, reason: collision with root package name */
        private static final String f154176l;

        /* renamed from: m, reason: collision with root package name */
        private static final String f154177m;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpUrl url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Headers varyHeaders;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String requestMethod;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final r protocol;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Headers responseHeaders;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final i handshake;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final long sentRequestMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final long receivedResponseMillis;

        public c(J rawSource) throws IOException {
            Intrinsics.j(rawSource, "rawSource");
            try {
                InterfaceC15330g interfaceC15330gD = w.d(rawSource);
                String strH1 = interfaceC15330gD.h1();
                HttpUrl httpUrlE = HttpUrl.INSTANCE.e(strH1);
                if (httpUrlE == null) {
                    IOException iOException = new IOException("Cache corruption for " + strH1);
                    okhttp3.internal.platform.c.INSTANCE.e().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrlE;
                this.requestMethod = interfaceC15330gD.h1();
                Headers.a aVar = new Headers.a();
                int iC = b.INSTANCE.c(interfaceC15330gD);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.c(interfaceC15330gD.h1());
                }
                this.varyHeaders = aVar.f();
                Wv.k kVarA = Wv.k.INSTANCE.a(interfaceC15330gD.h1());
                this.protocol = kVarA.protocol;
                this.code = kVarA.code;
                this.message = kVarA.message;
                Headers.a aVar2 = new Headers.a();
                int iC2 = b.INSTANCE.c(interfaceC15330gD);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.c(interfaceC15330gD.h1());
                }
                String str = f154176l;
                String strG = aVar2.g(str);
                String str2 = f154177m;
                String strG2 = aVar2.g(str2);
                aVar2.i(str);
                aVar2.i(str2);
                this.sentRequestMillis = strG != null ? Long.parseLong(strG) : 0L;
                this.receivedResponseMillis = strG2 != null ? Long.parseLong(strG2) : 0L;
                this.responseHeaders = aVar2.f();
                if (this.url.j()) {
                    String strH12 = interfaceC15330gD.h1();
                    if (strH12.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strH12 + '\"');
                    }
                    this.handshake = i.INSTANCE.d(!interfaceC15330gD.j2() ? l.INSTANCE.a(interfaceC15330gD.h1()) : l.f154426g, e.INSTANCE.b(interfaceC15330gD.h1()), b(interfaceC15330gD), b(interfaceC15330gD));
                } else {
                    this.handshake = null;
                }
                Unit unit = Unit.f142422a;
                CloseableKt.a(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.a(rawSource, th2);
                    throw th3;
                }
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            c.Companion companion = okhttp3.internal.platform.c.INSTANCE;
            sb2.append(companion.e().g());
            sb2.append("-Sent-Millis");
            f154176l = sb2.toString();
            f154177m = companion.e().g() + "-Received-Millis";
        }

        private final List<Certificate> b(InterfaceC15330g source) throws IOException, CertificateException {
            int iC = b.INSTANCE.c(source);
            if (iC == -1) {
                return CollectionsKt.m();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strH1 = source.h1();
                    C15328e c15328e = new C15328e();
                    C15331h c15331hA = C15331h.INSTANCE.a(strH1);
                    if (c15331hA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c15328e.Z2(c15331hA);
                    arrayList.add(certificateFactory.generateCertificate(c15328e.T3()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean a(Request request, Response response) {
            Intrinsics.j(request, "request");
            Intrinsics.j(response, "response");
            return Intrinsics.e(this.url, request.getUrl()) && Intrinsics.e(this.requestMethod, request.getMethod()) && b.INSTANCE.g(response, this.varyHeaders, request);
        }

        public final Response c(f.d snapshot) {
            Intrinsics.j(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.a().q(new Request(this.url, this.varyHeaders, this.requestMethod, null, 8, null)).o(this.protocol).f(this.code).l(this.message).j(this.responseHeaders).b(new a(snapshot, str, str2)).h(this.handshake).r(this.sentRequestMillis).p(this.receivedResponseMillis).c();
        }

        public final void e(f.b editor) throws IOException {
            Intrinsics.j(editor, "editor");
            InterfaceC15329f interfaceC15329fC = w.c(editor.g(0));
            try {
                interfaceC15329fC.I0(this.url.getUrl()).writeByte(10);
                interfaceC15329fC.I0(this.requestMethod).writeByte(10);
                interfaceC15329fC.E1(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC15329fC.I0(this.varyHeaders.h(i10)).I0(": ").I0(this.varyHeaders.p(i10)).writeByte(10);
                }
                interfaceC15329fC.I0(new Wv.k(this.protocol, this.code, this.message).toString()).writeByte(10);
                interfaceC15329fC.E1(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC15329fC.I0(this.responseHeaders.h(i11)).I0(": ").I0(this.responseHeaders.p(i11)).writeByte(10);
                }
                interfaceC15329fC.I0(f154176l).I0(": ").E1(this.sentRequestMillis).writeByte(10);
                interfaceC15329fC.I0(f154177m).I0(": ").E1(this.receivedResponseMillis).writeByte(10);
                if (this.url.j()) {
                    interfaceC15329fC.writeByte(10);
                    i iVar = this.handshake;
                    Intrinsics.g(iVar);
                    interfaceC15329fC.I0(iVar.getCipherSuite().getJavaName()).writeByte(10);
                    d(interfaceC15329fC, this.handshake.e());
                    d(interfaceC15329fC, this.handshake.d());
                    interfaceC15329fC.I0(this.handshake.getTlsVersion().getJavaName()).writeByte(10);
                }
                Unit unit = Unit.f142422a;
                CloseableKt.a(interfaceC15329fC, null);
            } finally {
            }
        }

        private final void d(InterfaceC15329f sink, List<? extends Certificate> certificates) throws IOException, CertificateEncodingException {
            try {
                sink.E1(certificates.size()).writeByte(10);
                Iterator<? extends Certificate> it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    C15331h.Companion companion = C15331h.INSTANCE;
                    Intrinsics.g(encoded);
                    sink.I0(C15331h.Companion.g(companion, encoded, 0, 0, 3, null).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public c(Response response) {
            Intrinsics.j(response, "response");
            this.url = response.getRequest().getUrl();
            this.varyHeaders = b.INSTANCE.f(response);
            this.requestMethod = response.getRequest().getMethod();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.responseHeaders = response.getHeaders();
            this.handshake = response.getHandshake();
            this.sentRequestMillis = response.getSentRequestAtMillis();
            this.receivedResponseMillis = response.getReceivedResponseAtMillis();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016\"\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/b$d;", "LTv/c;", "LTv/f$b;", "LTv/f;", "editor", "<init>", "(Lokhttp3/b;LTv/f$b;)V", "", "abort", "()V", "Lkw/I;", "a", "()Lkw/I;", "LTv/f$b;", "b", "Lkw/I;", "cacheOut", "c", "body", "", "d", "Z", "()Z", "(Z)V", "done", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class d implements Tv.c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f.b editor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final I cacheOut;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final I body;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f154192e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/b$d$a", "Lkw/n;", "", "close", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends AbstractC15337n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f154193b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f154194c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, d dVar, I i10) {
                super(i10);
                this.f154193b = bVar;
                this.f154194c = dVar;
            }

            @Override // kw.AbstractC15337n, kw.I, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                b bVar = this.f154193b;
                d dVar = this.f154194c;
                synchronized (bVar) {
                    if (dVar.getDone()) {
                        return;
                    }
                    dVar.d(true);
                    bVar.m(bVar.getWriteSuccessCount() + 1);
                    super.close();
                    this.f154194c.editor.c();
                }
            }
        }

        public d(b bVar, f.b editor) {
            Intrinsics.j(editor, "editor");
            this.f154192e = bVar;
            this.editor = editor;
            I iG = editor.g(1);
            this.cacheOut = iG;
            this.body = new a(bVar, this, iG);
        }

        @Override // Tv.c
        /* renamed from: a, reason: from getter */
        public I getBody() {
            return this.body;
        }

        @Override // Tv.c
        public void abort() throws IOException {
            b bVar = this.f154192e;
            synchronized (bVar) {
                if (this.done) {
                    return;
                }
                this.done = true;
                bVar.l(bVar.getWriteAbortCount() + 1);
                Rv.h.f(this.cacheOut);
                try {
                    this.editor.b();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c, reason: from getter */
        public final boolean getDone() {
            return this.done;
        }

        public final void d(boolean z10) {
            this.done = z10;
        }
    }

    public b(B directory, long j10, AbstractC15335l fileSystem, Uv.d taskRunner) {
        Intrinsics.j(directory, "directory");
        Intrinsics.j(fileSystem, "fileSystem");
        Intrinsics.j(taskRunner, "taskRunner");
        this.cache = new Tv.f(fileSystem, directory, 201105, 2, j10, taskRunner);
    }

    public final synchronized int g() {
        return this.hitCount;
    }

    public final synchronized int h() {
        return this.networkCount;
    }

    public final synchronized void p() {
        this.hitCount++;
    }

    public final synchronized void u(Tv.d cacheStrategy) {
        try {
            Intrinsics.j(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void a(f.b editor) {
        if (editor != null) {
            try {
                editor.b();
            } catch (IOException unused) {
            }
        }
    }

    public final Response b(Request request) throws IOException {
        Intrinsics.j(request, "request");
        try {
            f.d dVarA = this.cache.A(INSTANCE.b(request.getUrl()));
            if (dVarA == null) {
                return null;
            }
            try {
                c cVar = new c(dVarA.b(0));
                Response responseC = cVar.c(dVarA);
                if (cVar.a(request, responseC)) {
                    return responseC;
                }
                Rv.h.f(responseC.getBody());
                return null;
            } catch (IOException unused) {
                Rv.h.f(dVarA);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* renamed from: c, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    /* renamed from: d, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Tv.c i(Response response) {
        f.b bVarZ;
        Intrinsics.j(response, "response");
        String method = response.getRequest().getMethod();
        if (Wv.f.a(response.getRequest().getMethod())) {
            try {
                j(response.getRequest());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.e(method, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.a(response)) {
            return null;
        }
        c cVar = new c(response);
        try {
            bVarZ = Tv.f.z(this.cache, companion.b(response.getRequest().getUrl()), 0L, 2, null);
            if (bVarZ == null) {
                return null;
            }
            try {
                cVar.e(bVarZ);
                return new d(this, bVarZ);
            } catch (IOException unused2) {
                a(bVarZ);
                return null;
            }
        } catch (IOException unused3) {
            bVarZ = null;
        }
    }

    public final void j(Request request) throws IOException {
        Intrinsics.j(request, "request");
        this.cache.i0(INSTANCE.b(request.getUrl()));
    }

    public final void l(int i10) {
        this.writeAbortCount = i10;
    }

    public final void m(int i10) {
        this.writeSuccessCount = i10;
    }

    public final void w(Response cached, Response network) {
        f.b bVarA;
        Intrinsics.j(cached, "cached");
        Intrinsics.j(network, "network");
        c cVar = new c(network);
        ResponseBody body = cached.getBody();
        Intrinsics.h(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarA = ((a) body).getSnapshot().a();
            if (bVarA == null) {
                return;
            }
            try {
                cVar.e(bVarA);
                bVarA.c();
            } catch (IOException unused) {
                a(bVarA);
            }
        } catch (IOException unused2) {
            bVarA = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(AbstractC15335l fileSystem, B directory, long j10) {
        this(directory, j10, fileSystem, Uv.d.f36366m);
        Intrinsics.j(fileSystem, "fileSystem");
        Intrinsics.j(directory, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(File directory, long j10) {
        this(AbstractC15335l.f148118b, B.Companion.d(B.INSTANCE, directory, false, 1, null), j10);
        Intrinsics.j(directory, "directory");
    }
}
