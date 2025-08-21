package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10182yj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        long jZ = 0;
        boolean zN = false;
        int iW = 0;
        boolean zN2 = false;
        String strG = null;
        byte[] bArrB = null;
        String[] strArrH = null;
        String[] strArrH2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    bArrB = SafeParcelReader.b(parcel, iU);
                    break;
                case 5:
                    strArrH = SafeParcelReader.h(parcel, iU);
                    break;
                case 6:
                    strArrH2 = SafeParcelReader.h(parcel, iU);
                    break;
                case 7:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 8:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C10075xj(zN, strG, iW, bArrB, strArrH, strArrH2, zN2, jZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C10075xj[i10];
    }
}
