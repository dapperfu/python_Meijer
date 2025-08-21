package com.google.android.gms.location;

import Cd.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        WorkSource workSource = new WorkSource();
        Q q10 = null;
        boolean zN = false;
        int iW = 0;
        int iW2 = 0;
        boolean zN2 = false;
        long jZ = -1;
        float fS = 0.0f;
        int iW3 = Integer.MAX_VALUE;
        long jZ2 = Long.MAX_VALUE;
        long jZ3 = Long.MAX_VALUE;
        long jZ4 = 0;
        long jZ5 = 600000;
        long jZ6 = 3600000;
        int iW4 = 102;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    jZ6 = SafeParcelReader.z(parcel, iU);
                    break;
                case 3:
                    jZ5 = SafeParcelReader.z(parcel, iU);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 5:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 6:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 7:
                    fS = SafeParcelReader.s(parcel, iU);
                    break;
                case 8:
                    jZ4 = SafeParcelReader.z(parcel, iU);
                    break;
                case 9:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 10:
                    jZ3 = SafeParcelReader.z(parcel, iU);
                    break;
                case 11:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 12:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 13:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 15:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.f(parcel, iU, WorkSource.CREATOR);
                    break;
                case 17:
                    q10 = (Q) SafeParcelReader.f(parcel, iU, Q.CREATOR);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new LocationRequest(iW4, jZ6, jZ5, jZ4, jZ2, jZ3, iW3, fS, zN, jZ, iW, iW2, zN2, workSource, q10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
