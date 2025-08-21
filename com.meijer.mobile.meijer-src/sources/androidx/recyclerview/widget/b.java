package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    private final RecyclerView.h f58290a;

    @Override // androidx.recyclerview.widget.r
    public void a(int i10, int i11) {
        this.f58290a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i10, int i11) {
        this.f58290a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        this.f58290a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.r
    public void d(int i10, int i11) {
        this.f58290a.notifyItemMoved(i10, i11);
    }

    public b(RecyclerView.h hVar) {
        this.f58290a = hVar;
    }
}
