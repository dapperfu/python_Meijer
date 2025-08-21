package te;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: te.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C17244r extends AbstractC17243q {

    /* renamed from: f, reason: collision with root package name */
    private boolean f162631f = false;

    /* renamed from: g, reason: collision with root package name */
    private float f162632g = 0.0f;

    /* renamed from: te.r$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C17244r c17244r = C17244r.this;
            if (c17244r.f162628c == null || c17244r.f162629d.isEmpty()) {
                return;
            }
            C17244r c17244r2 = C17244r.this;
            RectF rectF = c17244r2.f162629d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c17244r2.f162632g);
        }
    }

    private float l() {
        RectF rectF;
        C17239m c17239m = this.f162628c;
        if (c17239m == null || (rectF = this.f162629d) == null) {
            return 0.0f;
        }
        return c17239m.f162561f.a(rectF);
    }

    private void m(View view) {
        view.setOutlineProvider(new a());
    }

    private boolean n() {
        C17239m c17239m;
        if (this.f162629d.isEmpty() || (c17239m = this.f162628c) == null) {
            return false;
        }
        return c17239m.u(this.f162629d);
    }

    private boolean o() {
        C17239m c17239m;
        if (!this.f162629d.isEmpty() && (c17239m = this.f162628c) != null && this.f162627b && !c17239m.u(this.f162629d) && p(this.f162628c)) {
            float fA = this.f162628c.r().a(this.f162629d);
            float fA2 = this.f162628c.t().a(this.f162629d);
            float fA3 = this.f162628c.j().a(this.f162629d);
            float fA4 = this.f162628c.l().a(this.f162629d);
            if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                RectF rectF = this.f162629d;
                rectF.set(rectF.left - fA2, rectF.top, rectF.right, rectF.bottom);
                this.f162632g = fA2;
                return true;
            }
            if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                RectF rectF2 = this.f162629d;
                rectF2.set(rectF2.left, rectF2.top - fA3, rectF2.right, rectF2.bottom);
                this.f162632g = fA3;
                return true;
            }
            if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                RectF rectF3 = this.f162629d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fA, rectF3.bottom);
                this.f162632g = fA;
                return true;
            }
            if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                RectF rectF4 = this.f162629d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fA);
                this.f162632g = fA;
                return true;
            }
        }
        return false;
    }

    @Override // te.AbstractC17243q
    boolean i() {
        return !this.f162631f || this.f162626a;
    }

    C17244r(View view) {
        m(view);
    }

    private static boolean p(C17239m c17239m) {
        if ((c17239m.q() instanceof C17238l) && (c17239m.s() instanceof C17238l) && (c17239m.i() instanceof C17238l) && (c17239m.k() instanceof C17238l)) {
            return true;
        }
        return false;
    }

    @Override // te.AbstractC17243q
    void b(View view) {
        boolean z10;
        this.f162632g = l();
        if (!n() && !o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f162631f = z10;
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }
}
