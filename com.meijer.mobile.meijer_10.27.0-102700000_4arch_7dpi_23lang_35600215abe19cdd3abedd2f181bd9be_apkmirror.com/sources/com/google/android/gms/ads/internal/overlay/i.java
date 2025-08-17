package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        long jZ = 0;
        boolean zN = false;
        int iW = 0;
        int iW2 = 0;
        boolean zN2 = false;
        Oc.l lVar = null;
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        IBinder iBinderV3 = null;
        IBinder iBinderV4 = null;
        String strG = null;
        String strG2 = null;
        IBinder iBinderV5 = null;
        String strG3 = null;
        Qc.a aVar = null;
        String strG4 = null;
        Lc.l lVar2 = null;
        IBinder iBinderV6 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        IBinder iBinderV7 = null;
        IBinder iBinderV8 = null;
        IBinder iBinderV9 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    lVar = (Oc.l) SafeParcelReader.f(parcel, iU, Oc.l.CREATOR);
                    break;
                case 3:
                    iBinderV = SafeParcelReader.v(parcel, iU);
                    break;
                case 4:
                    iBinderV2 = SafeParcelReader.v(parcel, iU);
                    break;
                case 5:
                    iBinderV3 = SafeParcelReader.v(parcel, iU);
                    break;
                case 6:
                    iBinderV4 = SafeParcelReader.v(parcel, iU);
                    break;
                case 7:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 10:
                    iBinderV5 = SafeParcelReader.v(parcel, iU);
                    break;
                case 11:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 12:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 13:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 14:
                    aVar = (Qc.a) SafeParcelReader.f(parcel, iU, Qc.a.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 16:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 17:
                    lVar2 = (Lc.l) SafeParcelReader.f(parcel, iU, Lc.l.CREATOR);
                    break;
                case 18:
                    iBinderV6 = SafeParcelReader.v(parcel, iU);
                    break;
                case 19:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 24:
                    strG6 = SafeParcelReader.g(parcel, iU);
                    break;
                case 25:
                    strG7 = SafeParcelReader.g(parcel, iU);
                    break;
                case 26:
                    iBinderV7 = SafeParcelReader.v(parcel, iU);
                    break;
                case 27:
                    iBinderV8 = SafeParcelReader.v(parcel, iU);
                    break;
                case 28:
                    iBinderV9 = SafeParcelReader.v(parcel, iU);
                    break;
                case 29:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 30:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new AdOverlayInfoParcel(lVar, iBinderV, iBinderV2, iBinderV3, iBinderV4, strG, zN, strG2, iBinderV5, iW, iW2, strG3, aVar, strG4, lVar2, iBinderV6, strG5, strG6, strG7, iBinderV7, iBinderV8, iBinderV9, zN2, jZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
