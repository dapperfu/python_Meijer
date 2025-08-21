package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* loaded from: classes6.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        List listK = LocationResult.f85580b;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            if (SafeParcelReader.m(iU) != 1) {
                SafeParcelReader.D(parcel, iU);
            } else {
                listK = SafeParcelReader.k(parcel, iU, Location.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new LocationResult(listK);
    }
}
