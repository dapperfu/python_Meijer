package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String[] strArrH = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleA = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            if (iM != 1000) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                iW = SafeParcelReader.w(parcel, iU);
                            }
                        } else {
                            bundleA = SafeParcelReader.a(parcel, iU);
                        }
                    } else {
                        iW2 = SafeParcelReader.w(parcel, iU);
                    }
                } else {
                    cursorWindowArr = (CursorWindow[]) SafeParcelReader.j(parcel, iU, CursorWindow.CREATOR);
                }
            } else {
                strArrH = SafeParcelReader.h(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        DataHolder dataHolder = new DataHolder(iW, strArrH, cursorWindowArr, iW2, bundleA);
        dataHolder.b0();
        return dataHolder;
    }
}
