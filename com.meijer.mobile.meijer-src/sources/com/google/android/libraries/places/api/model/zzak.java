package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PaymentOptions;
import com.google.android.libraries.places.api.model.Place;

/* loaded from: classes6.dex */
final class zzak extends PaymentOptions.Builder {
    private Place.BooleanPlaceAttributeValue zza;
    private Place.BooleanPlaceAttributeValue zzb;
    private Place.BooleanPlaceAttributeValue zzc;
    private Place.BooleanPlaceAttributeValue zzd;

    zzak() {
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final PaymentOptions build() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3;
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4 = this.zza;
        if (booleanPlaceAttributeValue4 != null && (booleanPlaceAttributeValue = this.zzb) != null && (booleanPlaceAttributeValue2 = this.zzc) != null && (booleanPlaceAttributeValue3 = this.zzd) != null) {
            return new zzde(booleanPlaceAttributeValue4, booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" acceptsCreditCards");
        }
        if (this.zzb == null) {
            sb2.append(" acceptsDebitCards");
        }
        if (this.zzc == null) {
            sb2.append(" acceptsCashOnly");
        }
        if (this.zzd == null) {
            sb2.append(" acceptsNfc");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final Place.BooleanPlaceAttributeValue getAcceptsCashOnly() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzc;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"acceptsCashOnly\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final Place.BooleanPlaceAttributeValue getAcceptsCreditCards() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zza;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"acceptsCreditCards\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final Place.BooleanPlaceAttributeValue getAcceptsDebitCards() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzb;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"acceptsDebitCards\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final Place.BooleanPlaceAttributeValue getAcceptsNfc() {
        Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue = this.zzd;
        if (booleanPlaceAttributeValue != null) {
            return booleanPlaceAttributeValue;
        }
        throw new IllegalStateException("Property \"acceptsNfc\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final PaymentOptions.Builder setAcceptsCashOnly(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null acceptsCashOnly");
        }
        this.zzc = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final PaymentOptions.Builder setAcceptsCreditCards(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.zza = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final PaymentOptions.Builder setAcceptsDebitCards(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null acceptsDebitCards");
        }
        this.zzb = booleanPlaceAttributeValue;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PaymentOptions.Builder
    public final PaymentOptions.Builder setAcceptsNfc(Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue) {
        if (booleanPlaceAttributeValue == null) {
            throw new NullPointerException("Null acceptsNfc");
        }
        this.zzd = booleanPlaceAttributeValue;
        return this;
    }
}
