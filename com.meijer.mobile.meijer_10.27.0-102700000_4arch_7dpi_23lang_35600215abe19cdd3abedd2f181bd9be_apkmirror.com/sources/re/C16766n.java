package re;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: re.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16766n {

    /* renamed from: a, reason: collision with root package name */
    private final C16767o[] f158090a = new C16767o[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f158091b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f158092c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f158093d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f158094e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f158095f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final C16767o f158096g = new C16767o();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f158097h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f158098i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f158099j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f158100k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f158101l = true;

    /* renamed from: re.n$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final C16766n f158102a = new C16766n();
    }

    /* renamed from: re.n$b */
    public interface b {
        void a(C16767o c16767o, Matrix matrix, int i10);

        void b(C16767o c16767o, Matrix matrix, int i10);
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

    private InterfaceC16755c g(int i10, C16765m c16765m) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c16765m.t() : c16765m.r() : c16765m.j() : c16765m.l();
    }

    private C16756d h(int i10, C16765m c16765m) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c16765m.s() : c16765m.q() : c16765m.i() : c16765m.k();
    }

    private C16758f j(int i10, C16765m c16765m) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? c16765m.o() : c16765m.p() : c16765m.n() : c16765m.h();
    }

    public void d(C16765m c16765m, float f10, RectF rectF, Path path) {
        e(c16765m, f10, rectF, null, path);
    }

    /* renamed from: re.n$c */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C16765m f158103a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f158104b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f158105c;

        /* renamed from: d, reason: collision with root package name */
        public final b f158106d;

        /* renamed from: e, reason: collision with root package name */
        public final float f158107e;

        c(C16765m c16765m, float f10, RectF rectF, b bVar, Path path) {
            this.f158106d = bVar;
            this.f158103a = c16765m;
            this.f158107e = f10;
            this.f158105c = rectF;
            this.f158104b = path;
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f158097h[0] = this.f158090a[i10].k();
        this.f158097h[1] = this.f158090a[i10].l();
        this.f158091b[i10].mapPoints(this.f158097h);
        if (i10 == 0) {
            Path path = cVar.f158104b;
            float[] fArr = this.f158097h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f158104b;
            float[] fArr2 = this.f158097h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f158090a[i10].d(this.f158091b[i10], cVar.f158104b);
        b bVar = cVar.f158106d;
        if (bVar != null) {
            bVar.a(this.f158090a[i10], this.f158091b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f158097h[0] = this.f158090a[i10].i();
        this.f158097h[1] = this.f158090a[i10].j();
        this.f158091b[i10].mapPoints(this.f158097h);
        this.f158098i[0] = this.f158090a[i11].k();
        this.f158098i[1] = this.f158090a[i11].l();
        this.f158091b[i11].mapPoints(this.f158098i);
        float f10 = this.f158097h[0];
        float[] fArr = this.f158098i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f158105c, i10);
        this.f158096g.n(0.0f, 0.0f);
        C16758f c16758fJ = j(i10, cVar.f158103a);
        c16758fJ.b(fMax, fI, cVar.f158107e, this.f158096g);
        this.f158099j.reset();
        this.f158096g.d(this.f158092c[i10], this.f158099j);
        if (this.f158101l && (c16758fJ.a() || l(this.f158099j, i10) || l(this.f158099j, i11))) {
            Path path = this.f158099j;
            path.op(path, this.f158095f, Path.Op.DIFFERENCE);
            this.f158097h[0] = this.f158096g.k();
            this.f158097h[1] = this.f158096g.l();
            this.f158092c[i10].mapPoints(this.f158097h);
            Path path2 = this.f158094e;
            float[] fArr2 = this.f158097h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f158096g.d(this.f158092c[i10], this.f158094e);
        } else {
            this.f158096g.d(this.f158092c[i10], cVar.f158104b);
        }
        b bVar = cVar.f158106d;
        if (bVar != null) {
            bVar.b(this.f158096g, this.f158092c[i10], i10);
        }
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f158097h;
        C16767o c16767o = this.f158090a[i10];
        fArr[0] = c16767o.f158110c;
        fArr[1] = c16767o.f158111d;
        this.f158091b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f158097h[0]) : Math.abs(rectF.centerY() - this.f158097h[1]);
    }

    public static C16766n k() {
        return a.f158102a;
    }

    private boolean l(Path path, int i10) {
        this.f158100k.reset();
        this.f158090a[i10].d(this.f158091b[i10], this.f158100k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f158100k.computeBounds(rectF, true);
        path.op(this.f158100k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f158103a).b(this.f158090a[i10], 90.0f, cVar.f158107e, cVar.f158105c, g(i10, cVar.f158103a));
        float fA = a(i10);
        this.f158091b[i10].reset();
        f(i10, cVar.f158105c, this.f158093d);
        Matrix matrix = this.f158091b[i10];
        PointF pointF = this.f158093d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f158091b[i10].preRotate(fA);
    }

    private void n(int i10) {
        this.f158097h[0] = this.f158090a[i10].i();
        this.f158097h[1] = this.f158090a[i10].j();
        this.f158091b[i10].mapPoints(this.f158097h);
        float fA = a(i10);
        this.f158092c[i10].reset();
        Matrix matrix = this.f158092c[i10];
        float[] fArr = this.f158097h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f158092c[i10].preRotate(fA);
    }

    public C16766n() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f158090a[i10] = new C16767o();
            this.f158091b[i10] = new Matrix();
            this.f158092c[i10] = new Matrix();
        }
    }

    public void e(C16765m c16765m, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f158094e.rewind();
        this.f158095f.rewind();
        this.f158095f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c16765m, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f158094e.close();
        if (!this.f158094e.isEmpty()) {
            path.op(this.f158094e, Path.Op.UNION);
        }
    }
}
