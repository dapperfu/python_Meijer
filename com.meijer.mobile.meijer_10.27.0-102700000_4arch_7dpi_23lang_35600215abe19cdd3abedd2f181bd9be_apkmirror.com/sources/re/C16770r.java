package re;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: re.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16770r extends AbstractC16769q {

    /* renamed from: f, reason: collision with root package name */
    private boolean f158141f = false;

    /* renamed from: g, reason: collision with root package name */
    private float f158142g = 0.0f;

    /* renamed from: re.r$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            C16770r c16770r = C16770r.this;
            if (c16770r.f158138c == null || c16770r.f158139d.isEmpty()) {
                return;
            }
            C16770r c16770r2 = C16770r.this;
            RectF rectF = c16770r2.f158139d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c16770r2.f158142g);
        }
    }

    private float l() {
        RectF rectF;
        C16765m c16765m = this.f158138c;
        if (c16765m == null || (rectF = this.f158139d) == null) {
            return 0.0f;
        }
        return c16765m.f158071f.a(rectF);
    }

    private void m(View view) {
        view.setOutlineProvider(new a());
    }

    private boolean n() {
        C16765m c16765m;
        if (this.f158139d.isEmpty() || (c16765m = this.f158138c) == null) {
            return false;
        }
        return c16765m.u(this.f158139d);
    }

    private boolean o() {
        C16765m c16765m;
        if (!this.f158139d.isEmpty() && (c16765m = this.f158138c) != null && this.f158137b && !c16765m.u(this.f158139d) && p(this.f158138c)) {
            float fA = this.f158138c.r().a(this.f158139d);
            float fA2 = this.f158138c.t().a(this.f158139d);
            float fA3 = this.f158138c.j().a(this.f158139d);
            float fA4 = this.f158138c.l().a(this.f158139d);
            if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                RectF rectF = this.f158139d;
                rectF.set(rectF.left - fA2, rectF.top, rectF.right, rectF.bottom);
                this.f158142g = fA2;
                return true;
            }
            if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                RectF rectF2 = this.f158139d;
                rectF2.set(rectF2.left, rectF2.top - fA3, rectF2.right, rectF2.bottom);
                this.f158142g = fA3;
                return true;
            }
            if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                RectF rectF3 = this.f158139d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fA, rectF3.bottom);
                this.f158142g = fA;
                return true;
            }
            if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                RectF rectF4 = this.f158139d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fA);
                this.f158142g = fA;
                return true;
            }
        }
        return false;
    }

    @Override // re.AbstractC16769q
    boolean i() {
        return !this.f158141f || this.f158136a;
    }

    C16770r(View view) {
        m(view);
    }

    private static boolean p(C16765m c16765m) {
        if ((c16765m.q() instanceof C16764l) && (c16765m.s() instanceof C16764l) && (c16765m.i() instanceof C16764l) && (c16765m.k() instanceof C16764l)) {
            return true;
        }
        return false;
    }

    @Override // re.AbstractC16769q
    void b(View view) {
        boolean z10;
        this.f158142g = l();
        if (!n() && !o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f158141f = z10;
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }
}
