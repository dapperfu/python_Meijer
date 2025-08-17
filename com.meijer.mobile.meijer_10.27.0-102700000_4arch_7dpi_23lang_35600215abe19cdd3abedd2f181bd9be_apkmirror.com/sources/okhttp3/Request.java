package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\t\u0010\u0013J'\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00142\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068G¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0007\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8G¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u000b\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8G¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8G¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b\r\u0010*R\u0019\u0010+\u001a\u0004\u0018\u00010\u00068G¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b#\u0010\"R*\u00100\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u0004\u0012\u00020\u00010,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b%\u0010/R\u0018\u00103\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00102R\u0011\u00106\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b-\u00105R\u0011\u00108\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b \u00107¨\u00069"}, d2 = {"Lokhttp3/Request;", "", "Lokhttp3/Request$a;", "builder", "<init>", "(Lokhttp3/Request$a;)V", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Headers;", "headers", "", "method", "Lokhttp3/RequestBody;", "body", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;Ljava/lang/String;Lokhttp3/RequestBody;)V", "name", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/util/List;", "T", "Lkotlin/reflect/KClass;", "type", "i", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/Class;", "h", "(Ljava/lang/Class;)Ljava/lang/Object;", "g", "()Lokhttp3/Request$a;", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/HttpUrl;", "()Lokhttp3/HttpUrl;", "b", "Ljava/lang/String;", "c", "Lokhttp3/Headers;", "e", "()Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "()Lokhttp3/RequestBody;", "cacheUrlOverride", "", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "tags", "Lokhttp3/c;", "Lokhttp3/c;", "lazyCacheControl", "", "()Z", "isHttps", "()Lokhttp3/c;", "cacheControl", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String method;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Headers headers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final RequestBody body;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl cacheUrlOverride;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<KClass<?>, Object> tags;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private c lazyCacheControl;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u0000\"\b\b\u0000\u0010**\u00020\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\b\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b.\u0010/J/\u00101\u001a\u00020\u0000\"\u0004\b\u0000\u0010*2\u000e\u0010,\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u0000002\b\u0010-\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b4\u0010\rJ\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u00106R$\u0010\b\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010'\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u001a\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010$\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u00103\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\bL\u00109\"\u0004\bM\u0010;R2\u0010T\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030+\u0012\u0004\u0012\u00020\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lokhttp3/Request$a;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)V", "", "url", "e", "(Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "v", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$a;", "t", "(Ljava/lang/String;)Lokhttp3/Request$a;", "Ljava/net/URL;", "u", "(Ljava/net/URL;)Lokhttp3/Request$a;", "name", "value", "m", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$a;", "a", "q", "Lokhttp3/Headers;", "headers", "n", "(Lokhttp3/Headers;)Lokhttp3/Request$a;", "Lokhttp3/c;", "cacheControl", "c", "(Lokhttp3/c;)Lokhttp3/Request$a;", "f", "()Lokhttp3/Request$a;", "Lokhttp3/RequestBody;", "body", "p", "(Lokhttp3/RequestBody;)Lokhttp3/Request$a;", "method", "o", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$a;", "T", "Lkotlin/reflect/KClass;", "type", "tag", "s", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lokhttp3/Request$a;", "Ljava/lang/Class;", "r", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$a;", "cacheUrlOverride", "d", "b", "()Lokhttp3/Request;", "Lokhttp3/HttpUrl;", "l", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$a;", "Lokhttp3/Headers$a;", "i", "()Lokhttp3/Headers$a;", "setHeaders$okhttp", "(Lokhttp3/Headers$a;)V", "Lokhttp3/RequestBody;", "g", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "h", "setCacheUrlOverride$okhttp", "", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "tags", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private HttpUrl url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String method;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Headers.a headers;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private RequestBody body;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private HttpUrl cacheUrlOverride;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Map<KClass<?>, ? extends Object> tags;

        public a() {
            this.tags = MapsKt.k();
            this.method = "GET";
            this.headers = new Headers.a();
        }

        private final String e(String url) {
            if (StringsKt.U(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.i(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
            if (!StringsKt.U(url, "wss:", true)) {
                return url;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https:");
            String strSubstring2 = url.substring(4);
            Intrinsics.i(strSubstring2, "substring(...)");
            sb3.append(strSubstring2);
            return sb3.toString();
        }

        public a a(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            this.headers.a(name, value);
            return this;
        }

        public Request b() {
            return new Request(this);
        }

        public a c(c cacheControl) {
            Intrinsics.j(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? q("Cache-Control") : m("Cache-Control", string);
        }

        public final a d(HttpUrl cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        public a f() {
            return o("GET", null);
        }

        /* renamed from: g, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        /* renamed from: h, reason: from getter */
        public final HttpUrl getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        /* renamed from: i, reason: from getter */
        public final Headers.a getHeaders() {
            return this.headers;
        }

        /* renamed from: j, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        public final Map<KClass<?>, Object> k() {
            return this.tags;
        }

        /* renamed from: l, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public a m(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            this.headers.j(name, value);
            return this;
        }

        public a n(Headers headers) {
            Intrinsics.j(headers, "headers");
            this.headers = headers.k();
            return this;
        }

        public a o(String method, RequestBody body) {
            Intrinsics.j(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (body == null) {
                if (Wv.f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!Wv.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public a p(RequestBody body) {
            Intrinsics.j(body, "body");
            return o("POST", body);
        }

        public a q(String name) {
            Intrinsics.j(name, "name");
            this.headers.i(name);
            return this;
        }

        public <T> a r(Class<? super T> type, T tag) {
            Intrinsics.j(type, "type");
            return s(JvmClassMappingKt.e(type), tag);
        }

        public final <T> a s(KClass<T> type, T tag) {
            Map mapD;
            Intrinsics.j(type, "type");
            if (tag == null) {
                if (!this.tags.isEmpty()) {
                    Map<KClass<?>, ? extends Object> map = this.tags;
                    Intrinsics.h(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                    TypeIntrinsics.d(map).remove(type);
                }
                return this;
            }
            if (this.tags.isEmpty()) {
                mapD = new LinkedHashMap();
                this.tags = mapD;
            } else {
                Map<KClass<?>, ? extends Object> map2 = this.tags;
                Intrinsics.h(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                mapD = TypeIntrinsics.d(map2);
            }
            mapD.put(type, KClasses.a(type, tag));
            return this;
        }

        public a t(String url) {
            Intrinsics.j(url, "url");
            return v(HttpUrl.INSTANCE.c(e(url)));
        }

        public a u(URL url) {
            Intrinsics.j(url, "url");
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string = url.toString();
            Intrinsics.i(string, "toString(...)");
            return v(companion.c(string));
        }

        public a v(HttpUrl url) {
            Intrinsics.j(url, "url");
            this.url = url;
            return this;
        }

        public a(Request request) {
            Intrinsics.j(request, "request");
            this.tags = MapsKt.k();
            this.url = request.getUrl();
            this.method = request.getMethod();
            this.body = request.getBody();
            this.tags = request.c().isEmpty() ? MapsKt.k() : MapsKt.D(request.c());
            this.headers = request.getHeaders().k();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }
    }

    public Request(a builder) {
        Intrinsics.j(builder, "builder");
        HttpUrl url = builder.getUrl();
        if (url == null) {
            throw new IllegalStateException("url == null");
        }
        this.url = url;
        this.method = builder.getMethod();
        this.headers = builder.getHeaders().f();
        this.body = builder.getBody();
        this.cacheUrlOverride = builder.getCacheUrlOverride();
        this.tags = MapsKt.A(builder.k());
    }

    @JvmName
    public final c a() {
        c cVar = this.lazyCacheControl;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.INSTANCE.a(this.headers);
        this.lazyCacheControl = cVarA;
        return cVarA;
    }

    @JvmName
    /* renamed from: b, reason: from getter */
    public final HttpUrl getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    @JvmName
    /* renamed from: body, reason: from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    public final Map<KClass<?>, Object> c() {
        return this.tags;
    }

    public final String d(String name) {
        Intrinsics.j(name, "name");
        return this.headers.get(name);
    }

    @JvmName
    /* renamed from: e, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    public final boolean f() {
        return this.url.j();
    }

    public final a g() {
        return new a(this);
    }

    public final <T> T h(Class<? extends T> type) {
        Intrinsics.j(type, "type");
        return (T) i(JvmClassMappingKt.e(type));
    }

    public final List<String> headers(String name) {
        Intrinsics.j(name, "name");
        return this.headers.q(name);
    }

    public final <T> T i(KClass<T> type) {
        Intrinsics.j(type, "type");
        return (T) JvmClassMappingKt.b(type).cast(this.tags.get(type));
    }

    @JvmName
    /* renamed from: method, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strA = pair2.a();
                String strB = pair2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strA);
                sb2.append(':');
                if (Rv.h.y(strA)) {
                    strB = "██";
                }
                sb2.append(strB);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        return sb2.toString();
    }

    @JvmName
    /* renamed from: url, reason: from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, (i10 & 2) != 0 ? Headers.INSTANCE.b(new String[0]) : headers, (i10 & 4) != 0 ? WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR : str, (i10 & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Request(HttpUrl url, Headers headers, String method, RequestBody requestBody) {
        Intrinsics.j(url, "url");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(method, "method");
        a aVarN = new a().v(url).n(headers);
        if (Intrinsics.e(method, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            if (requestBody != null) {
                method = "POST";
            } else {
                method = "GET";
            }
        }
        this(aVarN.o(method, requestBody));
    }
}
