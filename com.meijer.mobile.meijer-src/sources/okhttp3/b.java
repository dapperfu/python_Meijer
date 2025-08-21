package okhttp3;

import Mv.r;
import Pv.f;
import gw.AbstractC14423l;
import gw.AbstractC14425n;
import gw.AbstractC14426o;
import gw.B;
import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14417f;
import gw.InterfaceC14418g;
import gw.J;
import gw.K;
import gw.w;
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
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.internal.platform.c;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00046:\u0014\u0019B)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0018\u00010\u0010R\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0013H\u0000¢\u0006\u0004\b,\u0010&J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020-¢\u0006\u0004\b0\u0010/R\u001a\u00104\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103R\"\u00109\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00105\u001a\u0004\b6\u0010/\"\u0004\b7\u00108R\"\u0010<\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b:\u0010/\"\u0004\b;\u00108R\u0016\u0010=\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u0010?\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105R\u0016\u0010A\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00105¨\u0006B"}, d2 = {"Lokhttp3/b;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lgw/B;", "directory", "", "maxSize", "Lgw/l;", "fileSystem", "LQv/d;", "taskRunner", "<init>", "(Lgw/B;JLgw/l;LQv/d;)V", "(Lgw/l;Lgw/B;J)V", "Ljava/io/File;", "(Ljava/io/File;J)V", "LPv/f$b;", "LPv/f;", "editor", "", "a", "(LPv/f$b;)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "b", "(Lokhttp3/Request;)Lokhttp3/Response;", "response", "LPv/c;", "i", "(Lokhttp3/Response;)LPv/c;", "j", "(Lokhttp3/Request;)V", "cached", "network", "w", "(Lokhttp3/Response;Lokhttp3/Response;)V", "flush", "()V", "close", "LPv/d;", "cacheStrategy", "u", "(LPv/d;)V", "p", "", "h", "()I", "g", "LPv/f;", "getCache$okhttp", "()LPv/f;", "cache", "I", "d", "m", "(I)V", "writeSuccessCount", "c", "l", "writeAbortCount", "networkCount", "e", "hitCount", "f", "requestCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements Closeable, Flushable {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Pv.f cache;

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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokhttp3/b$a;", "Lokhttp3/ResponseBody;", "LPv/f$d;", "LPv/f;", "snapshot", "", "contentType", "contentLength", "<init>", "(LPv/f$d;Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/j;", "()Lokhttp3/j;", "", "()J", "Lgw/g;", "source", "()Lgw/g;", "a", "LPv/f$d;", "()LPv/f$d;", "b", "Ljava/lang/String;", "c", "d", "Lgw/g;", "bodySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a extends ResponseBody {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f.d snapshot;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String contentType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String contentLength;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC14418g bodySource;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/b$a$a", "Lgw/o;", "", "close", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        public static final class C2389a extends AbstractC14426o {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f154482a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2389a(K k10, a aVar) {
                super(k10);
                this.f154482a = aVar;
            }

            @Override // gw.AbstractC14426o, gw.K, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f154482a.getSnapshot().close();
                super.close();
            }
        }

        public a(f.d snapshot, String str, String str2) {
            Intrinsics.j(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = w.c(new C2389a(snapshot.b(1), this));
        }

        /* renamed from: a, reason: from getter */
        public final f.d getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Nv.h.C(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public j getMediaType() {
            String str = this.contentType;
            if (str != null) {
                return j.INSTANCE.b(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source, reason: from getter */
        public InterfaceC14418g getSource() {
            return this.bodySource;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u001b*\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u00020\u0004*\u00020\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lokhttp3/b$b;", "", "<init>", "()V", "Lokhttp3/Headers;", "", "", "d", "(Lokhttp3/Headers;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "e", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "Lokhttp3/HttpUrl;", "url", "b", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Lgw/g;", "source", "", "c", "(Lgw/g;)I", "Lokhttp3/Response;", "cachedResponse", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "g", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "a", "(Lokhttp3/Response;)Z", "f", "(Lokhttp3/Response;)Lokhttp3/Headers;", "VERSION", "I", "ENTRY_METADATA", "ENTRY_BODY", "ENTRY_COUNT", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            return C14419h.INSTANCE.d(url.getUrl()).N().E();
        }

        public final int c(InterfaceC14418g source) throws IOException {
            Intrinsics.j(source, "source");
            try {
                long jP2 = source.p2();
                String strI1 = source.i1();
                if (jP2 >= 0 && jP2 <= 2147483647L && strI1.length() <= 0) {
                    return (int) jP2;
                }
                throw new IOException("expected an int but was \"" + jP2 + strI1 + '\"');
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
                        treeSet = new TreeSet(StringsKt.J(StringCompanionObject.f143748a));
                    }
                    Iterator it = StringsKt.a1(strP, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.C1((String) it.next()).toString());
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
                return Headers.f154305c;
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

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u0000 @2\u00020\u0001:\u0001\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001fR\u00020\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00105\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010'R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<¨\u0006A"}, d2 = {"Lokhttp3/b$c;", "", "Lgw/K;", "rawSource", "<init>", "(Lgw/K;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lgw/g;", "source", "", "Ljava/security/cert/Certificate;", "b", "(Lgw/g;)Ljava/util/List;", "Lgw/f;", "sink", "certificates", "", "d", "(Lgw/f;Ljava/util/List;)V", "LPv/f$b;", "LPv/f;", "editor", "e", "(LPv/f$b;)V", "Lokhttp3/Request;", "request", "", "a", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "LPv/f$d;", "snapshot", "c", "(LPv/f$d;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "varyHeaders", "", "Ljava/lang/String;", "requestMethod", "LMv/r;", "LMv/r;", "protocol", "", "I", "code", "f", "message", "g", "responseHeaders", "Lokhttp3/i;", "h", "Lokhttp3/i;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "k", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class c {

        /* renamed from: l, reason: collision with root package name */
        private static final String f154484l;

        /* renamed from: m, reason: collision with root package name */
        private static final String f154485m;

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

        public c(K rawSource) throws IOException {
            Intrinsics.j(rawSource, "rawSource");
            try {
                InterfaceC14418g interfaceC14418gC = w.c(rawSource);
                String strI1 = interfaceC14418gC.i1();
                HttpUrl httpUrlE = HttpUrl.INSTANCE.e(strI1);
                if (httpUrlE == null) {
                    IOException iOException = new IOException("Cache corruption for " + strI1);
                    okhttp3.internal.platform.c.INSTANCE.e().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrlE;
                this.requestMethod = interfaceC14418gC.i1();
                Headers.a aVar = new Headers.a();
                int iC = b.INSTANCE.c(interfaceC14418gC);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.c(interfaceC14418gC.i1());
                }
                this.varyHeaders = aVar.f();
                Sv.k kVarA = Sv.k.INSTANCE.a(interfaceC14418gC.i1());
                this.protocol = kVarA.protocol;
                this.code = kVarA.code;
                this.message = kVarA.message;
                Headers.a aVar2 = new Headers.a();
                int iC2 = b.INSTANCE.c(interfaceC14418gC);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.c(interfaceC14418gC.i1());
                }
                String str = f154484l;
                String strG = aVar2.g(str);
                String str2 = f154485m;
                String strG2 = aVar2.g(str2);
                aVar2.i(str);
                aVar2.i(str2);
                this.sentRequestMillis = strG != null ? Long.parseLong(strG) : 0L;
                this.receivedResponseMillis = strG2 != null ? Long.parseLong(strG2) : 0L;
                this.responseHeaders = aVar2.f();
                if (this.url.j()) {
                    String strI12 = interfaceC14418gC.i1();
                    if (strI12.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strI12 + '\"');
                    }
                    this.handshake = i.INSTANCE.d(!interfaceC14418gC.i2() ? l.INSTANCE.a(interfaceC14418gC.i1()) : l.f154734g, e.INSTANCE.b(interfaceC14418gC.i1()), b(interfaceC14418gC), b(interfaceC14418gC));
                } else {
                    this.handshake = null;
                }
                Unit unit = Unit.f143329a;
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
            f154484l = sb2.toString();
            f154485m = companion.e().g() + "-Received-Millis";
        }

        private final List<Certificate> b(InterfaceC14418g source) throws IOException, CertificateException {
            int iC = b.INSTANCE.c(source);
            if (iC == -1) {
                return CollectionsKt.m();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strI1 = source.i1();
                    C14416e c14416e = new C14416e();
                    C14419h c14419hA = C14419h.INSTANCE.a(strI1);
                    if (c14419hA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c14416e.g1(c14419hA);
                    arrayList.add(certificateFactory.generateCertificate(c14416e.T3()));
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
            InterfaceC14417f interfaceC14417fB = w.b(editor.g(0));
            try {
                interfaceC14417fB.G0(this.url.getUrl()).writeByte(10);
                interfaceC14417fB.G0(this.requestMethod).writeByte(10);
                interfaceC14417fB.G1(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC14417fB.G0(this.varyHeaders.h(i10)).G0(": ").G0(this.varyHeaders.p(i10)).writeByte(10);
                }
                interfaceC14417fB.G0(new Sv.k(this.protocol, this.code, this.message).toString()).writeByte(10);
                interfaceC14417fB.G1(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    interfaceC14417fB.G0(this.responseHeaders.h(i11)).G0(": ").G0(this.responseHeaders.p(i11)).writeByte(10);
                }
                interfaceC14417fB.G0(f154484l).G0(": ").G1(this.sentRequestMillis).writeByte(10);
                interfaceC14417fB.G0(f154485m).G0(": ").G1(this.receivedResponseMillis).writeByte(10);
                if (this.url.j()) {
                    interfaceC14417fB.writeByte(10);
                    i iVar = this.handshake;
                    Intrinsics.g(iVar);
                    interfaceC14417fB.G0(iVar.getCipherSuite().getJavaName()).writeByte(10);
                    d(interfaceC14417fB, this.handshake.e());
                    d(interfaceC14417fB, this.handshake.d());
                    interfaceC14417fB.G0(this.handshake.getTlsVersion().getJavaName()).writeByte(10);
                }
                Unit unit = Unit.f143329a;
                CloseableKt.a(interfaceC14417fB, null);
            } finally {
            }
        }

        private final void d(InterfaceC14417f sink, List<? extends Certificate> certificates) throws IOException, CertificateEncodingException {
            try {
                sink.G1(certificates.size()).writeByte(10);
                Iterator<? extends Certificate> it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    C14419h.Companion companion = C14419h.INSTANCE;
                    Intrinsics.g(encoded);
                    sink.G0(C14419h.Companion.g(companion, encoded, 0, 0, 3, null).a()).writeByte(10);
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016\"\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/b$d;", "LPv/c;", "LPv/f$b;", "LPv/f;", "editor", "<init>", "(Lokhttp3/b;LPv/f$b;)V", "", "abort", "()V", "Lgw/J;", "a", "()Lgw/J;", "LPv/f$b;", "b", "Lgw/J;", "cacheOut", "c", "body", "", "d", "Z", "()Z", "(Z)V", "done", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class d implements Pv.c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final f.b editor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final J cacheOut;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final J body;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f154500e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/b$d$a", "Lgw/n;", "", "close", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends AbstractC14425n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f154501b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f154502c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, d dVar, J j10) {
                super(j10);
                this.f154501b = bVar;
                this.f154502c = dVar;
            }

            @Override // gw.AbstractC14425n, gw.J, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                b bVar = this.f154501b;
                d dVar = this.f154502c;
                synchronized (bVar) {
                    if (dVar.getDone()) {
                        return;
                    }
                    dVar.d(true);
                    bVar.m(bVar.getWriteSuccessCount() + 1);
                    super.close();
                    this.f154502c.editor.c();
                }
            }
        }

        public d(b bVar, f.b editor) {
            Intrinsics.j(editor, "editor");
            this.f154500e = bVar;
            this.editor = editor;
            J jG = editor.g(1);
            this.cacheOut = jG;
            this.body = new a(bVar, this, jG);
        }

        @Override // Pv.c
        /* renamed from: a, reason: from getter */
        public J getBody() {
            return this.body;
        }

        @Override // Pv.c
        public void abort() throws IOException {
            b bVar = this.f154500e;
            synchronized (bVar) {
                if (this.done) {
                    return;
                }
                this.done = true;
                bVar.l(bVar.getWriteAbortCount() + 1);
                Nv.h.f(this.cacheOut);
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

    public b(B directory, long j10, AbstractC14423l fileSystem, Qv.d taskRunner) {
        Intrinsics.j(directory, "directory");
        Intrinsics.j(fileSystem, "fileSystem");
        Intrinsics.j(taskRunner, "taskRunner");
        this.cache = new Pv.f(fileSystem, directory, 201105, 2, j10, taskRunner);
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

    public final synchronized void u(Pv.d cacheStrategy) {
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
                Nv.h.f(responseC.getBody());
                return null;
            } catch (IOException unused) {
                Nv.h.f(dVarA);
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

    public final Pv.c i(Response response) {
        f.b bVarZ;
        Intrinsics.j(response, "response");
        String method = response.getRequest().getMethod();
        if (Sv.f.a(response.getRequest().getMethod())) {
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
            bVarZ = Pv.f.z(this.cache, companion.b(response.getRequest().getUrl()), 0L, 2, null);
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
        this.cache.j0(INSTANCE.b(request.getUrl()));
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
    public b(AbstractC14423l fileSystem, B directory, long j10) {
        this(directory, j10, fileSystem, Qv.d.f31483m);
        Intrinsics.j(fileSystem, "fileSystem");
        Intrinsics.j(directory, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(File directory, long j10) {
        this(AbstractC14423l.f134581b, B.Companion.d(B.INSTANCE, directory, false, 1, null), j10);
        Intrinsics.j(directory, "directory");
    }
}
