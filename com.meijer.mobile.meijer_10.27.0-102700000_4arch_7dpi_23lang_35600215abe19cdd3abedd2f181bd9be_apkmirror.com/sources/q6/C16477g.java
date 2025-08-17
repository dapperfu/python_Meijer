package q6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import g6.C14209i;
import g6.D;
import i6.C14693d;
import i6.InterfaceC14692c;
import j6.C14863c;
import java.util.Collections;
import java.util.List;
import p6.C16263a;
import p6.q;
import u6.C17230d;
import v6.C17514c;

/* renamed from: q6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16477g extends AbstractC16472b {

    /* renamed from: E, reason: collision with root package name */
    private final C14693d f156911E;

    /* renamed from: F, reason: collision with root package name */
    private final C16473c f156912F;

    /* renamed from: G, reason: collision with root package name */
    private C14863c f156913G;

    @Override // q6.AbstractC16472b
    protected void I(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        this.f156911E.i(eVar, i10, list, eVar2);
    }

    @Override // q6.AbstractC16472b
    void u(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        C14863c c14863c = this.f156913G;
        if (c14863c != null) {
            c17230d = c14863c.b(matrix, i10);
        }
        this.f156911E.e(canvas, matrix, i10, c17230d);
    }

    C16477g(o oVar, C16475e c16475e, C16473c c16473c, C14209i c14209i) {
        super(oVar, c16475e);
        this.f156912F = c16473c;
        C14693d c14693d = new C14693d(oVar, this, new q("__container", c16475e.o(), false), c14209i);
        this.f156911E = c14693d;
        List<InterfaceC14692c> list = Collections.EMPTY_LIST;
        c14693d.b(list, list);
        if (z() != null) {
            this.f156913G = new C14863c(this, this, z());
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
        if (t10 == D.f132851e && (c14863c5 = this.f156913G) != null) {
            c14863c5.c(c17514c);
            return;
        }
        if (t10 == D.f132837G && (c14863c4 = this.f156913G) != null) {
            c14863c4.f(c17514c);
            return;
        }
        if (t10 == D.f132838H && (c14863c3 = this.f156913G) != null) {
            c14863c3.d(c17514c);
            return;
        }
        if (t10 == D.f132839I && (c14863c2 = this.f156913G) != null) {
            c14863c2.e(c17514c);
        } else if (t10 == D.f132840J && (c14863c = this.f156913G) != null) {
            c14863c.g(c17514c);
        }
    }

    @Override // q6.AbstractC16472b, i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        super.g(rectF, matrix, z10);
        this.f156911E.g(rectF, this.f156836o, z10);
    }

    @Override // q6.AbstractC16472b
    public C16263a x() {
        C16263a c16263aX = super.x();
        if (c16263aX != null) {
            return c16263aX;
        }
        return this.f156912F.x();
    }
}
