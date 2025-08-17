package H1;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u00020\u00148FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u00020\u00148FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"LH1/k;", "", "", "packedValue", "d", "(J)J", "", "j", "(J)Ljava/lang/String;", "", "i", "(J)I", "other", "", "e", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "LH1/h;", "h", "(J)F", "getWidth-D9Ej5fM$annotations", "width", "g", "getHeight-D9Ej5fM$annotations", "height", "b", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f11990c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f11991d = d(9205357640488583168L);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"LH1/k$a;", "", "<init>", "()V", "LH1/k;", "Zero", "J", "b", "()J", "Unspecified", "a", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H1.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a() {
            return k.f11991d;
        }

        public final long b() {
            return k.f11990c;
        }
    }

    public static long d(long j10) {
        return j10;
    }

    public static final /* synthetic */ k c(long j10) {
        return new k(j10);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof k) && j10 == ((k) obj).getPackedValue();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float h(long j10) {
        return h.p(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public boolean equals(Object obj) {
        return e(this.packedValue, obj);
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

    private /* synthetic */ k(long j10) {
        this.packedValue = j10;
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static final float g(long j10) {
        return h.p(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static String j(long j10) {
        if (j10 != 9205357640488583168L) {
            return ((Object) h.z(h(j10))) + " x " + ((Object) h.z(g(j10)));
        }
        return "DpSize.Unspecified";
    }
}
