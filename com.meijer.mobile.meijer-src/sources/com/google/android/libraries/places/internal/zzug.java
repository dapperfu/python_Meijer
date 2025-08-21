package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzug {
    public static final zzug zza = new zzug("about:invalid#zGuavaz");
    private final String zzb;

    public final String zza() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzug) {
            return this.zzb.equals(((zzug) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ 18288376;
    }

    public final String toString() {
        String str = this.zzb;
        StringBuilder sb2 = new StringBuilder(str.length() + 9);
        sb2.append("SafeUrl{");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    zzug(String str) {
        str.getClass();
        this.zzb = str;
    }
}
