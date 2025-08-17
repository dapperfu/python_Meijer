package com.google.android.gms.maps;

import Md.B;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

/* loaded from: classes6.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StreetViewPanoramaOptions[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String strG = null;
        LatLng latLng = null;
        Integer numX = null;
        B b10 = null;
        byte bP = 0;
        byte bP2 = 0;
        byte bP3 = 0;
        byte bP4 = 0;
        byte bP5 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.f(parcel, iU, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
                    break;
                case 5:
                    numX = SafeParcelReader.x(parcel, iU);
                    break;
                case 6:
                    bP = SafeParcelReader.p(parcel, iU);
                    break;
                case 7:
                    bP2 = SafeParcelReader.p(parcel, iU);
                    break;
                case 8:
                    bP3 = SafeParcelReader.p(parcel, iU);
                    break;
                case 9:
                    bP4 = SafeParcelReader.p(parcel, iU);
                    break;
                case 10:
                    bP5 = SafeParcelReader.p(parcel, iU);
                    break;
                case 11:
                    b10 = (B) SafeParcelReader.f(parcel, iU, B.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, strG, latLng, numX, bP, bP2, bP3, bP4, bP5, b10);
    }
}
