package Cd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6647d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        long jZ = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListK = null;
        String strG = null;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM == 1) {
                locationRequest = (LocationRequest) SafeParcelReader.f(parcel, iU, LocationRequest.CREATOR);
            } else if (iM == 5) {
                arrayListK = SafeParcelReader.k(parcel, iU, C6647d.CREATOR);
            } else if (iM == 8) {
                zN = SafeParcelReader.n(parcel, iU);
            } else if (iM != 9) {
                switch (iM) {
                    case 11:
                        zN3 = SafeParcelReader.n(parcel, iU);
                        break;
                    case 12:
                        zN4 = SafeParcelReader.n(parcel, iU);
                        break;
                    case 13:
                        strG = SafeParcelReader.g(parcel, iU);
                        break;
                    case 14:
                        jZ = SafeParcelReader.z(parcel, iU);
                        break;
                    default:
                        SafeParcelReader.D(parcel, iU);
                        break;
                }
            } else {
                zN2 = SafeParcelReader.n(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new Y(locationRequest, arrayListK, zN, zN2, zN3, zN4, strG, jZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Y[i10];
    }
}
