package com.google.android.libraries.places.internal;

import Ce.O;
import java.util.UUID;
import java.util.function.Consumer;

/* loaded from: classes6.dex */
final class zzqp extends zzqc implements zzra {
    static final zzqf zza = new zzqg();
    public static final /* synthetic */ int zzb = 0;

    @Override // com.google.android.libraries.places.internal.zzra
    public final long zzi() {
        return -1L;
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final zzqt zzj() {
        throw null;
    }

    private zzqp(UUID uuid, String str, Exception exc, boolean z10, zzqy zzqyVar) {
        super("<missing root>", "", "", 0, uuid, str, zzqyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzra
    public final zzqt zzg() {
        return zzqs.zza;
    }

    static zzqp zzh(zzqy zzqyVar) {
        final UUID uuidZzc = zzqn.zza().zzc();
        String strZzf = zzqc.zzf(uuidZzc);
        O oZza = zzqj.zza();
        if (!oZza.isEmpty()) {
            final Exception exc = null;
            oZza.forEach(new Consumer(uuidZzc, exc) { // from class: com.google.android.libraries.places.internal.zzqo
                @Override // java.util.function.Consumer
                public final /* synthetic */ void accept(Object obj) {
                    int i10 = zzqp.zzb;
                    ((zzrc) obj).zza();
                }
            });
        }
        return new zzqp(uuidZzc, strZzf, zza, false, zzqyVar);
    }
}
