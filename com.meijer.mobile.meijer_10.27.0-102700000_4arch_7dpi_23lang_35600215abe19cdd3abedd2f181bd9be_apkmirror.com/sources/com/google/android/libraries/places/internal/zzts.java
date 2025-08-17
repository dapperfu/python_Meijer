package com.google.android.libraries.places.internal;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
final class zzts extends AbstractMap {
    private static final Comparator zza = new zztp();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd = new zztr(this, -1);
    private Integer zze = null;
    private String zzf = null;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    final /* synthetic */ Object[] zzb() {
        return this.zzb;
    }

    final /* synthetic */ int[] zzc() {
        return this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }

    zzts(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArrCopyOf = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                if (size > 16 && size * 9 > 0) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, 0);
                }
                this.zzb = objArrCopyOf;
                this.zzc = iArr;
                return;
            }
            throw null;
        }
        throw null;
    }
}
