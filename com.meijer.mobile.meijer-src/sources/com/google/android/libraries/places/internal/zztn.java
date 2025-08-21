package com.google.android.libraries.places.internal;

import java.util.Comparator;

/* loaded from: classes6.dex */
final class zztn implements Comparator {
    zztn() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zztt zzttVarZza = zztt.zza(obj);
        zztt zzttVarZza2 = zztt.zza(obj2);
        if (zzttVarZza == zzttVarZza2) {
            int iOrdinal = zzttVarZza.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            return ((Double) obj).compareTo((Double) obj2);
                        }
                        throw null;
                    }
                    return ((Long) obj).compareTo((Long) obj2);
                }
                return ((String) obj).compareTo((String) obj2);
            }
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        return zzttVarZza.compareTo(zzttVarZza2);
    }
}
