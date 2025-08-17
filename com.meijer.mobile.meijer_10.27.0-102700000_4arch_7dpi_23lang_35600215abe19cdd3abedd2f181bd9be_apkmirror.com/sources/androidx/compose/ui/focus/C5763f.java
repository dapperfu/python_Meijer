package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/f;", "", "", "value", "j", "(I)I", "", "n", "(I)Ljava/lang/String;", "m", "other", "", "k", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: androidx.compose.ui.focus.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5763f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f50650c = j(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f50651d = j(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f50652e = j(3);

    /* renamed from: f, reason: collision with root package name */
    private static final int f50653f = j(4);

    /* renamed from: g, reason: collision with root package name */
    private static final int f50654g = j(5);

    /* renamed from: h, reason: collision with root package name */
    private static final int f50655h = j(6);

    /* renamed from: i, reason: collision with root package name */
    private static final int f50656i = j(7);

    /* renamed from: j, reason: collision with root package name */
    private static final int f50657j = j(8);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/f;", "Next", "I", "e", "()I", "Previous", "f", "Left", "d", "Right", "g", "Up", "h", "Down", "a", "Enter", "b", "Exit", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return C5763f.f50655h;
        }

        public final int b() {
            return C5763f.f50656i;
        }

        public final int c() {
            return C5763f.f50657j;
        }

        public final int d() {
            return C5763f.f50652e;
        }

        public final int e() {
            return C5763f.f50650c;
        }

        public final int f() {
            return C5763f.f50651d;
        }

        public final int g() {
            return C5763f.f50653f;
        }

        public final int h() {
            return C5763f.f50654g;
        }
    }

    public static final /* synthetic */ C5763f i(int i10) {
        return new C5763f(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof C5763f) && i10 == ((C5763f) obj).getValue();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public boolean equals(Object obj) {
        return k(this.value, obj);
    }

    public int hashCode() {
        return m(this.value);
    }

    /* renamed from: o, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public static String n(int i10) {
        return l(i10, f50650c) ? "Next" : l(i10, f50651d) ? "Previous" : l(i10, f50652e) ? "Left" : l(i10, f50653f) ? "Right" : l(i10, f50654g) ? "Up" : l(i10, f50655h) ? "Down" : l(i10, f50656i) ? "Enter" : l(i10, f50657j) ? "Exit" : "Invalid FocusDirection";
    }

    public String toString() {
        return n(this.value);
    }

    private /* synthetic */ C5763f(int i10) {
        this.value = i10;
    }
}
