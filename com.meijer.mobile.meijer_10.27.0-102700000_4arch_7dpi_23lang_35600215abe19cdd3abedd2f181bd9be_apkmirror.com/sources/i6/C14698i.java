package i6;

import Z.C;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import g6.D;
import j6.AbstractC14861a;
import q6.AbstractC16472b;
import u6.C17230d;
import v6.C17514c;

/* renamed from: i6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14698i extends AbstractC14690a {

    /* renamed from: A, reason: collision with root package name */
    private j6.q f137519A;

    /* renamed from: q, reason: collision with root package name */
    private final String f137520q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f137521r;

    /* renamed from: s, reason: collision with root package name */
    private final C<LinearGradient> f137522s;

    /* renamed from: t, reason: collision with root package name */
    private final C<RadialGradient> f137523t;

    /* renamed from: u, reason: collision with root package name */
    private final RectF f137524u;

    /* renamed from: v, reason: collision with root package name */
    private final p6.g f137525v;

    /* renamed from: w, reason: collision with root package name */
    private final int f137526w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC14861a<p6.d, p6.d> f137527x;

    /* renamed from: y, reason: collision with root package name */
    private final AbstractC14861a<PointF, PointF> f137528y;

    /* renamed from: z, reason: collision with root package name */
    private final AbstractC14861a<PointF, PointF> f137529z;

    private int[] k(int[] iArr) {
        j6.q qVar = this.f137519A;
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

    private int l() {
        int iRound = Math.round(this.f137528y.f() * this.f137526w);
        int iRound2 = Math.round(this.f137529z.f() * this.f137526w);
        int iRound3 = Math.round(this.f137527x.f() * this.f137526w);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    @Override // i6.AbstractC14690a, i6.InterfaceC14694e
    public void e(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        if (this.f137521r) {
            return;
        }
        g(this.f137524u, matrix, false);
        this.f137456i.setShader(this.f137525v == p6.g.LINEAR ? m() : n());
        super.e(canvas, matrix, i10, c17230d);
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137520q;
    }

    public C14698i(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.f fVar) {
        super(oVar, abstractC16472b, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f137522s = new C<>();
        this.f137523t = new C<>();
        this.f137524u = new RectF();
        this.f137520q = fVar.j();
        this.f137525v = fVar.f();
        this.f137521r = fVar.n();
        this.f137526w = (int) (oVar.J().d() / 32.0f);
        AbstractC14861a<p6.d, p6.d> abstractC14861aA = fVar.e().a();
        this.f137527x = abstractC14861aA;
        abstractC14861aA.a(this);
        abstractC16472b.j(abstractC14861aA);
        AbstractC14861a<PointF, PointF> abstractC14861aA2 = fVar.l().a();
        this.f137528y = abstractC14861aA2;
        abstractC14861aA2.a(this);
        abstractC16472b.j(abstractC14861aA2);
        AbstractC14861a<PointF, PointF> abstractC14861aA3 = fVar.d().a();
        this.f137529z = abstractC14861aA3;
        abstractC14861aA3.a(this);
        abstractC16472b.j(abstractC14861aA3);
    }

    private LinearGradient m() {
        long jL = l();
        LinearGradient linearGradientD = this.f137522s.d(jL);
        if (linearGradientD != null) {
            return linearGradientD;
        }
        PointF pointFH = this.f137528y.h();
        PointF pointFH2 = this.f137529z.h();
        p6.d dVarH = this.f137527x.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, k(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f137522s.i(jL, linearGradient);
        return linearGradient;
    }

    private RadialGradient n() {
        long jL = l();
        RadialGradient radialGradientD = this.f137523t.d(jL);
        if (radialGradientD != null) {
            return radialGradientD;
        }
        PointF pointFH = this.f137528y.h();
        PointF pointFH2 = this.f137529z.h();
        p6.d dVarH = this.f137527x.h();
        int[] iArrK = k(dVarH.d());
        float[] fArrE = dVarH.e();
        RadialGradient radialGradient = new RadialGradient(pointFH.x, pointFH.y, (float) Math.hypot(pointFH2.x - r7, pointFH2.y - r8), iArrK, fArrE, Shader.TileMode.CLAMP);
        this.f137523t.i(jL, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i6.AbstractC14690a, n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        super.d(t10, c17514c);
        if (t10 == D.f132842L) {
            j6.q qVar = this.f137519A;
            if (qVar != null) {
                this.f137453f.H(qVar);
            }
            if (c17514c == null) {
                this.f137519A = null;
                return;
            }
            j6.q qVar2 = new j6.q(c17514c);
            this.f137519A = qVar2;
            qVar2.a(this);
            this.f137453f.j(this.f137519A);
        }
    }
}
