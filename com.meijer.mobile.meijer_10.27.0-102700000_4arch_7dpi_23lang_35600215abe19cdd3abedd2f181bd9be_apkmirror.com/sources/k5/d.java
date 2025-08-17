package k5;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import q5.C16458j;
import q5.C16470v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\n\bB\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lk5/d;", "", "Lokhttp3/Request;", "networkRequest", "Lk5/c;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lk5/c;)V", "a", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "Lk5/c;", "()Lk5/c;", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Request networkRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15097c cacheResponse;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk5/d$a;", "", "<init>", "()V", "", "name", "", "e", "(Ljava/lang/String;)Z", "d", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "c", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "Lk5/c;", "b", "(Lokhttp3/Request;Lk5/c;)Z", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "a", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: k5.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final boolean d(String name) {
            return StringsKt.H("Content-Length", name, true) || StringsKt.H("Content-Encoding", name, true) || StringsKt.H("Content-Type", name, true);
        }

        private final boolean e(String name) {
            return (StringsKt.H("Connection", name, true) || StringsKt.H("Keep-Alive", name, true) || StringsKt.H("Proxy-Authenticate", name, true) || StringsKt.H("Proxy-Authorization", name, true) || StringsKt.H("TE", name, true) || StringsKt.H("Trailers", name, true) || StringsKt.H("Transfer-Encoding", name, true) || StringsKt.H("Upgrade", name, true)) ? false : true;
        }

        public final Headers a(Headers cachedHeaders, Headers networkHeaders) {
            Headers.a aVar = new Headers.a();
            int size = cachedHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strH = cachedHeaders.h(i10);
                String strP = cachedHeaders.p(i10);
                if ((!StringsKt.H("Warning", strH, true) || !StringsKt.W(strP, "1", false, 2, null)) && (d(strH) || !e(strH) || networkHeaders.get(strH) == null)) {
                    aVar.e(strH, strP);
                }
            }
            int size2 = networkHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strH2 = networkHeaders.h(i11);
                if (!d(strH2) && e(strH2)) {
                    aVar.e(strH2, networkHeaders.p(i11));
                }
            }
            return aVar.f();
        }

        public final boolean b(Request request, C15097c response) {
            if (!request.a().getNoStore() && !response.e().getNoStore() && !Intrinsics.e(response.getResponseHeaders().get("Vary"), "*")) {
                return true;
            }
            return false;
        }

        public final boolean c(Request request, Response response) {
            if (!request.a().getNoStore() && !response.b().getNoStore() && !Intrinsics.e(response.getHeaders().get("Vary"), "*")) {
                return true;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lk5/d$b;", "", "Lokhttp3/Request;", "request", "Lk5/c;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lk5/c;)V", "", "c", "()J", "a", "", "d", "(Lokhttp3/Request;)Z", "Lk5/d;", "b", "()Lk5/d;", "Lokhttp3/Request;", "Lk5/c;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "e", "lastModified", "f", "lastModifiedString", "g", "expires", "h", "J", "sentRequestMillis", "i", "receivedResponseMillis", "j", "etag", "", "k", "I", "ageSeconds", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Request request;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final C15097c cacheResponse;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Date servedDate;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String servedDateString;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Date lastModified;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private String lastModifiedString;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Date expires;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long sentRequestMillis;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private String etag;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private int ageSeconds;

        private final long a() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i10 = this.ageSeconds;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + (this.receivedResponseMillis - this.sentRequestMillis) + (C16470v.f156814a.a() - this.receivedResponseMillis);
        }

        private final long c() {
            C15097c c15097c = this.cacheResponse;
            Intrinsics.g(c15097c);
            if (c15097c.e().getMaxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.getMaxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified != null && this.request.getUrl().p() == null) {
                Date date3 = this.servedDate;
                long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
                Date date4 = this.lastModified;
                Intrinsics.g(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
            }
            return 0L;
        }

        private final boolean d(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final d b() {
            String str;
            C15097c c15097c = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (this.cacheResponse == null) {
                return new d(this.request, c15097c, objArr12 == true ? 1 : 0);
            }
            if (this.request.f() && !this.cacheResponse.getIsTls()) {
                return new d(this.request, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            okhttp3.c cVarE = this.cacheResponse.e();
            if (!d.INSTANCE.b(this.request, this.cacheResponse)) {
                return new d(this.request, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            okhttp3.c cVarA = this.request.a();
            if (cVarA.getNoCache() || d(this.request)) {
                return new d(this.request, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            long jA = a();
            long jC = c();
            if (cVarA.getMaxAgeSeconds() != -1) {
                jC = Math.min(jC, TimeUnit.SECONDS.toMillis(cVarA.getMaxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = cVarA.getMinFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cVarA.getMinFreshSeconds()) : 0L;
            if (!cVarE.getMustRevalidate() && cVarA.getMaxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cVarA.getMaxStaleSeconds());
            }
            if (!cVarE.getNoCache() && jA + millis2 < jC + millis) {
                return new d(objArr7 == true ? 1 : 0, this.cacheResponse, objArr6 == true ? 1 : 0);
            }
            String str2 = this.etag;
            if (str2 != null) {
                Intrinsics.g(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.lastModified != null) {
                    str2 = this.lastModifiedString;
                    Intrinsics.g(str2);
                } else {
                    if (this.servedDate == null) {
                        return new d(this.request, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                    }
                    str2 = this.servedDateString;
                    Intrinsics.g(str2);
                }
            }
            return new d(this.request.g().a(str, str2).b(), this.cacheResponse, objArr5 == true ? 1 : 0);
        }

        public b(Request request, C15097c c15097c) {
            this.request = request;
            this.cacheResponse = c15097c;
            this.ageSeconds = -1;
            if (c15097c != null) {
                this.sentRequestMillis = c15097c.getSentRequestAtMillis();
                this.receivedResponseMillis = c15097c.getReceivedResponseAtMillis();
                Headers responseHeaders = c15097c.getResponseHeaders();
                int size = responseHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strH = responseHeaders.h(i10);
                    if (StringsKt.H(strH, "Date", true)) {
                        this.servedDate = responseHeaders.a("Date");
                        this.servedDateString = responseHeaders.p(i10);
                    } else if (StringsKt.H(strH, "Expires", true)) {
                        this.expires = responseHeaders.a("Expires");
                    } else if (StringsKt.H(strH, "Last-Modified", true)) {
                        this.lastModified = responseHeaders.a("Last-Modified");
                        this.lastModifiedString = responseHeaders.p(i10);
                    } else if (StringsKt.H(strH, "ETag", true)) {
                        this.etag = responseHeaders.p(i10);
                    } else if (StringsKt.H(strH, "Age", true)) {
                        this.ageSeconds = C16458j.A(responseHeaders.p(i10), -1);
                    }
                }
            }
        }
    }

    public /* synthetic */ d(Request request, C15097c c15097c, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, c15097c);
    }

    private d(Request request, C15097c c15097c) {
        this.networkRequest = request;
        this.cacheResponse = c15097c;
    }

    /* renamed from: a, reason: from getter */
    public final C15097c getCacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: b, reason: from getter */
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
