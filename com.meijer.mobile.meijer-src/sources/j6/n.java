package j6;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import h6.D;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15096d;
import q6.k;
import q6.t;
import r6.AbstractC16860b;
import w6.C17847c;

/* loaded from: classes4.dex */
public class n implements m, AbstractC15093a.b, k {

    /* renamed from: e, reason: collision with root package name */
    private final String f140076e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.o f140077f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f140078g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f140079h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f140080i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140081j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC15093a<?, PointF> f140082k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140083l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140084m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140085n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140086o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140087p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f140089r;

    /* renamed from: a, reason: collision with root package name */
    private final Path f140072a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f140073b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final PathMeasure f140074c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    private final float[] f140075d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    private final C14950b f140088q = new C14950b();

    private void k() {
        this.f140089r = false;
        this.f140077f.invalidateSelf();
    }

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC14951c interfaceC14951c = list.get(i10);
            if (interfaceC14951c instanceof u) {
                u uVar = (u) interfaceC14951c;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f140088q.a(uVar);
                    uVar.f(this);
                }
            }
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f140090a;

        static {
            int[] iArr = new int[k.a.values().length];
            f140090a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f140090a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void i() {
        double d10;
        float f10;
        float f11;
        float f12;
        int iFloor = (int) Math.floor(this.f140081j.h().floatValue());
        double radians = Math.toRadians((this.f140083l == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.f140087p.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f140085n.h().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.f140072a.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double dCeil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                PointF pointFH = this.f140082k.h();
                this.f140072a.offset(pointFH.x, pointFH.y);
                this.f140072a.close();
                return;
            }
            float fCos2 = (float) (d12 * Math.cos(d14));
            float fSin2 = (float) (Math.sin(d14) * d12);
            if (fFloatValue != 0.0f) {
                d10 = dCeil;
                f10 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f13 = fFloatValue2 * f10 * 0.25f;
                float f14 = f13 * fCos3;
                float f15 = f13 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan22)) * f13;
                float fSin4 = f13 * ((float) Math.sin(dAtan22));
                if (d15 == d10 - 1.0d) {
                    this.f140073b.reset();
                    this.f140073b.moveTo(fCos, fSin);
                    float f16 = fCos - f14;
                    float f17 = fSin - f15;
                    float f18 = fCos2 + fCos4;
                    float f19 = fSin2 + fSin4;
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f140073b.cubicTo(f16, f17, f18, f19, f11, f12);
                    this.f140074c.setPath(this.f140073b, false);
                    PathMeasure pathMeasure = this.f140074c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f140075d, null);
                    Path path = this.f140072a;
                    float[] fArr = this.f140075d;
                    path.cubicTo(f16, f17, f18, f19, fArr[0], fArr[1]);
                } else {
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f140072a.cubicTo(fCos - f14, fSin - f15, f11 + fCos4, f12 + fSin4, f11, f12);
                }
                fCos = f11;
                fSin = f12;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d10 = dCeil;
                f10 = fFloatValue;
                if (d15 == d10 - 1.0d) {
                    i10++;
                    dCeil = d10;
                    fFloatValue = f10;
                } else {
                    this.f140072a.lineTo(fCos, fSin);
                }
            }
            d14 += d13;
            i10++;
            dCeil = d10;
            fFloatValue = f10;
        }
    }

    private void j() {
        float f10;
        float f11;
        int i10;
        float fCos;
        float fSin;
        float f12;
        float f13;
        double d10;
        float f14;
        int i11;
        float f15;
        double d11;
        float f16;
        float f17;
        double d12;
        float f18;
        float f19;
        float fFloatValue = this.f140081j.h().floatValue();
        double radians = Math.toRadians((this.f140083l == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d13 = fFloatValue;
        float f20 = (float) (6.283185307179586d / d13);
        if (this.f140080i) {
            f20 *= -1.0f;
        }
        float f21 = f20 / 2.0f;
        float f22 = fFloatValue - ((int) fFloatValue);
        int i12 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
        if (i12 != 0) {
            radians += (1.0f - f22) * f21;
        }
        float fFloatValue2 = this.f140085n.h().floatValue();
        float fFloatValue3 = this.f140084m.h().floatValue();
        AbstractC15093a<?, Float> abstractC15093a = this.f140086o;
        float fFloatValue4 = abstractC15093a != null ? abstractC15093a.h().floatValue() / 100.0f : 0.0f;
        AbstractC15093a<?, Float> abstractC15093a2 = this.f140087p;
        float fFloatValue5 = abstractC15093a2 != null ? abstractC15093a2.h().floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            f14 = ((fFloatValue2 - fFloatValue3) * f22) + fFloatValue3;
            f11 = 0.0f;
            i10 = i12;
            double d14 = f14;
            f10 = 2.0f;
            float fCos2 = (float) (d14 * Math.cos(radians));
            fSin = (float) (d14 * Math.sin(radians));
            this.f140072a.moveTo(fCos2, fSin);
            d10 = radians + ((f20 * f22) / 2.0f);
            f12 = f22;
            fCos = fCos2;
            f13 = f21;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            i10 = i12;
            double d15 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d15);
            fSin = (float) (d15 * Math.sin(radians));
            this.f140072a.moveTo(fCos, fSin);
            f12 = f22;
            f13 = f21;
            d10 = radians + f13;
            f14 = 0.0f;
        }
        double dCeil = Math.ceil(d13) * 2.0d;
        int i13 = 0;
        boolean z10 = false;
        double d16 = d10;
        float f23 = fSin;
        float f24 = fCos;
        double d17 = d16;
        while (true) {
            double d18 = i13;
            if (d18 >= dCeil) {
                PointF pointFH = this.f140082k.h();
                this.f140072a.offset(pointFH.x, pointFH.y);
                this.f140072a.close();
                return;
            }
            float f25 = z10 ? fFloatValue2 : fFloatValue3;
            if (f14 == f11 || d18 != dCeil - 2.0d) {
                i11 = i13;
                f15 = f13;
            } else {
                i11 = i13;
                f15 = (f20 * f12) / f10;
            }
            if (f14 == f11 || d18 != dCeil - 1.0d) {
                d11 = d18;
                f16 = f25;
            } else {
                d11 = d18;
                f16 = f14;
            }
            double d19 = f16;
            float fCos3 = (float) (d19 * Math.cos(d17));
            float f26 = f20;
            float fSin2 = (float) (d19 * Math.sin(d17));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.f140072a.lineTo(fCos3, fSin2);
                f19 = fCos3;
                f18 = fSin2;
                f17 = f13;
                d12 = d17;
            } else {
                f17 = f13;
                d12 = d17;
                double dAtan2 = (float) (Math.atan2(f23, f24) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f27 = f24;
                float f28 = f23;
                f18 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f29 = z10 ? fFloatValue4 : fFloatValue5;
                float f30 = z10 ? fFloatValue5 : fFloatValue4;
                float f31 = (z10 ? fFloatValue3 : fFloatValue2) * f29 * 0.47829f;
                float f32 = fCos4 * f31;
                float f33 = f31 * fSin3;
                float f34 = (z10 ? fFloatValue2 : fFloatValue3) * f30 * 0.47829f;
                float f35 = fCos5 * f34;
                float f36 = f34 * fSin4;
                if (i10 != 0) {
                    if (i11 == 0) {
                        f32 *= f12;
                        f33 *= f12;
                    } else if (d11 == dCeil - 1.0d) {
                        f35 *= f12;
                        f36 *= f12;
                    }
                }
                f19 = fCos3;
                this.f140072a.cubicTo(f27 - f32, f28 - f33, fCos3 + f35, f18 + f36, f19, f18);
            }
            d17 = d12 + f15;
            z10 = !z10;
            i13 = i11 + 1;
            f13 = f17;
            f24 = f19;
            f23 = f18;
            f20 = f26;
        }
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        AbstractC15093a<?, Float> abstractC15093a;
        AbstractC15093a<?, Float> abstractC15093a2;
        if (t10 == D.f135045w) {
            this.f140081j.o(c17847c);
            return;
        }
        if (t10 == D.f135046x) {
            this.f140083l.o(c17847c);
            return;
        }
        if (t10 == D.f135036n) {
            this.f140082k.o(c17847c);
            return;
        }
        if (t10 == D.f135047y && (abstractC15093a2 = this.f140084m) != null) {
            abstractC15093a2.o(c17847c);
            return;
        }
        if (t10 == D.f135048z) {
            this.f140085n.o(c17847c);
            return;
        }
        if (t10 == D.f135007A && (abstractC15093a = this.f140086o) != null) {
            abstractC15093a.o(c17847c);
        } else if (t10 == D.f135008B) {
            this.f140087p.o(c17847c);
        }
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140076e;
    }

    @Override // j6.m
    public Path getPath() {
        if (this.f140089r) {
            return this.f140072a;
        }
        this.f140072a.reset();
        if (this.f140079h) {
            this.f140089r = true;
            return this.f140072a;
        }
        int i10 = a.f140090a[this.f140078g.ordinal()];
        if (i10 == 1) {
            j();
        } else if (i10 == 2) {
            i();
        }
        this.f140072a.close();
        this.f140088q.b(this.f140072a);
        this.f140089r = true;
        return this.f140072a;
    }

    public n(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.k kVar) {
        this.f140077f = oVar;
        this.f140076e = kVar.d();
        k.a aVarJ = kVar.j();
        this.f140078g = aVarJ;
        this.f140079h = kVar.k();
        this.f140080i = kVar.l();
        C15096d c15096dA = kVar.g().a();
        this.f140081j = c15096dA;
        AbstractC15093a<PointF, PointF> abstractC15093aA = kVar.h().a();
        this.f140082k = abstractC15093aA;
        C15096d c15096dA2 = kVar.i().a();
        this.f140083l = c15096dA2;
        C15096d c15096dA3 = kVar.e().a();
        this.f140085n = c15096dA3;
        C15096d c15096dA4 = kVar.f().a();
        this.f140087p = c15096dA4;
        k.a aVar = k.a.STAR;
        if (aVarJ == aVar) {
            this.f140084m = kVar.b().a();
            this.f140086o = kVar.c().a();
        } else {
            this.f140084m = null;
            this.f140086o = null;
        }
        abstractC16860b.j(c15096dA);
        abstractC16860b.j(abstractC15093aA);
        abstractC16860b.j(c15096dA2);
        abstractC16860b.j(c15096dA3);
        abstractC16860b.j(c15096dA4);
        if (aVarJ == aVar) {
            abstractC16860b.j(this.f140084m);
            abstractC16860b.j(this.f140086o);
        }
        c15096dA.a(this);
        abstractC15093aA.a(this);
        c15096dA2.a(this);
        c15096dA3.a(this);
        c15096dA4.a(this);
        if (aVarJ == aVar) {
            this.f140084m.a(this);
            this.f140086o.a(this);
        }
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        k();
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        v6.l.k(eVar, i10, list, eVar2, this);
    }
}
