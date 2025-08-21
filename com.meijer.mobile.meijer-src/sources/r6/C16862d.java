package r6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import com.fullstory.FS;
import h6.D;
import h6.z;
import i6.C14689a;
import k6.AbstractC15093a;
import k6.C15095c;
import k6.q;
import v6.C17643d;
import v6.p;
import w6.C17847c;

/* renamed from: r6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16862d extends AbstractC16860b {

    /* renamed from: E, reason: collision with root package name */
    private final Paint f159309E;

    /* renamed from: F, reason: collision with root package name */
    private final Rect f159310F;

    /* renamed from: G, reason: collision with root package name */
    private final Rect f159311G;

    /* renamed from: H, reason: collision with root package name */
    private final RectF f159312H;

    /* renamed from: I, reason: collision with root package name */
    private final z f159313I;

    /* renamed from: J, reason: collision with root package name */
    private AbstractC15093a<ColorFilter, ColorFilter> f159314J;

    /* renamed from: K, reason: collision with root package name */
    private AbstractC15093a<Bitmap, Bitmap> f159315K;

    /* renamed from: L, reason: collision with root package name */
    private C15095c f159316L;

    /* renamed from: M, reason: collision with root package name */
    private p f159317M;

    /* renamed from: N, reason: collision with root package name */
    private p.a f159318N;

    private Bitmap P() {
        Bitmap bitmapH;
        AbstractC15093a<Bitmap, Bitmap> abstractC15093a = this.f159315K;
        if (abstractC15093a != null && (bitmapH = abstractC15093a.h()) != null) {
            return bitmapH;
        }
        Bitmap bitmapG = this.f159285p.G(this.f159286q.n());
        if (bitmapG != null) {
            return bitmapG;
        }
        z zVar = this.f159313I;
        if (zVar != null) {
            return zVar.b();
        }
        return null;
    }

    C16862d(o oVar, C16863e c16863e) {
        super(oVar, c16863e);
        this.f159309E = new C14689a(3);
        this.f159310F = new Rect();
        this.f159311G = new Rect();
        this.f159312H = new RectF();
        this.f159313I = oVar.P(c16863e.n());
        if (z() != null) {
            this.f159316L = new C15095c(this, this, z());
        }
    }

    @Override // r6.AbstractC16860b, o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        C15095c c15095c;
        C15095c c15095c2;
        C15095c c15095c3;
        C15095c c15095c4;
        C15095c c15095c5;
        super.f(t10, c17847c);
        if (t10 == D.f135017K) {
            if (c17847c == null) {
                this.f159314J = null;
                return;
            } else {
                this.f159314J = new q(c17847c);
                return;
            }
        }
        if (t10 == D.f135020N) {
            if (c17847c == null) {
                this.f159315K = null;
                return;
            } else {
                this.f159315K = new q(c17847c);
                return;
            }
        }
        if (t10 == D.f135027e && (c15095c5 = this.f159316L) != null) {
            c15095c5.c(c17847c);
            return;
        }
        if (t10 == D.f135013G && (c15095c4 = this.f159316L) != null) {
            c15095c4.f(c17847c);
            return;
        }
        if (t10 == D.f135014H && (c15095c3 = this.f159316L) != null) {
            c15095c3.d(c17847c);
            return;
        }
        if (t10 == D.f135015I && (c15095c2 = this.f159316L) != null) {
            c15095c2.e(c17847c);
        } else if (t10 == D.f135016J && (c15095c = this.f159316L) != null) {
            c15095c.g(c17847c);
        }
    }

    @Override // r6.AbstractC16860b, j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        Bitmap bitmapP;
        super.h(rectF, matrix, z10);
        if (this.f159313I != null) {
            float fE = v6.q.e();
            if (!this.f159285p.Q() && (bitmapP = P()) != null) {
                rectF.set(0.0f, 0.0f, bitmapP.getWidth() * fE, bitmapP.getHeight() * fE);
            } else {
                rectF.set(0.0f, 0.0f, this.f159313I.f() * fE, this.f159313I.d() * fE);
            }
            this.f159284o.mapRect(rectF);
        }
    }

    @Override // r6.AbstractC16860b
    public void u(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        Bitmap bitmapP = P();
        if (bitmapP != null && !FS.bitmap_isRecycled(bitmapP) && this.f159313I != null) {
            float fE = v6.q.e();
            this.f159309E.setAlpha(i10);
            AbstractC15093a<ColorFilter, ColorFilter> abstractC15093a = this.f159314J;
            if (abstractC15093a != null) {
                this.f159309E.setColorFilter(abstractC15093a.h());
            }
            C15095c c15095c = this.f159316L;
            if (c15095c != null) {
                c17643d = c15095c.b(matrix, i10);
            }
            boolean z10 = false;
            this.f159310F.set(0, 0, bitmapP.getWidth(), bitmapP.getHeight());
            if (this.f159285p.Q()) {
                this.f159311G.set(0, 0, (int) (this.f159313I.f() * fE), (int) (this.f159313I.d() * fE));
            } else {
                this.f159311G.set(0, 0, (int) (bitmapP.getWidth() * fE), (int) (bitmapP.getHeight() * fE));
            }
            if (c17643d != null) {
                z10 = true;
            }
            if (z10) {
                if (this.f159317M == null) {
                    this.f159317M = new p();
                }
                if (this.f159318N == null) {
                    this.f159318N = new p.a();
                }
                this.f159318N.f();
                c17643d.d(i10, this.f159318N);
                RectF rectF = this.f159312H;
                Rect rect = this.f159311G;
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                matrix.mapRect(this.f159312H);
                canvas = this.f159317M.j(canvas, this.f159312H, this.f159318N);
            }
            canvas.save();
            canvas.concat(matrix);
            canvas.drawBitmap(bitmapP, this.f159310F, this.f159311G, this.f159309E);
            if (z10) {
                this.f159317M.e();
                if (this.f159317M.f()) {
                    return;
                }
            }
            canvas.restore();
        }
    }
}
