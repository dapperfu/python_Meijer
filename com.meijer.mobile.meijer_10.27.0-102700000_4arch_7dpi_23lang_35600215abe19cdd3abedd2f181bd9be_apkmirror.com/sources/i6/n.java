package i6;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import g6.D;
import j6.AbstractC14861a;
import j6.C14864d;
import java.util.List;
import p6.k;
import p6.t;
import q6.AbstractC16472b;
import v6.C17514c;

/* loaded from: classes4.dex */
public class n implements m, AbstractC14861a.b, k {

    /* renamed from: e, reason: collision with root package name */
    private final String f137541e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.o f137542f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f137543g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f137544h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f137545i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137546j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC14861a<?, PointF> f137547k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137548l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137549m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137550n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137551o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137552p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f137554r;

    /* renamed from: a, reason: collision with root package name */
    private final Path f137537a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f137538b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final PathMeasure f137539c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    private final float[] f137540d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    private final C14691b f137553q = new C14691b();

    private void k() {
        this.f137554r = false;
        this.f137542f.invalidateSelf();
    }

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC14692c interfaceC14692c = list.get(i10);
            if (interfaceC14692c instanceof u) {
                u uVar = (u) interfaceC14692c;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f137553q.a(uVar);
                    uVar.d(this);
                }
            }
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137555a;

        static {
            int[] iArr = new int[k.a.values().length];
            f137555a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137555a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void h() {
        double d10;
        float f10;
        float f11;
        float f12;
        int iFloor = (int) Math.floor(this.f137546j.h().floatValue());
        double radians = Math.toRadians((this.f137548l == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = this.f137552p.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f137550n.h().floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.f137537a.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double dCeil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                PointF pointFH = this.f137547k.h();
                this.f137537a.offset(pointFH.x, pointFH.y);
                this.f137537a.close();
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
                    this.f137538b.reset();
                    this.f137538b.moveTo(fCos, fSin);
                    float f16 = fCos - f14;
                    float f17 = fSin - f15;
                    float f18 = fCos2 + fCos4;
                    float f19 = fSin2 + fSin4;
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f137538b.cubicTo(f16, f17, f18, f19, f11, f12);
                    this.f137539c.setPath(this.f137538b, false);
                    PathMeasure pathMeasure = this.f137539c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f137540d, null);
                    Path path = this.f137537a;
                    float[] fArr = this.f137540d;
                    path.cubicTo(f16, f17, f18, f19, fArr[0], fArr[1]);
                } else {
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f137537a.cubicTo(fCos - f14, fSin - f15, f11 + fCos4, f12 + fSin4, f11, f12);
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
                    this.f137537a.lineTo(fCos, fSin);
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
        float fFloatValue = this.f137546j.h().floatValue();
        double radians = Math.toRadians((this.f137548l == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d13 = fFloatValue;
        float f20 = (float) (6.283185307179586d / d13);
        if (this.f137545i) {
            f20 *= -1.0f;
        }
        float f21 = f20 / 2.0f;
        float f22 = fFloatValue - ((int) fFloatValue);
        int i12 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
        if (i12 != 0) {
            radians += (1.0f - f22) * f21;
        }
        float fFloatValue2 = this.f137550n.h().floatValue();
        float fFloatValue3 = this.f137549m.h().floatValue();
        AbstractC14861a<?, Float> abstractC14861a = this.f137551o;
        float fFloatValue4 = abstractC14861a != null ? abstractC14861a.h().floatValue() / 100.0f : 0.0f;
        AbstractC14861a<?, Float> abstractC14861a2 = this.f137552p;
        float fFloatValue5 = abstractC14861a2 != null ? abstractC14861a2.h().floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            f14 = ((fFloatValue2 - fFloatValue3) * f22) + fFloatValue3;
            f11 = 0.0f;
            i10 = i12;
            double d14 = f14;
            f10 = 2.0f;
            float fCos2 = (float) (d14 * Math.cos(radians));
            fSin = (float) (d14 * Math.sin(radians));
            this.f137537a.moveTo(fCos2, fSin);
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
            this.f137537a.moveTo(fCos, fSin);
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
                PointF pointFH = this.f137547k.h();
                this.f137537a.offset(pointFH.x, pointFH.y);
                this.f137537a.close();
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
                this.f137537a.lineTo(fCos3, fSin2);
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
                this.f137537a.cubicTo(f27 - f32, f28 - f33, fCos3 + f35, f18 + f36, f19, f18);
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

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        AbstractC14861a<?, Float> abstractC14861a;
        AbstractC14861a<?, Float> abstractC14861a2;
        if (t10 == D.f132869w) {
            this.f137546j.o(c17514c);
            return;
        }
        if (t10 == D.f132870x) {
            this.f137548l.o(c17514c);
            return;
        }
        if (t10 == D.f132860n) {
            this.f137547k.o(c17514c);
            return;
        }
        if (t10 == D.f132871y && (abstractC14861a2 = this.f137549m) != null) {
            abstractC14861a2.o(c17514c);
            return;
        }
        if (t10 == D.f132872z) {
            this.f137550n.o(c17514c);
            return;
        }
        if (t10 == D.f132831A && (abstractC14861a = this.f137551o) != null) {
            abstractC14861a.o(c17514c);
        } else if (t10 == D.f132832B) {
            this.f137552p.o(c17514c);
        }
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137541e;
    }

    @Override // i6.m
    public Path getPath() {
        if (this.f137554r) {
            return this.f137537a;
        }
        this.f137537a.reset();
        if (this.f137544h) {
            this.f137554r = true;
            return this.f137537a;
        }
        int i10 = a.f137555a[this.f137543g.ordinal()];
        if (i10 == 1) {
            j();
        } else if (i10 == 2) {
            h();
        }
        this.f137537a.close();
        this.f137553q.b(this.f137537a);
        this.f137554r = true;
        return this.f137537a;
    }

    public n(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.k kVar) {
        this.f137542f = oVar;
        this.f137541e = kVar.d();
        k.a aVarJ = kVar.j();
        this.f137543g = aVarJ;
        this.f137544h = kVar.k();
        this.f137545i = kVar.l();
        C14864d c14864dA = kVar.g().a();
        this.f137546j = c14864dA;
        AbstractC14861a<PointF, PointF> abstractC14861aA = kVar.h().a();
        this.f137547k = abstractC14861aA;
        C14864d c14864dA2 = kVar.i().a();
        this.f137548l = c14864dA2;
        C14864d c14864dA3 = kVar.e().a();
        this.f137550n = c14864dA3;
        C14864d c14864dA4 = kVar.f().a();
        this.f137552p = c14864dA4;
        k.a aVar = k.a.STAR;
        if (aVarJ == aVar) {
            this.f137549m = kVar.b().a();
            this.f137551o = kVar.c().a();
        } else {
            this.f137549m = null;
            this.f137551o = null;
        }
        abstractC16472b.j(c14864dA);
        abstractC16472b.j(abstractC14861aA);
        abstractC16472b.j(c14864dA2);
        abstractC16472b.j(c14864dA3);
        abstractC16472b.j(c14864dA4);
        if (aVarJ == aVar) {
            abstractC16472b.j(this.f137549m);
            abstractC16472b.j(this.f137551o);
        }
        c14864dA.a(this);
        abstractC14861aA.a(this);
        c14864dA2.a(this);
        c14864dA3.a(this);
        c14864dA4.a(this);
        if (aVarJ == aVar) {
            this.f137549m.a(this);
            this.f137551o.a(this);
        }
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        k();
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        u6.l.k(eVar, i10, list, eVar2, this);
    }
}
