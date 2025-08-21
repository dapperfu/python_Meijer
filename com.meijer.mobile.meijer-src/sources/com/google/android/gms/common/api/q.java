package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import id.C14719b;

/* loaded from: classes4.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        C14719b c14719b = null;
        int iW = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            c14719b = (C14719b) SafeParcelReader.f(parcel, iU, C14719b.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, iU, PendingIntent.CREATOR);
                    }
                } else {
                    strG = SafeParcelReader.g(parcel, iU);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new Status(iW, strG, pendingIntent, c14719b);
    }
}
