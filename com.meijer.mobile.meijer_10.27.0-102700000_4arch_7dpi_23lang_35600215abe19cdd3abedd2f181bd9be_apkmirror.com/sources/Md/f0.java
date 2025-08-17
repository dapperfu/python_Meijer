package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        LatLng latLng = null;
        String strG = null;
        String strG2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        strG2 = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    strG = SafeParcelReader.g(parcel, iU);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new r(latLng, strG, strG2);
    }
}
