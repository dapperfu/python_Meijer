package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Ro, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7268Ro implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7234Qo[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Oc.Y1 y12 = null;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    strG = SafeParcelReader.g(parcel, iU);
                }
            } else {
                y12 = (Oc.Y1) SafeParcelReader.f(parcel, iU, Oc.Y1.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C7234Qo(y12, strG);
    }
}
