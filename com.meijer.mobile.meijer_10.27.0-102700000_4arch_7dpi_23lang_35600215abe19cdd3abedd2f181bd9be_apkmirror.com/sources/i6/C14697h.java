package i6;

import Z.C;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.medallia.digital.mobilesdk.l3;
import g6.C14205e;
import g6.C14209i;
import g6.D;
import h6.C14380a;
import j6.AbstractC14861a;
import j6.C14864d;
import java.util.ArrayList;
import java.util.List;
import q6.AbstractC16472b;
import u6.C17230d;
import v6.C17514c;

/* renamed from: i6.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14697h implements InterfaceC14694e, AbstractC14861a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final String f137499a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f137500b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16472b f137501c;

    /* renamed from: d, reason: collision with root package name */
    private final C<LinearGradient> f137502d = new C<>();

    /* renamed from: e, reason: collision with root package name */
    private final C<RadialGradient> f137503e = new C<>();

    /* renamed from: f, reason: collision with root package name */
    private final Path f137504f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f137505g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f137506h;

    /* renamed from: i, reason: collision with root package name */
    private final List<m> f137507i;

    /* renamed from: j, reason: collision with root package name */
    private final p6.g f137508j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC14861a<p6.d, p6.d> f137509k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC14861a<Integer, Integer> f137510l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC14861a<PointF, PointF> f137511m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC14861a<PointF, PointF> f137512n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC14861a<ColorFilter, ColorFilter> f137513o;

    /* renamed from: p, reason: collision with root package name */
    private j6.q f137514p;

    /* renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.o f137515q;

    /* renamed from: r, reason: collision with root package name */
    private final int f137516r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f137517s;

    /* renamed from: t, reason: collision with root package name */
    float f137518t;

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC14692c interfaceC14692c = list2.get(i10);
            if (interfaceC14692c instanceof m) {
                this.f137507i.add((m) interfaceC14692c);
            }
        }
    }

    private int[] h(int[] iArr) {
        j6.q qVar = this.f137514p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int iRound = Math.round(this.f137511m.f() * this.f137516r);
        int iRound2 = Math.round(this.f137512n.f() * this.f137516r);
        int iRound3 = Math.round(this.f137509k.f() * this.f137516r);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient k() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        LinearGradient linearGradientD = this.f137502d.d(j10);
        if (linearGradientD != null) {
            return linearGradientD;
        }
        PointF pointFH = this.f137511m.h();
        PointF pointFH2 = this.f137512n.h();
        p6.d dVarH = this.f137509k.h();
        int[] iArrH = h(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrH.length < 2) {
            iArr = new int[]{iArrH[0], iArrH[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrH;
        }
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f137502d.i(j10, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        RadialGradient radialGradientD = this.f137503e.d(j10);
        if (radialGradientD != null) {
            return radialGradientD;
        }
        PointF pointFH = this.f137511m.h();
        PointF pointFH2 = this.f137512n.h();
        p6.d dVarH = this.f137509k.h();
        int[] iArrH = h(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrH.length < 2) {
            iArr = new int[]{iArrH[0], iArrH[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrH;
        }
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f137503e.i(j10, radialGradient);
        return radialGradient;
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        this.f137515q.invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        if (t10 == D.f132850d) {
            this.f137510l.o(c17514c);
            return;
        }
        if (t10 == D.f132841K) {
            AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f137513o;
            if (abstractC14861a != null) {
                this.f137501c.H(abstractC14861a);
            }
            if (c17514c == null) {
                this.f137513o = null;
                return;
            }
            j6.q qVar = new j6.q(c17514c);
            this.f137513o = qVar;
            qVar.a(this);
            this.f137501c.j(this.f137513o);
            return;
        }
        if (t10 != D.f132842L) {
            if (t10 == D.f132856j) {
                AbstractC14861a<Float, Float> abstractC14861a2 = this.f137517s;
                if (abstractC14861a2 != null) {
                    abstractC14861a2.o(c17514c);
                    return;
                }
                j6.q qVar2 = new j6.q(c17514c);
                this.f137517s = qVar2;
                qVar2.a(this);
                this.f137501c.j(this.f137517s);
                return;
            }
            return;
        }
        j6.q qVar3 = this.f137514p;
        if (qVar3 != null) {
            this.f137501c.H(qVar3);
        }
        if (c17514c == null) {
            this.f137514p = null;
            return;
        }
        this.f137502d.a();
        this.f137503e.a();
        j6.q qVar4 = new j6.q(c17514c);
        this.f137514p = qVar4;
        qVar4.a(this);
        this.f137501c.j(this.f137514p);
    }

    @Override // i6.InterfaceC14694e
    public void e(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        if (this.f137500b) {
            return;
        }
        if (C14205e.h()) {
            C14205e.b("GradientFillContent#draw");
        }
        this.f137504f.reset();
        for (int i11 = 0; i11 < this.f137507i.size(); i11++) {
            this.f137504f.addPath(this.f137507i.get(i11).getPath(), matrix);
        }
        this.f137504f.computeBounds(this.f137506h, false);
        Shader shaderK = this.f137508j == p6.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f137505g.setShader(shaderK);
        AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f137513o;
        if (abstractC14861a != null) {
            this.f137505g.setColorFilter(abstractC14861a.h());
        }
        AbstractC14861a<Float, Float> abstractC14861a2 = this.f137517s;
        if (abstractC14861a2 != null) {
            float fFloatValue = abstractC14861a2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f137505g.setMaskFilter(null);
            } else if (fFloatValue != this.f137518t) {
                this.f137505g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f137518t = fFloatValue;
        }
        float fIntValue = this.f137510l.h().intValue() / 100.0f;
        this.f137505g.setAlpha(u6.l.c((int) (i10 * fIntValue), 0, l3.f92484c));
        if (c17230d != null) {
            c17230d.c((int) (fIntValue * 255.0f), this.f137505g);
        }
        canvas.drawPath(this.f137504f, this.f137505g);
        if (C14205e.h()) {
            C14205e.c("GradientFillContent#draw");
        }
    }

    @Override // i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f137504f.reset();
        for (int i10 = 0; i10 < this.f137507i.size(); i10++) {
            this.f137504f.addPath(this.f137507i.get(i10).getPath(), matrix);
        }
        this.f137504f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137499a;
    }

    public C14697h(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b, p6.e eVar) {
        Path path = new Path();
        this.f137504f = path;
        this.f137505g = new C14380a(1);
        this.f137506h = new RectF();
        this.f137507i = new ArrayList();
        this.f137518t = 0.0f;
        this.f137501c = abstractC16472b;
        this.f137499a = eVar.f();
        this.f137500b = eVar.i();
        this.f137515q = oVar;
        this.f137508j = eVar.e();
        path.setFillType(eVar.c());
        this.f137516r = (int) (c14209i.d() / 32.0f);
        AbstractC14861a<p6.d, p6.d> abstractC14861aA = eVar.d().a();
        this.f137509k = abstractC14861aA;
        abstractC14861aA.a(this);
        abstractC16472b.j(abstractC14861aA);
        AbstractC14861a<Integer, Integer> abstractC14861aA2 = eVar.g().a();
        this.f137510l = abstractC14861aA2;
        abstractC14861aA2.a(this);
        abstractC16472b.j(abstractC14861aA2);
        AbstractC14861a<PointF, PointF> abstractC14861aA3 = eVar.h().a();
        this.f137511m = abstractC14861aA3;
        abstractC14861aA3.a(this);
        abstractC16472b.j(abstractC14861aA3);
        AbstractC14861a<PointF, PointF> abstractC14861aA4 = eVar.b().a();
        this.f137512n = abstractC14861aA4;
        abstractC14861aA4.a(this);
        abstractC16472b.j(abstractC14861aA4);
        if (abstractC16472b.x() != null) {
            C14864d c14864dA = abstractC16472b.x().a().a();
            this.f137517s = c14864dA;
            c14864dA.a(this);
            abstractC16472b.j(this.f137517s);
        }
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        u6.l.k(eVar, i10, list, eVar2, this);
    }
}
