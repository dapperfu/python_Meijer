package q6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import g6.D;
import h6.C14380a;
import j6.AbstractC14861a;
import j6.q;
import u6.C17230d;
import v6.C17514c;

/* renamed from: q6.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16478h extends AbstractC16472b {

    /* renamed from: E, reason: collision with root package name */
    private final RectF f156914E;

    /* renamed from: F, reason: collision with root package name */
    private final Paint f156915F;

    /* renamed from: G, reason: collision with root package name */
    private final float[] f156916G;

    /* renamed from: H, reason: collision with root package name */
    private final Path f156917H;

    /* renamed from: I, reason: collision with root package name */
    private final C16475e f156918I;

    /* renamed from: J, reason: collision with root package name */
    private AbstractC14861a<ColorFilter, ColorFilter> f156919J;

    /* renamed from: K, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156920K;

    @Override // q6.AbstractC16472b
    public void u(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        int iAlpha = Color.alpha(this.f156918I.p());
        if (iAlpha == 0) {
            return;
        }
        AbstractC14861a<Integer, Integer> abstractC14861a = this.f156920K;
        Integer numH = abstractC14861a == null ? null : abstractC14861a.h();
        if (numH != null) {
            this.f156915F.setColor(numH.intValue());
        } else {
            this.f156915F.setColor(this.f156918I.p());
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.f156845x.h() == null ? 100 : this.f156845x.h().h().intValue())) / 100.0f) * 255.0f);
        this.f156915F.setAlpha(iIntValue);
        if (c17230d != null) {
            c17230d.a(this.f156915F);
        } else {
            this.f156915F.clearShadowLayer();
        }
        AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a2 = this.f156919J;
        if (abstractC14861a2 != null) {
            this.f156915F.setColorFilter(abstractC14861a2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f156916G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f156918I.r();
            float[] fArr2 = this.f156916G;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f156918I.r();
            this.f156916G[5] = this.f156918I.q();
            float[] fArr3 = this.f156916G;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f156918I.q();
            matrix.mapPoints(this.f156916G);
            this.f156917H.reset();
            Path path = this.f156917H;
            float[] fArr4 = this.f156916G;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f156917H;
            float[] fArr5 = this.f156916G;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f156917H;
            float[] fArr6 = this.f156916G;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f156917H;
            float[] fArr7 = this.f156916G;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f156917H;
            float[] fArr8 = this.f156916G;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f156917H.close();
            canvas.drawPath(this.f156917H, this.f156915F);
        }
    }

    C16478h(o oVar, C16475e c16475e) {
        super(oVar, c16475e);
        this.f156914E = new RectF();
        C14380a c14380a = new C14380a();
        this.f156915F = c14380a;
        this.f156916G = new float[8];
        this.f156917H = new Path();
        this.f156918I = c16475e;
        c14380a.setAlpha(0);
        c14380a.setStyle(Paint.Style.FILL);
        c14380a.setColor(c16475e.p());
    }

    @Override // q6.AbstractC16472b, n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        super.d(t10, c17514c);
        if (t10 == D.f132841K) {
            if (c17514c == null) {
                this.f156919J = null;
                return;
            } else {
                this.f156919J = new q(c17514c);
                return;
            }
        }
        if (t10 == D.f132847a) {
            if (c17514c == null) {
                this.f156920K = null;
                this.f156915F.setColor(this.f156918I.p());
            } else {
                this.f156920K = new q(c17514c);
            }
        }
    }

    @Override // q6.AbstractC16472b, i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        super.g(rectF, matrix, z10);
        this.f156914E.set(0.0f, 0.0f, this.f156918I.r(), this.f156918I.q());
        this.f156836o.mapRect(this.f156914E);
        rectF.set(this.f156914E);
    }
}
