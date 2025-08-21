package H1;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"LH1/x;", "", "", "type", "e", "(J)J", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "b", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f13348c = e(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f13349d = e(4294967296L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f13350e = e(8589934592L);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"LH1/x$a;", "", "<init>", "()V", "LH1/x;", "Unspecified", "J", "c", "()J", "Sp", "b", "Em", "a", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H1.x$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a() {
            return x.f13350e;
        }

        public final long b() {
            return x.f13349d;
        }

        public final long c() {
            return x.f13348c;
        }
    }

    public static long e(long j10) {
        return j10;
    }

    public static final /* synthetic */ x d(long j10) {
        return new x(j10);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).getType();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static String i(long j10) {
        return g(j10, f13348c) ? "Unspecified" : g(j10, f13349d) ? "Sp" : g(j10, f13350e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.type, obj);
    }

    public int hashCode() {
        return h(this.type);
    }

    /* renamed from: j, reason: from getter */
    public final /* synthetic */ long getType() {
        return this.type;
    }

    public String toString() {
        return i(this.type);
    }

    private /* synthetic */ x(long j10) {
        this.type = j10;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }
}
