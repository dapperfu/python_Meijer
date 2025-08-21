package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzxn implements Cloneable, zzwk {
    public static final zzxn zza = new zzxn();
    private List zzb;
    private final List zzc;

    public final boolean zzc(Class cls, boolean z10) {
        List<zzpt> list;
        if (z10) {
            list = this.zzb;
        } else {
            if (!Enum.class.isAssignableFrom(cls) && zzabp.zzj(cls)) {
                return true;
            }
            list = this.zzc;
        }
        for (zzpt zzptVar : list) {
        }
        return false;
    }

    public zzxn() {
        List list = Collections.EMPTY_LIST;
        this.zzb = list;
        this.zzc = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        Class clsZzc = zzacaVar.zzc();
        boolean zZzc = zzc(clsZzc, true);
        boolean zZzc2 = zzc(clsZzc, false);
        if (!zZzc && !zZzc2) {
            return null;
        }
        return new zzxm(this, zZzc2, zZzc, zzvrVar, zzacaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzxn clone() {
        try {
            return (zzxn) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean zzd(Field field, boolean z10) {
        List<zzpt> list;
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || zzc(field.getType(), z10)) {
            return true;
        }
        if (z10) {
            list = this.zzb;
        } else {
            list = this.zzc;
        }
        if (!list.isEmpty()) {
            for (zzpt zzptVar : list) {
                zzps zzpsVar = (zzps) zzvk.zza(field).getAnnotation(zzps.class);
                if (zzpsVar != null && Arrays.asList(zzpsVar.zzb()).contains(zzvk.zzb(field))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final zzxn zze(zzpt zzptVar, boolean z10, boolean z11) {
        zzxn zzxnVarClone = clone();
        ArrayList arrayList = new ArrayList(this.zzb);
        zzxnVarClone.zzb = arrayList;
        arrayList.add(zzptVar);
        return zzxnVarClone;
    }
}
