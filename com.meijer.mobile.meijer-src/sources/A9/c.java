package A9;

import android.net.Uri;
import io.constructor.data.local.PreferencesHelper;
import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u9.C17361a;
import v9.C17649a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0019Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0019\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b\u001b\u0010'R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*¨\u0006+"}, d2 = {"LA9/c;", "Ljava/io/Serializable;", "", "urlStr", "LA9/b;", "method", "", "", "payload", "headers", "", "timestamp", "ttl", PreferencesHelper.PREF_ID, "Ljava/net/URL;", "url", "<init>", "(Ljava/lang/String;LA9/b;Ljava/util/Map;Ljava/util/Map;JJLjava/lang/String;Ljava/net/URL;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "b", "LA9/b;", "c", "()LA9/b;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "e", "J", "()J", "f", "g", "()Ljava/lang/String;", "h", "Ljava/net/URL;", "()Ljava/net/URL;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class c implements Serializable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String urlStr;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b method;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> payload;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> headers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long ttl;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final URL url;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b%\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\u00002\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"R\"\u0010\f\u001a\u00020\u000b8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010\"\"\u0004\b%\u0010&R\"\u0010\u0014\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R2\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b,\u0010/\"\u0004\b3\u00101R\"\u00109\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u001c\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010=\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b5\u0010#\u001a\u0004\b2\u0010\"\"\u0004\b<\u0010&R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b:\u0010-\u001a\u0004\b>\u0010/\"\u0004\b?\u00101¨\u0006@"}, d2 = {"LA9/c$a;", "", "Lu9/a;", "timestampProvider", "Lv9/a;", "uuidProvider", "<init>", "(Lu9/a;Lv9/a;)V", "LA9/c;", "requestModel", "(LA9/c;)V", "", "url", "p", "(Ljava/lang/String;)LA9/c$a;", "", "queryParams", "m", "(Ljava/util/Map;)LA9/c$a;", "LA9/b;", "method", "k", "(LA9/b;)LA9/c$a;", "payload", "l", "headers", "j", "", "ttl", "o", "(J)LA9/c$a;", "a", "()LA9/c;", "b", "()Ljava/lang/String;", "Ljava/lang/String;", "i", "n", "(Ljava/lang/String;)V", "LA9/b;", "e", "()LA9/b;", "setMethod", "(LA9/b;)V", "c", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "setPayload", "(Ljava/util/Map;)V", "d", "setHeaders", "J", "g", "()J", "setTimestamp", "(J)V", "timestamp", "h", "setTtl", "setId", PreferencesHelper.PREF_ID, "getQueryParams", "setQueryParams", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        protected String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private b method;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Map<String, ? extends Object> payload;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Map<String, String> headers;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long timestamp;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long ttl;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String id;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Map<String, String> queryParams;

        public a(C17361a timestampProvider, C17649a uuidProvider) {
            Intrinsics.j(timestampProvider, "timestampProvider");
            Intrinsics.j(uuidProvider, "uuidProvider");
            this.method = b.POST;
            this.headers = MapsKt.k();
            this.ttl = Long.MAX_VALUE;
            this.timestamp = timestampProvider.a();
            this.id = uuidProvider.a();
        }

        public c a() {
            return new c(b(), this.method, this.payload, this.headers, this.timestamp, this.ttl, this.id, null, 128, null);
        }

        protected final Map<String, String> c() {
            return this.headers;
        }

        /* renamed from: d, reason: from getter */
        protected final String getId() {
            return this.id;
        }

        /* renamed from: e, reason: from getter */
        protected final b getMethod() {
            return this.method;
        }

        protected final Map<String, Object> f() {
            return this.payload;
        }

        /* renamed from: g, reason: from getter */
        protected final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: h, reason: from getter */
        protected final long getTtl() {
            return this.ttl;
        }

        protected final String i() {
            String str = this.url;
            if (str != null) {
                return str;
            }
            Intrinsics.x("url");
            return null;
        }

        public a j(Map<String, String> headers) {
            Intrinsics.j(headers, "headers");
            this.headers = headers;
            return this;
        }

        public a k(b method) {
            Intrinsics.j(method, "method");
            this.method = method;
            return this;
        }

        public a l(Map<String, ? extends Object> payload) {
            Intrinsics.j(payload, "payload");
            this.payload = payload;
            return this;
        }

        public a m(Map<String, String> queryParams) {
            Intrinsics.j(queryParams, "queryParams");
            this.queryParams = queryParams;
            return this;
        }

        protected final void n(String str) {
            Intrinsics.j(str, "<set-?>");
            this.url = str;
        }

        public a o(long ttl) {
            this.ttl = ttl;
            return this;
        }

        public a p(String url) {
            Intrinsics.j(url, "url");
            n(url);
            return this;
        }

        public final String b() {
            Uri.Builder builderBuildUpon = Uri.parse(i()).buildUpon();
            Map<String, String> map = this.queryParams;
            if (map != null) {
                Intrinsics.g(map);
                if (!map.isEmpty()) {
                    Map<String, String> map2 = this.queryParams;
                    Intrinsics.g(map2);
                    for (String str : map2.keySet()) {
                        Map<String, String> map3 = this.queryParams;
                        Intrinsics.g(map3);
                        builderBuildUpon.appendQueryParameter(str, map3.get(str));
                    }
                }
            }
            String string = builderBuildUpon.build().toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }

        public a(c requestModel) {
            Intrinsics.j(requestModel, "requestModel");
            this.method = b.POST;
            this.headers = MapsKt.k();
            this.ttl = Long.MAX_VALUE;
            I9.b.c(requestModel, "RequestModel must not be null!");
            n(requestModel.getUrl().toString());
            this.method = requestModel.getMethod();
            this.payload = requestModel.d();
            this.headers = requestModel.a();
            this.timestamp = requestModel.getTimestamp();
            this.ttl = requestModel.getTtl();
            this.id = requestModel.getId();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public c(String urlStr, b method, Map<String, ? extends Object> map, Map<String, String> headers, long j10, long j11, String id2) {
        this(urlStr, method, map, headers, j10, j11, id2, null, 128, null);
        Intrinsics.j(urlStr, "urlStr");
        Intrinsics.j(method, "method");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(id2, "id");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.emarsys.core.request.model.RequestModel");
        c cVar = (c) other;
        return getMethod() == cVar.getMethod() && Intrinsics.e(d(), cVar.d()) && Intrinsics.e(a(), cVar.a()) && getTimestamp() == cVar.getTimestamp() && getTtl() == cVar.getTtl() && Intrinsics.e(getId(), cVar.getId()) && Intrinsics.e(getUrl(), cVar.getUrl());
    }

    @JvmOverloads
    public c(String urlStr, b method, Map<String, ? extends Object> map, Map<String, String> headers, long j10, long j11, String id2, URL url) {
        Intrinsics.j(urlStr, "urlStr");
        Intrinsics.j(method, "method");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(id2, "id");
        Intrinsics.j(url, "url");
        this.urlStr = urlStr;
        this.method = method;
        this.payload = map;
        this.headers = headers;
        this.timestamp = j10;
        this.ttl = j11;
        this.id = id2;
        this.url = url;
    }

    public Map<String, String> a() {
        return this.headers;
    }

    /* renamed from: b, reason: from getter */
    public String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public b getMethod() {
        return this.method;
    }

    public Map<String, Object> d() {
        return this.payload;
    }

    /* renamed from: e, reason: from getter */
    public long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: f, reason: from getter */
    public long getTtl() {
        return this.ttl;
    }

    /* renamed from: g, reason: from getter */
    public URL getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = getMethod().hashCode() * 31;
        Map<String, Object> mapD = d();
        if (mapD != null) {
            iHashCode = mapD.hashCode();
        } else {
            iHashCode = 0;
        }
        return ((((((((((iHashCode2 + iHashCode) * 31) + a().hashCode()) * 31) + Long.hashCode(getTimestamp())) * 31) + Long.hashCode(getTtl())) * 31) + getId().hashCode()) * 31) + getUrl().hashCode();
    }

    public /* synthetic */ c(String str, b bVar, Map map, Map map2, long j10, long j11, String str2, URL url, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, map, map2, j10, j11, str2, (i10 & 128) != 0 ? new URL(str) : url);
    }
}
