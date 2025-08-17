package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbmz extends zzbfh {
    private final zzbfh zza;
    private volatile boolean zzb;
    private List zzc = new ArrayList();

    private final void zzg(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.zzb) {
                    runnable.run();
                } else {
                    this.zzc.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ zzbfh zzf() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zza(zzbip zzbipVar) {
        if (this.zzb) {
            this.zza.zza(zzbipVar);
        } else {
            zzg(new zzbmv(this, zzbipVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzb(Object obj) {
        if (this.zzb) {
            this.zza.zzb(obj);
        } else {
            zzg(new zzbmw(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzc(zzbjv zzbjvVar, zzbip zzbipVar) {
        zzg(new zzbmx(this, zzbjvVar, zzbipVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new zzbmy(this));
        }
    }

    final void zze() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (this.zzc.isEmpty()) {
                        this.zzc = null;
                        this.zzb = true;
                        return;
                    } else {
                        list = this.zzc;
                        this.zzc = arrayList;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }

    public zzbmz(zzbfh zzbfhVar) {
        this.zza = zzbfhVar;
    }
}
