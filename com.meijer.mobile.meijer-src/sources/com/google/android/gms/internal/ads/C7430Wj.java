package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Wj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7430Wj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7364Uj[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        String strG = null;
        int iW3 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 1000) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            iW = SafeParcelReader.w(parcel, iU);
                        }
                    } else {
                        iW2 = SafeParcelReader.w(parcel, iU);
                    }
                } else {
                    strG = SafeParcelReader.g(parcel, iU);
                }
            } else {
                iW3 = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C7364Uj(iW, iW3, strG, iW2);
    }
}
