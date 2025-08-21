package kotlin;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Ly1/u;", "", "", "value", "d", "(I)I", "", "g", "(I)Ljava/lang/String;", "f", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: y1.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18278u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f171173b = d(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f171174c = d(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f171175d = d(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Ly1/u$a;", "", "<init>", "()V", "Ly1/u;", "Blocking", "I", "b", "()I", "OptionalLocal", "c", "Async", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return C18278u.f171175d;
        }

        public final int b() {
            return C18278u.f171173b;
        }

        public final int c() {
            return C18278u.f171174c;
        }
    }

    private static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static String g(int i10) {
        if (e(i10, f171173b)) {
            return "Blocking";
        }
        if (e(i10, f171174c)) {
            return "Optional";
        }
        if (e(i10, f171175d)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }
}
