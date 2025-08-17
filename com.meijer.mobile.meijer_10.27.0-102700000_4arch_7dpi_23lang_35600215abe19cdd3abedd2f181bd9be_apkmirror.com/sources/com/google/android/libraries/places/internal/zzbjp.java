package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* loaded from: classes6.dex */
final class zzbjp implements Comparator {
    final /* synthetic */ zzbjq zza;

    zzbjp(zzbjq zzbjqVar) {
        this.zza = zzbjqVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzbjq zzbjqVar = this.zza;
        zzbjqVar.zza(obj);
        zzbjqVar.zza(obj2);
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
