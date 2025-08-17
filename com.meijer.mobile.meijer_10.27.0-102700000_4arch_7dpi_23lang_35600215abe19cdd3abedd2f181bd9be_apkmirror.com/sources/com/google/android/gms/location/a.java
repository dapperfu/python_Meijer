package com.google.android.gms.location;

import Jd.A;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        A[] aArr = null;
        long jZ = 0;
        int iW = 1;
        int iW2 = 1;
        int iW3 = 1000;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 4:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    aArr = (A[]) SafeParcelReader.j(parcel, iU, A.CREATOR);
                    break;
                case 6:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new LocationAvailability(iW3, iW, iW2, jZ, aArr, zN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
