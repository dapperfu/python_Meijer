package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzaf extends Money {
    private final String zza;
    private final Long zzb;
    private final Integer zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Money) {
            Money money = (Money) obj;
            if (this.zza.equals(money.getCurrencyCode()) && this.zzb.equals(money.getUnits()) && this.zzc.equals(money.getNanos())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final String getCurrencyCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final Integer getNanos() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Money
    public final Long getUnits() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        Long l10 = this.zzb;
        int length = l10.toString().length();
        Integer num = this.zzc;
        int length2 = num.toString().length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 27 + length + 8 + length2 + 1);
        sb2.append("Money{currencyCode=");
        sb2.append(str);
        sb2.append(", units=");
        sb2.append(l10);
        sb2.append(", nanos=");
        sb2.append(num);
        sb2.append("}");
        return sb2.toString();
    }

    zzaf(String str, Long l10, Integer num) {
        if (str != null) {
            this.zza = str;
            this.zzb = l10;
            this.zzc = num;
            return;
        }
        throw new NullPointerException("Null currencyCode");
    }
}
