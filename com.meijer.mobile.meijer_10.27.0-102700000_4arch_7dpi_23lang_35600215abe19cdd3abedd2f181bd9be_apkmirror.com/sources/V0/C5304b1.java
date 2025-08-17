package V0;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"LV0/b1;", "", "", "value", "c", "(I)I", "", "f", "(I)Ljava/lang/String;", "e", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: V0.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5304b1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f36440b = c(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f36441c = c(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f36442d = c(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f36443e = c(3);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"LV0/b1$a;", "", "<init>", "()V", "LV0/b1;", "None", "I", "b", "()I", "Low", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: V0.b1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return C5304b1.f36441c;
        }

        public final int b() {
            return C5304b1.f36440b;
        }
    }

    public static int c(int i10) {
        return i10;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static String f(int i10) {
        return d(i10, f36440b) ? "None" : d(i10, f36441c) ? "Low" : d(i10, f36442d) ? "Medium" : d(i10, f36443e) ? "High" : "Unknown";
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }
}
