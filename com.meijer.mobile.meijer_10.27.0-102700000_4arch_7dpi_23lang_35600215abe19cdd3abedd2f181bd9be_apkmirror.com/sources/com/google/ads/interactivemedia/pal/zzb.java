package com.google.ads.interactivemedia.pal;

import com.google.ads.interactivemedia.pal.ConsentSettings;

/* loaded from: classes4.dex */
final class zzb extends ConsentSettings.Builder {
    private Boolean zza;
    private Boolean zzb;
    private Boolean zzc;

    zzb() {
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings.Builder
    public final ConsentSettings.Builder enableCookiesFor3pServerSideAdInsertion(Boolean bool) {
        this.zza = bool;
        return this;
    }

    /* synthetic */ zzb(ConsentSettings consentSettings, zza zzaVar) {
        this.zza = consentSettings.zzc();
        this.zzb = consentSettings.zza();
        this.zzc = consentSettings.zzb();
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings.Builder
    public final ConsentSettings.Builder allowStorage(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null allowStorage");
        }
        this.zzb = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings.Builder
    public final ConsentSettings build() {
        Boolean bool;
        Boolean bool2 = this.zzb;
        if (bool2 != null && (bool = this.zzc) != null) {
            return new zzd(this.zza, bool2, bool, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zzb == null) {
            sb2.append(" allowStorage");
        }
        if (this.zzc == null) {
            sb2.append(" directedForChildOrUnknownAge");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings.Builder
    public final ConsentSettings.Builder directedForChildOrUnknownAge(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null directedForChildOrUnknownAge");
        }
        this.zzc = bool;
        return this;
    }
}
