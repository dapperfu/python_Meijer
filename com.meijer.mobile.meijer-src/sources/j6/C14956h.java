package j6;

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
import h6.C14474e;
import h6.C14478i;
import h6.D;
import i6.C14689a;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC15093a;
import k6.C15096d;
import r6.AbstractC16860b;
import v6.C17643d;
import w6.C17847c;

/* renamed from: j6.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14956h implements InterfaceC14953e, AbstractC15093a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final String f140034a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f140035b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16860b f140036c;

    /* renamed from: d, reason: collision with root package name */
    private final C<LinearGradient> f140037d = new C<>();

    /* renamed from: e, reason: collision with root package name */
    private final C<RadialGradient> f140038e = new C<>();

    /* renamed from: f, reason: collision with root package name */
    private final Path f140039f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f140040g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f140041h;

    /* renamed from: i, reason: collision with root package name */
    private final List<m> f140042i;

    /* renamed from: j, reason: collision with root package name */
    private final q6.g f140043j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC15093a<q6.d, q6.d> f140044k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC15093a<Integer, Integer> f140045l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC15093a<PointF, PointF> f140046m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC15093a<PointF, PointF> f140047n;

    /* renamed from: o, reason: collision with root package name */
    private AbstractC15093a<ColorFilter, ColorFilter> f140048o;

    /* renamed from: p, reason: collision with root package name */
    private k6.q f140049p;

    /* renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.o f140050q;

    /* renamed from: r, reason: collision with root package name */
    private final int f140051r;

    /* renamed from: s, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f140052s;

    /* renamed from: t, reason: collision with root package name */
    float f140053t;

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC14951c interfaceC14951c = list2.get(i10);
            if (interfaceC14951c instanceof m) {
                this.f140042i.add((m) interfaceC14951c);
            }
        }
    }

    private int[] i(int[] iArr) {
        k6.q qVar = this.f140049p;
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
        int iRound = Math.round(this.f140046m.f() * this.f140051r);
        int iRound2 = Math.round(this.f140047n.f() * this.f140051r);
        int iRound3 = Math.round(this.f140044k.f() * this.f140051r);
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
        LinearGradient linearGradientD = this.f140037d.d(j10);
        if (linearGradientD != null) {
            return linearGradientD;
        }
        PointF pointFH = this.f140046m.h();
        PointF pointFH2 = this.f140047n.h();
        q6.d dVarH = this.f140044k.h();
        int[] iArrI = i(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrI.length < 2) {
            iArr = new int[]{iArrI[0], iArrI[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrI;
        }
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f140037d.i(j10, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        RadialGradient radialGradientD = this.f140038e.d(j10);
        if (radialGradientD != null) {
            return radialGradientD;
        }
        PointF pointFH = this.f140046m.h();
        PointF pointFH2 = this.f140047n.h();
        q6.d dVarH = this.f140044k.h();
        int[] iArrI = i(dVarH.d());
        float[] fArrE = dVarH.e();
        if (iArrI.length < 2) {
            iArr = new int[]{iArrI[0], iArrI[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrI;
        }
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f140038e.i(j10, radialGradient);
        return radialGradient;
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        this.f140050q.invalidateSelf();
    }

    @Override // j6.InterfaceC14953e
    public void e(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        if (this.f140035b) {
            return;
        }
        if (C14474e.h()) {
            C14474e.b("GradientFillContent#draw");
        }
        this.f140039f.reset();
        for (int i11 = 0; i11 < this.f140042i.size(); i11++) {
            this.f140039f.addPath(this.f140042i.get(i11).getPath(), matrix);
        }
        this.f140039f.computeBounds(this.f140041h, false);
        Shader shaderK = this.f140043j == q6.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f140040g.setShader(shaderK);
        AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f140048o;
        if (abstractC15093a != null) {
            this.f140040g.setColorFilter(abstractC15093a.h());
        }
        AbstractC15093a<Float, Float> abstractC15093a2 = this.f140052s;
        if (abstractC15093a2 != null) {
            float fFloatValue = abstractC15093a2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f140040g.setMaskFilter(null);
            } else if (fFloatValue != this.f140053t) {
                this.f140040g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f140053t = fFloatValue;
        }
        float fIntValue = this.f140045l.h().intValue() / 100.0f;
        this.f140040g.setAlpha(v6.l.c((int) (i10 * fIntValue), 0, l3.f93323c));
        if (c17643d != null) {
            c17643d.c((int) (fIntValue * 255.0f), this.f140040g);
        }
        canvas.drawPath(this.f140039f, this.f140040g);
        if (C14474e.h()) {
            C14474e.c("GradientFillContent#draw");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        if (t10 == D.f135026d) {
            this.f140045l.o(c17847c);
            return;
        }
        if (t10 == D.f135017K) {
            AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f140048o;
            if (abstractC15093a != null) {
                this.f140036c.H(abstractC15093a);
            }
            if (c17847c == null) {
                this.f140048o = null;
                return;
            }
            k6.q qVar = new k6.q(c17847c);
            this.f140048o = qVar;
            qVar.a(this);
            this.f140036c.j(this.f140048o);
            return;
        }
        if (t10 != D.f135018L) {
            if (t10 == D.f135032j) {
                AbstractC15093a<Float, Float> abstractC15093a2 = this.f140052s;
                if (abstractC15093a2 != null) {
                    abstractC15093a2.o(c17847c);
                    return;
                }
                k6.q qVar2 = new k6.q(c17847c);
                this.f140052s = qVar2;
                qVar2.a(this);
                this.f140036c.j(this.f140052s);
                return;
            }
            return;
        }
        k6.q qVar3 = this.f140049p;
        if (qVar3 != null) {
            this.f140036c.H(qVar3);
        }
        if (c17847c == null) {
            this.f140049p = null;
            return;
        }
        this.f140037d.a();
        this.f140038e.a();
        k6.q qVar4 = new k6.q(c17847c);
        this.f140049p = qVar4;
        qVar4.a(this);
        this.f140036c.j(this.f140049p);
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140034a;
    }

    @Override // j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        this.f140039f.reset();
        for (int i10 = 0; i10 < this.f140042i.size(); i10++) {
            this.f140039f.addPath(this.f140042i.get(i10).getPath(), matrix);
        }
        this.f140039f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public C14956h(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b, q6.e eVar) {
        Path path = new Path();
        this.f140039f = path;
        this.f140040g = new C14689a(1);
        this.f140041h = new RectF();
        this.f140042i = new ArrayList();
        this.f140053t = 0.0f;
        this.f140036c = abstractC16860b;
        this.f140034a = eVar.f();
        this.f140035b = eVar.i();
        this.f140050q = oVar;
        this.f140043j = eVar.e();
        path.setFillType(eVar.c());
        this.f140051r = (int) (c14478i.d() / 32.0f);
        AbstractC15093a<q6.d, q6.d> abstractC15093aA = eVar.d().a();
        this.f140044k = abstractC15093aA;
        abstractC15093aA.a(this);
        abstractC16860b.j(abstractC15093aA);
        AbstractC15093a<Integer, Integer> abstractC15093aA2 = eVar.g().a();
        this.f140045l = abstractC15093aA2;
        abstractC15093aA2.a(this);
        abstractC16860b.j(abstractC15093aA2);
        AbstractC15093a<PointF, PointF> abstractC15093aA3 = eVar.h().a();
        this.f140046m = abstractC15093aA3;
        abstractC15093aA3.a(this);
        abstractC16860b.j(abstractC15093aA3);
        AbstractC15093a<PointF, PointF> abstractC15093aA4 = eVar.b().a();
        this.f140047n = abstractC15093aA4;
        abstractC15093aA4.a(this);
        abstractC16860b.j(abstractC15093aA4);
        if (abstractC16860b.x() != null) {
            C15096d c15096dA = abstractC16860b.x().a().a();
            this.f140052s = c15096dA;
            c15096dA.a(this);
            abstractC16860b.j(this.f140052s);
        }
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        v6.l.k(eVar, i10, list, eVar2, this);
    }
}
