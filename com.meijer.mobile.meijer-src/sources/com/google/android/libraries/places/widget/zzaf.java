package com.google.android.libraries.places.widget;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes6.dex */
public final class zzaf extends ViewPager2.i {
    final /* synthetic */ PlaceDetailsFragment zza;

    zzaf(PlaceDetailsFragment placeDetailsFragment) {
        this.zza = placeDetailsFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i10) {
        super.onPageSelected(i10);
        this.zza.zzv();
    }
}
