package j6;

import Z.C;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import h6.D;
import k6.AbstractC15093a;
import r6.AbstractC16860b;
import v6.C17643d;
import w6.C17847c;

/* renamed from: j6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14957i extends AbstractC14949a {

    /* renamed from: A, reason: collision with root package name */
    private k6.q f140054A;

    /* renamed from: q, reason: collision with root package name */
    private final String f140055q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f140056r;

    /* renamed from: s, reason: collision with root package name */
    private final C<LinearGradient> f140057s;

    /* renamed from: t, reason: collision with root package name */
    private final C<RadialGradient> f140058t;

    /* renamed from: u, reason: collision with root package name */
    private final RectF f140059u;

    /* renamed from: v, reason: collision with root package name */
    private final q6.g f140060v;

    /* renamed from: w, reason: collision with root package name */
    private final int f140061w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC15093a<q6.d, q6.d> f140062x;

    /* renamed from: y, reason: collision with root package name */
    private final AbstractC15093a<PointF, PointF> f140063y;

    /* renamed from: z, reason: collision with root package name */
    private final AbstractC15093a<PointF, PointF> f140064z;

    private int[] k(int[] iArr) {
        k6.q qVar = this.f140054A;
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
        int iRound = Math.round(this.f140063y.f() * this.f140061w);
        int iRound2 = Math.round(this.f140064z.f() * this.f140061w);
        int iRound3 = Math.round(this.f140062x.f() * this.f140061w);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    @Override // j6.AbstractC14949a, j6.InterfaceC14953e
    public void e(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        if (this.f140056r) {
            return;
        }
        h(this.f140059u, matrix, false);
        this.f139991i.setShader(this.f140060v == q6.g.LINEAR ? m() : n());
        super.e(canvas, matrix, i10, c17643d);
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140055q;
    }

    public C14957i(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.f fVar) {
        super(oVar, abstractC16860b, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f140057s = new C<>();
        this.f140058t = new C<>();
        this.f140059u = new RectF();
        this.f140055q = fVar.j();
        this.f140060v = fVar.f();
        this.f140056r = fVar.n();
        this.f140061w = (int) (oVar.J().d() / 32.0f);
        AbstractC15093a<q6.d, q6.d> abstractC15093aA = fVar.e().a();
        this.f140062x = abstractC15093aA;
        abstractC15093aA.a(this);
        abstractC16860b.j(abstractC15093aA);
        AbstractC15093a<PointF, PointF> abstractC15093aA2 = fVar.l().a();
        this.f140063y = abstractC15093aA2;
        abstractC15093aA2.a(this);
        abstractC16860b.j(abstractC15093aA2);
        AbstractC15093a<PointF, PointF> abstractC15093aA3 = fVar.d().a();
        this.f140064z = abstractC15093aA3;
        abstractC15093aA3.a(this);
        abstractC16860b.j(abstractC15093aA3);
    }

    private LinearGradient m() {
        long jL = l();
        LinearGradient linearGradientD = this.f140057s.d(jL);
        if (linearGradientD != null) {
            return linearGradientD;
        }
        PointF pointFH = this.f140063y.h();
        PointF pointFH2 = this.f140064z.h();
        q6.d dVarH = this.f140062x.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, k(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f140057s.i(jL, linearGradient);
        return linearGradient;
    }

    private RadialGradient n() {
        long jL = l();
        RadialGradient radialGradientD = this.f140058t.d(jL);
        if (radialGradientD != null) {
            return radialGradientD;
        }
        PointF pointFH = this.f140063y.h();
        PointF pointFH2 = this.f140064z.h();
        q6.d dVarH = this.f140062x.h();
        int[] iArrK = k(dVarH.d());
        float[] fArrE = dVarH.e();
        RadialGradient radialGradient = new RadialGradient(pointFH.x, pointFH.y, (float) Math.hypot(pointFH2.x - r7, pointFH2.y - r8), iArrK, fArrE, Shader.TileMode.CLAMP);
        this.f140058t.i(jL, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.AbstractC14949a, o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        super.f(t10, c17847c);
        if (t10 == D.f135018L) {
            k6.q qVar = this.f140054A;
            if (qVar != null) {
                this.f139988f.H(qVar);
            }
            if (c17847c == null) {
                this.f140054A = null;
                return;
            }
            k6.q qVar2 = new k6.q(c17847c);
            this.f140054A = qVar2;
            qVar2.a(this);
            this.f139988f.j(this.f140054A);
        }
    }
}
