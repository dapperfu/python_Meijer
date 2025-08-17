package com.google.ads.interactivemedia.v3.impl;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzal implements CompanionAdSlot {
    private int zza;
    private int zzb;
    private ViewGroup zzc;
    private String zzd;
    private final List zze = new ArrayList(1);

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final ViewGroup getContainer() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final int getHeight() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final int getWidth() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void setContainer(ViewGroup viewGroup) {
        this.zzc = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void setSize(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    public final List zza() {
        return this.zze;
    }

    public final void zzb(String str) {
        this.zzd = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void addClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.zze.add(clickListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final boolean isFilled() {
        ViewGroup viewGroup = this.zzc;
        return (viewGroup == null || viewGroup.findViewWithTag(this.zzd) == null) ? false : true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void removeClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.zze.remove(clickListener);
    }
}
