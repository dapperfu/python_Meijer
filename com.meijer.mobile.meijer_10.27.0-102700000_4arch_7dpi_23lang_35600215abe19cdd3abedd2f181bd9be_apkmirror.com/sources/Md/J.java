package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        LatLng latLng = null;
        float fS3 = 0.0f;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        if (iM != 5) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            fS2 = SafeParcelReader.s(parcel, iU);
                        }
                    } else {
                        fS3 = SafeParcelReader.s(parcel, iU);
                    }
                } else {
                    fS = SafeParcelReader.s(parcel, iU);
                }
            } else {
                latLng = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new CameraPosition(latLng, fS, fS3, fS2);
    }
}
