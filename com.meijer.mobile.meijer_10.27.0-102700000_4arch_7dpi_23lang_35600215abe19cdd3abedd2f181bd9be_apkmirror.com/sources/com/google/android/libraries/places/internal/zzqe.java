package com.google.android.libraries.places.internal;

import Ce.L;
import java.util.UUID;

/* loaded from: classes6.dex */
final class zzqe extends zzre {
    private final L zza;
    private final L zzb;
    private final UUID zzc;
    private final long zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzre) {
            zzre zzreVar = (zzre) obj;
            if (this.zza.equals(zzreVar.zza()) && this.zzb.equals(zzreVar.zzb()) && this.zzc.equals(zzreVar.zzc()) && this.zzd == zzreVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzre
    public final UUID zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzre
    public final long zzd() {
        return this.zzd;
    }

    public final int hashCode() {
        int iHashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        long j10 = this.zzd;
        return (iHashCode * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // com.google.android.libraries.places.internal.zzre
    public final L zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzre
    public final L zzb() {
        return this.zzb;
    }

    /* synthetic */ zzqe(L l10, L l11, UUID uuid, long j10, byte[] bArr) {
        this.zza = l10;
        this.zzb = l11;
        this.zzc = uuid;
        this.zzd = j10;
    }
}
