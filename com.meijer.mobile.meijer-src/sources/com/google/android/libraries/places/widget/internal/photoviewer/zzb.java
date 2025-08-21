package com.google.android.libraries.places.widget.internal.photoviewer;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes6.dex */
public final class zzb extends ViewPager2.i {
    final /* synthetic */ PageSelectionIndicator zza;

    zzb(PageSelectionIndicator pageSelectionIndicator) {
        this.zza = pageSelectionIndicator;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i10) {
        this.zza.zza(i10);
    }
}
