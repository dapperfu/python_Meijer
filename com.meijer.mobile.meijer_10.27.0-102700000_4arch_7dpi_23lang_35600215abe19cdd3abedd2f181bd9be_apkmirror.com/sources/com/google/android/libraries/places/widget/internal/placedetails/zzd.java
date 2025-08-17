package com.google.android.libraries.places.widget.internal.placedetails;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes6.dex */
public final class zzd extends GridLayoutManager.c {
    final /* synthetic */ zzm zza;

    zzd(zzm zzmVar) {
        this.zza = zzmVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int getSpanSize(int i10) {
        return this.zza.getItemViewType(i10) != 1 ? 2 : 1;
    }
}
