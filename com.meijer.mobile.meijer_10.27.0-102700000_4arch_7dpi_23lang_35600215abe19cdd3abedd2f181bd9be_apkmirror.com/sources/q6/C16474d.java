package q6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import com.fullstory.FS;
import g6.D;
import g6.z;
import h6.C14380a;
import j6.AbstractC14861a;
import j6.C14863c;
import j6.q;
import u6.C17230d;
import u6.p;
import v6.C17514c;

/* renamed from: q6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16474d extends AbstractC16472b {

    /* renamed from: E, reason: collision with root package name */
    private final Paint f156861E;

    /* renamed from: F, reason: collision with root package name */
    private final Rect f156862F;

    /* renamed from: G, reason: collision with root package name */
    private final Rect f156863G;

    /* renamed from: H, reason: collision with root package name */
    private final RectF f156864H;

    /* renamed from: I, reason: collision with root package name */
    private final z f156865I;

    /* renamed from: J, reason: collision with root package name */
    private AbstractC14861a<ColorFilter, ColorFilter> f156866J;

    /* renamed from: K, reason: collision with root package name */
    private AbstractC14861a<Bitmap, Bitmap> f156867K;

    /* renamed from: L, reason: collision with root package name */
    private C14863c f156868L;

    /* renamed from: M, reason: collision with root package name */
    private p f156869M;

    /* renamed from: N, reason: collision with root package name */
    private p.a f156870N;

    private Bitmap P() {
        Bitmap bitmapH;
        AbstractC14861a<Bitmap, Bitmap> abstractC14861a = this.f156867K;
        if (abstractC14861a != null && (bitmapH = abstractC14861a.h()) != null) {
            return bitmapH;
        }
        Bitmap bitmapG = this.f156837p.G(this.f156838q.n());
        if (bitmapG != null) {
            return bitmapG;
        }
        z zVar = this.f156865I;
        if (zVar != null) {
            return zVar.b();
        }
        return null;
    }

    C16474d(o oVar, C16475e c16475e) {
        super(oVar, c16475e);
        this.f156861E = new C14380a(3);
        this.f156862F = new Rect();
        this.f156863G = new Rect();
        this.f156864H = new RectF();
        this.f156865I = oVar.P(c16475e.n());
        if (z() != null) {
            this.f156868L = new C14863c(this, this, z());
        }
    }

    @Override // q6.AbstractC16472b, n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        C14863c c14863c;
        C14863c c14863c2;
        C14863c c14863c3;
        C14863c c14863c4;
        C14863c c14863c5;
        super.d(t10, c17514c);
        if (t10 == D.f132841K) {
            if (c17514c == null) {
                this.f156866J = null;
                return;
            } else {
                this.f156866J = new q(c17514c);
                return;
            }
        }
        if (t10 == D.f132844N) {
            if (c17514c == null) {
                this.f156867K = null;
                return;
            } else {
                this.f156867K = new q(c17514c);
                return;
            }
        }
        if (t10 == D.f132851e && (c14863c5 = this.f156868L) != null) {
            c14863c5.c(c17514c);
            return;
        }
        if (t10 == D.f132837G && (c14863c4 = this.f156868L) != null) {
            c14863c4.f(c17514c);
            return;
        }
        if (t10 == D.f132838H && (c14863c3 = this.f156868L) != null) {
            c14863c3.d(c17514c);
            return;
        }
        if (t10 == D.f132839I && (c14863c2 = this.f156868L) != null) {
            c14863c2.e(c17514c);
        } else if (t10 == D.f132840J && (c14863c = this.f156868L) != null) {
            c14863c.g(c17514c);
        }
    }

    @Override // q6.AbstractC16472b, i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        Bitmap bitmapP;
        super.g(rectF, matrix, z10);
        if (this.f156865I != null) {
            float fE = u6.q.e();
            if (!this.f156837p.Q() && (bitmapP = P()) != null) {
                rectF.set(0.0f, 0.0f, bitmapP.getWidth() * fE, bitmapP.getHeight() * fE);
            } else {
                rectF.set(0.0f, 0.0f, this.f156865I.f() * fE, this.f156865I.d() * fE);
            }
            this.f156836o.mapRect(rectF);
        }
    }

    @Override // q6.AbstractC16472b
    public void u(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        Bitmap bitmapP = P();
        if (bitmapP != null && !FS.bitmap_isRecycled(bitmapP) && this.f156865I != null) {
            float fE = u6.q.e();
            this.f156861E.setAlpha(i10);
            AbstractC14861a<ColorFilter, ColorFilter> abstractC14861a = this.f156866J;
            if (abstractC14861a != null) {
                this.f156861E.setColorFilter(abstractC14861a.h());
            }
            C14863c c14863c = this.f156868L;
            if (c14863c != null) {
                c17230d = c14863c.b(matrix, i10);
            }
            boolean z10 = false;
            this.f156862F.set(0, 0, bitmapP.getWidth(), bitmapP.getHeight());
            if (this.f156837p.Q()) {
                this.f156863G.set(0, 0, (int) (this.f156865I.f() * fE), (int) (this.f156865I.d() * fE));
            } else {
                this.f156863G.set(0, 0, (int) (bitmapP.getWidth() * fE), (int) (bitmapP.getHeight() * fE));
            }
            if (c17230d != null) {
                z10 = true;
            }
            if (z10) {
                if (this.f156869M == null) {
                    this.f156869M = new p();
                }
                if (this.f156870N == null) {
                    this.f156870N = new p.a();
                }
                this.f156870N.f();
                c17230d.d(i10, this.f156870N);
                RectF rectF = this.f156864H;
                Rect rect = this.f156863G;
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                matrix.mapRect(this.f156864H);
                canvas = this.f156869M.j(canvas, this.f156864H, this.f156870N);
            }
            canvas.save();
            canvas.concat(matrix);
            canvas.drawBitmap(bitmapP, this.f156862F, this.f156863G, this.f156861E);
            if (z10) {
                this.f156869M.e();
                if (this.f156869M.f()) {
                    return;
                }
            }
            canvas.restore();
        }
    }
}
