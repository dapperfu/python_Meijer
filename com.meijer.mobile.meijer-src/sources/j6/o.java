package j6;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h6.D;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15096d;
import r6.AbstractC16860b;
import w6.C17847c;

/* loaded from: classes4.dex */
public class o implements AbstractC15093a.b, k, m {

    /* renamed from: c, reason: collision with root package name */
    private final String f140093c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f140094d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.o f140095e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC15093a<?, PointF> f140096f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC15093a<?, PointF> f140097g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f140098h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f140101k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f140091a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f140092b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final C14950b f140099i = new C14950b();

    /* renamed from: j, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f140100j = null;

    private void i() {
        this.f140101k = false;
        this.f140095e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // j6.InterfaceC14951c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List<j6.InterfaceC14951c> r5, java.util.List<j6.InterfaceC14951c> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            j6.c r0 = (j6.InterfaceC14951c) r0
            boolean r1 = r0 instanceof j6.u
            if (r1 == 0) goto L25
            r1 = r0
            j6.u r1 = (j6.u) r1
            q6.t$a r2 = r1.k()
            q6.t$a r3 = q6.t.a.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            j6.b r0 = r4.f140099i
            r0.a(r1)
            r1.f(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof j6.q
            if (r1 == 0) goto L31
            j6.q r0 = (j6.q) r0
            k6.a r0 = r0.i()
            r4.f140100j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.o.b(java.util.List, java.util.List):void");
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        if (t10 == D.f135034l) {
            this.f140097g.o(c17847c);
        } else if (t10 == D.f135036n) {
            this.f140096f.o(c17847c);
        } else if (t10 == D.f135035m) {
            this.f140098h.o(c17847c);
        }
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140093c;
    }

    @Override // j6.m
    public Path getPath() {
        AbstractC15093a<Float, Float> abstractC15093a;
        if (this.f140101k) {
            return this.f140091a;
        }
        this.f140091a.reset();
        if (this.f140094d) {
            this.f140101k = true;
            return this.f140091a;
        }
        PointF pointFH = this.f140097g.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        AbstractC15093a<?, Float> abstractC15093a2 = this.f140098h;
        float fR = abstractC15093a2 == null ? 0.0f : ((C15096d) abstractC15093a2).r();
        if (fR == 0.0f && (abstractC15093a = this.f140100j) != null) {
            fR = Math.min(abstractC15093a.h().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fR > fMin) {
            fR = fMin;
        }
        PointF pointFH2 = this.f140096f.h();
        this.f140091a.moveTo(pointFH2.x + f10, (pointFH2.y - f11) + fR);
        this.f140091a.lineTo(pointFH2.x + f10, (pointFH2.y + f11) - fR);
        if (fR > 0.0f) {
            RectF rectF = this.f140092b;
            float f12 = pointFH2.x;
            float f13 = fR * 2.0f;
            float f14 = pointFH2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f140091a.arcTo(this.f140092b, 0.0f, 90.0f, false);
        }
        this.f140091a.lineTo((pointFH2.x - f10) + fR, pointFH2.y + f11);
        if (fR > 0.0f) {
            RectF rectF2 = this.f140092b;
            float f15 = pointFH2.x;
            float f16 = pointFH2.y;
            float f17 = fR * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f140091a.arcTo(this.f140092b, 90.0f, 90.0f, false);
        }
        this.f140091a.lineTo(pointFH2.x - f10, (pointFH2.y - f11) + fR);
        if (fR > 0.0f) {
            RectF rectF3 = this.f140092b;
            float f18 = pointFH2.x;
            float f19 = pointFH2.y;
            float f20 = fR * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f140091a.arcTo(this.f140092b, 180.0f, 90.0f, false);
        }
        this.f140091a.lineTo((pointFH2.x + f10) - fR, pointFH2.y - f11);
        if (fR > 0.0f) {
            RectF rectF4 = this.f140092b;
            float f21 = pointFH2.x;
            float f22 = fR * 2.0f;
            float f23 = pointFH2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f140091a.arcTo(this.f140092b, 270.0f, 90.0f, false);
        }
        this.f140091a.close();
        this.f140099i.b(this.f140091a);
        this.f140101k = true;
        return this.f140091a;
    }

    public o(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.l lVar) {
        this.f140093c = lVar.c();
        this.f140094d = lVar.f();
        this.f140095e = oVar;
        AbstractC15093a<PointF, PointF> abstractC15093aA = lVar.d().a();
        this.f140096f = abstractC15093aA;
        AbstractC15093a<PointF, PointF> abstractC15093aA2 = lVar.e().a();
        this.f140097g = abstractC15093aA2;
        C15096d c15096dA = lVar.b().a();
        this.f140098h = c15096dA;
        abstractC16860b.j(abstractC15093aA);
        abstractC16860b.j(abstractC15093aA2);
        abstractC16860b.j(c15096dA);
        abstractC15093aA.a(this);
        abstractC15093aA2.a(this);
        c15096dA.a(this);
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        i();
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        v6.l.k(eVar, i10, list, eVar2, this);
    }
}
