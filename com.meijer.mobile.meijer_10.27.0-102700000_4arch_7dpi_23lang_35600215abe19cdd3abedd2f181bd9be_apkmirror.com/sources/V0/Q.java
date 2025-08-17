package V0;

import V0.q1;
import V0.u1;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0019J/\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0019J?\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$J?\u0010'\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010$J\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010/J\"\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00012\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00106J\u001a\u00109\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J*\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010@\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010NR*\u0010V\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010Z\u001a\u00020A8VX\u0096\u0004¢\u0006\f\u0012\u0004\bY\u00106\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"LV0/Q;", "LV0/q1;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "x", "(Landroidx/compose/ui/geometry/Rect;)V", "", "y", "r", "(FF)V", "dx", "dy", "c", "u", "t", "x1", "y1", "x2", "y2", "e", "(FFFF)V", "h", "dx1", "dy1", "dx2", "dy2", "f", "m", "x3", "y3", "s", "(FFFFFF)V", "dx3", "dy3", "d", "LV0/q1$b;", "direction", "l", "(Landroidx/compose/ui/geometry/Rect;LV0/q1$b;)V", "LU0/i;", "roundRect", "i", "(LU0/i;LV0/q1$b;)V", "path", "LU0/f;", "offset", "b", "(LV0/q1;J)V", "close", "()V", "reset", "v", "k", "(J)V", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "path1", "path2", "LV0/u1;", "operation", "", "q", "(LV0/q1;LV0/q1;I)Z", "Landroid/graphics/Path;", "w", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mMatrix", "LV0/s1;", "value", "o", "()I", "g", "(I)V", "fillType", "a", "()Z", "isConvex$annotations", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Q implements q1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Path internalPath;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private RectF rectF;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float[] radii;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Matrix mMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public Q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Q(Path path) {
        this.internalPath = path;
    }

    @Override // V0.q1
    public boolean a() {
        return this.internalPath.isConvex();
    }

    @Override // V0.q1
    public void b(q1 path, long offset) {
        Path path2 = this.internalPath;
        if (!(path instanceof Q)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((Q) path).getInternalPath(), Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
    }

    @Override // V0.q1
    public void c(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // V0.q1
    public void close() {
        this.internalPath.close();
    }

    @Override // V0.q1
    public void d(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // V0.q1
    public void e(float x12, float y12, float x22, float y22) {
        this.internalPath.quadTo(x12, y12, x22, y22);
    }

    @Override // V0.q1
    public void f(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // V0.q1
    public void g(int i10) {
        this.internalPath.setFillType(s1.d(i10, s1.INSTANCE.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // V0.q1
    public Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.g(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // V0.q1
    public void h(float x12, float y12, float x22, float y22) {
        this.internalPath.quadTo(x12, y12, x22, y22);
    }

    @Override // V0.q1
    public void i(U0.i roundRect, q1.b direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.g(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        Intrinsics.g(fArr);
        fArr[0] = Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() & 4294967295L));
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.g(rectF2);
        float[] fArr2 = this.radii;
        Intrinsics.g(fArr2);
        path.addRoundRect(rectF2, fArr2, W.e(direction));
    }

    @Override // V0.q1
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // V0.q1
    public void k(long offset) {
        Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new Matrix();
        } else {
            Intrinsics.g(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.mMatrix;
        Intrinsics.g(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
        Path path = this.internalPath;
        Matrix matrix3 = this.mMatrix;
        Intrinsics.g(matrix3);
        path.transform(matrix3);
    }

    @Override // V0.q1
    public void m(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // V0.q1
    public int o() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? s1.INSTANCE.a() : s1.INSTANCE.b();
    }

    @Override // V0.q1
    public boolean q(q1 path1, q1 path2, int operation) {
        u1.Companion companion = u1.INSTANCE;
        Path.Op op2 = u1.f(operation, companion.a()) ? Path.Op.DIFFERENCE : u1.f(operation, companion.b()) ? Path.Op.INTERSECT : u1.f(operation, companion.c()) ? Path.Op.REVERSE_DIFFERENCE : u1.f(operation, companion.d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.internalPath;
        if (!(path1 instanceof Q)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((Q) path1).getInternalPath();
        if (path2 instanceof Q) {
            return path.op(internalPath, ((Q) path2).getInternalPath(), op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // V0.q1
    public void r(float x10, float y10) {
        this.internalPath.moveTo(x10, y10);
    }

    @Override // V0.q1
    public void reset() {
        this.internalPath.reset();
    }

    @Override // V0.q1
    public void s(float x12, float y12, float x22, float y22, float x32, float y32) {
        this.internalPath.cubicTo(x12, y12, x22, y22, x32, y32);
    }

    @Override // V0.q1
    public void t(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    @Override // V0.q1
    public void u(float x10, float y10) {
        this.internalPath.lineTo(x10, y10);
    }

    @Override // V0.q1
    public void v() {
        this.internalPath.rewind();
    }

    /* renamed from: w, reason: from getter */
    public final Path getInternalPath() {
        return this.internalPath;
    }

    private final void x(Rect rect) {
        if (!Float.isNaN(rect.getLeft()) && !Float.isNaN(rect.getTop()) && !Float.isNaN(rect.l()) && !Float.isNaN(rect.i())) {
            return;
        }
        W.d("Invalid rectangle, make sure no value is NaN");
    }

    @Override // V0.q1
    public void l(Rect rect, q1.b direction) {
        x(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.g(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.l(), rect.i());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.g(rectF2);
        path.addRect(rectF2, W.e(direction));
    }

    public /* synthetic */ Q(Path path, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
