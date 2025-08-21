package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.FuelPrice;
import j$.time.Instant;

/* loaded from: classes6.dex */
abstract class zzy extends FuelPrice {
    private final FuelPrice.FuelType zza;
    private final Money zzb;
    private final Instant zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FuelPrice) {
            FuelPrice fuelPrice = (FuelPrice) obj;
            if (this.zza.equals(fuelPrice.getType()) && this.zzb.equals(fuelPrice.getPrice()) && this.zzc.equals(fuelPrice.getUpdateTime())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final Money getPrice() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final FuelPrice.FuelType getType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final Instant getUpdateTime() {
        return this.zzc;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(length + 23 + length2 + 13 + string3.length() + 1);
        sb2.append("FuelPrice{type=");
        sb2.append(string);
        sb2.append(", price=");
        sb2.append(string2);
        sb2.append(", updateTime=");
        sb2.append(string3);
        sb2.append("}");
        return sb2.toString();
    }

    zzy(FuelPrice.FuelType fuelType, Money money, Instant instant) {
        if (fuelType != null) {
            this.zza = fuelType;
            if (money != null) {
                this.zzb = money;
                if (instant != null) {
                    this.zzc = instant;
                    return;
                }
                throw new NullPointerException("Null updateTime");
            }
            throw new NullPointerException("Null price");
        }
        throw new NullPointerException("Null type");
    }
}
