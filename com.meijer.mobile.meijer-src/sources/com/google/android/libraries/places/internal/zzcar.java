package com.google.android.libraries.places.internal;

import De.p;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzcar {
    final Collection zza;
    final int zzb;

    public final int hashCode() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcar)) {
            return false;
        }
        zzcar zzcarVar = (zzcar) obj;
        if (zzcarVar.zzb == this.zzb) {
            Collection collection = zzcarVar.zza;
            int size = collection.size();
            Collection<?> collection2 = this.zza;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final String toString() {
        return this.zza.toString();
    }

    public zzcar(zzbgl zzbglVar) {
        p.r(zzbglVar, "eag");
        if (zzbglVar.zza().size() < 10) {
            this.zza = zzbglVar.zza();
        } else {
            this.zza = new HashSet(zzbglVar.zza());
        }
        Iterator it = zzbglVar.zza().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((SocketAddress) it.next()).hashCode();
        }
        this.zzb = iHashCode;
    }
}
