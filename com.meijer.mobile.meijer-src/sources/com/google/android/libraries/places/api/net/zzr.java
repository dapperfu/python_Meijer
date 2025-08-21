package com.google.android.libraries.places.api.net;

/* loaded from: classes6.dex */
final class zzr extends IsOpenResponse {
    private final Boolean zza;

    zzr(Boolean bool) {
        this.zza = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IsOpenResponse)) {
            return false;
        }
        IsOpenResponse isOpenResponse = (IsOpenResponse) obj;
        Boolean bool = this.zza;
        return bool == null ? isOpenResponse.isOpen() == null : bool.equals(isOpenResponse.isOpen());
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenResponse
    public final Boolean isOpen() {
        return this.zza;
    }

    public final int hashCode() {
        Boolean bool = this.zza;
        return (bool == null ? 0 : bool.hashCode()) ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(bool).length() + 23);
        sb2.append("IsOpenResponse{isOpen=");
        sb2.append(bool);
        sb2.append("}");
        return sb2.toString();
    }
}
