package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import id.C14720c;

/* loaded from: classes4.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Bundle bundleA = null;
        C6649f c6649f = null;
        int iW = 0;
        C14720c[] c14720cArr = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            c6649f = (C6649f) SafeParcelReader.f(parcel, iU, C6649f.CREATOR);
                        }
                    } else {
                        iW = SafeParcelReader.w(parcel, iU);
                    }
                } else {
                    c14720cArr = (C14720c[]) SafeParcelReader.j(parcel, iU, C14720c.CREATOR);
                }
            } else {
                bundleA = SafeParcelReader.a(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new h0(bundleA, c14720cArr, iW, c6649f);
    }
}
