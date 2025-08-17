package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzmm extends zzmp {
    private final String zza;
    private final int zzb;
    private final zzmo zzc;

    /* synthetic */ zzmm(String str, int i10, zzmo zzmoVar, byte[] bArr) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = zzmoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzmp) {
            zzmp zzmpVar = (zzmp) obj;
            if (this.zza.equals(zzmpVar.zza()) && this.zzb == zzmpVar.zzb() && this.zzc.equals(zzmpVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzmp
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzmp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzmp
    public final zzmo zzc() {
        return this.zzc;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String string = this.zzc.toString();
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int length2 = string.length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 40 + length + 16 + length2 + 1);
        sb2.append("ClientProfile{packageName=");
        sb2.append(str);
        sb2.append(", versionCode=");
        sb2.append(i10);
        sb2.append(", requestSource=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
