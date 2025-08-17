package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.internal.zzqf;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrp;

/* loaded from: classes4.dex */
final class zzad extends zzx {
    private final zzqf zza;
    private final String zzb;
    private final zzrm zzc;
    private final zzrp zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.zza.equals(zzxVar.zzb()) && this.zzb.equals(zzxVar.zze()) && this.zzc.equals(zzxVar.zzc()) && this.zzd.equals(zzxVar.zzd())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzx
    final zzqf zzb() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzx
    final zzrm zzc() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzx
    final zzrp zzd() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzx
    final String zze() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        zzrp zzrpVar = this.zzd;
        zzrm zzrmVar = this.zzc;
        return "RequestSignals{identifierInfo=" + this.zza.toString() + ", spamMsParameter=" + this.zzb + ", secureSignals=" + zzrmVar.toString() + ", platformSignals=" + zzrpVar.toString() + "}";
    }

    zzad(zzqf zzqfVar, String str, zzrm zzrmVar, zzrp zzrpVar) {
        this.zza = zzqfVar;
        if (str != null) {
            this.zzb = str;
            if (zzrmVar != null) {
                this.zzc = zzrmVar;
                this.zzd = zzrpVar;
                return;
            }
            throw new NullPointerException("Null secureSignals");
        }
        throw new NullPointerException("Null spamMsParameter");
    }
}
