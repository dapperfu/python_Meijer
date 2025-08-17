package com.google.android.libraries.places.internal;

import Ce.L;
import java.util.UUID;

/* loaded from: classes6.dex */
final class zzqd extends zzrd {
    private L zza;
    private L zzb;
    private UUID zzc;
    private long zzd;
    private byte zze;

    zzqd() {
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzrd zzd(long j10) {
        this.zzd = -1L;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzrd zza(L l10) {
        if (l10 == null) {
            throw new NullPointerException("Null spansNames");
        }
        this.zza = l10;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzrd zzb(L l10) {
        if (l10 == null) {
            throw new NullPointerException("Null extras");
        }
        this.zzb = l10;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzrd zzc(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        this.zzc = uuid;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzre zze() {
        L l10;
        L l11;
        UUID uuid;
        if (this.zze == 1 && (l10 = this.zza) != null && (l11 = this.zzb) != null && (uuid = this.zzc) != null) {
            return new zzqe(l10, l11, uuid, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" spansNames");
        }
        if (this.zzb == null) {
            sb2.append(" extras");
        }
        if (this.zzc == null) {
            sb2.append(" rootTraceId");
        }
        if (this.zze == 0) {
            sb2.append(" rootDurationMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
