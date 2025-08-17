package com.google.android.libraries.places.widget.internal.placedetails;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzf extends zzi {
    private final String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(String name) {
        super(null);
        Intrinsics.j(name, "name");
        this.zza = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzf) && Intrinsics.e(this.zza, ((zzf) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 14);
        sb2.append("Feature(name=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    public final String zza() {
        return this.zza;
    }
}
