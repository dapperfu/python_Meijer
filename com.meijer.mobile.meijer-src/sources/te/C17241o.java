package te;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import se.C17068a;

/* renamed from: te.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17241o {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f162598a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f162599b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f162600c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f162601d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f162602e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f162603f;

    /* renamed from: g, reason: collision with root package name */
    private final List<f> f162604g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<g> f162605h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f162606i;

    /* renamed from: te.o$a */
    class a extends g {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f162607c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f162608d;

        a(List list, Matrix matrix) {
            this.f162607c = list;
            this.f162608d = matrix;
        }

        @Override // te.C17241o.g
        public void a(Matrix matrix, C17068a c17068a, int i10, Canvas canvas) {
            Iterator it = this.f162607c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f162608d, c17068a, i10, canvas);
            }
        }
    }

    /* renamed from: te.o$b */
    static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        private final d f162610c;

        @Override // te.C17241o.g
        public void a(Matrix matrix, C17068a c17068a, int i10, Canvas canvas) {
            c17068a.a(canvas, matrix, new RectF(this.f162610c.k(), this.f162610c.o(), this.f162610c.l(), this.f162610c.j()), i10, this.f162610c.m(), this.f162610c.n());
        }

        public b(d dVar) {
            this.f162610c = dVar;
        }
    }

    /* renamed from: te.o$c */
    static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        private final e f162611c;

        /* renamed from: d, reason: collision with root package name */
        private final float f162612d;

        /* renamed from: e, reason: collision with root package name */
        private final float f162613e;

        @Override // te.C17241o.g
        public void a(Matrix matrix, C17068a c17068a, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f162611c.f162622c - this.f162613e, this.f162611c.f162621b - this.f162612d), 0.0f);
            this.f162625a.set(matrix);
            this.f162625a.preTranslate(this.f162612d, this.f162613e);
            this.f162625a.preRotate(c());
            c17068a.b(canvas, this.f162625a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f162611c.f162622c - this.f162613e) / (this.f162611c.f162621b - this.f162612d)));
        }

        public c(e eVar, float f10, float f11) {
            this.f162611c = eVar;
            this.f162612d = f10;
            this.f162613e = f11;
        }
    }

    /* renamed from: te.o$d */
    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f162614h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f162615b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f162616c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f162617d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f162618e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f162619f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f162620g;

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f162618e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f162615b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f162617d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f162619f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f162620g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f162616c;
        }

        private void p(float f10) {
            this.f162618e = f10;
        }

        private void q(float f10) {
            this.f162615b = f10;
        }

        private void r(float f10) {
            this.f162617d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f162619f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f162620g = f10;
        }

        private void u(float f10) {
            this.f162616c = f10;
        }

        @Override // te.C17241o.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f162623a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f162614h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }
    }

    /* renamed from: te.o$e */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f162621b;

        /* renamed from: c, reason: collision with root package name */
        private float f162622c;

        @Override // te.C17241o.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f162623a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f162621b, this.f162622c);
            path.transform(matrix);
        }
    }

    /* renamed from: te.o$f */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f162623a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* renamed from: te.o$g */
    static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        static final Matrix f162624b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        final Matrix f162625a = new Matrix();

        public abstract void a(Matrix matrix, C17068a c17068a, int i10, Canvas canvas);

        public final void b(C17068a c17068a, int i10, Canvas canvas) {
            a(f162624b, c17068a, i10, canvas);
        }

        g() {
        }
    }

    private float g() {
        return this.f162602e;
    }

    private float h() {
        return this.f162603f;
    }

    private void p(float f10) {
        this.f162602e = f10;
    }

    private void q(float f10) {
        this.f162603f = f10;
    }

    private void r(float f10) {
        this.f162600c = f10;
    }

    private void s(float f10) {
        this.f162601d = f10;
    }

    private void t(float f10) {
        this.f162598a = f10;
    }

    private void u(float f10) {
        this.f162599b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f162604g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f162604g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f162604g.get(i10).a(matrix, path);
        }
    }

    boolean e() {
        return this.f162606i;
    }

    float i() {
        return this.f162600c;
    }

    float j() {
        return this.f162601d;
    }

    float k() {
        return this.f162598a;
    }

    float l() {
        return this.f162599b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f162621b = f10;
        eVar.f162622c = f11;
        this.f162604g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public C17241o() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() != f10) {
            float fG = ((f10 - g()) + 360.0f) % 360.0f;
            if (fG > 180.0f) {
                return;
            }
            d dVar = new d(i(), j(), i(), j());
            dVar.s(g());
            dVar.t(fG);
            this.f162605h.add(new b(dVar));
            p(f10);
        }
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f162605h.add(gVar);
        p(f11);
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f162605h), new Matrix(matrix));
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f162604g.clear();
        this.f162605h.clear();
        this.f162606i = false;
    }
}
