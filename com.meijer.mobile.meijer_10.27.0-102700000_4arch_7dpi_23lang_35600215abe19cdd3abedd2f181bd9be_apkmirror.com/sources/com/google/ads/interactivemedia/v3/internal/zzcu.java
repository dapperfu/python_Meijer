package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public final class zzcu {
    private final zzeg zza;
    private final String zzb;
    private final FriendlyObstructionPurpose zzc;
    private final String zzd;

    public final FriendlyObstructionPurpose zza() {
        return this.zzc;
    }

    public final zzeg zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }

    public zzcu(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.zza = new zzeg(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = friendlyObstructionPurpose;
        this.zzd = str;
    }
}
