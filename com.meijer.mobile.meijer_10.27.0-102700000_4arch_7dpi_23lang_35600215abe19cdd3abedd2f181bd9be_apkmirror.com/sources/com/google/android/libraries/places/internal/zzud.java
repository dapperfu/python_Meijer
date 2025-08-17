package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzud {
    private final String zza;

    public final String zza() {
        return this.zza;
    }

    static {
        new zzud("");
        new zzud("<br>");
        new zzud("<!DOCTYPE html>");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzud) {
            return this.zza.equals(((zzud) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 867184553;
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 10);
        sb2.append("SafeHtml{");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    zzud(String str) {
        str.getClass();
        this.zza = str;
    }
}
