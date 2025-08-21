package kotlin;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Lc0/t;", "", "", "value", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", "d", "a", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: c0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6463t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f61056b = b(5);

    /* renamed from: c, reason: collision with root package name */
    private static final int f61057c = b(4);

    /* renamed from: d, reason: collision with root package name */
    private static final int f61058d = b(0);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lc0/t$a;", "", "<init>", "()V", "Lc0/t;", "ArcLinear", "I", "a", "()I", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c0.t$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return C6463t.f61058d;
        }
    }

    public static int b(int i10) {
        return i10;
    }

    public static final boolean c(int i10, int i11) {
        return i10 == i11;
    }

    public static String e(int i10) {
        return "ArcMode(value=" + i10 + ')';
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }
}
