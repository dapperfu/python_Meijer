package com.google.android.libraries.places.internal;

import Be.p;
import com.medallia.digital.mobilesdk.q2;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzbgl {
    public static final zzbey zza = zzbey.zza("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    private final List zzb;
    private final zzbez zzc;
    private final int zzd;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbgl)) {
            return false;
        }
        zzbgl zzbglVar = (zzbgl) obj;
        List list = this.zzb;
        int size = list.size();
        List list2 = zzbglVar.zzb;
        if (size != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!((SocketAddress) list.get(i10)).equals(list2.get(i10))) {
                return false;
            }
        }
        return this.zzc.equals(zzbglVar.zzc);
    }

    public final int hashCode() {
        return this.zzd;
    }

    public final List zza() {
        return this.zzb;
    }

    public final zzbez zzb() {
        return this.zzc;
    }

    public final String toString() {
        zzbez zzbezVar = this.zzc;
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(zzbezVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length() + 1);
        sb2.append("[");
        sb2.append(strValueOf);
        sb2.append(q2.f92724c);
        sb2.append(strValueOf2);
        sb2.append("]");
        return sb2.toString();
    }

    public zzbgl(List list, zzbez zzbezVar) {
        p.e(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zzb = listUnmodifiableList;
        this.zzc = (zzbez) p.r(zzbezVar, "attrs");
        this.zzd = listUnmodifiableList.hashCode();
    }
}
