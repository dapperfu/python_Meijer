package com.google.ads.interactivemedia.v3.impl;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.internal.zzqh;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzro;
import com.google.ads.interactivemedia.v3.internal.zzru;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class zzaf implements BaseDisplayContainer {
    private static int zza;
    private ViewGroup zzb;
    private Collection zzc = zzrm.zzm();
    private Map zzd = zzru.zzo();
    private final Set zze = new HashSet();
    private zzae zzf = null;
    private boolean zzg = false;

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final ViewGroup getAdContainer() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final Collection<CompanionAdSlot> getCompanionSlots() {
        return this.zzc;
    }

    public final Map zza() {
        return this.zzd;
    }

    public final void zzc(zzae zzaeVar) {
        this.zzf = zzaeVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void claim() {
        zzqh.zze(!this.zzg, "A given DisplayContainer may only be used once");
        this.zzg = true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void destroy() {
        ViewGroup viewGroup = this.zzb;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.zzf = null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction) {
        if (friendlyObstruction == null || this.zze.contains(friendlyObstruction)) {
            return;
        }
        this.zze.add(friendlyObstruction);
        zzae zzaeVar = this.zzf;
        if (zzaeVar != null) {
            ((zzbt) zzaeVar).zza(friendlyObstruction);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void registerVideoControlsOverlay(View view) {
        if (view == null) {
            return;
        }
        com.google.ads.interactivemedia.v3.impl.data.zzbg zzbgVarBuilder = com.google.ads.interactivemedia.v3.impl.data.zzbh.builder();
        zzbgVarBuilder.view(view);
        zzbgVarBuilder.purpose(FriendlyObstructionPurpose.VIDEO_CONTROLS);
        com.google.ads.interactivemedia.v3.impl.data.zzbh zzbhVarBuild = zzbgVarBuilder.build();
        if (this.zze.contains(zzbhVarBuild)) {
            return;
        }
        this.zze.add(zzbhVarBuild);
        zzae zzaeVar = this.zzf;
        if (zzaeVar != null) {
            ((zzbt) zzaeVar).zza(zzbhVarBuild);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void setCompanionSlots(Collection<CompanionAdSlot> collection) {
        if (collection == null) {
            collection = zzrm.zzm();
        }
        zzro zzroVar = new zzro();
        for (CompanionAdSlot companionAdSlot : collection) {
            if (companionAdSlot != null) {
                int i10 = zza;
                zza = i10 + 1;
                zzroVar.zza("compSlot_" + i10, companionAdSlot);
            }
        }
        this.zzd = zzroVar.zzc();
        this.zzc = collection;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void unregisterAllFriendlyObstructions() {
        this.zze.clear();
        zzae zzaeVar = this.zzf;
        if (zzaeVar != null) {
            ((zzbt) zzaeVar).zzf();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void unregisterAllVideoControlsOverlays() {
        this.zze.clear();
        zzae zzaeVar = this.zzf;
        if (zzaeVar != null) {
            ((zzbt) zzaeVar).zzf();
        }
    }

    public final Set zzb() {
        return new HashSet(this.zze);
    }

    public zzaf(ViewGroup viewGroup) {
        this.zzb = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void setAdContainer(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.zzb = viewGroup;
    }
}
