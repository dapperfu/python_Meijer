package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u0000 (2\u00020\u0001:\u0002\u0016\u001aBs\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058G¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028G¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00058G¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028G¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028G¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010'\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lokhttp3/c;", "", "", "noCache", "noStore", "", "maxAgeSeconds", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Z", "i", "()Z", "b", "j", "c", "I", "e", "()I", "d", "m", "f", "g", "h", "l", "k", "Ljava/lang/String;", "n", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final c f154196o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final c f154197p;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean noStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxAgeSeconds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int sMaxAgeSeconds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrivate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPublic;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean mustRevalidate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxStaleSeconds;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minFreshSeconds;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean onlyIfCached;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean noTransform;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean immutable;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String headerValue;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010 \u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010&\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010)\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\"\u0010,\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R\"\u0010.\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b-\u0010\u0014¨\u0006/"}, d2 = {"Lokhttp3/c$a;", "", "<init>", "()V", "k", "()Lokhttp3/c$a;", "l", "m", "Lkotlin/time/Duration;", "maxStale", "j", "(J)Lokhttp3/c$a;", "Lokhttp3/c;", "a", "()Lokhttp3/c;", "", "Z", "f", "()Z", "n", "(Z)V", "noCache", "b", "g", "o", "noStore", "", "c", "I", "()I", "setMaxAgeSeconds$okhttp", "(I)V", "maxAgeSeconds", "d", "setMaxStaleSeconds$okhttp", "maxStaleSeconds", "e", "setMinFreshSeconds$okhttp", "minFreshSeconds", "i", "p", "onlyIfCached", "h", "setNoTransform$okhttp", "noTransform", "setImmutable$okhttp", "immutable", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean noCache;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean noStore;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int maxAgeSeconds = -1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int maxStaleSeconds = -1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int minFreshSeconds = -1;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean onlyIfCached;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean noTransform;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean immutable;

        /* renamed from: b, reason: from getter */
        public final boolean getImmutable() {
            return this.immutable;
        }

        /* renamed from: c, reason: from getter */
        public final int getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        /* renamed from: d, reason: from getter */
        public final int getMaxStaleSeconds() {
            return this.maxStaleSeconds;
        }

        /* renamed from: e, reason: from getter */
        public final int getMinFreshSeconds() {
            return this.minFreshSeconds;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getNoCache() {
            return this.noCache;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getNoStore() {
            return this.noStore;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getNoTransform() {
            return this.noTransform;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getOnlyIfCached() {
            return this.onlyIfCached;
        }

        public final void n(boolean z10) {
            this.noCache = z10;
        }

        public final void o(boolean z10) {
            this.noStore = z10;
        }

        public final void p(boolean z10) {
            this.onlyIfCached = z10;
        }

        public final c a() {
            return Rv.d.a(this);
        }

        public final a j(long maxStale) {
            long jI = Duration.I(maxStale);
            if (jI >= 0) {
                this.maxStaleSeconds = Rv.d.b(jI);
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + jI).toString());
        }

        public final a k() {
            return Rv.d.e(this);
        }

        public final a l() {
            return Rv.d.f(this);
        }

        public final a m() {
            return Rv.d.g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lokhttp3/c$b;", "", "<init>", "()V", "Lokhttp3/Headers;", "headers", "Lokhttp3/c;", "a", "(Lokhttp3/Headers;)Lokhttp3/c;", "FORCE_NETWORK", "Lokhttp3/c;", "FORCE_CACHE", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final c a(Headers headers) {
            Intrinsics.j(headers, "headers");
            return Rv.d.h(this, headers);
        }
    }

    public c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f154196o = Rv.d.d(companion);
        f154197p = Rv.d.c(companion);
    }

    /* renamed from: a, reason: from getter */
    public final String getHeaderValue() {
        return this.headerValue;
    }

    @JvmName
    /* renamed from: b, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    @JvmName
    /* renamed from: e, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @JvmName
    /* renamed from: f, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @JvmName
    /* renamed from: g, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @JvmName
    /* renamed from: h, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @JvmName
    /* renamed from: i, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @JvmName
    /* renamed from: j, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @JvmName
    /* renamed from: k, reason: from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @JvmName
    /* renamed from: l, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @JvmName
    /* renamed from: m, reason: from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final void n(String str) {
        this.headerValue = str;
    }

    public String toString() {
        return Rv.d.i(this);
    }
}
