package i6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.medallia.digital.mobilesdk.l3;
import g6.C14205e;
import g6.D;
import h6.C14380a;
import j6.AbstractC14861a;
import j6.C14864d;
import java.util.ArrayList;
import java.util.List;
import o6.C15998b;
import o6.C16000d;
import q6.AbstractC16472b;
import u6.C17230d;
import v6.C17514c;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14690a implements AbstractC14861a.b, k, InterfaceC14694e {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.o f137452e;

    /* renamed from: f, reason: collision with root package name */
    protected final AbstractC16472b f137453f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f137455h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f137456i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137457j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC14861a<?, Integer> f137458k;

    /* renamed from: l, reason: collision with root package name */
    private final List<AbstractC14861a<?, Float>> f137459l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC14861a<?, Float> f137460m;

    /* renamed from: n, reason: collision with root package name */
    private AbstractC14861a<ColorFilter, ColorFilter> f137461n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f137462o;

    /* renamed from: p, reason: collision with root package name */
    float f137463p;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f137448a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f137449b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f137450c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f137451d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f137454g = new ArrayList();

    /* renamed from: i6.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<m> f137464a;

        /* renamed from: b, reason: collision with root package name */
        private final u f137465b;

        private b(u uVar) {
            this.f137464a = new ArrayList();
            this.f137465b = uVar;
        }
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        this.f137452e.invalidateSelf();
    }

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        if (t10 == D.f132850d) {
            this.f137458k.o(c17514c);
            return;
        }
        if (t10 == D.f132865s) {
            this.f137457j.o(c17514c);
            return;
        }
        if (t10 == D.f132841K) {
            AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f137461n;
            if (abstractC14861a != null) {
                this.f137453f.H(abstractC14861a);
            }
            if (c17514c == null) {
                this.f137461n = null;
                return;
            }
            j6.q qVar = new j6.q(c17514c);
            this.f137461n = qVar;
            qVar.a(this);
            this.f137453f.j(this.f137461n);
            return;
        }
        if (t10 == D.f132856j) {
            AbstractC14861a<Float, Float> abstractC14861a2 = this.f137462o;
            if (abstractC14861a2 != null) {
                abstractC14861a2.o(c17514c);
                return;
            }
            j6.q qVar2 = new j6.q(c17514c);
            this.f137462o = qVar2;
            qVar2.a(this);
            this.f137453f.j(this.f137462o);
        }
    }

    AbstractC14690a(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, Paint.Cap cap, Paint.Join join, float f10, C16000d c16000d, C15998b c15998b, List<C15998b> list, C15998b c15998b2) {
        C14380a c14380a = new C14380a(1);
        this.f137456i = c14380a;
        this.f137463p = 0.0f;
        this.f137452e = oVar;
        this.f137453f = abstractC16472b;
        c14380a.setStyle(Paint.Style.STROKE);
        c14380a.setStrokeCap(cap);
        c14380a.setStrokeJoin(join);
        c14380a.setStrokeMiter(f10);
        this.f137458k = c16000d.a();
        this.f137457j = c15998b.a();
        if (c15998b2 == null) {
            this.f137460m = null;
        } else {
            this.f137460m = c15998b2.a();
        }
        this.f137459l = new ArrayList(list.size());
        this.f137455h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f137459l.add(list.get(i10).a());
        }
        abstractC16472b.j(this.f137458k);
        abstractC16472b.j(this.f137457j);
        for (int i11 = 0; i11 < this.f137459l.size(); i11++) {
            abstractC16472b.j(this.f137459l.get(i11));
        }
        AbstractC14861a<?, Float> abstractC14861a = this.f137460m;
        if (abstractC14861a != null) {
            abstractC16472b.j(abstractC14861a);
        }
        this.f137458k.a(this);
        this.f137457j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f137459l.get(i12).a(this);
        }
        AbstractC14861a<?, Float> abstractC14861a2 = this.f137460m;
        if (abstractC14861a2 != null) {
            abstractC14861a2.a(this);
        }
        if (abstractC16472b.x() != null) {
            C14864d c14864dA = abstractC16472b.x().a().a();
            this.f137462o = c14864dA;
            c14864dA.a(this);
            abstractC16472b.j(this.f137462o);
        }
    }

    private void h() {
        float fFloatValue;
        if (C14205e.h()) {
            C14205e.b("StrokeContent#applyDashPattern");
        }
        if (this.f137459l.isEmpty()) {
            if (C14205e.h()) {
                C14205e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f137459l.size(); i10++) {
            this.f137455h[i10] = this.f137459l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f137455h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f137455h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        AbstractC14861a<?, Float> abstractC14861a = this.f137460m;
        if (abstractC14861a == null) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = abstractC14861a.h().floatValue();
        }
        this.f137456i.setPathEffect(new DashPathEffect(this.f137455h, fFloatValue));
        if (C14205e.h()) {
            C14205e.c("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j(android.graphics.Canvas r14, i6.AbstractC14690a.b r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.AbstractC14690a.j(android.graphics.Canvas, i6.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // i6.InterfaceC14692c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List<i6.InterfaceC14692c> r8, java.util.List<i6.InterfaceC14692c> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            i6.c r3 = (i6.InterfaceC14692c) r3
            boolean r4 = r3 instanceof i6.u
            if (r4 == 0) goto L1f
            i6.u r3 = (i6.u) r3
            p6.t$a r4 = r3.k()
            p6.t$a r5 = p6.t.a.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.d(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            i6.c r3 = (i6.InterfaceC14692c) r3
            boolean r4 = r3 instanceof i6.u
            if (r4 == 0) goto L55
            r4 = r3
            i6.u r4 = (i6.u) r4
            p6.t$a r5 = r4.k()
            p6.t$a r6 = p6.t.a.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<i6.a$b> r3 = r7.f137454g
            r3.add(r0)
        L4c:
            i6.a$b r0 = new i6.a$b
            r0.<init>(r4)
            r4.d(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof i6.m
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            i6.a$b r0 = new i6.a$b
            r0.<init>(r2)
        L60:
            java.util.List r4 = i6.AbstractC14690a.b.a(r0)
            i6.m r3 = (i6.m) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<i6.a$b> r8 = r7.f137454g
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.AbstractC14690a.b(java.util.List, java.util.List):void");
    }

    @Override // i6.InterfaceC14694e
    public void e(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        if (C14205e.h()) {
            C14205e.b("StrokeContent#draw");
        }
        if (u6.q.h(matrix)) {
            if (C14205e.h()) {
                C14205e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.f137458k.h().intValue() / 100.0f;
        this.f137456i.setAlpha(u6.l.c((int) (i10 * fIntValue), 0, l3.f92484c));
        this.f137456i.setStrokeWidth(((C14864d) this.f137457j).r());
        if (this.f137456i.getStrokeWidth() <= 0.0f) {
            if (C14205e.h()) {
                C14205e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        h();
        AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f137461n;
        if (abstractC14861a != null) {
            this.f137456i.setColorFilter(abstractC14861a.h());
        }
        AbstractC14861a<Float, Float> abstractC14861a2 = this.f137462o;
        if (abstractC14861a2 != null) {
            float fFloatValue = abstractC14861a2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f137456i.setMaskFilter(null);
            } else if (fFloatValue != this.f137463p) {
                this.f137456i.setMaskFilter(this.f137453f.y(fFloatValue));
            }
            this.f137463p = fFloatValue;
        }
        if (c17230d != null) {
            c17230d.c((int) (fIntValue * 255.0f), this.f137456i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f137454g.size(); i11++) {
            b bVar = this.f137454g.get(i11);
            if (bVar.f137465b != null) {
                j(canvas, bVar);
            } else {
                if (C14205e.h()) {
                    C14205e.b("StrokeContent#buildPath");
                }
                this.f137449b.reset();
                for (int size = bVar.f137464a.size() - 1; size >= 0; size--) {
                    this.f137449b.addPath(((m) bVar.f137464a.get(size)).getPath());
                }
                if (C14205e.h()) {
                    C14205e.c("StrokeContent#buildPath");
                    C14205e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f137449b, this.f137456i);
                if (C14205e.h()) {
                    C14205e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (C14205e.h()) {
            C14205e.c("StrokeContent#draw");
        }
    }

    @Override // i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        if (C14205e.h()) {
            C14205e.b("StrokeContent#getBounds");
        }
        this.f137449b.reset();
        for (int i10 = 0; i10 < this.f137454g.size(); i10++) {
            b bVar = this.f137454g.get(i10);
            for (int i11 = 0; i11 < bVar.f137464a.size(); i11++) {
                this.f137449b.addPath(((m) bVar.f137464a.get(i11)).getPath(), matrix);
            }
        }
        this.f137449b.computeBounds(this.f137451d, false);
        float fR = ((C14864d) this.f137457j).r();
        RectF rectF2 = this.f137451d;
        float f10 = fR / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f137451d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (C14205e.h()) {
            C14205e.c("StrokeContent#getBounds");
        }
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        u6.l.k(eVar, i10, list, eVar2, this);
    }
}
