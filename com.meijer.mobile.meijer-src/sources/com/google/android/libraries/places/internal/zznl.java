package com.google.android.libraries.places.internal;

import Vd.C5508b;

/* loaded from: classes6.dex */
final class zznl extends zznq {
    private final C5508b zza;
    private final String zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznq) {
            zznq zznqVar = (zznq) obj;
            if (this.zza.equals(zznqVar.zza()) && this.zzb.equals(zznqVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zznq
    public final String zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String str = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 35 + str.length() + 1);
        sb2.append("AutocompleteRequest{source=");
        sb2.append(string);
        sb2.append(", query=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final C5508b zza() {
        return this.zza;
    }

    zznl(C5508b c5508b, String str) {
        this.zza = c5508b;
        if (str != null) {
            this.zzb = str;
            return;
        }
        throw new NullPointerException("Null query");
    }
}
