package H1;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087@\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0010B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u000bR\u001b\u0010\u001a\u001a\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"LH1/r;", "", "", "packedValue", "c", "(J)J", "", "i", "(J)Ljava/lang/String;", "", "h", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "g", "getWidth$annotations", "()V", "width", "f", "getHeight$annotations", "height", "b", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f12004c = c(0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"LH1/r$a;", "", "<init>", "()V", "LH1/r;", "Zero", "J", "a", "()J", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H1.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a() {
            return r.f12004c;
        }
    }

    @PublishedApi
    public static long c(long j10) {
        return j10;
    }

    public static final /* synthetic */ r b(long j10) {
        return new r(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof r) && j10 == ((r) obj).getPackedValue();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static String i(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    public int hashCode() {
        return h(this.packedValue);
    }

    /* renamed from: j, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return i(this.packedValue);
    }

    @PublishedApi
    private /* synthetic */ r(long j10) {
        this.packedValue = j10;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }
}
