package com.google.android.libraries.places.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.widget.model.AttributionPosition;
import com.google.android.libraries.places.widget.model.Orientation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzau extends RecyclerView.u {
    final /* synthetic */ PlaceSearchFragment zza;

    zzau(PlaceSearchFragment placeSearchFragment) {
        this.zza = placeSearchFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        View viewFindViewById;
        Intrinsics.j(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i10, i11);
        if (!recyclerView.canScrollVertically(1)) {
            View viewFindViewById2 = this.zza.requireView().findViewById(R.id.place_search_border_bottom);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
                return;
            }
            return;
        }
        PlaceSearchFragment placeSearchFragment = this.zza;
        Orientation orientation = placeSearchFragment.zzk;
        if (orientation == null) {
            Intrinsics.y("orientation");
            orientation = null;
        }
        if (orientation == Orientation.VERTICAL && placeSearchFragment.getZzp() == AttributionPosition.BOTTOM && (viewFindViewById = placeSearchFragment.requireView().findViewById(R.id.place_search_border_bottom)) != null) {
            viewFindViewById.setVisibility(0);
        }
    }
}
