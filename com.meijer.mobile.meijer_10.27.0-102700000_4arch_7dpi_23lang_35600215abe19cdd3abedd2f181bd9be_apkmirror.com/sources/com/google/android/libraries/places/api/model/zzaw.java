package com.google.android.libraries.places.api.model;

/* loaded from: classes6.dex */
abstract class zzaw extends zzey {
    private final Money zza;
    private final Money zzb;

    zzaw(Money money, Money money2) {
        this.zza = money;
        this.zzb = money2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzey) {
            zzey zzeyVar = (zzey) obj;
            Money money = this.zza;
            if (money != null ? money.equals(zzeyVar.zza()) : zzeyVar.zza() == null) {
                Money money2 = this.zzb;
                if (money2 != null ? money2.equals(zzeyVar.zzb()) : zzeyVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.zzey
    public final Money zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.zzey
    public final Money zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        Money money = this.zza;
        int iHashCode = money == null ? 0 : money.hashCode();
        Money money2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (money2 != null ? money2.hashCode() : 0);
    }

    public final String toString() {
        Money money = this.zzb;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(money);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 33 + strValueOf2.length() + 1);
        sb2.append("PriceRange{startPrice=");
        sb2.append(strValueOf);
        sb2.append(", endPrice=");
        sb2.append(strValueOf2);
        sb2.append("}");
        return sb2.toString();
    }
}
