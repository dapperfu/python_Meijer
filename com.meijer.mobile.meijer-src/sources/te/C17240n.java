package te;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: te.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17240n {

    /* renamed from: a, reason: collision with root package name */
    private final C17241o[] f162580a = new C17241o[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f162581b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f162582c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f162583d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f162584e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f162585f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final C17241o f162586g = new C17241o();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f162587h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f162588i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f162589j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f162590k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f162591l = true;

    /* renamed from: te.n$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final C17240n f162592a = new C17240n();
    }

    /* renamed from: te.n$b */
    public interface b {
        void a(C17241o c17241o, Matrix matrix, int i10);

        void b(C17241o c17241o, Matrix matrix, int i10);
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private InterfaceC17229c g(int i10, C17239m c17239m) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c17239m.t() : c17239m.r() : c17239m.j() : c17239m.l();
    }

    private C17230d h(int i10, C17239m c17239m) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c17239m.s() : c17239m.q() : c17239m.i() : c17239m.k();
    }

    private C17232f j(int i10, C17239m c17239m) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c17239m.o() : c17239m.p() : c17239m.n() : c17239m.h();
    }

    public void d(C17239m c17239m, float f10, RectF rectF, Path path) {
        e(c17239m, f10, rectF, null, path);
    }

    /* renamed from: te.n$c */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C17239m f162593a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f162594b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f162595c;

        /* renamed from: d, reason: collision with root package name */
        public final b f162596d;

        /* renamed from: e, reason: collision with root package name */
        public final float f162597e;

        c(C17239m c17239m, float f10, RectF rectF, b bVar, Path path) {
            this.f162596d = bVar;
            this.f162593a = c17239m;
            this.f162597e = f10;
            this.f162595c = rectF;
            this.f162594b = path;
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f162587h[0] = this.f162580a[i10].k();
        this.f162587h[1] = this.f162580a[i10].l();
        this.f162581b[i10].mapPoints(this.f162587h);
        if (i10 == 0) {
            Path path = cVar.f162594b;
            float[] fArr = this.f162587h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f162594b;
            float[] fArr2 = this.f162587h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f162580a[i10].d(this.f162581b[i10], cVar.f162594b);
        b bVar = cVar.f162596d;
        if (bVar != null) {
            bVar.a(this.f162580a[i10], this.f162581b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f162587h[0] = this.f162580a[i10].i();
        this.f162587h[1] = this.f162580a[i10].j();
        this.f162581b[i10].mapPoints(this.f162587h);
        this.f162588i[0] = this.f162580a[i11].k();
        this.f162588i[1] = this.f162580a[i11].l();
        this.f162581b[i11].mapPoints(this.f162588i);
        float f10 = this.f162587h[0];
        float[] fArr = this.f162588i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f162595c, i10);
        this.f162586g.n(0.0f, 0.0f);
        C17232f c17232fJ = j(i10, cVar.f162593a);
        c17232fJ.b(fMax, fI, cVar.f162597e, this.f162586g);
        this.f162589j.reset();
        this.f162586g.d(this.f162582c[i10], this.f162589j);
        if (this.f162591l && (c17232fJ.a() || l(this.f162589j, i10) || l(this.f162589j, i11))) {
            Path path = this.f162589j;
            path.op(path, this.f162585f, Path.Op.DIFFERENCE);
            this.f162587h[0] = this.f162586g.k();
            this.f162587h[1] = this.f162586g.l();
            this.f162582c[i10].mapPoints(this.f162587h);
            Path path2 = this.f162584e;
            float[] fArr2 = this.f162587h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f162586g.d(this.f162582c[i10], this.f162584e);
        } else {
            this.f162586g.d(this.f162582c[i10], cVar.f162594b);
        }
        b bVar = cVar.f162596d;
        if (bVar != null) {
            bVar.b(this.f162586g, this.f162582c[i10], i10);
        }
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f162587h;
        C17241o c17241o = this.f162580a[i10];
        fArr[0] = c17241o.f162600c;
        fArr[1] = c17241o.f162601d;
        this.f162581b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f162587h[0]) : Math.abs(rectF.centerY() - this.f162587h[1]);
    }

    public static C17240n k() {
        return a.f162592a;
    }

    private boolean l(Path path, int i10) {
        this.f162590k.reset();
        this.f162580a[i10].d(this.f162581b[i10], this.f162590k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f162590k.computeBounds(rectF, true);
        path.op(this.f162590k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f162593a).b(this.f162580a[i10], 90.0f, cVar.f162597e, cVar.f162595c, g(i10, cVar.f162593a));
        float fA = a(i10);
        this.f162581b[i10].reset();
        f(i10, cVar.f162595c, this.f162583d);
        Matrix matrix = this.f162581b[i10];
        PointF pointF = this.f162583d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f162581b[i10].preRotate(fA);
    }

    private void n(int i10) {
        this.f162587h[0] = this.f162580a[i10].i();
        this.f162587h[1] = this.f162580a[i10].j();
        this.f162581b[i10].mapPoints(this.f162587h);
        float fA = a(i10);
        this.f162582c[i10].reset();
        Matrix matrix = this.f162582c[i10];
        float[] fArr = this.f162587h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f162582c[i10].preRotate(fA);
    }

    public C17240n() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f162580a[i10] = new C17241o();
            this.f162581b[i10] = new Matrix();
            this.f162582c[i10] = new Matrix();
        }
    }

    public void e(C17239m c17239m, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f162584e.rewind();
        this.f162585f.rewind();
        this.f162585f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c17239m, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f162584e.close();
        if (!this.f162584e.isEmpty()) {
            path.op(this.f162584e, Path.Op.UNION);
        }
    }
}
