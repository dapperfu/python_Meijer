package androidx.compose.ui.graphics;

import V0.InterfaceC5459f1;
import V0.o1;
import V0.q1;
import androidx.compose.ui.geometry.Rect;
import com.fullstory.instrumentation.frameworks.compose.FSComposeCanvas;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J$\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J*\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J7\u0010/\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b/\u00100JG\u00103\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b3\u00104J*\u00107\u001a\u00020\u00022\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b7\u00108JO\u0010=\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010<\u001a\u00020;2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b?\u0010@J*\u0010D\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bD\u0010EJJ\u0010L\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020F2\b\b\u0002\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ0\u0010R\u001a\u00020\u00022\u0006\u0010O\u001a\u00020N2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020*0P2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0002H&¢\u0006\u0004\bT\u0010\u0004J\u000f\u0010U\u001a\u00020\u0002H&¢\u0006\u0004\bU\u0010\u0004ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006VÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "", "save", "()V", "i", "Landroidx/compose/ui/geometry/Rect;", "bounds", "LV0/o1;", "paint", "q", "(Landroidx/compose/ui/geometry/Rect;LV0/o1;)V", "", "dx", "dy", "d", "(FF)V", "sx", "sy", "a", "degrees", "p", "(F)V", "LV0/k1;", "matrix", "u", "([F)V", "rect", "Landroidx/compose/ui/graphics/b;", "clipOp", "v", "(Landroidx/compose/ui/geometry/Rect;I)V", "left", "top", "right", "bottom", "c", "(FFFFI)V", "LV0/q1;", "path", "e", "(LV0/q1;I)V", "LU0/f;", "p1", "p2", "o", "(JJLV0/o1;)V", "f", "(FFFFLV0/o1;)V", "radiusX", "radiusY", "n", "(FFFFFFLV0/o1;)V", "center", "radius", "w", "(JFLV0/o1;)V", "startAngle", "sweepAngle", "", "useCenter", "g", "(FFFFFFZLV0/o1;)V", "s", "(LV0/q1;LV0/o1;)V", "LV0/f1;", "image", "topLeftOffset", "k", "(LV0/f1;JLV0/o1;)V", "LH1/n;", "srcOffset", "LH1/r;", "srcSize", "dstOffset", "dstSize", "h", "(LV0/f1;JJJJLV0/o1;)V", "Landroidx/compose/ui/graphics/f;", "pointMode", "", "points", "b", "(ILjava/util/List;LV0/o1;)V", "l", "t", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface Canvas extends FSComposeCanvas {
    void a(float sx, float sy);

    void b(int pointMode, List<U0.f> points, o1 paint);

    void c(float left, float top, float right, float bottom, int clipOp);

    void d(float dx, float dy);

    void e(q1 path, int clipOp);

    void f(float left, float top, float right, float bottom, o1 paint);

    void g(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, o1 paint);

    void h(InterfaceC5459f1 image, long srcOffset, long srcSize, long dstOffset, long dstSize, o1 paint);

    void i();

    void k(InterfaceC5459f1 image, long topLeftOffset, o1 paint);

    void l();

    void n(float left, float top, float right, float bottom, float radiusX, float radiusY, o1 paint);

    void o(long p12, long p22, o1 paint);

    void p(float degrees);

    void q(Rect bounds, o1 paint);

    void s(q1 path, o1 paint);

    void save();

    void t();

    void u(float[] matrix);

    void w(long center, float radius, o1 paint);

    static /* synthetic */ void j(Canvas canvas, q1 q1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = b.INSTANCE.b();
        }
        canvas.e(q1Var, i10);
    }

    static /* synthetic */ void m(Canvas canvas, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = b.INSTANCE.b();
        }
        canvas.c(f10, f11, f12, f13, i10);
    }

    static /* synthetic */ void r(Canvas canvas, Rect rect, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = b.INSTANCE.b();
        }
        canvas.v(rect, i10);
    }

    default void v(Rect rect, int clipOp) {
        c(rect.getLeft(), rect.getTop(), rect.l(), rect.i(), clipOp);
    }
}
