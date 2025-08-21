package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class p extends RecyclerView.A {

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    protected PointF f58517k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f58518l;

    /* renamed from: n, reason: collision with root package name */
    private float f58520n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f58515i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f58516j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f58519m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f58521o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f58522p = 0;

    private int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void n() {
        this.f58522p = 0;
        this.f58521o = 0;
        this.f58517k = null;
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    private float A() {
        if (!this.f58519m) {
            this.f58520n = v(this.f58518l);
            this.f58519m = true;
        }
        return this.f58520n;
    }

    protected int B() {
        PointF pointF = this.f58517k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    @SuppressLint({"UnknownNullness"})
    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int z() {
        PointF pointF = this.f58517k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    @SuppressLint({"UnknownNullness"})
    public p(Context context) {
        this.f58518l = context.getResources().getDisplayMetrics();
    }

    @SuppressLint({"UnknownNullness"})
    protected void C(RecyclerView.A.a aVar) {
        PointF pointFA = a(f());
        if (pointFA != null && (pointFA.x != 0.0f || pointFA.y != 0.0f)) {
            i(pointFA);
            this.f58517k = pointFA;
            this.f58521o = (int) (pointFA.x * 10000.0f);
            this.f58522p = (int) (pointFA.y * 10000.0f);
            aVar.d((int) (this.f58521o * 1.2f), (int) (this.f58522p * 1.2f), (int) (x(10000) * 1.2f), this.f58515i);
            return;
        }
        aVar.b(f());
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    @SuppressLint({"UnknownNullness"})
    protected void l(int i10, int i11, RecyclerView.B b10, RecyclerView.A.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f58521o = y(this.f58521o, i10);
        int iY = y(this.f58522p, i11);
        this.f58522p = iY;
        if (this.f58521o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    @SuppressLint({"UnknownNullness"})
    protected void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f58516j);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public int t(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE != null && pVarE.B()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return s(pVarE.i0(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.l0(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.getPaddingLeft(), pVarE.C0() - pVarE.getPaddingRight(), i10);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE != null && pVarE.C()) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return s(pVarE.m0(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.g0(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.getPaddingTop(), pVarE.o0() - pVarE.getPaddingBottom(), i10);
        }
        return 0;
    }

    protected int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    protected int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }
}
