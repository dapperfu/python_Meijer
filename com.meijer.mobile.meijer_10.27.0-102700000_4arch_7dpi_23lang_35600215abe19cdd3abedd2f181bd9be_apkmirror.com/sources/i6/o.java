package i6;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import g6.D;
import j6.AbstractC14861a;
import j6.C14864d;
import java.util.List;
import q6.AbstractC16472b;
import v6.C17514c;

/* loaded from: classes4.dex */
public class o implements AbstractC14861a.b, k, m {

    /* renamed from: c, reason: collision with root package name */
    private final String f137558c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f137559d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.o f137560e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC14861a<?, PointF> f137561f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC14861a<?, PointF> f137562g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137563h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f137566k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f137556a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f137557b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final C14691b f137564i = new C14691b();

    /* renamed from: j, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f137565j = null;

    private void h() {
        this.f137566k = false;
        this.f137560e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // i6.InterfaceC14692c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List<i6.InterfaceC14692c> r5, java.util.List<i6.InterfaceC14692c> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            i6.c r0 = (i6.InterfaceC14692c) r0
            boolean r1 = r0 instanceof i6.u
            if (r1 == 0) goto L25
            r1 = r0
            i6.u r1 = (i6.u) r1
            p6.t$a r2 = r1.k()
            p6.t$a r3 = p6.t.a.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            i6.b r0 = r4.f137564i
            r0.a(r1)
            r1.d(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof i6.q
            if (r1 == 0) goto L31
            i6.q r0 = (i6.q) r0
            j6.a r0 = r0.i()
            r4.f137565j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.o.b(java.util.List, java.util.List):void");
    }

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        if (t10 == D.f132858l) {
            this.f137562g.o(c17514c);
        } else if (t10 == D.f132860n) {
            this.f137561f.o(c17514c);
        } else if (t10 == D.f132859m) {
            this.f137563h.o(c17514c);
        }
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137558c;
    }

    @Override // i6.m
    public Path getPath() {
        AbstractC14861a<Float, Float> abstractC14861a;
        if (this.f137566k) {
            return this.f137556a;
        }
        this.f137556a.reset();
        if (this.f137559d) {
            this.f137566k = true;
            return this.f137556a;
        }
        PointF pointFH = this.f137562g.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        AbstractC14861a<?, Float> abstractC14861a2 = this.f137563h;
        float fR = abstractC14861a2 == null ? 0.0f : ((C14864d) abstractC14861a2).r();
        if (fR == 0.0f && (abstractC14861a = this.f137565j) != null) {
            fR = Math.min(abstractC14861a.h().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fR > fMin) {
            fR = fMin;
        }
        PointF pointFH2 = this.f137561f.h();
        this.f137556a.moveTo(pointFH2.x + f10, (pointFH2.y - f11) + fR);
        this.f137556a.lineTo(pointFH2.x + f10, (pointFH2.y + f11) - fR);
        if (fR > 0.0f) {
            RectF rectF = this.f137557b;
            float f12 = pointFH2.x;
            float f13 = fR * 2.0f;
            float f14 = pointFH2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f137556a.arcTo(this.f137557b, 0.0f, 90.0f, false);
        }
        this.f137556a.lineTo((pointFH2.x - f10) + fR, pointFH2.y + f11);
        if (fR > 0.0f) {
            RectF rectF2 = this.f137557b;
            float f15 = pointFH2.x;
            float f16 = pointFH2.y;
            float f17 = fR * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f137556a.arcTo(this.f137557b, 90.0f, 90.0f, false);
        }
        this.f137556a.lineTo(pointFH2.x - f10, (pointFH2.y - f11) + fR);
        if (fR > 0.0f) {
            RectF rectF3 = this.f137557b;
            float f18 = pointFH2.x;
            float f19 = pointFH2.y;
            float f20 = fR * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f137556a.arcTo(this.f137557b, 180.0f, 90.0f, false);
        }
        this.f137556a.lineTo((pointFH2.x + f10) - fR, pointFH2.y - f11);
        if (fR > 0.0f) {
            RectF rectF4 = this.f137557b;
            float f21 = pointFH2.x;
            float f22 = fR * 2.0f;
            float f23 = pointFH2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f137556a.arcTo(this.f137557b, 270.0f, 90.0f, false);
        }
        this.f137556a.close();
        this.f137564i.b(this.f137556a);
        this.f137566k = true;
        return this.f137556a;
    }

    public o(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.l lVar) {
        this.f137558c = lVar.c();
        this.f137559d = lVar.f();
        this.f137560e = oVar;
        AbstractC14861a<PointF, PointF> abstractC14861aA = lVar.d().a();
        this.f137561f = abstractC14861aA;
        AbstractC14861a<PointF, PointF> abstractC14861aA2 = lVar.e().a();
        this.f137562g = abstractC14861aA2;
        C14864d c14864dA = lVar.b().a();
        this.f137563h = c14864dA;
        abstractC16472b.j(abstractC14861aA);
        abstractC16472b.j(abstractC14861aA2);
        abstractC16472b.j(c14864dA);
        abstractC14861aA.a(this);
        abstractC14861aA2.a(this);
        c14864dA.a(this);
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        h();
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        u6.l.k(eVar, i10, list, eVar2, this);
    }
}
