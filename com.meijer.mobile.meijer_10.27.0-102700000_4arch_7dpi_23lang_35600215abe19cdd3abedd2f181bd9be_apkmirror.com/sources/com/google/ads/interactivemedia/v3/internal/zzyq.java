package com.google.ads.interactivemedia.v3.internal;

import java.util.Date;

/* loaded from: classes4.dex */
final class zzyq implements zzwk {
    zzyq() {
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        if (zzacaVar.zzc() != Date.class) {
            return null;
        }
        return new zzyu(zzys.zza, 2, 2, null);
    }
}
