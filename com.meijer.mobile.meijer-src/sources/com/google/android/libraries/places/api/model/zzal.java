package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
abstract class zzal extends PaymentOptions {
    private final Place.BooleanPlaceAttributeValue zza;
    private final Place.BooleanPlaceAttributeValue zzb;
    private final Place.BooleanPlaceAttributeValue zzc;
    private final Place.BooleanPlaceAttributeValue zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaymentOptions) {
            PaymentOptions paymentOptions = (PaymentOptions) obj;
            if (this.zza.equals(paymentOptions.getAcceptsCreditCards()) && this.zzb.equals(paymentOptions.getAcceptsDebitCards()) && this.zzc.equals(paymentOptions.getAcceptsCashOnly()) && this.zzd.equals(paymentOptions.getAcceptsNfc())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final Place.BooleanPlaceAttributeValue getAcceptsCashOnly() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final Place.BooleanPlaceAttributeValue getAcceptsCreditCards() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final Place.BooleanPlaceAttributeValue getAcceptsDebitCards() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions
    public final Place.BooleanPlaceAttributeValue getAcceptsNfc() {
        return this.zzd;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        int length3 = string3.length();
        String string4 = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 18 + length3 + 13 + string4.length() + 1);
        sb2.append("PaymentOptions{acceptsCreditCards=");
        sb2.append(string);
        sb2.append(", acceptsDebitCards=");
        sb2.append(string2);
        sb2.append(", acceptsCashOnly=");
        sb2.append(string3);
        sb2.append(", acceptsNfc=");
        sb2.append(string4);
        sb2.append("}");
        return sb2.toString();
    }

    zzal(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4) {
        if (booleanPlaceAttributeValue != null) {
            this.zza = booleanPlaceAttributeValue;
            if (booleanPlaceAttributeValue2 != null) {
                this.zzb = booleanPlaceAttributeValue2;
                if (booleanPlaceAttributeValue3 != null) {
                    this.zzc = booleanPlaceAttributeValue3;
                    if (booleanPlaceAttributeValue4 != null) {
                        this.zzd = booleanPlaceAttributeValue4;
                        return;
                    }
                    throw new NullPointerException("Null acceptsNfc");
                }
                throw new NullPointerException("Null acceptsCashOnly");
            }
            throw new NullPointerException("Null acceptsDebitCards");
        }
        throw new NullPointerException("Null acceptsCreditCards");
    }
}
