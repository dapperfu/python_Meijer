package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new I[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        if (iM != 5) {
                            if (iM != 6) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                latLngBounds = (LatLngBounds) SafeParcelReader.f(parcel, iU, LatLngBounds.CREATOR);
                            }
                        } else {
                            latLng4 = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
                        }
                    } else {
                        latLng3 = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
                    }
                } else {
                    latLng2 = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new I(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }
}
