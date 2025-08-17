package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes6.dex */
public final class zztu {
    private static final Comparator zza = new zztn();
    private static final zztu zzb = new zztu(new zzts(Collections.EMPTY_LIST));
    private final zzts zzc;

    private zztu(zzts zztsVar) {
        this.zzc = zztsVar;
    }

    public static zztu zza() {
        return zzb;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zztu) && ((zztu) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return ~this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc.toString();
    }
}
