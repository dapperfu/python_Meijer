package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
class o {

    /* renamed from: b, reason: collision with root package name */
    int f58283b;

    /* renamed from: c, reason: collision with root package name */
    int f58284c;

    /* renamed from: d, reason: collision with root package name */
    int f58285d;

    /* renamed from: e, reason: collision with root package name */
    int f58286e;

    /* renamed from: h, reason: collision with root package name */
    boolean f58289h;

    /* renamed from: i, reason: collision with root package name */
    boolean f58290i;

    /* renamed from: a, reason: collision with root package name */
    boolean f58282a = true;

    /* renamed from: f, reason: collision with root package name */
    int f58287f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f58288g = 0;

    boolean a(RecyclerView.B b10) {
        int i10 = this.f58284c;
        return i10 >= 0 && i10 < b10.b();
    }

    View b(RecyclerView.w wVar) {
        View viewP = wVar.p(this.f58284c);
        this.f58284c += this.f58285d;
        return viewP;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f58283b + ", mCurrentPosition=" + this.f58284c + ", mItemDirection=" + this.f58285d + ", mLayoutDirection=" + this.f58286e + ", mStartLine=" + this.f58287f + ", mEndLine=" + this.f58288g + '}';
    }

    o() {
    }
}
