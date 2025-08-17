package com.google.android.libraries.places.internal;

import Td.C5224b;

/* loaded from: classes6.dex */
final class zznm extends zznr {
    private final C5224b zza;
    private final String zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznr) {
            zznr zznrVar = (zznr) obj;
            if (this.zza.equals(zznrVar.zza()) && this.zzb.equals(zznrVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zznr
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
        StringBuilder sb2 = new StringBuilder(length + 30 + str.length() + 1);
        sb2.append("PlaceRequest{source=");
        sb2.append(string);
        sb2.append(", placeId=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzns
    public final C5224b zza() {
        return this.zza;
    }

    zznm(C5224b c5224b, String str) {
        this.zza = c5224b;
        if (str != null) {
            this.zzb = str;
            return;
        }
        throw new NullPointerException("Null placeId");
    }
}
