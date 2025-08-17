package H1;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u00020\u00148FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\u00020\u00148FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"LH1/j;", "", "", "packedValue", "b", "(J)J", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "LH1/h;", "e", "(J)F", "getX-D9Ej5fM$annotations", "()V", "x", "f", "getY-D9Ej5fM$annotations", "y", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f11986c = b(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f11987d = b(9205357640488583168L);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH1/j$a;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H1.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static long b(long j10) {
        return j10;
    }

    public static final /* synthetic */ j a(long j10) {
        return new j(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof j) && j10 == ((j) obj).getPackedValue();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static final float e(long j10) {
        return h.p(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public boolean equals(Object obj) {
        return c(this.packedValue, obj);
    }

    public int hashCode() {
        return g(this.packedValue);
    }

    /* renamed from: i, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return h(this.packedValue);
    }

    private /* synthetic */ j(long j10) {
        this.packedValue = j10;
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static final float f(long j10) {
        return h.p(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static String h(long j10) {
        if (j10 != 9205357640488583168L) {
            return '(' + ((Object) h.z(e(j10))) + ", " + ((Object) h.z(f(j10))) + ')';
        }
        return "DpOffset.Unspecified";
    }
}
