package com.google.android.material.transformation;

import ae.C5596a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import be.C6237h;
import be.C6239j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes4.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    private Map<View, Integer> f88014i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e i0(Context context, boolean z10) {
        int i10 = z10 ? C5596a.f44478d : C5596a.f44477c;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f88007a = C6237h.c(context, i10);
        eVar.f88008b = new C6239j(17, 0.0f, 0.0f);
        return eVar;
    }

    private void k0(View view, boolean z10) {
        boolean z11;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f88014i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (childAt != view && !z11) {
                    if (!z10) {
                        Map<View, Integer> map = this.f88014i;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.w0(childAt, this.f88014i.get(childAt).intValue());
                        }
                    } else {
                        this.f88014i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        ViewCompat.w0(childAt, 4);
                    }
                }
            }
            if (!z10) {
                this.f88014i = null;
            }
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean L(View view, View view2, boolean z10, boolean z11) {
        k0(view2, z10);
        return super.L(view, view2, z10, z11);
    }
}
