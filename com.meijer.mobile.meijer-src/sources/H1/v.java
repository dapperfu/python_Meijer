package H1;

import H1.x;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0005R\u0017\u0010\u0018\u001a\u00020\u00168Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"LH1/v;", "", "", "packedValue", "c", "(J)J", "", "j", "(J)Ljava/lang/String;", "", "i", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "f", "getRawType$annotations", "()V", "rawType", "LH1/x;", "g", "type", "", "h", "(J)F", "value", "b", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final x[] f13344c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f13345d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"LH1/v$a;", "", "<init>", "()V", "LH1/v;", "Unspecified", "J", "a", "()J", "getUnspecified-XSAIIZE$annotations", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H1.v$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a() {
            return v.f13345d;
        }
    }

    public static long c(long j10) {
        return j10;
    }

    static {
        x.Companion companion = x.INSTANCE;
        f13344c = new x[]{x.d(companion.c()), x.d(companion.b()), x.d(companion.a())};
        f13345d = w.k(0L, Float.NaN);
    }

    public static final /* synthetic */ v b(long j10) {
        return new v(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof v) && j10 == ((v) obj).getPackedValue();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final long g(long j10) {
        return f13344c[(int) (f(j10) >>> 32)].getType();
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    public int hashCode() {
        return i(this.packedValue);
    }

    /* renamed from: k, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return j(this.packedValue);
    }

    private /* synthetic */ v(long j10) {
        this.packedValue = j10;
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        long jG = g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.c())) {
            return "Unspecified";
        }
        if (x.g(jG, companion.b())) {
            return h(j10) + ".sp";
        }
        if (x.g(jG, companion.a())) {
            return h(j10) + ".em";
        }
        return "Invalid";
    }

    public static final long f(long j10) {
        return j10 & 1095216660480L;
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }
}
