package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
class o {

    /* renamed from: b, reason: collision with root package name */
    int f58507b;

    /* renamed from: c, reason: collision with root package name */
    int f58508c;

    /* renamed from: d, reason: collision with root package name */
    int f58509d;

    /* renamed from: e, reason: collision with root package name */
    int f58510e;

    /* renamed from: h, reason: collision with root package name */
    boolean f58513h;

    /* renamed from: i, reason: collision with root package name */
    boolean f58514i;

    /* renamed from: a, reason: collision with root package name */
    boolean f58506a = true;

    /* renamed from: f, reason: collision with root package name */
    int f58511f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f58512g = 0;

    boolean a(RecyclerView.B b10) {
        int i10 = this.f58508c;
        return i10 >= 0 && i10 < b10.b();
    }

    View b(RecyclerView.w wVar) {
        View viewP = wVar.p(this.f58508c);
        this.f58508c += this.f58509d;
        return viewP;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f58507b + ", mCurrentPosition=" + this.f58508c + ", mItemDirection=" + this.f58509d + ", mLayoutDirection=" + this.f58510e + ", mStartLine=" + this.f58511f + ", mEndLine=" + this.f58512g + '}';
    }

    o() {
    }
}
