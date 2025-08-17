package re;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qe.C16520a;

/* renamed from: re.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16767o {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f158108a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f158109b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f158110c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f158111d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f158112e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f158113f;

    /* renamed from: g, reason: collision with root package name */
    private final List<f> f158114g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<g> f158115h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f158116i;

    /* renamed from: re.o$a */
    class a extends g {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f158117c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f158118d;

        a(List list, Matrix matrix) {
            this.f158117c = list;
            this.f158118d = matrix;
        }

        @Override // re.C16767o.g
        public void a(Matrix matrix, C16520a c16520a, int i10, Canvas canvas) {
            Iterator it = this.f158117c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f158118d, c16520a, i10, canvas);
            }
        }
    }

    /* renamed from: re.o$b */
    static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        private final d f158120c;

        @Override // re.C16767o.g
        public void a(Matrix matrix, C16520a c16520a, int i10, Canvas canvas) {
            c16520a.a(canvas, matrix, new RectF(this.f158120c.k(), this.f158120c.o(), this.f158120c.l(), this.f158120c.j()), i10, this.f158120c.m(), this.f158120c.n());
        }

        public b(d dVar) {
            this.f158120c = dVar;
        }
    }

    /* renamed from: re.o$c */
    static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        private final e f158121c;

        /* renamed from: d, reason: collision with root package name */
        private final float f158122d;

        /* renamed from: e, reason: collision with root package name */
        private final float f158123e;

        @Override // re.C16767o.g
        public void a(Matrix matrix, C16520a c16520a, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f158121c.f158132c - this.f158123e, this.f158121c.f158131b - this.f158122d), 0.0f);
            this.f158135a.set(matrix);
            this.f158135a.preTranslate(this.f158122d, this.f158123e);
            this.f158135a.preRotate(c());
            c16520a.b(canvas, this.f158135a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f158121c.f158132c - this.f158123e) / (this.f158121c.f158131b - this.f158122d)));
        }

        public c(e eVar, float f10, float f11) {
            this.f158121c = eVar;
            this.f158122d = f10;
            this.f158123e = f11;
        }
    }

    /* renamed from: re.o$d */
    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f158124h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f158125b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f158126c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f158127d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f158128e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f158129f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f158130g;

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f158128e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f158125b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f158127d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f158129f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f158130g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f158126c;
        }

        private void p(float f10) {
            this.f158128e = f10;
        }

        private void q(float f10) {
            this.f158125b = f10;
        }

        private void r(float f10) {
            this.f158127d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f158129f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f158130g = f10;
        }

        private void u(float f10) {
            this.f158126c = f10;
        }

        @Override // re.C16767o.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f158133a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f158124h;
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

    /* renamed from: re.o$e */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f158131b;

        /* renamed from: c, reason: collision with root package name */
        private float f158132c;

        @Override // re.C16767o.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f158133a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f158131b, this.f158132c);
            path.transform(matrix);
        }
    }

    /* renamed from: re.o$f */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f158133a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* renamed from: re.o$g */
    static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        static final Matrix f158134b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        final Matrix f158135a = new Matrix();

        public abstract void a(Matrix matrix, C16520a c16520a, int i10, Canvas canvas);

        public final void b(C16520a c16520a, int i10, Canvas canvas) {
            a(f158134b, c16520a, i10, canvas);
        }

        g() {
        }
    }

    private float g() {
        return this.f158112e;
    }

    private float h() {
        return this.f158113f;
    }

    private void p(float f10) {
        this.f158112e = f10;
    }

    private void q(float f10) {
        this.f158113f = f10;
    }

    private void r(float f10) {
        this.f158110c = f10;
    }

    private void s(float f10) {
        this.f158111d = f10;
    }

    private void t(float f10) {
        this.f158108a = f10;
    }

    private void u(float f10) {
        this.f158109b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f158114g.add(dVar);
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
        int size = this.f158114g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f158114g.get(i10).a(matrix, path);
        }
    }

    boolean e() {
        return this.f158116i;
    }

    float i() {
        return this.f158110c;
    }

    float j() {
        return this.f158111d;
    }

    float k() {
        return this.f158108a;
    }

    float l() {
        return this.f158109b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f158131b = f10;
        eVar.f158132c = f11;
        this.f158114g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public C16767o() {
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
            this.f158115h.add(new b(dVar));
            p(f10);
        }
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f158115h.add(gVar);
        p(f11);
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f158115h), new Matrix(matrix));
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f158114g.clear();
        this.f158115h.clear();
        this.f158116i = false;
    }
}
