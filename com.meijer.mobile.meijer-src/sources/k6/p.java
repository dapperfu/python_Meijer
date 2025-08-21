package k6;

import android.graphics.Matrix;
import android.graphics.PointF;
import h6.D;
import java.util.Collections;
import k6.AbstractC15093a;
import r6.AbstractC16860b;
import w6.C17845a;
import w6.C17847c;
import w6.C17848d;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f141673a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f141674b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f141675c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f141676d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f141677e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC15093a<PointF, PointF> f141678f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC15093a<?, PointF> f141679g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC15093a<C17848d, C17848d> f141680h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f141681i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f141682j;

    /* renamed from: k, reason: collision with root package name */
    private C15096d f141683k;

    /* renamed from: l, reason: collision with root package name */
    private C15096d f141684l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC15093a<?, Float> f141685m;

    /* renamed from: n, reason: collision with root package name */
    private AbstractC15093a<?, Float> f141686n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f141687o;

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f141677e[i10] = 0.0f;
        }
    }

    public void a(AbstractC16860b abstractC16860b) {
        abstractC16860b.j(this.f141682j);
        abstractC16860b.j(this.f141685m);
        abstractC16860b.j(this.f141686n);
        abstractC16860b.j(this.f141678f);
        abstractC16860b.j(this.f141679g);
        abstractC16860b.j(this.f141680h);
        abstractC16860b.j(this.f141681i);
        abstractC16860b.j(this.f141683k);
        abstractC16860b.j(this.f141684l);
    }

    public void b(AbstractC15093a.b bVar) {
        AbstractC15093a<Integer, Integer> abstractC15093a = this.f141682j;
        if (abstractC15093a != null) {
            abstractC15093a.a(bVar);
        }
        AbstractC15093a<?, Float> abstractC15093a2 = this.f141685m;
        if (abstractC15093a2 != null) {
            abstractC15093a2.a(bVar);
        }
        AbstractC15093a<?, Float> abstractC15093a3 = this.f141686n;
        if (abstractC15093a3 != null) {
            abstractC15093a3.a(bVar);
        }
        AbstractC15093a<PointF, PointF> abstractC15093a4 = this.f141678f;
        if (abstractC15093a4 != null) {
            abstractC15093a4.a(bVar);
        }
        AbstractC15093a<?, PointF> abstractC15093a5 = this.f141679g;
        if (abstractC15093a5 != null) {
            abstractC15093a5.a(bVar);
        }
        AbstractC15093a<C17848d, C17848d> abstractC15093a6 = this.f141680h;
        if (abstractC15093a6 != null) {
            abstractC15093a6.a(bVar);
        }
        AbstractC15093a<Float, Float> abstractC15093a7 = this.f141681i;
        if (abstractC15093a7 != null) {
            abstractC15093a7.a(bVar);
        }
        C15096d c15096d = this.f141683k;
        if (c15096d != null) {
            c15096d.a(bVar);
        }
        C15096d c15096d2 = this.f141684l;
        if (c15096d2 != null) {
            c15096d2.a(bVar);
        }
    }

    public <T> boolean c(T t10, C17847c<T> c17847c) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (t10 == D.f135028f) {
            AbstractC15093a<PointF, PointF> abstractC15093a = this.f141678f;
            if (abstractC15093a == null) {
                this.f141678f = new q(c17847c, new PointF());
                return true;
            }
            abstractC15093a.o(c17847c);
            return true;
        }
        if (t10 == D.f135029g) {
            AbstractC15093a<?, PointF> abstractC15093a2 = this.f141679g;
            if (abstractC15093a2 == null) {
                this.f141679g = new q(c17847c, new PointF());
                return true;
            }
            abstractC15093a2.o(c17847c);
            return true;
        }
        if (t10 == D.f135030h) {
            AbstractC15093a<?, PointF> abstractC15093a3 = this.f141679g;
            if (abstractC15093a3 instanceof n) {
                ((n) abstractC15093a3).t(c17847c);
                return true;
            }
        }
        if (t10 == D.f135031i) {
            AbstractC15093a<?, PointF> abstractC15093a4 = this.f141679g;
            if (abstractC15093a4 instanceof n) {
                ((n) abstractC15093a4).u(c17847c);
                return true;
            }
        }
        if (t10 == D.f135037o) {
            AbstractC15093a<C17848d, C17848d> abstractC15093a5 = this.f141680h;
            if (abstractC15093a5 == null) {
                this.f141680h = new q(c17847c, new C17848d());
                return true;
            }
            abstractC15093a5.o(c17847c);
            return true;
        }
        if (t10 == D.f135038p) {
            AbstractC15093a<Float, Float> abstractC15093a6 = this.f141681i;
            if (abstractC15093a6 == null) {
                this.f141681i = new q(c17847c, fValueOf2);
                return true;
            }
            abstractC15093a6.o(c17847c);
            return true;
        }
        if (t10 == D.f135025c) {
            AbstractC15093a<Integer, Integer> abstractC15093a7 = this.f141682j;
            if (abstractC15093a7 == null) {
                this.f141682j = new q(c17847c, 100);
                return true;
            }
            abstractC15093a7.o(c17847c);
            return true;
        }
        if (t10 == D.f135009C) {
            AbstractC15093a<?, Float> abstractC15093a8 = this.f141685m;
            if (abstractC15093a8 == null) {
                this.f141685m = new q(c17847c, fValueOf);
                return true;
            }
            abstractC15093a8.o(c17847c);
            return true;
        }
        if (t10 == D.f135010D) {
            AbstractC15093a<?, Float> abstractC15093a9 = this.f141686n;
            if (abstractC15093a9 == null) {
                this.f141686n = new q(c17847c, fValueOf);
                return true;
            }
            abstractC15093a9.o(c17847c);
            return true;
        }
        if (t10 == D.f135039q) {
            if (this.f141683k == null) {
                this.f141683k = new C15096d(Collections.singletonList(new C17845a(fValueOf2)));
            }
            this.f141683k.o(c17847c);
            return true;
        }
        if (t10 != D.f135040r) {
            return false;
        }
        if (this.f141684l == null) {
            this.f141684l = new C15096d(Collections.singletonList(new C17845a(fValueOf2)));
        }
        this.f141684l.o(c17847c);
        return true;
    }

    public AbstractC15093a<?, Float> e() {
        return this.f141686n;
    }

    public Matrix f() {
        PointF pointFH;
        C17848d c17848dH;
        PointF pointFH2;
        this.f141673a.reset();
        AbstractC15093a<?, PointF> abstractC15093a = this.f141679g;
        if (abstractC15093a != null && (pointFH2 = abstractC15093a.h()) != null) {
            float f10 = pointFH2.x;
            if (f10 != 0.0f || pointFH2.y != 0.0f) {
                this.f141673a.preTranslate(f10, pointFH2.y);
            }
        }
        if (!this.f141687o) {
            AbstractC15093a<Float, Float> abstractC15093a2 = this.f141681i;
            if (abstractC15093a2 != null) {
                float fFloatValue = abstractC15093a2 instanceof q ? abstractC15093a2.h().floatValue() : ((C15096d) abstractC15093a2).r();
                if (fFloatValue != 0.0f) {
                    this.f141673a.preRotate(fFloatValue);
                }
            }
        } else if (abstractC15093a != null) {
            float f11 = abstractC15093a.f();
            PointF pointFH3 = abstractC15093a.h();
            float f12 = pointFH3.x;
            float f13 = pointFH3.y;
            abstractC15093a.n(1.0E-4f + f11);
            PointF pointFH4 = abstractC15093a.h();
            abstractC15093a.n(f11);
            this.f141673a.preRotate((float) Math.toDegrees(Math.atan2(pointFH4.y - f13, pointFH4.x - f12)));
        }
        if (this.f141683k != null) {
            float fCos = this.f141684l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.r()) + 90.0f));
            float fSin = this.f141684l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.r()));
            d();
            float[] fArr = this.f141677e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f141674b.setValues(fArr);
            d();
            float[] fArr2 = this.f141677e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f141675c.setValues(fArr2);
            d();
            float[] fArr3 = this.f141677e;
            fArr3[0] = fCos;
            fArr3[1] = f14;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f141676d.setValues(fArr3);
            this.f141675c.preConcat(this.f141674b);
            this.f141676d.preConcat(this.f141675c);
            this.f141673a.preConcat(this.f141676d);
        }
        AbstractC15093a<C17848d, C17848d> abstractC15093a3 = this.f141680h;
        if (abstractC15093a3 != null && (c17848dH = abstractC15093a3.h()) != null && (c17848dH.b() != 1.0f || c17848dH.c() != 1.0f)) {
            this.f141673a.preScale(c17848dH.b(), c17848dH.c());
        }
        AbstractC15093a<PointF, PointF> abstractC15093a4 = this.f141678f;
        if (abstractC15093a4 != null && (pointFH = abstractC15093a4.h()) != null) {
            float f15 = pointFH.x;
            if (f15 != 0.0f || pointFH.y != 0.0f) {
                this.f141673a.preTranslate(-f15, -pointFH.y);
            }
        }
        return this.f141673a;
    }

    public Matrix g(float f10) {
        AbstractC15093a<?, PointF> abstractC15093a = this.f141679g;
        PointF pointFH = abstractC15093a == null ? null : abstractC15093a.h();
        AbstractC15093a<C17848d, C17848d> abstractC15093a2 = this.f141680h;
        C17848d c17848dH = abstractC15093a2 == null ? null : abstractC15093a2.h();
        this.f141673a.reset();
        if (pointFH != null) {
            this.f141673a.preTranslate(pointFH.x * f10, pointFH.y * f10);
        }
        if (c17848dH != null) {
            double d10 = f10;
            this.f141673a.preScale((float) Math.pow(c17848dH.b(), d10), (float) Math.pow(c17848dH.c(), d10));
        }
        AbstractC15093a<Float, Float> abstractC15093a3 = this.f141681i;
        if (abstractC15093a3 != null) {
            float fFloatValue = abstractC15093a3.h().floatValue();
            AbstractC15093a<PointF, PointF> abstractC15093a4 = this.f141678f;
            PointF pointFH2 = abstractC15093a4 != null ? abstractC15093a4.h() : null;
            this.f141673a.preRotate(fFloatValue * f10, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
        }
        return this.f141673a;
    }

    public AbstractC15093a<?, Integer> h() {
        return this.f141682j;
    }

    public AbstractC15093a<?, Float> i() {
        return this.f141685m;
    }

    public void j(float f10) {
        AbstractC15093a<Integer, Integer> abstractC15093a = this.f141682j;
        if (abstractC15093a != null) {
            abstractC15093a.n(f10);
        }
        AbstractC15093a<?, Float> abstractC15093a2 = this.f141685m;
        if (abstractC15093a2 != null) {
            abstractC15093a2.n(f10);
        }
        AbstractC15093a<?, Float> abstractC15093a3 = this.f141686n;
        if (abstractC15093a3 != null) {
            abstractC15093a3.n(f10);
        }
        AbstractC15093a<PointF, PointF> abstractC15093a4 = this.f141678f;
        if (abstractC15093a4 != null) {
            abstractC15093a4.n(f10);
        }
        AbstractC15093a<?, PointF> abstractC15093a5 = this.f141679g;
        if (abstractC15093a5 != null) {
            abstractC15093a5.n(f10);
        }
        AbstractC15093a<C17848d, C17848d> abstractC15093a6 = this.f141680h;
        if (abstractC15093a6 != null) {
            abstractC15093a6.n(f10);
        }
        AbstractC15093a<Float, Float> abstractC15093a7 = this.f141681i;
        if (abstractC15093a7 != null) {
            abstractC15093a7.n(f10);
        }
        C15096d c15096d = this.f141683k;
        if (c15096d != null) {
            c15096d.n(f10);
        }
        C15096d c15096d2 = this.f141684l;
        if (c15096d2 != null) {
            c15096d2.n(f10);
        }
    }

    public p(p6.n nVar) {
        AbstractC15093a<PointF, PointF> abstractC15093aA;
        AbstractC15093a<PointF, PointF> abstractC15093aA2;
        AbstractC15093a<C17848d, C17848d> abstractC15093aA3;
        C15096d c15096dA;
        C15096d c15096dA2;
        C15096d c15096dA3;
        if (nVar.c() == null) {
            abstractC15093aA = null;
        } else {
            abstractC15093aA = nVar.c().a();
        }
        this.f141678f = abstractC15093aA;
        if (nVar.f() == null) {
            abstractC15093aA2 = null;
        } else {
            abstractC15093aA2 = nVar.f().a();
        }
        this.f141679g = abstractC15093aA2;
        if (nVar.h() == null) {
            abstractC15093aA3 = null;
        } else {
            abstractC15093aA3 = nVar.h().a();
        }
        this.f141680h = abstractC15093aA3;
        if (nVar.g() == null) {
            c15096dA = null;
        } else {
            c15096dA = nVar.g().a();
        }
        this.f141681i = c15096dA;
        if (nVar.i() == null) {
            c15096dA2 = null;
        } else {
            c15096dA2 = nVar.i().a();
        }
        this.f141683k = c15096dA2;
        this.f141687o = nVar.l();
        if (this.f141683k != null) {
            this.f141674b = new Matrix();
            this.f141675c = new Matrix();
            this.f141676d = new Matrix();
            this.f141677e = new float[9];
        } else {
            this.f141674b = null;
            this.f141675c = null;
            this.f141676d = null;
            this.f141677e = null;
        }
        if (nVar.j() == null) {
            c15096dA3 = null;
        } else {
            c15096dA3 = nVar.j().a();
        }
        this.f141684l = c15096dA3;
        if (nVar.e() != null) {
            this.f141682j = nVar.e().a();
        }
        if (nVar.k() != null) {
            this.f141685m = nVar.k().a();
        } else {
            this.f141685m = null;
        }
        if (nVar.d() != null) {
            this.f141686n = nVar.d().a();
        } else {
            this.f141686n = null;
        }
    }
}
