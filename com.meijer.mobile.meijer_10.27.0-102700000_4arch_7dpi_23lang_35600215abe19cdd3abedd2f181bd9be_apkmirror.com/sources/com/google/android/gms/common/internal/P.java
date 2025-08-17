package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import gd.C14243b;

/* loaded from: classes4.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new O[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        boolean zN = false;
        boolean zN2 = false;
        IBinder iBinderV = null;
        C14243b c14243b = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            if (iM != 5) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                zN2 = SafeParcelReader.n(parcel, iU);
                            }
                        } else {
                            zN = SafeParcelReader.n(parcel, iU);
                        }
                    } else {
                        c14243b = (C14243b) SafeParcelReader.f(parcel, iU, C14243b.CREATOR);
                    }
                } else {
                    iBinderV = SafeParcelReader.v(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new O(iW, iBinderV, c14243b, zN, zN2);
    }
}
