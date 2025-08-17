package androidx.compose.ui.graphics;

import H1.n;
import V0.C5334l1;
import V0.C5336m0;
import V0.InterfaceC5316f1;
import V0.M;
import V0.N;
import V0.Q;
import V0.o1;
import V0.q1;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.graphics.f;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J:\u0010+\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\"\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0014\u00102\u001a\u000201*\u00020)ø\u0001\u0000¢\u0006\u0004\b2\u00103J*\u00106\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J7\u00108\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u00109JG\u0010<\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010=J*\u0010@\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJO\u0010F\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u00162\u0006\u0010E\u001a\u00020D2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\t2\u0006\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010IJ*\u0010M\u001a\u00020\t2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJB\u0010U\u001a\u00020\t2\u0006\u0010K\u001a\u00020J2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020O2\u0006\u0010T\u001a\u00020Q2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ0\u0010Y\u001a\u00020\t2\u0006\u0010X\u001a\u00020W2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\tH\u0016¢\u0006\u0004\b[\u0010\u0003J\u000f\u0010\\\u001a\u00020\tH\u0016¢\u0006\u0004\b\\\u0010\u0003R,\u0010e\u001a\u00060]j\u0002`^8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010_\u0012\u0004\bd\u0010\u0003\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010g\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006j"}, d2 = {"Landroidx/compose/ui/graphics/a;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "LU0/f;", "points", "LV0/o1;", "paint", "", "y", "(Ljava/util/List;LV0/o1;)V", "", "stepBy", "x", "(Ljava/util/List;LV0/o1;I)V", "save", "i", "Landroidx/compose/ui/geometry/Rect;", "bounds", "q", "(Landroidx/compose/ui/geometry/Rect;LV0/o1;)V", "", "dx", "dy", "d", "(FF)V", "sx", "sy", "a", "degrees", "p", "(F)V", "LV0/k1;", "matrix", "u", "([F)V", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/b;", "clipOp", "c", "(FFFFI)V", "LV0/q1;", "path", "e", "(LV0/q1;I)V", "Landroid/graphics/Region$Op;", "B", "(I)Landroid/graphics/Region$Op;", "p1", "p2", "o", "(JJLV0/o1;)V", "f", "(FFFFLV0/o1;)V", "radiusX", "radiusY", "n", "(FFFFFFLV0/o1;)V", "center", "radius", "w", "(JFLV0/o1;)V", "startAngle", "sweepAngle", "", "useCenter", "g", "(FFFFFFZLV0/o1;)V", "s", "(LV0/q1;LV0/o1;)V", "LV0/f1;", "image", "topLeftOffset", "k", "(LV0/f1;JLV0/o1;)V", "LH1/n;", "srcOffset", "LH1/r;", "srcSize", "dstOffset", "dstSize", "h", "(LV0/f1;JJJJLV0/o1;)V", "Landroidx/compose/ui/graphics/f;", "pointMode", "b", "(ILjava/util/List;LV0/o1;)V", "l", "t", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "z", "()Landroid/graphics/Canvas;", "A", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a implements Canvas {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.f50701a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Rect srcRect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Rect dstRect;

    private final void y(List<U0.f> points, o1 paint) {
        int size = points.size();
        for (int i10 = 0; i10 < size; i10++) {
            long packedValue = points.get(i10).getPackedValue();
            this.internalCanvas.drawPoint(Float.intBitsToFloat((int) (packedValue >> 32)), Float.intBitsToFloat((int) (packedValue & 4294967295L)), paint.C());
        }
    }

    public final void A(android.graphics.Canvas canvas) {
        this.internalCanvas = canvas;
    }

    public final Region.Op B(int i10) {
        return b.d(i10, b.INSTANCE.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void a(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void b(int pointMode, List<U0.f> points, o1 paint) {
        f.Companion companion = f.INSTANCE;
        if (f.e(pointMode, companion.a())) {
            x(points, paint, 2);
        } else if (f.e(pointMode, companion.c())) {
            x(points, paint, 1);
        } else if (f.e(pointMode, companion.b())) {
            y(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void c(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, B(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void d(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void e(q1 path, int clipOp) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof Q)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((Q) path).getInternalPath(), B(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void f(float left, float top, float right, float bottom, o1 paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, paint.C());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void g(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, o1 paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.C());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void h(InterfaceC5316f1 image, long srcOffset, long srcSize, long dstOffset, long dstSize, o1 paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapB = M.b(image);
        Rect rect = this.srcRect;
        Intrinsics.g(rect);
        rect.left = n.k(srcOffset);
        rect.top = n.l(srcOffset);
        rect.right = n.k(srcOffset) + ((int) (srcSize >> 32));
        rect.bottom = n.l(srcOffset) + ((int) (srcSize & 4294967295L));
        Unit unit = Unit.f142422a;
        Rect rect2 = this.dstRect;
        Intrinsics.g(rect2);
        rect2.left = n.k(dstOffset);
        rect2.top = n.l(dstOffset);
        rect2.right = n.k(dstOffset) + ((int) (dstSize >> 32));
        rect2.bottom = n.l(dstOffset) + ((int) (dstSize & 4294967295L));
        canvas.drawBitmap(bitmapB, rect, rect2, paint.C());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void i() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void k(InterfaceC5316f1 image, long topLeftOffset, o1 paint) {
        this.internalCanvas.drawBitmap(M.b(image), Float.intBitsToFloat((int) (topLeftOffset >> 32)), Float.intBitsToFloat((int) (topLeftOffset & 4294967295L)), paint.C());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void l() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C5336m0.f36502a.a(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void n(float left, float top, float right, float bottom, float radiusX, float radiusY, o1 paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.C());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void o(long p12, long p22, o1 paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (p12 >> 32)), Float.intBitsToFloat((int) (p12 & 4294967295L)), Float.intBitsToFloat((int) (p22 >> 32)), Float.intBitsToFloat((int) (p22 & 4294967295L)), paint.C());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void p(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void q(androidx.compose.ui.geometry.Rect bounds, o1 paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.l(), bounds.i(), paint.C(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void s(q1 path, o1 paint) {
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof Q)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((Q) path).getInternalPath(), paint.C());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void t() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C5336m0.f36502a.a(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void w(long center, float radius, o1 paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (center >> 32)), Float.intBitsToFloat((int) (center & 4294967295L)), radius, paint.C());
    }

    /* renamed from: z, reason: from getter */
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    private final void x(List<U0.f> points, o1 paint, int stepBy) {
        if (points.size() >= 2) {
            Paint paintC = paint.C();
            int i10 = 0;
            while (i10 < points.size() - 1) {
                long packedValue = points.get(i10).getPackedValue();
                long packedValue2 = points.get(i10 + 1).getPackedValue();
                this.internalCanvas.drawLine(Float.intBitsToFloat((int) (packedValue >> 32)), Float.intBitsToFloat((int) (packedValue & 4294967295L)), Float.intBitsToFloat((int) (packedValue2 >> 32)), Float.intBitsToFloat((int) (packedValue2 & 4294967295L)), paintC);
                i10 += stepBy;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void u(float[] matrix) {
        if (!C5334l1.a(matrix)) {
            Matrix matrix2 = new Matrix();
            N.a(matrix2, matrix);
            this.internalCanvas.concat(matrix2);
        }
    }
}
