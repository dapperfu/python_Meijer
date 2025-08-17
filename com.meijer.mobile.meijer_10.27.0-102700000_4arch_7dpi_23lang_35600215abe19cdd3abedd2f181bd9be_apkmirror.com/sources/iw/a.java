package iw;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.j;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0003\u0012\u000b\u000eB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#R*\u0010\u0015\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00148\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b\u0015\u0010*¨\u0006+"}, d2 = {"Liw/a;", "Lokhttp3/Interceptor;", "Liw/a$c;", "logger", "<init>", "(Liw/a$c;)V", "Lokhttp3/Headers;", "headers", "", "i", "", "c", "(Lokhttp3/Headers;I)V", "", "a", "(Lokhttp3/Headers;)Z", "Lokhttp3/Response;", "response", "b", "(Lokhttp3/Response;)Z", "Liw/a$b;", "level", "e", "(Liw/a$b;)Liw/a;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "url", "", "d", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Liw/a$c;", "", "Ljava/util/Set;", "headersToRedact", "queryParamsNameToRedact", "value", "Liw/a$b;", "getLevel", "()Liw/a$b;", "(Liw/a$b;)V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c logger;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Set<String> headersToRedact;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile Set<String> queryParamsNameToRedact;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile b level;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Liw/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f138528a = new b("NONE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f138529b = new b("BASIC", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f138530c = new b("HEADERS", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f138531d = new b("BODY", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f138532e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f138533f;

        static {
            b[] bVarArrA = a();
            f138532e = bVarArrA;
            f138533f = EnumEntriesKt.a(bVarArrA);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f138528a, f138529b, f138530c, f138531d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f138532e.clone();
        }

        private b(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Liw/a$c;", "", "", "message", "", "a", "(Ljava/lang/String;)V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f138536a;

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public static final c f138535b = new Companion.C2195a();

        void a(String message);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Liw/a$c$a;", "", "<init>", "()V", "Liw/a$c;", "DEFAULT", "Liw/a$c;", "a", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: iw.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f138536a = new Companion();

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liw/a$c$a$a;", "Liw/a$c;", "<init>", "()V", "", "message", "", "a", "(Ljava/lang/String;)V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
            /* renamed from: iw.a$c$a$a, reason: collision with other inner class name */
            private static final class C2195a implements c {
                @Override // iw.a.c
                public void a(String message) {
                    Intrinsics.j(message, "message");
                    okhttp3.internal.platform.c.l(okhttp3.internal.platform.c.INSTANCE.e(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public a(c logger) {
        Intrinsics.j(logger, "logger");
        this.logger = logger;
        this.headersToRedact = SetsKt.e();
        this.queryParamsNameToRedact = SetsKt.e();
        this.level = b.f138528a;
    }

    private final boolean a(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || StringsKt.H(str, "identity", true) || StringsKt.H(str, "gzip", true)) ? false : true;
    }

    private final void c(Headers headers, int i10) {
        String strP = this.headersToRedact.contains(headers.h(i10)) ? "██" : headers.p(i10);
        this.logger.a(headers.h(i10) + ": " + strP);
    }

    public final String d(HttpUrl url) {
        Intrinsics.j(url, "url");
        if (this.queryParamsNameToRedact.isEmpty() || url.u() == 0) {
            return url.getUrl();
        }
        HttpUrl.a aVarX = url.k().x(null);
        int iU = url.u();
        for (int i10 = 0; i10 < iU; i10++) {
            String strQ = url.q(i10);
            aVarX.b(strQ, this.queryParamsNameToRedact.contains(strQ) ? "██" : url.s(i10));
        }
        return aVarX.toString();
    }

    public final a e(b level) {
        Intrinsics.j(level, "level");
        this.level = level;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010b A[LOOP:0: B:42:0x0109->B:43:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iw.a.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private final boolean b(Response response) {
        j f154149a = response.getBody().getF154149a();
        if (f154149a != null && Intrinsics.e(f154149a.getType(), "text") && Intrinsics.e(f154149a.getSubtype(), "event-stream")) {
            return true;
        }
        return false;
    }

    public /* synthetic */ a(c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? c.f138535b : cVar);
    }
}
