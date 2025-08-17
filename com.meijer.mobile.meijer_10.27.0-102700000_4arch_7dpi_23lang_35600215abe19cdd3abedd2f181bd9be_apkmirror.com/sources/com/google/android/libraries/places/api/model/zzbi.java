package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzbi extends SpecialDay {
    private final LocalDate zza;
    private final boolean zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpecialDay) {
            SpecialDay specialDay = (SpecialDay) obj;
            if (this.zza.equals(specialDay.getDate()) && this.zzb == specialDay.isExceptional()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final LocalDate getDate() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.SpecialDay
    public final boolean isExceptional() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        boolean z10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 30 + String.valueOf(z10).length() + 1);
        sb2.append("SpecialDay{date=");
        sb2.append(string);
        sb2.append(", exceptional=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    zzbi(LocalDate localDate, boolean z10) {
        if (localDate != null) {
            this.zza = localDate;
            this.zzb = z10;
            return;
        }
        throw new NullPointerException("Null date");
    }
}
