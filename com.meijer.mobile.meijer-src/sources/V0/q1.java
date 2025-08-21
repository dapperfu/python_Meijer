package V0;

import androidx.compose.ui.geometry.Rect;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 E2\u00020\u0001:\u0002E.J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0012J/\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J?\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001dJ!\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b)\u0010*J$\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0005H&¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00101J\u001a\u00104\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020!H&¢\u0006\u0004\b6\u00107J*\u0010=\u001a\u00020<2\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:H&ø\u0001\u0000¢\u0006\u0004\b=\u0010>R\"\u0010D\u001a\u00020?8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020<8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010Fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006IÀ\u0006\u0003"}, d2 = {"LV0/q1;", "", "", "x", "y", "", "r", "(FF)V", "dx", "dy", "c", "u", "t", "x1", "y1", "x2", "y2", "e", "(FFFF)V", "h", "dx1", "dy1", "dx2", "dy2", "f", "m", "x3", "y3", "s", "(FFFFFF)V", "dx3", "dy3", "d", "Landroidx/compose/ui/geometry/Rect;", "rect", "LV0/q1$b;", "direction", "l", "(Landroidx/compose/ui/geometry/Rect;LV0/q1$b;)V", "LU0/i;", "roundRect", "i", "(LU0/i;LV0/q1$b;)V", "path", "LU0/f;", "offset", "b", "(LV0/q1;J)V", "close", "()V", "reset", "v", "k", "(J)V", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "path1", "path2", "LV0/u1;", "operation", "", "q", "(LV0/q1;LV0/q1;I)Z", "LV0/s1;", "o", "()I", "g", "(I)V", "fillType", "a", "()Z", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface q1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f39390a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LV0/q1$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39391a = new b("CounterClockwise", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f39392b = new b("Clockwise", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f39393c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f39394d;

        static {
            b[] bVarArrA = a();
            f39393c = bVarArrA;
            f39394d = EnumEntriesKt.a(bVarArrA);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f39391a, f39392b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f39393c.clone();
        }

        private b(String str, int i10) {
        }
    }

    boolean a();

    void b(q1 path, long offset);

    void c(float dx, float dy);

    void close();

    void d(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    @Deprecated
    void e(float x12, float y12, float x22, float y22);

    @Deprecated
    void f(float dx1, float dy1, float dx2, float dy2);

    void g(int i10);

    Rect getBounds();

    void i(U0.i roundRect, b direction);

    boolean isEmpty();

    void k(long offset);

    void l(Rect rect, b direction);

    int o();

    boolean q(q1 path1, q1 path2, int operation);

    void r(float x10, float y10);

    void reset();

    void s(float x12, float y12, float x22, float y22, float x32, float y32);

    void t(float dx, float dy);

    void u(float x10, float y10);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LV0/q1$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: V0.q1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f39390a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ void j(q1 q1Var, q1 q1Var2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = U0.f.INSTANCE.c();
        }
        q1Var.b(q1Var2, j10);
    }

    static /* synthetic */ void n(q1 q1Var, Rect rect, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.f39391a;
        }
        q1Var.l(rect, bVar);
    }

    static /* synthetic */ void p(q1 q1Var, U0.i iVar, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.f39391a;
        }
        q1Var.i(iVar, bVar);
    }

    default void h(float x12, float y12, float x22, float y22) {
        e(x12, y12, x22, y22);
    }

    default void m(float dx1, float dy1, float dx2, float dy2) {
        f(dx1, dy1, dx2, dy2);
    }

    default void v() {
        reset();
    }
}
