package Pv;

import com.medallia.digital.mobilesdk.l8;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0002\n\bB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"LPv/d;", "", "Lokhttp3/Request;", "networkRequest", "Lokhttp3/Response;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "a", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "Lokhttp3/Response;", "()Lokhttp3/Response;", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Request networkRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Response cacheResponse;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LPv/d$a;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "request", "", "a", "(Lokhttp3/Response;Lokhttp3/Request;)Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Pv.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(okhttp3.Response r5, okhttp3.Request r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.j(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.j(r6, r0)
                int r0 = r5.getCode()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = okhttp3.Response.j(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                okhttp3.c r0 = r5.b()
                int r0 = r0.getMaxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L65
                okhttp3.c r0 = r5.b()
                boolean r0 = r0.getIsPublic()
                if (r0 != 0) goto L65
                okhttp3.c r0 = r5.b()
                boolean r0 = r0.getIsPrivate()
                if (r0 != 0) goto L65
                return r2
            L65:
                okhttp3.c r5 = r5.b()
                boolean r5 = r5.getNoStore()
                if (r5 != 0) goto L7b
                okhttp3.c r5 = r6.a()
                boolean r5 = r5.getNoStore()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Pv.d.Companion.a(okhttp3.Response, okhttp3.Request):boolean");
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"LPv/d$b;", "", "", "nowMillis", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "", "f", "()Z", "LPv/d;", "c", "()LPv/d;", "d", "()J", "a", "e", "(Lokhttp3/Request;)Z", "b", "J", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "Lokhttp3/Response;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "g", "lastModifiedString", "h", "expires", "i", "sentRequestMillis", "j", "receivedResponseMillis", "k", "etag", "", "l", "I", "ageSeconds", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long nowMillis;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Request request;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Response cacheResponse;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Date servedDate;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String servedDateString;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Date lastModified;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String lastModifiedString;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Date expires;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private long sentRequestMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private long receivedResponseMillis;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private String etag;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private int ageSeconds;

        public b(long j10, Request request, Response response) {
            Intrinsics.j(request, "request");
            this.nowMillis = j10;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.getSentRequestAtMillis();
                this.receivedResponseMillis = response.getReceivedResponseAtMillis();
                Headers headers = response.getHeaders();
                int size = headers.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strH = headers.h(i10);
                    String strP = headers.p(i10);
                    if (StringsKt.H(strH, "Date", true)) {
                        this.servedDate = Sv.c.a(strP);
                        this.servedDateString = strP;
                    } else if (StringsKt.H(strH, "Expires", true)) {
                        this.expires = Sv.c.a(strP);
                    } else if (StringsKt.H(strH, "Last-Modified", true)) {
                        this.lastModified = Sv.c.a(strP);
                        this.lastModifiedString = strP;
                    } else if (StringsKt.H(strH, "ETag", true)) {
                        this.etag = strP;
                    } else if (StringsKt.H(strH, "Age", true)) {
                        this.ageSeconds = Nv.h.D(strP, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i10 = this.ageSeconds;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + Math.max(0L, this.receivedResponseMillis - this.sentRequestMillis) + Math.max(0L, this.nowMillis - this.receivedResponseMillis);
        }

        private final d c() {
            String str;
            if (this.cacheResponse == null) {
                return new d(this.request, null);
            }
            if (this.request.f() && this.cacheResponse.getHandshake() == null) {
                return new d(this.request, null);
            }
            if (!d.INSTANCE.a(this.cacheResponse, this.request)) {
                return new d(this.request, null);
            }
            okhttp3.c cVarA = this.request.a();
            if (cVarA.getNoCache() || e(this.request)) {
                return new d(this.request, null);
            }
            okhttp3.c cVarB = this.cacheResponse.b();
            long jA = a();
            long jD = d();
            if (cVarA.getMaxAgeSeconds() != -1) {
                jD = Math.min(jD, TimeUnit.SECONDS.toMillis(cVarA.getMaxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = cVarA.getMinFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cVarA.getMinFreshSeconds()) : 0L;
            if (!cVarB.getMustRevalidate() && cVarA.getMaxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cVarA.getMaxStaleSeconds());
            }
            if (!cVarB.getNoCache()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jD) {
                    Response.a aVarP = this.cacheResponse.p();
                    if (j10 >= jD) {
                        aVarP.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > l8.b.f93366d && f()) {
                        aVarP.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new d(null, aVarP.c());
                }
            }
            String str2 = this.etag;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.lastModified != null) {
                    str2 = this.lastModifiedString;
                } else {
                    if (this.servedDate == null) {
                        return new d(this.request, null);
                    }
                    str2 = this.servedDateString;
                }
                str = "If-Modified-Since";
            }
            Headers.a aVarK = this.request.getHeaders().k();
            Intrinsics.g(str2);
            aVarK.d(str, str2);
            return new d(this.request.g().n(aVarK.f()).b(), this.cacheResponse);
        }

        private final long d() {
            Response response = this.cacheResponse;
            Intrinsics.g(response);
            if (response.b().getMaxAgeSeconds() != -1) {
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
            if (this.lastModified != null && this.cacheResponse.getRequest().getUrl().p() == null) {
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

        private final boolean e(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            Response response = this.cacheResponse;
            Intrinsics.g(response);
            return response.b().getMaxAgeSeconds() == -1 && this.expires == null;
        }

        public final d b() {
            d dVarC = c();
            if (dVarC.getNetworkRequest() != null && this.request.a().getOnlyIfCached()) {
                return new d(null, null);
            }
            return dVarC;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: b, reason: from getter */
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }

    public d(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }
}
