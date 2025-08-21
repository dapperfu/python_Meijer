package com.google.android.libraries.places.internal;

import De.p;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbtb {
    private List zza;
    private int zzb = 0;
    private final boolean zzc;

    public final void zzc() {
        this.zzb = 0;
    }

    public final boolean zza() {
        return this.zzb < this.zza.size();
    }

    public final void zzg(List list) {
        List listZzj;
        p.r(list, "newGroups");
        if (this.zzc) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i10 = 0; i10 < list.size(); i10++) {
                zzbgl zzbglVar = (zzbgl) list.get(i10);
                for (int i11 = 0; i11 < zzbglVar.zza().size(); i11++) {
                    SocketAddress socketAddress = (SocketAddress) zzbglVar.zza().get(i11);
                    if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                        if (bool == null) {
                            bool = Boolean.FALSE;
                        }
                        arrayList.add(new zzbta(zzbglVar.zzb(), socketAddress));
                    } else {
                        if (bool == null) {
                            bool = Boolean.TRUE;
                        }
                        arrayList2.add(new zzbta(zzbglVar.zzb(), socketAddress));
                    }
                }
            }
            listZzj = (bool == null || !bool.booleanValue()) ? zzj(arrayList, arrayList2) : zzj(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < list.size(); i12++) {
                zzbgl zzbglVar2 = (zzbgl) list.get(i12);
                for (int i13 = 0; i13 < zzbglVar2.zza().size(); i13++) {
                    arrayList3.add(new zzbta(zzbglVar2.zzb(), (SocketAddress) zzbglVar2.zza().get(i13)));
                }
            }
            listZzj = arrayList3;
        }
        this.zza = listZzj;
        this.zzb = 0;
    }

    public final boolean zzh(SocketAddress socketAddress) {
        p.r(socketAddress, "needle");
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (((zzbta) this.zza.get(i10)).zzc().equals(socketAddress)) {
                this.zzb = i10;
                return true;
            }
        }
        return false;
    }

    public final int zzi() {
        return this.zza.size();
    }

    zzbtb(List list, boolean z10) {
        this.zzc = z10;
        zzg(list);
    }

    private static final List zzj(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (int i10 = 0; i10 < Math.max(list.size(), list2.size()); i10++) {
            if (i10 < list.size()) {
                arrayList.add((zzbta) list.get(i10));
            }
            if (i10 < list2.size()) {
                arrayList.add((zzbta) list2.get(i10));
            }
        }
        return arrayList;
    }

    public final boolean zzb() {
        if (!zza()) {
            return false;
        }
        this.zzb++;
        return zza();
    }

    public final SocketAddress zzd() {
        if (zza()) {
            return ((zzbta) this.zza.get(this.zzb)).zzc();
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final zzbez zze() {
        if (zza()) {
            return ((zzbta) this.zza.get(this.zzb)).zzb();
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    public final List zzf() {
        if (zza()) {
            return Collections.singletonList(((zzbta) this.zza.get(this.zzb)).zza());
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }
}
