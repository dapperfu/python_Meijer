package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public abstract class x extends RecyclerView.m {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateAdd(RecyclerView.F f10);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateChange(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateChange(RecyclerView.F f10, RecyclerView.F f11, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f57948a;
        int i13 = cVar.f57949b;
        if (f11.shouldIgnore()) {
            int i14 = cVar.f57948a;
            i11 = cVar.f57949b;
            i10 = i14;
        } else {
            i10 = cVar2.f57948a;
            i11 = cVar2.f57949b;
        }
        return animateChange(f10, f11, i12, i13, i10, i11);
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateMove(RecyclerView.F f10, int i10, int i11, int i12, int i13);

    @SuppressLint({"UnknownNullness"})
    public abstract boolean animateRemove(RecyclerView.F f10);

    @SuppressLint({"UnknownNullness"})
    public void onAddFinished(RecyclerView.F f10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onAddStarting(RecyclerView.F f10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeFinished(RecyclerView.F f10, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onChangeStarting(RecyclerView.F f10, boolean z10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveFinished(RecyclerView.F f10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onMoveStarting(RecyclerView.F f10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveFinished(RecyclerView.F f10) {
    }

    @SuppressLint({"UnknownNullness"})
    public void onRemoveStarting(RecyclerView.F f10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateAppearance(RecyclerView.F f10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f57948a) == (i11 = cVar2.f57948a) && cVar.f57949b == cVar2.f57949b)) ? animateAdd(f10) : animateMove(f10, i10, cVar.f57949b, i11, cVar2.f57949b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animateDisappearance(RecyclerView.F f10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f57948a;
        int i11 = cVar.f57949b;
        View view = f10.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f57948a;
        int top = cVar2 == null ? view.getTop() : cVar2.f57949b;
        if (f10.isRemoved() || (i10 == left && i11 == top)) {
            return animateRemove(f10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(f10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean animatePersistence(RecyclerView.F f10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f57948a;
        int i11 = cVar2.f57948a;
        if (i10 != i11 || cVar.f57949b != cVar2.f57949b) {
            return animateMove(f10, i10, cVar.f57949b, i11, cVar2.f57949b);
        }
        dispatchMoveFinished(f10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.F f10) {
        return !this.mSupportsChangeAnimations || f10.isInvalid();
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void setSupportsChangeAnimations(boolean z10) {
        this.mSupportsChangeAnimations = z10;
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddFinished(RecyclerView.F f10) {
        onAddFinished(f10);
        dispatchAnimationFinished(f10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchAddStarting(RecyclerView.F f10) {
        onAddStarting(f10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeFinished(RecyclerView.F f10, boolean z10) {
        onChangeFinished(f10, z10);
        dispatchAnimationFinished(f10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchChangeStarting(RecyclerView.F f10, boolean z10) {
        onChangeStarting(f10, z10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveFinished(RecyclerView.F f10) {
        onMoveFinished(f10);
        dispatchAnimationFinished(f10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchMoveStarting(RecyclerView.F f10) {
        onMoveStarting(f10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveFinished(RecyclerView.F f10) {
        onRemoveFinished(f10);
        dispatchAnimationFinished(f10);
    }

    @SuppressLint({"UnknownNullness"})
    public final void dispatchRemoveStarting(RecyclerView.F f10) {
        onRemoveStarting(f10);
    }
}
