package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
final class zzcaw extends zzcas {
    private final AtomicInteger zzi;
    private zzbhy zzj;

    private final void zzl(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        if (zzbfyVar == this.zzh && zzbhyVar.equals(this.zzj)) {
            return;
        }
        zzg().zzb(zzbfyVar, zzbhyVar);
        this.zzh = zzbfyVar;
        this.zzj = zzbhyVar;
    }

    private final zzbhy zzm(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcaq) it.next()).zze());
        }
        return new zzcav(arrayList, this.zzi);
    }

    @Override // com.google.android.libraries.places.internal.zzcas
    protected final zzcaq zzf(Object obj) {
        return new zzcau(this, obj, this.zzg);
    }

    public zzcaw(zzbhr zzbhrVar) {
        super(zzbhrVar);
        this.zzi = new AtomicInteger(new Random().nextInt());
        this.zzj = new zzbhq(zzbht.zzd());
    }

    @Override // com.google.android.libraries.places.internal.zzcas
    protected final void zze() {
        List listZzi = zzi();
        if (listZzi.isEmpty()) {
            Iterator it = zzh().iterator();
            while (it.hasNext()) {
                zzbfy zzbfyVarZzf = ((zzcaq) it.next()).zzf();
                zzbfy zzbfyVar = zzbfy.CONNECTING;
                if (zzbfyVarZzf == zzbfyVar || zzbfyVarZzf == zzbfy.IDLE) {
                    zzl(zzbfyVar, new zzbhq(zzbht.zzd()));
                    return;
                }
            }
            zzl(zzbfy.TRANSIENT_FAILURE, zzm(zzh()));
            return;
        }
        zzl(zzbfy.READY, zzm(listZzi));
    }
}
