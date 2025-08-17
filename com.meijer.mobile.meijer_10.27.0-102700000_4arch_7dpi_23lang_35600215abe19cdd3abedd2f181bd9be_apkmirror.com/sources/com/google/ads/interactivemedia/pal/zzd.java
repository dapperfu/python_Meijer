package com.google.ads.interactivemedia.pal;

import com.google.ads.interactivemedia.pal.ConsentSettings;

/* loaded from: classes4.dex */
final class zzd extends ConsentSettings {
    private final Boolean zza;
    private final Boolean zzb;
    private final Boolean zzc;

    /* synthetic */ zzd(Boolean bool, Boolean bool2, Boolean bool3, zzc zzcVar) {
        this.zza = bool;
        this.zzb = bool2;
        this.zzc = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConsentSettings) {
            ConsentSettings consentSettings = (ConsentSettings) obj;
            Boolean bool = this.zza;
            if (bool != null ? bool.equals(consentSettings.zzc()) : consentSettings.zzc() == null) {
                if (this.zzb.equals(consentSettings.zza()) && this.zzc.equals(consentSettings.zzb())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings
    public final ConsentSettings.Builder toBuilder() {
        return new zzb(this, null);
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings
    final Boolean zza() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings
    final Boolean zzb() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings
    final Boolean zzc() {
        return this.zza;
    }

    public final int hashCode() {
        Boolean bool = this.zza;
        return (((((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        return "ConsentSettings{enableCookiesFor3pServerSideAdInsertion=" + this.zza + ", allowStorage=" + this.zzb + ", directedForChildOrUnknownAge=" + this.zzc + "}";
    }
}
