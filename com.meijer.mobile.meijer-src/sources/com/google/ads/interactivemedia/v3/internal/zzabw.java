package com.google.ads.interactivemedia.v3.internal;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes4.dex */
final class zzabw implements zzwk {
    zzabw() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        if (zzacaVar.zzc() != Timestamp.class) {
            return null;
        }
        return new zzaby(zzvrVar.zza(zzaca.zza(Date.class)), null);
    }
}
