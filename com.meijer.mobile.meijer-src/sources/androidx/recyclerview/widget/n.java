package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.ViewCompat;
import q4.C16602c;

/* loaded from: classes4.dex */
class n implements m {

    /* renamed from: a, reason: collision with root package name */
    static final m f58505a = new n();

    @Override // androidx.recyclerview.widget.m
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.m
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }

    @Override // androidx.recyclerview.widget.m
    public void a(View view) {
        Object tag = view.getTag(C16602c.f157878a);
        if (tag instanceof Float) {
            ViewCompat.u0(view, ((Float) tag).floatValue());
        }
        view.setTag(C16602c.f157878a, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.m
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10 && view.getTag(C16602c.f157878a) == null) {
            Float fValueOf = Float.valueOf(ViewCompat.u(view));
            ViewCompat.u0(view, e(recyclerView, view) + 1.0f);
            view.setTag(C16602c.f157878a, fValueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    n() {
    }

    private static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float fU = ViewCompat.u(childAt);
                if (fU > f10) {
                    f10 = fU;
                }
            }
        }
        return f10;
    }
}
