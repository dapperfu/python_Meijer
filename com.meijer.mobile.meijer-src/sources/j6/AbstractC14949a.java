package j6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.medallia.digital.mobilesdk.l3;
import h6.C14474e;
import h6.D;
import i6.C14689a;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15096d;
import p6.C16407b;
import p6.C16409d;
import r6.AbstractC16860b;
import v6.C17643d;
import w6.C17847c;

/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14949a implements AbstractC15093a.b, k, InterfaceC14953e {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.o f139987e;

    /* renamed from: f, reason: collision with root package name */
    protected final AbstractC16860b f139988f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f139990h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f139991i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f139992j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC15093a<?, Integer> f139993k;

    /* renamed from: l, reason: collision with root package name */
    private final List<AbstractC15093a<?, Float>> f139994l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC15093a<?, Float> f139995m;

    /* renamed from: n, reason: collision with root package name */
    private AbstractC15093a<ColorFilter, ColorFilter> f139996n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f139997o;

    /* renamed from: p, reason: collision with root package name */
    float f139998p;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f139983a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f139984b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f139985c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f139986d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f139989g = new ArrayList();

    /* renamed from: j6.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<m> f139999a;

        /* renamed from: b, reason: collision with root package name */
        private final u f140000b;

        private b(u uVar) {
            this.f139999a = new ArrayList();
            this.f140000b = uVar;
        }
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        this.f139987e.invalidateSelf();
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        if (t10 == D.f135026d) {
            this.f139993k.o(c17847c);
            return;
        }
        if (t10 == D.f135041s) {
            this.f139992j.o(c17847c);
            return;
        }
        if (t10 == D.f135017K) {
            AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f139996n;
            if (abstractC15093a != null) {
                this.f139988f.H(abstractC15093a);
            }
            if (c17847c == null) {
                this.f139996n = null;
                return;
            }
            k6.q qVar = new k6.q(c17847c);
            this.f139996n = qVar;
            qVar.a(this);
            this.f139988f.j(this.f139996n);
            return;
        }
        if (t10 == D.f135032j) {
            AbstractC15093a<Float, Float> abstractC15093a2 = this.f139997o;
            if (abstractC15093a2 != null) {
                abstractC15093a2.o(c17847c);
                return;
            }
            k6.q qVar2 = new k6.q(c17847c);
            this.f139997o = qVar2;
            qVar2.a(this);
            this.f139988f.j(this.f139997o);
        }
    }

    AbstractC14949a(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, Paint.Cap cap, Paint.Join join, float f10, C16409d c16409d, C16407b c16407b, List<C16407b> list, C16407b c16407b2) {
        C14689a c14689a = new C14689a(1);
        this.f139991i = c14689a;
        this.f139998p = 0.0f;
        this.f139987e = oVar;
        this.f139988f = abstractC16860b;
        c14689a.setStyle(Paint.Style.STROKE);
        c14689a.setStrokeCap(cap);
        c14689a.setStrokeJoin(join);
        c14689a.setStrokeMiter(f10);
        this.f139993k = c16409d.a();
        this.f139992j = c16407b.a();
        if (c16407b2 == null) {
            this.f139995m = null;
        } else {
            this.f139995m = c16407b2.a();
        }
        this.f139994l = new ArrayList(list.size());
        this.f139990h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f139994l.add(list.get(i10).a());
        }
        abstractC16860b.j(this.f139993k);
        abstractC16860b.j(this.f139992j);
        for (int i11 = 0; i11 < this.f139994l.size(); i11++) {
            abstractC16860b.j(this.f139994l.get(i11));
        }
        AbstractC15093a<?, Float> abstractC15093a = this.f139995m;
        if (abstractC15093a != null) {
            abstractC16860b.j(abstractC15093a);
        }
        this.f139993k.a(this);
        this.f139992j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f139994l.get(i12).a(this);
        }
        AbstractC15093a<?, Float> abstractC15093a2 = this.f139995m;
        if (abstractC15093a2 != null) {
            abstractC15093a2.a(this);
        }
        if (abstractC16860b.x() != null) {
            C15096d c15096dA = abstractC16860b.x().a().a();
            this.f139997o = c15096dA;
            c15096dA.a(this);
            abstractC16860b.j(this.f139997o);
        }
    }

    private void i() {
        float fFloatValue;
        if (C14474e.h()) {
            C14474e.b("StrokeContent#applyDashPattern");
        }
        if (this.f139994l.isEmpty()) {
            if (C14474e.h()) {
                C14474e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f139994l.size(); i10++) {
            this.f139990h[i10] = this.f139994l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f139990h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f139990h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        AbstractC15093a<?, Float> abstractC15093a = this.f139995m;
        if (abstractC15093a == null) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = abstractC15093a.h().floatValue();
        }
        this.f139991i.setPathEffect(new DashPathEffect(this.f139990h, fFloatValue));
        if (C14474e.h()) {
            C14474e.c("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j(android.graphics.Canvas r14, j6.AbstractC14949a.b r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.AbstractC14949a.j(android.graphics.Canvas, j6.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // j6.InterfaceC14951c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List<j6.InterfaceC14951c> r8, java.util.List<j6.InterfaceC14951c> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            j6.c r3 = (j6.InterfaceC14951c) r3
            boolean r4 = r3 instanceof j6.u
            if (r4 == 0) goto L1f
            j6.u r3 = (j6.u) r3
            q6.t$a r4 = r3.k()
            q6.t$a r5 = q6.t.a.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.f(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            j6.c r3 = (j6.InterfaceC14951c) r3
            boolean r4 = r3 instanceof j6.u
            if (r4 == 0) goto L55
            r4 = r3
            j6.u r4 = (j6.u) r4
            q6.t$a r5 = r4.k()
            q6.t$a r6 = q6.t.a.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<j6.a$b> r3 = r7.f139989g
            r3.add(r0)
        L4c:
            j6.a$b r0 = new j6.a$b
            r0.<init>(r4)
            r4.f(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof j6.m
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            j6.a$b r0 = new j6.a$b
            r0.<init>(r2)
        L60:
            java.util.List r4 = j6.AbstractC14949a.b.a(r0)
            j6.m r3 = (j6.m) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<j6.a$b> r8 = r7.f139989g
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.AbstractC14949a.b(java.util.List, java.util.List):void");
    }

    @Override // j6.InterfaceC14953e
    public void e(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        if (C14474e.h()) {
            C14474e.b("StrokeContent#draw");
        }
        if (v6.q.h(matrix)) {
            if (C14474e.h()) {
                C14474e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.f139993k.h().intValue() / 100.0f;
        this.f139991i.setAlpha(v6.l.c((int) (i10 * fIntValue), 0, l3.f93323c));
        this.f139991i.setStrokeWidth(((C15096d) this.f139992j).r());
        if (this.f139991i.getStrokeWidth() <= 0.0f) {
            if (C14474e.h()) {
                C14474e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        i();
        AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f139996n;
        if (abstractC15093a != null) {
            this.f139991i.setColorFilter(abstractC15093a.h());
        }
        AbstractC15093a<Float, Float> abstractC15093a2 = this.f139997o;
        if (abstractC15093a2 != null) {
            float fFloatValue = abstractC15093a2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f139991i.setMaskFilter(null);
            } else if (fFloatValue != this.f139998p) {
                this.f139991i.setMaskFilter(this.f139988f.y(fFloatValue));
            }
            this.f139998p = fFloatValue;
        }
        if (c17643d != null) {
            c17643d.c((int) (fIntValue * 255.0f), this.f139991i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f139989g.size(); i11++) {
            b bVar = this.f139989g.get(i11);
            if (bVar.f140000b != null) {
                j(canvas, bVar);
            } else {
                if (C14474e.h()) {
                    C14474e.b("StrokeContent#buildPath");
                }
                this.f139984b.reset();
                for (int size = bVar.f139999a.size() - 1; size >= 0; size--) {
                    this.f139984b.addPath(((m) bVar.f139999a.get(size)).getPath());
                }
                if (C14474e.h()) {
                    C14474e.c("StrokeContent#buildPath");
                    C14474e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f139984b, this.f139991i);
                if (C14474e.h()) {
                    C14474e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (C14474e.h()) {
            C14474e.c("StrokeContent#draw");
        }
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        v6.l.k(eVar, i10, list, eVar2, this);
    }

    @Override // j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        if (C14474e.h()) {
            C14474e.b("StrokeContent#getBounds");
        }
        this.f139984b.reset();
        for (int i10 = 0; i10 < this.f139989g.size(); i10++) {
            b bVar = this.f139989g.get(i10);
            for (int i11 = 0; i11 < bVar.f139999a.size(); i11++) {
                this.f139984b.addPath(((m) bVar.f139999a.get(i11)).getPath(), matrix);
            }
        }
        this.f139984b.computeBounds(this.f139986d, false);
        float fR = ((C15096d) this.f139992j).r();
        RectF rectF2 = this.f139986d;
        float f10 = fR / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f139986d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (C14474e.h()) {
            C14474e.c("StrokeContent#getBounds");
        }
    }
}
