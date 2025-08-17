package com.google.android.libraries.places.api.model;

import Be.p;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.RoutingParameters;

/* loaded from: classes6.dex */
final class zzfa implements Parcelable.Creator {
    zzfa() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RoutingParameters.RoutingPreference[i10];
    }

    @Override // android.os.Parcelable.Creator
    @SuppressLint({"AmbiguousGranuleClass"})
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return RoutingParameters.RoutingPreference.valueOf((String) p.q(parcel.readString()));
    }
}
