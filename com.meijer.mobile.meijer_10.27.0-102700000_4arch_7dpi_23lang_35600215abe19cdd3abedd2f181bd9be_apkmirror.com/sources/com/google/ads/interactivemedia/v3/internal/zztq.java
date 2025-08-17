package com.google.ads.interactivemedia.v3.internal;

import java.util.Objects;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
abstract class zztq extends zztw {
    private zzri zza;

    abstract void zzs();

    final /* synthetic */ void zzu(zzri zzriVar) {
        zzA((zzri) null);
    }

    void zzv(int i10) {
        this.zza = null;
    }

    static {
        new zzut(zztq.class);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztg
    protected final String zza() {
        zzri zzriVar = this.zza;
        return zzriVar != null ? "futures=".concat(zzriVar.toString()) : super.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztg
    protected final void zzb() {
        zzri zzriVar = this.zza;
        zzv(1);
        if ((zzriVar != null) && isCancelled()) {
            boolean zZzr = zzr();
            zzss it = zzriVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzr);
            }
        }
    }

    final void zzt() {
        Objects.requireNonNull(this.zza);
        if (this.zza.isEmpty()) {
            zzs();
            return;
        }
        final zzri zzriVar = null;
        Runnable runnable = new Runnable(zzriVar) { // from class: com.google.ads.interactivemedia.v3.internal.zztp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzu((zzri) null);
            }
        };
        zzss it = this.zza.iterator();
        while (it.hasNext()) {
            zzuu zzuuVar = (zzuu) it.next();
            if (zzuuVar.isDone()) {
                zzA((zzri) null);
            } else {
                zzuuVar.zzo(runnable, zzua.INSTANCE);
            }
        }
    }

    zztq(zzri zzriVar, boolean z10, boolean z11) {
        super(zzriVar.size());
        this.zza = zzriVar;
    }

    private final void zzA(zzri zzriVar) {
        boolean z10;
        int iZzx = zzx();
        if (iZzx >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzqh.zzi(z10, "Less than 0 remaining futures");
        if (iZzx == 0) {
            zzz();
            zzs();
            zzv(2);
        }
    }
}
