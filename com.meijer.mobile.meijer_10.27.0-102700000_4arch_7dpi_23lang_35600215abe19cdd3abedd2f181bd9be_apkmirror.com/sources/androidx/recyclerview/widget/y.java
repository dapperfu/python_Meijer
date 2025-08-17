package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class y extends RecyclerView.s {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f58311a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f58312b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.u f58313c = new a();

    class a extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        boolean f58314a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f58314a = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 == 0 && this.f58314a) {
                this.f58314a = false;
                y.this.j();
            }
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.A d(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract View f(RecyclerView.p pVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int g(RecyclerView.p pVar, int i10, int i11);

    private void e() {
        this.f58311a.removeOnScrollListener(this.f58313c);
        this.f58311a.setOnFlingListener(null);
    }

    private void h() throws IllegalStateException {
        if (this.f58311a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f58311a.addOnScrollListener(this.f58313c);
        this.f58311a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.A aD;
        int iG;
        if (!(pVar instanceof RecyclerView.A.b) || (aD = d(pVar)) == null || (iG = g(pVar, i10, i11)) == -1) {
            return false;
        }
        aD.p(iG);
        pVar.a2(aD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f58311a.getLayoutManager();
        if (layoutManager == null || this.f58311a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f58311a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f58311a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f58311a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f58312b = new Scroller(this.f58311a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    void j() {
        RecyclerView.p layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f58311a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f58311a.smoothScrollBy(i10, iArrC[1]);
    }
}
