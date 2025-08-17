package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f58301a;

    /* renamed from: b, reason: collision with root package name */
    private int f58302b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f58303c;

    class a extends t {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.t
        public int h() {
            return this.f58301a.C0();
        }

        @Override // androidx.recyclerview.widget.t
        public int i() {
            return this.f58301a.C0() - this.f58301a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.t
        public int j() {
            return this.f58301a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.t
        public int k() {
            return this.f58301a.D0();
        }

        @Override // androidx.recyclerview.widget.t
        public int l() {
            return this.f58301a.p0();
        }

        @Override // androidx.recyclerview.widget.t
        public int m() {
            return this.f58301a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.t
        public int n() {
            return (this.f58301a.C0() - this.f58301a.getPaddingLeft()) - this.f58301a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.t
        public int p(View view) {
            this.f58301a.B0(view, true, this.f58303c);
            return this.f58303c.right;
        }

        @Override // androidx.recyclerview.widget.t
        public int q(View view) {
            this.f58301a.B0(view, true, this.f58303c);
            return this.f58303c.left;
        }

        @Override // androidx.recyclerview.widget.t
        public void r(int i10) {
            this.f58301a.S0(i10);
        }

        @Override // androidx.recyclerview.widget.t
        public int d(View view) {
            return this.f58301a.l0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f58301a.k0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f58301a.j0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int g(View view) {
            return this.f58301a.i0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }
    }

    class b extends t {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.t
        public int h() {
            return this.f58301a.o0();
        }

        @Override // androidx.recyclerview.widget.t
        public int i() {
            return this.f58301a.o0() - this.f58301a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.t
        public int j() {
            return this.f58301a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.t
        public int k() {
            return this.f58301a.p0();
        }

        @Override // androidx.recyclerview.widget.t
        public int l() {
            return this.f58301a.D0();
        }

        @Override // androidx.recyclerview.widget.t
        public int m() {
            return this.f58301a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.t
        public int n() {
            return (this.f58301a.o0() - this.f58301a.getPaddingTop()) - this.f58301a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.t
        public int p(View view) {
            this.f58301a.B0(view, true, this.f58303c);
            return this.f58303c.bottom;
        }

        @Override // androidx.recyclerview.widget.t
        public int q(View view) {
            this.f58301a.B0(view, true, this.f58303c);
            return this.f58303c.top;
        }

        @Override // androidx.recyclerview.widget.t
        public void r(int i10) {
            this.f58301a.T0(i10);
        }

        @Override // androidx.recyclerview.widget.t
        public int d(View view) {
            return this.f58301a.g0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f58301a.j0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f58301a.k0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.t
        public int g(View view) {
            return this.f58301a.m0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }
    }

    /* synthetic */ t(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    private t(RecyclerView.p pVar) {
        this.f58302b = Integer.MIN_VALUE;
        this.f58303c = new Rect();
        this.f58301a = pVar;
    }

    public static t a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static t b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static t c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public int o() {
        if (Integer.MIN_VALUE == this.f58302b) {
            return 0;
        }
        return n() - this.f58302b;
    }

    public void s() {
        this.f58302b = n();
    }
}
