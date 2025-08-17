package com.google.android.libraries.places.internal;

import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes6.dex */
public class zzsd {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzsd(String str, Class cls, boolean z10) {
        this(str, cls, z10, true);
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzsd(String str, Class cls, boolean z10, boolean z11) {
        zztw.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z10;
        System.identityHashCode(this);
        for (int i10 = 0; i10 < 5; i10++) {
        }
    }

    public static zzsd zza(String str, Class cls) {
        return new zzsd(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 1 + str.length() + 1 + length2 + 1);
        sb2.append(name);
        sb2.append(q2.f92724c);
        sb2.append(str);
        sb2.append("[");
        sb2.append(name2);
        sb2.append("]");
        return sb2.toString();
    }
}
