package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Ic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6820Ic implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6786Hc[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        long jZ = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        if (iM != 5) {
                            if (iM != 6) {
                                SafeParcelReader.D(parcel, iU);
                            } else {
                                zN3 = SafeParcelReader.n(parcel, iU);
                            }
                        } else {
                            jZ = SafeParcelReader.z(parcel, iU);
                        }
                    } else {
                        zN2 = SafeParcelReader.n(parcel, iU);
                    }
                } else {
                    zN = SafeParcelReader.n(parcel, iU);
                }
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.f(parcel, iU, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C6786Hc(parcelFileDescriptor, zN, zN2, jZ, zN3);
    }
}
