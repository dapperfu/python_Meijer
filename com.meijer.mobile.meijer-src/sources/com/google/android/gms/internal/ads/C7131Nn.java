package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Nn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7131Nn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7097Mn[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    iBinderV2 = SafeParcelReader.v(parcel, iU);
                }
            } else {
                iBinderV = SafeParcelReader.v(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C7097Mn(iBinderV, iBinderV2);
    }
}
