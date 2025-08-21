package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        CameraPosition cameraPosition = null;
        Float fT = null;
        Float fT2 = null;
        LatLngBounds latLngBounds = null;
        Integer numX = null;
        String strG = null;
        byte bP = -1;
        byte bP2 = -1;
        byte bP3 = -1;
        byte bP4 = -1;
        byte bP5 = -1;
        byte bP6 = -1;
        byte bP7 = -1;
        byte bP8 = -1;
        byte bP9 = -1;
        byte bP10 = -1;
        byte bP11 = -1;
        byte bP12 = -1;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    bP = SafeParcelReader.p(parcel, iU);
                    break;
                case 3:
                    bP2 = SafeParcelReader.p(parcel, iU);
                    break;
                case 4:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.f(parcel, iU, CameraPosition.CREATOR);
                    break;
                case 6:
                    bP3 = SafeParcelReader.p(parcel, iU);
                    break;
                case 7:
                    bP4 = SafeParcelReader.p(parcel, iU);
                    break;
                case 8:
                    bP5 = SafeParcelReader.p(parcel, iU);
                    break;
                case 9:
                    bP6 = SafeParcelReader.p(parcel, iU);
                    break;
                case 10:
                    bP7 = SafeParcelReader.p(parcel, iU);
                    break;
                case 11:
                    bP8 = SafeParcelReader.p(parcel, iU);
                    break;
                case 12:
                    bP9 = SafeParcelReader.p(parcel, iU);
                    break;
                case 13:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 14:
                    bP10 = SafeParcelReader.p(parcel, iU);
                    break;
                case 15:
                    bP11 = SafeParcelReader.p(parcel, iU);
                    break;
                case 16:
                    fT = SafeParcelReader.t(parcel, iU);
                    break;
                case 17:
                    fT2 = SafeParcelReader.t(parcel, iU);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.f(parcel, iU, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bP12 = SafeParcelReader.p(parcel, iU);
                    break;
                case 20:
                    numX = SafeParcelReader.x(parcel, iU);
                    break;
                case 21:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 23:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new GoogleMapOptions(bP, bP2, iW, cameraPosition, bP3, bP4, bP5, bP6, bP7, bP8, bP9, bP10, bP11, fT, fT2, latLngBounds, bP12, numX, strG, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
