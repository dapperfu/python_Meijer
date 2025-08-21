package X0;

import V0.InterfaceC5459f1;
import V0.o1;
import V0.q1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\"\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J*\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010.JG\u00101\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102J*\u00105\u001a\u00020\u00042\u0006\u00103\u001a\u00020(2\u0006\u00104\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106JO\u0010;\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u0010:\u001a\u0002092\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010>J*\u0010B\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJB\u0010J\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020F2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ0\u0010P\u001a\u00020\u00042\u0006\u0010M\u001a\u00020L2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020(0N2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010\u0003J\u000f\u0010S\u001a\u00020\u0004H\u0016¢\u0006\u0004\bS\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006T"}, d2 = {"LX0/i;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "save", "i", "Landroidx/compose/ui/geometry/Rect;", "bounds", "LV0/o1;", "paint", "q", "(Landroidx/compose/ui/geometry/Rect;LV0/o1;)V", "", "dx", "dy", "d", "(FF)V", "sx", "sy", "a", "degrees", "p", "(F)V", "LV0/k1;", "matrix", "u", "([F)V", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/b;", "clipOp", "c", "(FFFFI)V", "LV0/q1;", "path", "e", "(LV0/q1;I)V", "LU0/f;", "p1", "p2", "o", "(JJLV0/o1;)V", "f", "(FFFFLV0/o1;)V", "radiusX", "radiusY", "n", "(FFFFFFLV0/o1;)V", "center", "radius", "w", "(JFLV0/o1;)V", "startAngle", "sweepAngle", "", "useCenter", "g", "(FFFFFFZLV0/o1;)V", "s", "(LV0/q1;LV0/o1;)V", "LV0/f1;", "image", "topLeftOffset", "k", "(LV0/f1;JLV0/o1;)V", "LH1/n;", "srcOffset", "LH1/r;", "srcSize", "dstOffset", "dstSize", "h", "(LV0/f1;JJJJLV0/o1;)V", "Landroidx/compose/ui/graphics/f;", "pointMode", "", "points", "b", "(ILjava/util/List;LV0/o1;)V", "l", "t", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i implements Canvas {

    /* renamed from: a, reason: collision with root package name */
    public static final i f41493a = new i();

    @Override // androidx.compose.ui.graphics.Canvas
    public void a(float sx, float sy) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void b(int pointMode, List<U0.f> points, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void c(float left, float top, float right, float bottom, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void d(float dx, float dy) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void e(q1 path, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void f(float left, float top, float right, float bottom, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void g(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void h(InterfaceC5459f1 image, long srcOffset, long srcSize, long dstOffset, long dstSize, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void i() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void k(InterfaceC5459f1 image, long topLeftOffset, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void l() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void n(float left, float top, float right, float bottom, float radiusX, float radiusY, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void o(long p12, long p22, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void p(float degrees) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void q(Rect bounds, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void s(q1 path, o1 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void t() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void u(float[] matrix) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void w(long center, float radius, o1 paint) {
        throw new UnsupportedOperationException();
    }

    private i() {
    }
}
