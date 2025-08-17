package com.google.android.libraries.places.widget.internal.photoviewer;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes6.dex */
public final class zzw extends ViewPager2.i {
    final /* synthetic */ PlacesLightboxActivity zza;

    zzw(PlacesLightboxActivity placesLightboxActivity) {
        this.zza = placesLightboxActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i10) {
        PlacesLightboxActivity placesLightboxActivity = this.zza;
        placesLightboxActivity.zzj(i10);
        if (i10 != placesLightboxActivity.zzh) {
            placesLightboxActivity.zzg++;
            placesLightboxActivity.zzh = i10;
        }
    }
}
