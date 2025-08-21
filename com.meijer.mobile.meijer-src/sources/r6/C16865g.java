package r6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import h6.C14478i;
import h6.D;
import j6.C14952d;
import j6.InterfaceC14951c;
import java.util.Collections;
import java.util.List;
import k6.C15095c;
import q6.C16608a;
import q6.q;
import v6.C17643d;
import w6.C17847c;

/* renamed from: r6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16865g extends AbstractC16860b {

    /* renamed from: E, reason: collision with root package name */
    private final C14952d f159359E;

    /* renamed from: F, reason: collision with root package name */
    private final C16861c f159360F;

    /* renamed from: G, reason: collision with root package name */
    private C15095c f159361G;

    @Override // r6.AbstractC16860b
    protected void I(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        this.f159359E.g(eVar, i10, list, eVar2);
    }

    @Override // r6.AbstractC16860b
    void u(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        C15095c c15095c = this.f159361G;
        if (c15095c != null) {
            c17643d = c15095c.b(matrix, i10);
        }
        this.f159359E.e(canvas, matrix, i10, c17643d);
    }

    C16865g(o oVar, C16863e c16863e, C16861c c16861c, C14478i c14478i) {
        super(oVar, c16863e);
        this.f159360F = c16861c;
        C14952d c14952d = new C14952d(oVar, this, new q("__container", c16863e.o(), false), c14478i);
        this.f159359E = c14952d;
        List<InterfaceC14951c> list = Collections.EMPTY_LIST;
        c14952d.b(list, list);
        if (z() != null) {
            this.f159361G = new C15095c(this, this, z());
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
        if (t10 == D.f135027e && (c15095c5 = this.f159361G) != null) {
            c15095c5.c(c17847c);
            return;
        }
        if (t10 == D.f135013G && (c15095c4 = this.f159361G) != null) {
            c15095c4.f(c17847c);
            return;
        }
        if (t10 == D.f135014H && (c15095c3 = this.f159361G) != null) {
            c15095c3.d(c17847c);
            return;
        }
        if (t10 == D.f135015I && (c15095c2 = this.f159361G) != null) {
            c15095c2.e(c17847c);
        } else if (t10 == D.f135016J && (c15095c = this.f159361G) != null) {
            c15095c.g(c17847c);
        }
    }

    @Override // r6.AbstractC16860b, j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        super.h(rectF, matrix, z10);
        this.f159359E.h(rectF, this.f159284o, z10);
    }

    @Override // r6.AbstractC16860b
    public C16608a x() {
        C16608a c16608aX = super.x();
        if (c16608aX != null) {
            return c16608aX;
        }
        return this.f159360F.x();
    }
}
