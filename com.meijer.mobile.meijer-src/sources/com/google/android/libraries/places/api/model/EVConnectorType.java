package com.google.android.libraries.places.api.model;

import De.p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public enum EVConnectorType implements Parcelable {
    EV_CONNECTOR_TYPE_UNSPECIFIED,
    EV_CONNECTOR_TYPE_OTHER,
    EV_CONNECTOR_TYPE_J1772,
    EV_CONNECTOR_TYPE_TYPE_2,
    EV_CONNECTOR_TYPE_CHADEMO,
    EV_CONNECTOR_TYPE_CCS_COMBO_1,
    EV_CONNECTOR_TYPE_CCS_COMBO_2,
    EV_CONNECTOR_TYPE_TESLA,
    EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T,
    EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;


    @RecentlyNonNull
    public static final Parcelable.Creator<EVConnectorType> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.api.model.zzem
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new EVConnectorType[i10];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return EVConnectorType.valueOf((String) p.q(parcel.readString()));
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        parcel.writeString(name());
    }
}
