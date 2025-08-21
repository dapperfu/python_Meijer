package okhttp3;

import fsimpl.C14170dq;
import gw.C14416e;
import gw.C14419h;
import gw.InterfaceC14417f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okhttp3.j;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0003\u001e\u001b\u0010B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u0005\u0010\u0015R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068G¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\b\u0010 R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010%¨\u0006("}, d2 = {"Lokhttp3/k;", "Lokhttp3/RequestBody;", "Lgw/h;", "boundaryByteString", "Lokhttp3/j;", "type", "", "Lokhttp3/k$c;", "parts", "<init>", "(Lgw/h;Lokhttp3/j;Ljava/util/List;)V", "Lgw/f;", "sink", "", "countBytes", "", "b", "(Lgw/f;Z)J", "isOneShot", "()Z", "contentType", "()Lokhttp3/j;", "contentLength", "()J", "", "writeTo", "(Lgw/f;)V", "a", "Lgw/h;", "Lokhttp3/j;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "J", "", "()Ljava/lang/String;", "boundary", "f", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class k extends RequestBody {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final j f154710g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final j f154711h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final j f154712i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final j f154713j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final j f154714k;

    /* renamed from: l, reason: collision with root package name */
    private static final byte[] f154715l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f154716m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f154717n;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14419h boundaryByteString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<c> parts;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j contentType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long contentLength;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"¨\u0006$"}, d2 = {"Lokhttp3/k$a;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/j;", "type", "f", "(Lokhttp3/j;)Lokhttp3/k$a;", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "c", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/k$a;", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/k$a;", "filename", "b", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/k$a;", "Lokhttp3/k$c;", "part", "d", "(Lokhttp3/k$c;)Lokhttp3/k$a;", "Lokhttp3/k;", "e", "()Lokhttp3/k;", "Lgw/h;", "Lgw/h;", "Lokhttp3/j;", "", "Ljava/util/List;", "parts", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C14419h boundary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private j type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<c> parts;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @JvmOverloads
        public a(String boundary) {
            Intrinsics.j(boundary, "boundary");
            this.boundary = C14419h.INSTANCE.d(boundary);
            this.type = k.f154710g;
            this.parts = new ArrayList();
        }

        public final a a(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            d(c.INSTANCE.b(name, value));
            return this;
        }

        public final a b(String name, String filename, RequestBody body) {
            Intrinsics.j(name, "name");
            Intrinsics.j(body, "body");
            d(c.INSTANCE.c(name, filename, body));
            return this;
        }

        public final a c(Headers headers, RequestBody body) {
            Intrinsics.j(body, "body");
            d(c.INSTANCE.a(headers, body));
            return this;
        }

        public final a d(c part) {
            Intrinsics.j(part, "part");
            this.parts.add(part);
            return this;
        }

        public final k e() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new k(this.boundary, this.type, Nv.k.x(this.parts));
        }

        public final a f(j type) {
            Intrinsics.j(type, "type");
            if (Intrinsics.e(type.getType(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.i(str, "toString(...)");
            }
            this(str);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/k$b;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/j;", "MIXED", "Lokhttp3/j;", "ALTERNATIVE", "DIGEST", "PARALLEL", "FORM", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.k$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void a(StringBuilder sb2, String key) {
            Intrinsics.j(sb2, "<this>");
            Intrinsics.j(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt != '\"') {
                    sb2.append(cCharAt);
                } else {
                    sb2.append("%22");
                }
            }
            sb2.append('\"');
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028G¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lokhttp3/k$c;", "", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "a", "Lokhttp3/Headers;", "b", "()Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "()Lokhttp3/RequestBody;", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Headers headers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final RequestBody body;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/k$c$a;", "", "<init>", "()V", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "Lokhttp3/k$c;", "a", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/k$c;", "", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/k$c;", "filename", "c", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/k$c;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: okhttp3.k$c$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final c a(Headers headers, RequestBody body) {
                Intrinsics.j(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((headers != null ? headers.get("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers != null ? headers.get("Content-Length") : null) == null) {
                    return new c(headers, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            @JvmStatic
            public final c b(String name, String value) {
                Intrinsics.j(name, "name");
                Intrinsics.j(value, "value");
                return c(name, null, RequestBody.Companion.q(RequestBody.INSTANCE, value, null, 1, null));
            }

            @JvmStatic
            public final c c(String name, String filename, RequestBody body) {
                Intrinsics.j(name, "name");
                Intrinsics.j(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                Companion companion = k.INSTANCE;
                companion.a(sb2, name);
                if (filename != null) {
                    sb2.append("; filename=");
                    companion.a(sb2, filename);
                }
                return a(new Headers.a().e("Content-Disposition", sb2.toString()).f(), body);
            }
        }

        public /* synthetic */ c(Headers headers, RequestBody requestBody, DefaultConstructorMarker defaultConstructorMarker) {
            this(headers, requestBody);
        }

        private c(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        @JvmName
        /* renamed from: a, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @JvmName
        /* renamed from: b, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    static {
        j.Companion companion = j.INSTANCE;
        f154710g = companion.a("multipart/mixed");
        f154711h = companion.a("multipart/alternative");
        f154712i = companion.a("multipart/digest");
        f154713j = companion.a("multipart/parallel");
        f154714k = companion.a("multipart/form-data");
        f154715l = new byte[]{58, 32};
        f154716m = new byte[]{C14170dq.DARKEN, 10};
        f154717n = new byte[]{45, 45};
    }

    public k(C14419h boundaryByteString, j type, List<c> parts) {
        Intrinsics.j(boundaryByteString, "boundaryByteString");
        Intrinsics.j(type, "type");
        Intrinsics.j(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = j.INSTANCE.a(type + "; boundary=" + a());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long b(InterfaceC14417f sink, boolean countBytes) throws IOException {
        C14416e c14416e;
        if (countBytes) {
            sink = new C14416e();
            c14416e = sink;
        } else {
            c14416e = 0;
        }
        int size = this.parts.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.parts.get(i10);
            Headers headers = cVar.getHeaders();
            RequestBody body = cVar.getBody();
            Intrinsics.g(sink);
            sink.write(f154717n);
            sink.g1(this.boundaryByteString);
            sink.write(f154716m);
            if (headers != null) {
                int size2 = headers.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    sink.G0(headers.h(i11)).write(f154715l).G0(headers.p(i11)).write(f154716m);
                }
            }
            j contentType = body.getContentType();
            if (contentType != null) {
                sink.G0("Content-Type: ").G0(contentType.getMediaType()).write(f154716m);
            }
            long jContentLength = body.contentLength();
            if (jContentLength == -1 && countBytes) {
                Intrinsics.g(c14416e);
                c14416e.a();
                return -1L;
            }
            byte[] bArr = f154716m;
            sink.write(bArr);
            if (countBytes) {
                j10 += jContentLength;
            } else {
                body.writeTo(sink);
            }
            sink.write(bArr);
        }
        Intrinsics.g(sink);
        byte[] bArr2 = f154717n;
        sink.write(bArr2);
        sink.g1(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(f154716m);
        if (!countBytes) {
            return j10;
        }
        Intrinsics.g(c14416e);
        long size3 = j10 + c14416e.getSize();
        c14416e.a();
        return size3;
    }

    @JvmName
    public final String a() {
        return this.boundaryByteString.c0();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j10 = this.contentLength;
        if (j10 != -1) {
            return j10;
        }
        long jB = b(null, true);
        this.contentLength = jB;
        return jB;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public j getContentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        List<c> list = this.parts;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).getBody().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC14417f sink) throws IOException {
        Intrinsics.j(sink, "sink");
        b(sink, false);
    }
}
