package r6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import h6.D;
import i6.C14689a;
import k6.AbstractC15093a;
import k6.q;
import v6.C17643d;
import w6.C17847c;

/* renamed from: r6.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16866h extends AbstractC16860b {

    /* renamed from: E, reason: collision with root package name */
    private final RectF f159362E;

    /* renamed from: F, reason: collision with root package name */
    private final Paint f159363F;

    /* renamed from: G, reason: collision with root package name */
    private final float[] f159364G;

    /* renamed from: H, reason: collision with root package name */
    private final Path f159365H;

    /* renamed from: I, reason: collision with root package name */
    private final C16863e f159366I;

    /* renamed from: J, reason: collision with root package name */
    private AbstractC15093a<ColorFilter, ColorFilter> f159367J;

    /* renamed from: K, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159368K;

    @Override // r6.AbstractC16860b
    public void u(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        int iAlpha = Color.alpha(this.f159366I.p());
        if (iAlpha == 0) {
            return;
        }
        AbstractC15093a<Integer, Integer> abstractC15093a = this.f159368K;
        Integer numH = abstractC15093a == null ? null : abstractC15093a.h();
        if (numH != null) {
            this.f159363F.setColor(numH.intValue());
        } else {
            this.f159363F.setColor(this.f159366I.p());
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.f159293x.h() == null ? 100 : this.f159293x.h().h().intValue())) / 100.0f) * 255.0f);
        this.f159363F.setAlpha(iIntValue);
        if (c17643d != null) {
            c17643d.a(this.f159363F);
        } else {
            this.f159363F.clearShadowLayer();
        }
        AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a2 = this.f159367J;
        if (abstractC15093a2 != null) {
            this.f159363F.setColorFilter(abstractC15093a2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f159364G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f159366I.r();
            float[] fArr2 = this.f159364G;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f159366I.r();
            this.f159364G[5] = this.f159366I.q();
            float[] fArr3 = this.f159364G;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f159366I.q();
            matrix.mapPoints(this.f159364G);
            this.f159365H.reset();
            Path path = this.f159365H;
            float[] fArr4 = this.f159364G;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f159365H;
            float[] fArr5 = this.f159364G;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f159365H;
            float[] fArr6 = this.f159364G;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f159365H;
            float[] fArr7 = this.f159364G;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f159365H;
            float[] fArr8 = this.f159364G;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f159365H.close();
            canvas.drawPath(this.f159365H, this.f159363F);
        }
    }

    C16866h(o oVar, C16863e c16863e) {
        super(oVar, c16863e);
        this.f159362E = new RectF();
        C14689a c14689a = new C14689a();
        this.f159363F = c14689a;
        this.f159364G = new float[8];
        this.f159365H = new Path();
        this.f159366I = c16863e;
        c14689a.setAlpha(0);
        c14689a.setStyle(Paint.Style.FILL);
        c14689a.setColor(c16863e.p());
    }

    @Override // r6.AbstractC16860b, o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        super.f(t10, c17847c);
        if (t10 == D.f135017K) {
            if (c17847c == null) {
                this.f159367J = null;
                return;
            } else {
                this.f159367J = new q(c17847c);
                return;
            }
        }
        if (t10 == D.f135023a) {
            if (c17847c == null) {
                this.f159368K = null;
                this.f159363F.setColor(this.f159366I.p());
            } else {
                this.f159368K = new q(c17847c);
            }
        }
    }

    @Override // r6.AbstractC16860b, j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        super.h(rectF, matrix, z10);
        this.f159362E.set(0.0f, 0.0f, this.f159366I.r(), this.f159366I.q());
        this.f159284o.mapRect(this.f159362E);
        rectF.set(this.f159362E);
    }
}
