package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17334A;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087@\u0018\u0000 '2\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\"\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010&\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/text/y;", "", "", "packedValue", "c", "(J)J", "other", "", "p", "(JJ)Z", "d", "", "offset", "e", "(JI)Z", "", "q", "(J)Ljava/lang/String;", "o", "(J)I", "f", "(JLjava/lang/Object;)Z", "a", "J", "n", "start", "i", "end", "l", "min", "k", "max", "h", "(J)Z", "collapsed", "m", "reversed", "j", "length", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f52907c = C17334A.a(0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/y$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/y;", "Zero", "J", "a", "()J", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.y$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long a() {
            return y.f52907c;
        }
    }

    public static final /* synthetic */ y b(long j10) {
        return new y(j10);
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof y) && j10 == ((y) obj).getPackedValue();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public boolean equals(Object obj) {
        return f(this.packedValue, obj);
    }

    public int hashCode() {
        return o(this.packedValue);
    }

    /* renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public static String q(long j10) {
        return "TextRange(" + n(j10) + ", " + i(j10) + ')';
    }

    public String toString() {
        return q(this.packedValue);
    }

    private /* synthetic */ y(long j10) {
        this.packedValue = j10;
    }

    public static final boolean d(long j10, long j11) {
        boolean z10;
        boolean z11 = false;
        if (l(j10) <= l(j11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (k(j11) <= k(j10)) {
            z11 = true;
        }
        return z10 & z11;
    }

    public static final boolean e(long j10, int i10) {
        int iL = l(j10);
        if (i10 >= k(j10) || iL > i10) {
            return false;
        }
        return true;
    }

    public static final boolean h(long j10) {
        if (n(j10) == i(j10)) {
            return true;
        }
        return false;
    }

    public static final int j(long j10) {
        return k(j10) - l(j10);
    }

    public static final int k(long j10) {
        return Math.max(n(j10), i(j10));
    }

    public static final int l(long j10) {
        return Math.min(n(j10), i(j10));
    }

    public static final boolean m(long j10) {
        if (n(j10) > i(j10)) {
            return true;
        }
        return false;
    }

    public static final boolean p(long j10, long j11) {
        boolean z10;
        boolean z11 = false;
        if (l(j10) < k(j11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (l(j11) < k(j10)) {
            z11 = true;
        }
        return z10 & z11;
    }
}
