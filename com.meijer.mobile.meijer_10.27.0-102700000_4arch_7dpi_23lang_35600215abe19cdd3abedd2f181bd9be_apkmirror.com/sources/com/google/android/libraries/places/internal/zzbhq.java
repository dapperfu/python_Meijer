package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public final class zzbhq extends zzbhy {
    private final zzbht zza;

    @Override // com.google.android.libraries.places.internal.zzbhy
    public final zzbht zza(zzbhu zzbhuVar) {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbhq) {
            return this.zza.equals(((zzbhq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19);
        sb2.append("FixedResultPicker(");
        sb2.append(strValueOf);
        sb2.append(")");
        return sb2.toString();
    }

    public zzbhq(zzbht zzbhtVar) {
        this.zza = (zzbht) p.r(zzbhtVar, "result");
    }
}
