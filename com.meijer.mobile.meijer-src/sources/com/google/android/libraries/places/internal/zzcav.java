package com.google.android.libraries.places.internal;

import De.j;
import De.p;
import com.google.android.gms.common.api.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
final class zzcav extends zzbhy {
    private final List zza;
    private final AtomicInteger zzb;
    private final int zzc;

    public final int hashCode() {
        return this.zzc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcav)) {
            return false;
        }
        zzcav zzcavVar = (zzcav) obj;
        if (zzcavVar == this) {
            return true;
        }
        if (this.zzc == zzcavVar.zzc && this.zzb == zzcavVar.zzb) {
            List list = this.zza;
            int size = list.size();
            List list2 = zzcavVar.zza;
            if (size == list2.size() && new HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return j.b(zzcav.class).d("subchannelPickers", this.zza).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbhy
    public final zzbht zza(zzbhu zzbhuVar) {
        int andIncrement = this.zzb.getAndIncrement() & a.e.API_PRIORITY_OTHER;
        List list = this.zza;
        return ((zzbhy) list.get(andIncrement % list.size())).zza(zzbhuVar);
    }

    public zzcav(List list, AtomicInteger atomicInteger) {
        p.e(!list.isEmpty(), "empty list");
        this.zza = list;
        this.zzb = (AtomicInteger) p.r(atomicInteger, "index");
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((zzbhy) it.next()).hashCode();
        }
        this.zzc = iHashCode;
    }
}
