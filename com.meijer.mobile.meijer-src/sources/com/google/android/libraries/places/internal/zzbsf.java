package com.google.android.libraries.places.internal;

import De.j;
import De.l;
import De.p;
import java.text.ParseException;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
final class zzbsf {
    static final zzbfc zza = zzbfc.zza("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    final Long zzb;
    final Boolean zzc;
    final Integer zzd;
    final Integer zze;
    final zzbvm zzf;
    final zzbpg zzg;

    zzbsf(Map map, boolean z10, int i10, int i11) throws NumberFormatException, ParseException {
        long j10;
        zzbvm zzbvmVar;
        zzbpg zzbpgVar;
        this.zzb = zzbqj.zzh(map, "timeout");
        this.zzc = zzbqj.zzi(map, "waitForReady");
        Integer numZzf = zzbqj.zzf(map, "maxResponseMessageBytes");
        this.zzd = numZzf;
        if (numZzf != null) {
            p.l(numZzf.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numZzf);
        }
        Integer numZzf2 = zzbqj.zzf(map, "maxRequestMessageBytes");
        this.zze = numZzf2;
        if (numZzf2 != null) {
            p.l(numZzf2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numZzf2);
        }
        Map mapZzd = z10 ? zzbqj.zzd(map, "retryPolicy") : null;
        if (mapZzd == null) {
            j10 = 0;
            zzbvmVar = null;
        } else {
            int iIntValue = ((Integer) p.r(zzbqj.zzf(mapZzd, "maxAttempts"), "maxAttempts cannot be empty")).intValue();
            p.h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, 5);
            long jLongValue = ((Long) p.r(zzbqj.zzh(mapZzd, "initialBackoff"), "initialBackoff cannot be empty")).longValue();
            p.k(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) p.r(zzbqj.zzh(mapZzd, "maxBackoff"), "maxBackoff cannot be empty")).longValue();
            p.k(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d10 = (Double) p.r(zzbqj.zze(mapZzd, "backoffMultiplier"), "backoffMultiplier cannot be empty");
            double dDoubleValue = d10.doubleValue();
            j10 = 0;
            p.l(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d10);
            Long lZzh = zzbqj.zzh(mapZzd, "perAttemptRecvTimeout");
            p.l(lZzh == null || lZzh.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lZzh);
            Set setZza = zzbvz.zza(mapZzd);
            p.e((lZzh == null && setZza.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            zzbvmVar = new zzbvm(iMin, jLongValue, jLongValue2, dDoubleValue, lZzh, setZza);
        }
        this.zzf = zzbvmVar;
        Map mapZzd2 = z10 ? zzbqj.zzd(map, "hedgingPolicy") : null;
        if (mapZzd2 == null) {
            zzbpgVar = null;
        } else {
            int iIntValue2 = ((Integer) p.r(zzbqj.zzf(mapZzd2, "maxAttempts"), "maxAttempts cannot be empty")).intValue();
            p.h(iIntValue2 >= 2, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, 5);
            long jLongValue3 = ((Long) p.r(zzbqj.zzh(mapZzd2, "hedgingDelay"), "hedgingDelay cannot be empty")).longValue();
            p.k(jLongValue3 >= j10, "hedgingDelay must not be negative: %s", jLongValue3);
            zzbpgVar = new zzbpg(iMin2, jLongValue3, zzbvz.zzb(mapZzd2));
        }
        this.zzg = zzbpgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbsf)) {
            return false;
        }
        zzbsf zzbsfVar = (zzbsf) obj;
        return l.a(this.zzb, zzbsfVar.zzb) && l.a(this.zzc, zzbsfVar.zzc) && l.a(this.zzd, zzbsfVar.zzd) && l.a(this.zze, zzbsfVar.zze) && l.a(this.zzf, zzbsfVar.zzf) && l.a(this.zzg, zzbsfVar.zzg);
    }

    public final int hashCode() {
        return l.b(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final String toString() {
        return j.c(this).d("timeoutNanos", this.zzb).d("waitForReady", this.zzc).d("maxInboundMessageSize", this.zzd).d("maxOutboundMessageSize", this.zze).d("retryPolicy", this.zzf).d("hedgingPolicy", this.zzg).toString();
    }
}
