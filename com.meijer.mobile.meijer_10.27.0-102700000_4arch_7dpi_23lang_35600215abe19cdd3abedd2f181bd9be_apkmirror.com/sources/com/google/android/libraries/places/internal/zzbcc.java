package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzbcc extends zzbcg {
    zzbcc() {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzbcg
    public final void zza() {
        if (!zzb()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                ((zzazt) ((zzbcd) zzd(i10)).zza()).zzd();
            }
            Iterator it = zze().iterator();
            while (it.hasNext()) {
                ((zzazt) ((Map.Entry) it.next()).getKey()).zzd();
            }
        }
        super.zza();
    }
}
