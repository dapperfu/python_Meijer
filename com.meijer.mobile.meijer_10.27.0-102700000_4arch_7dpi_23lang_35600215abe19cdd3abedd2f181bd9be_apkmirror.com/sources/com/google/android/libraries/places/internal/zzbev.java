package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class zzbev implements zzbep {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzbev(List list, List list2, zzbet zzbetVar) {
        this.zza = list;
        this.zzb = list2;
    }

    static {
        zzbeq.zza(Collections.EMPTY_SET);
    }

    public static zzbeu zza(int i10, int i11) {
        return new zzbeu(1, 0, null);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzbes) list2.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER);
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objZzb = ((zzbes) list.get(i11)).zzb();
            objZzb.getClass();
            hashSet.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
