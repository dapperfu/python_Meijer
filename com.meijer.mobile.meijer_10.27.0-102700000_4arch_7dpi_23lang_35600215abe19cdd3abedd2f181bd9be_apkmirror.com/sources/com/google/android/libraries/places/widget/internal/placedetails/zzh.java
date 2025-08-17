package com.google.android.libraries.places.widget.internal.placedetails;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzh extends zzi {
    private final String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(String title) {
        super(null);
        Intrinsics.j(title, "title");
        this.zza = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzh) && Intrinsics.e(this.zza, ((zzh) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20);
        sb2.append("SectionTitle(title=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    public final String zza() {
        return this.zza;
    }
}
