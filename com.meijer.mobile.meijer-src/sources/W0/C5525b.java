package W0;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"LW0/b;", "", "", "packedValue", "d", "(J)J", "", "h", "(J)Ljava/lang/String;", "", "g", "(J)I", "f", "getComponentCount$annotations", "()V", "componentCount", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: W0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5525b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f40544b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f40545c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f40546d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f40547e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"LW0/b$a;", "", "<init>", "()V", "LW0/b;", "Rgb", "J", "b", "()J", "Xyz", "c", "Lab", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: W0.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a() {
            return C5525b.f40546d;
        }

        public final long b() {
            return C5525b.f40544b;
        }

        public final long c() {
            return C5525b.f40545c;
        }
    }

    public static long d(long j10) {
        return j10;
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f40544b = d((0 & 4294967295L) | j11);
        f40545c = d((1 & 4294967295L) | j11);
        f40546d = d(j11 | (2 & 4294967295L));
        f40547e = d((j10 & 4294967295L) | (4 << 32));
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 >> 32);
    }

    public static String h(long j10) {
        return e(j10, f40544b) ? "Rgb" : e(j10, f40545c) ? "Xyz" : e(j10, f40546d) ? "Lab" : e(j10, f40547e) ? "Cmyk" : "Unknown";
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }
}
