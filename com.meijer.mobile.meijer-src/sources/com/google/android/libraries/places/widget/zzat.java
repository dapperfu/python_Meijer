package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzat extends RecyclerView.o {
    final /* synthetic */ PlaceSearchFragment zza;

    zzat(PlaceSearchFragment placeSearchFragment) {
        this.zza = placeSearchFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.B state) throws Resources.NotFoundException {
        Intrinsics.j(outRect, "outRect");
        Intrinsics.j(view, "view");
        Intrinsics.j(parent, "parent");
        Intrinsics.j(state, "state");
        int layoutDirection = parent.getLayoutDirection();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int iB = state.b() - 1;
        boolean z10 = true;
        boolean z11 = layoutDirection == 1;
        if (childAdapterPosition == iB) {
            if (z11) {
            }
            outRect.set(0, 0, 0, 0);
        }
        z10 = z11;
        if (childAdapterPosition != 0 || !z10) {
            PlaceSearchFragment placeSearchFragment = this.zza;
            Context contextRequireContext = placeSearchFragment.requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            int iZzl = placeSearchFragment.zzl();
            int[] PlacesMaterialThemeAttrs = R.styleable.PlacesMaterialThemeAttrs;
            Intrinsics.i(PlacesMaterialThemeAttrs, "PlacesMaterialThemeAttrs");
            TypedArray typedArrayObtainStyledAttributes = contextRequireContext.obtainStyledAttributes(iZzl, PlacesMaterialThemeAttrs);
            outRect.set(0, 0, (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.PlacesMaterialThemeAttrs_placesSpacingMedium, placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.gmp_sys_measurement_spacing_medium)), 0);
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        outRect.set(0, 0, 0, 0);
    }
}
