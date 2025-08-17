package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new A[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        C4199z[] c4199zArr = null;
        LatLng latLng = null;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        strG = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    latLng = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
                }
            } else {
                c4199zArr = (C4199z[]) SafeParcelReader.j(parcel, iU, C4199z.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new A(c4199zArr, latLng, strG);
    }
}
