package com.google.android.libraries.places.internal;

import Be.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbva {
    final boolean zza;
    final List zzb;
    final Collection zzc;
    final Collection zzd;
    final int zze;
    final zzbvj zzf;
    final boolean zzg;
    final boolean zzh;

    final zzbva zza(zzbvj zzbvjVar) {
        Collection collectionUnmodifiableCollection;
        p.x(!this.zza, "Already passThrough");
        if (zzbvjVar.zzb) {
            collectionUnmodifiableCollection = this.zzc;
        } else {
            Collection collection = this.zzc;
            if (collection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(zzbvjVar);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(zzbvjVar);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collectionUnmodifiableCollection;
        zzbvj zzbvjVar2 = this.zzf;
        boolean z10 = zzbvjVar2 != null;
        List list = this.zzb;
        if (z10) {
            p.x(zzbvjVar2 == zzbvjVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new zzbva(list, collection2, this.zzd, zzbvjVar2, this.zzg, z10, this.zzh, this.zze);
    }

    final zzbva zzb() {
        return this.zzh ? this : new zzbva(this.zzb, this.zzc, this.zzd, this.zzf, this.zzg, this.zza, true, this.zze);
    }

    final zzbva zzc(zzbvj zzbvjVar) {
        Collection collectionUnmodifiableCollection;
        boolean z10 = this.zzh;
        p.x(!z10, "hedging frozen");
        zzbvj zzbvjVar2 = this.zzf;
        p.x(zzbvjVar2 == null, "already committed");
        Collection collection = this.zzd;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(zzbvjVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(zzbvjVar);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new zzbva(this.zzb, this.zzc, collectionUnmodifiableCollection, zzbvjVar2, this.zzg, this.zza, z10, this.zze + 1);
    }

    zzbva(List list, Collection collection, Collection collection2, zzbvj zzbvjVar, boolean z10, boolean z11, boolean z12, int i10) {
        boolean z13;
        boolean z14;
        boolean z15;
        this.zzb = list;
        this.zzc = (Collection) p.r(collection, "drainedSubstreams");
        this.zzf = zzbvjVar;
        this.zzd = collection2;
        this.zzg = z10;
        this.zza = z11;
        this.zzh = z12;
        this.zze = i10;
        if (!z11 || list == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        p.x(z13, "passThrough should imply buffer is null");
        if (!z11 || zzbvjVar != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        p.x(z14, "passThrough should imply winningSubstream != null");
        if (!z11 || ((collection.size() == 1 && collection.contains(zzbvjVar)) || (collection.size() == 0 && zzbvjVar.zzb))) {
            z15 = true;
        } else {
            z15 = false;
        }
        p.x(z15, "passThrough should imply winningSubstream is drained");
        p.x((z10 && zzbvjVar == null) ? false : true, "cancelled should imply committed");
    }
}
