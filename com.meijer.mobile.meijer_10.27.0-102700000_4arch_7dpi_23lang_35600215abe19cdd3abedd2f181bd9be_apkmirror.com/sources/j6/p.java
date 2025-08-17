package j6;

import android.graphics.Matrix;
import android.graphics.PointF;
import g6.D;
import j6.AbstractC14861a;
import java.util.Collections;
import q6.AbstractC16472b;
import v6.C17512a;
import v6.C17514c;
import v6.C17515d;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f139475a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f139476b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f139477c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f139478d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f139479e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC14861a<PointF, PointF> f139480f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC14861a<?, PointF> f139481g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC14861a<C17515d, C17515d> f139482h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f139483i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f139484j;

    /* renamed from: k, reason: collision with root package name */
    private C14864d f139485k;

    /* renamed from: l, reason: collision with root package name */
    private C14864d f139486l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC14861a<?, Float> f139487m;

    /* renamed from: n, reason: collision with root package name */
    private AbstractC14861a<?, Float> f139488n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f139489o;

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f139479e[i10] = 0.0f;
        }
    }

    public void a(AbstractC16472b abstractC16472b) {
        abstractC16472b.j(this.f139484j);
        abstractC16472b.j(this.f139487m);
        abstractC16472b.j(this.f139488n);
        abstractC16472b.j(this.f139480f);
        abstractC16472b.j(this.f139481g);
        abstractC16472b.j(this.f139482h);
        abstractC16472b.j(this.f139483i);
        abstractC16472b.j(this.f139485k);
        abstractC16472b.j(this.f139486l);
    }

    public void b(AbstractC14861a.b bVar) {
        AbstractC14861a<Integer, Integer> abstractC14861a = this.f139484j;
        if (abstractC14861a != null) {
            abstractC14861a.a(bVar);
        }
        AbstractC14861a<?, Float> abstractC14861a2 = this.f139487m;
        if (abstractC14861a2 != null) {
            abstractC14861a2.a(bVar);
        }
        AbstractC14861a<?, Float> abstractC14861a3 = this.f139488n;
        if (abstractC14861a3 != null) {
            abstractC14861a3.a(bVar);
        }
        AbstractC14861a<PointF, PointF> abstractC14861a4 = this.f139480f;
        if (abstractC14861a4 != null) {
            abstractC14861a4.a(bVar);
        }
        AbstractC14861a<?, PointF> abstractC14861a5 = this.f139481g;
        if (abstractC14861a5 != null) {
            abstractC14861a5.a(bVar);
        }
        AbstractC14861a<C17515d, C17515d> abstractC14861a6 = this.f139482h;
        if (abstractC14861a6 != null) {
            abstractC14861a6.a(bVar);
        }
        AbstractC14861a<Float, Float> abstractC14861a7 = this.f139483i;
        if (abstractC14861a7 != null) {
            abstractC14861a7.a(bVar);
        }
        C14864d c14864d = this.f139485k;
        if (c14864d != null) {
            c14864d.a(bVar);
        }
        C14864d c14864d2 = this.f139486l;
        if (c14864d2 != null) {
            c14864d2.a(bVar);
        }
    }

    public <T> boolean c(T t10, C17514c<T> c17514c) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (t10 == D.f132852f) {
            AbstractC14861a<PointF, PointF> abstractC14861a = this.f139480f;
            if (abstractC14861a == null) {
                this.f139480f = new q(c17514c, new PointF());
                return true;
            }
            abstractC14861a.o(c17514c);
            return true;
        }
        if (t10 == D.f132853g) {
            AbstractC14861a<?, PointF> abstractC14861a2 = this.f139481g;
            if (abstractC14861a2 == null) {
                this.f139481g = new q(c17514c, new PointF());
                return true;
            }
            abstractC14861a2.o(c17514c);
            return true;
        }
        if (t10 == D.f132854h) {
            AbstractC14861a<?, PointF> abstractC14861a3 = this.f139481g;
            if (abstractC14861a3 instanceof n) {
                ((n) abstractC14861a3).t(c17514c);
                return true;
            }
        }
        if (t10 == D.f132855i) {
            AbstractC14861a<?, PointF> abstractC14861a4 = this.f139481g;
            if (abstractC14861a4 instanceof n) {
                ((n) abstractC14861a4).u(c17514c);
                return true;
            }
        }
        if (t10 == D.f132861o) {
            AbstractC14861a<C17515d, C17515d> abstractC14861a5 = this.f139482h;
            if (abstractC14861a5 == null) {
                this.f139482h = new q(c17514c, new C17515d());
                return true;
            }
            abstractC14861a5.o(c17514c);
            return true;
        }
        if (t10 == D.f132862p) {
            AbstractC14861a<Float, Float> abstractC14861a6 = this.f139483i;
            if (abstractC14861a6 == null) {
                this.f139483i = new q(c17514c, fValueOf2);
                return true;
            }
            abstractC14861a6.o(c17514c);
            return true;
        }
        if (t10 == D.f132849c) {
            AbstractC14861a<Integer, Integer> abstractC14861a7 = this.f139484j;
            if (abstractC14861a7 == null) {
                this.f139484j = new q(c17514c, 100);
                return true;
            }
            abstractC14861a7.o(c17514c);
            return true;
        }
        if (t10 == D.f132833C) {
            AbstractC14861a<?, Float> abstractC14861a8 = this.f139487m;
            if (abstractC14861a8 == null) {
                this.f139487m = new q(c17514c, fValueOf);
                return true;
            }
            abstractC14861a8.o(c17514c);
            return true;
        }
        if (t10 == D.f132834D) {
            AbstractC14861a<?, Float> abstractC14861a9 = this.f139488n;
            if (abstractC14861a9 == null) {
                this.f139488n = new q(c17514c, fValueOf);
                return true;
            }
            abstractC14861a9.o(c17514c);
            return true;
        }
        if (t10 == D.f132863q) {
            if (this.f139485k == null) {
                this.f139485k = new C14864d(Collections.singletonList(new C17512a(fValueOf2)));
            }
            this.f139485k.o(c17514c);
            return true;
        }
        if (t10 != D.f132864r) {
            return false;
        }
        if (this.f139486l == null) {
            this.f139486l = new C14864d(Collections.singletonList(new C17512a(fValueOf2)));
        }
        this.f139486l.o(c17514c);
        return true;
    }

    public AbstractC14861a<?, Float> e() {
        return this.f139488n;
    }

    public Matrix f() {
        PointF pointFH;
        C17515d c17515dH;
        PointF pointFH2;
        this.f139475a.reset();
        AbstractC14861a<?, PointF> abstractC14861a = this.f139481g;
        if (abstractC14861a != null && (pointFH2 = abstractC14861a.h()) != null) {
            float f10 = pointFH2.x;
            if (f10 != 0.0f || pointFH2.y != 0.0f) {
                this.f139475a.preTranslate(f10, pointFH2.y);
            }
        }
        if (!this.f139489o) {
            AbstractC14861a<Float, Float> abstractC14861a2 = this.f139483i;
            if (abstractC14861a2 != null) {
                float fFloatValue = abstractC14861a2 instanceof q ? abstractC14861a2.h().floatValue() : ((C14864d) abstractC14861a2).r();
                if (fFloatValue != 0.0f) {
                    this.f139475a.preRotate(fFloatValue);
                }
            }
        } else if (abstractC14861a != null) {
            float f11 = abstractC14861a.f();
            PointF pointFH3 = abstractC14861a.h();
            float f12 = pointFH3.x;
            float f13 = pointFH3.y;
            abstractC14861a.n(1.0E-4f + f11);
            PointF pointFH4 = abstractC14861a.h();
            abstractC14861a.n(f11);
            this.f139475a.preRotate((float) Math.toDegrees(Math.atan2(pointFH4.y - f13, pointFH4.x - f12)));
        }
        if (this.f139485k != null) {
            float fCos = this.f139486l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.r()) + 90.0f));
            float fSin = this.f139486l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.r()));
            d();
            float[] fArr = this.f139479e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f139476b.setValues(fArr);
            d();
            float[] fArr2 = this.f139479e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f139477c.setValues(fArr2);
            d();
            float[] fArr3 = this.f139479e;
            fArr3[0] = fCos;
            fArr3[1] = f14;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f139478d.setValues(fArr3);
            this.f139477c.preConcat(this.f139476b);
            this.f139478d.preConcat(this.f139477c);
            this.f139475a.preConcat(this.f139478d);
        }
        AbstractC14861a<C17515d, C17515d> abstractC14861a3 = this.f139482h;
        if (abstractC14861a3 != null && (c17515dH = abstractC14861a3.h()) != null && (c17515dH.b() != 1.0f || c17515dH.c() != 1.0f)) {
            this.f139475a.preScale(c17515dH.b(), c17515dH.c());
        }
        AbstractC14861a<PointF, PointF> abstractC14861a4 = this.f139480f;
        if (abstractC14861a4 != null && (pointFH = abstractC14861a4.h()) != null) {
            float f15 = pointFH.x;
            if (f15 != 0.0f || pointFH.y != 0.0f) {
                this.f139475a.preTranslate(-f15, -pointFH.y);
            }
        }
        return this.f139475a;
    }

    public Matrix g(float f10) {
        AbstractC14861a<?, PointF> abstractC14861a = this.f139481g;
        PointF pointFH = abstractC14861a == null ? null : abstractC14861a.h();
        AbstractC14861a<C17515d, C17515d> abstractC14861a2 = this.f139482h;
        C17515d c17515dH = abstractC14861a2 == null ? null : abstractC14861a2.h();
        this.f139475a.reset();
        if (pointFH != null) {
            this.f139475a.preTranslate(pointFH.x * f10, pointFH.y * f10);
        }
        if (c17515dH != null) {
            double d10 = f10;
            this.f139475a.preScale((float) Math.pow(c17515dH.b(), d10), (float) Math.pow(c17515dH.c(), d10));
        }
        AbstractC14861a<Float, Float> abstractC14861a3 = this.f139483i;
        if (abstractC14861a3 != null) {
            float fFloatValue = abstractC14861a3.h().floatValue();
            AbstractC14861a<PointF, PointF> abstractC14861a4 = this.f139480f;
            PointF pointFH2 = abstractC14861a4 != null ? abstractC14861a4.h() : null;
            this.f139475a.preRotate(fFloatValue * f10, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
        }
        return this.f139475a;
    }

    public AbstractC14861a<?, Integer> h() {
        return this.f139484j;
    }

    public AbstractC14861a<?, Float> i() {
        return this.f139487m;
    }

    public void j(float f10) {
        AbstractC14861a<Integer, Integer> abstractC14861a = this.f139484j;
        if (abstractC14861a != null) {
            abstractC14861a.n(f10);
        }
        AbstractC14861a<?, Float> abstractC14861a2 = this.f139487m;
        if (abstractC14861a2 != null) {
            abstractC14861a2.n(f10);
        }
        AbstractC14861a<?, Float> abstractC14861a3 = this.f139488n;
        if (abstractC14861a3 != null) {
            abstractC14861a3.n(f10);
        }
        AbstractC14861a<PointF, PointF> abstractC14861a4 = this.f139480f;
        if (abstractC14861a4 != null) {
            abstractC14861a4.n(f10);
        }
        AbstractC14861a<?, PointF> abstractC14861a5 = this.f139481g;
        if (abstractC14861a5 != null) {
            abstractC14861a5.n(f10);
        }
        AbstractC14861a<C17515d, C17515d> abstractC14861a6 = this.f139482h;
        if (abstractC14861a6 != null) {
            abstractC14861a6.n(f10);
        }
        AbstractC14861a<Float, Float> abstractC14861a7 = this.f139483i;
        if (abstractC14861a7 != null) {
            abstractC14861a7.n(f10);
        }
        C14864d c14864d = this.f139485k;
        if (c14864d != null) {
            c14864d.n(f10);
        }
        C14864d c14864d2 = this.f139486l;
        if (c14864d2 != null) {
            c14864d2.n(f10);
        }
    }

    public p(o6.n nVar) {
        AbstractC14861a<PointF, PointF> abstractC14861aA;
        AbstractC14861a<PointF, PointF> abstractC14861aA2;
        AbstractC14861a<C17515d, C17515d> abstractC14861aA3;
        C14864d c14864dA;
        C14864d c14864dA2;
        C14864d c14864dA3;
        if (nVar.c() == null) {
            abstractC14861aA = null;
        } else {
            abstractC14861aA = nVar.c().a();
        }
        this.f139480f = abstractC14861aA;
        if (nVar.f() == null) {
            abstractC14861aA2 = null;
        } else {
            abstractC14861aA2 = nVar.f().a();
        }
        this.f139481g = abstractC14861aA2;
        if (nVar.h() == null) {
            abstractC14861aA3 = null;
        } else {
            abstractC14861aA3 = nVar.h().a();
        }
        this.f139482h = abstractC14861aA3;
        if (nVar.g() == null) {
            c14864dA = null;
        } else {
            c14864dA = nVar.g().a();
        }
        this.f139483i = c14864dA;
        if (nVar.i() == null) {
            c14864dA2 = null;
        } else {
            c14864dA2 = nVar.i().a();
        }
        this.f139485k = c14864dA2;
        this.f139489o = nVar.l();
        if (this.f139485k != null) {
            this.f139476b = new Matrix();
            this.f139477c = new Matrix();
            this.f139478d = new Matrix();
            this.f139479e = new float[9];
        } else {
            this.f139476b = null;
            this.f139477c = null;
            this.f139478d = null;
            this.f139479e = null;
        }
        if (nVar.j() == null) {
            c14864dA3 = null;
        } else {
            c14864dA3 = nVar.j().a();
        }
        this.f139486l = c14864dA3;
        if (nVar.e() != null) {
            this.f139484j = nVar.e().a();
        }
        if (nVar.k() != null) {
            this.f139487m = nVar.k().a();
        } else {
            this.f139487m = null;
        }
        if (nVar.d() != null) {
            this.f139488n = nVar.d().a();
        } else {
            this.f139488n = null;
        }
    }
}
