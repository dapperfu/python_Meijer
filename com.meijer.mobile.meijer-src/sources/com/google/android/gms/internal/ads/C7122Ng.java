package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.Ng, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7122Ng implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        boolean zN = false;
        int iW2 = 0;
        boolean zN2 = false;
        int iW3 = 0;
        boolean zN3 = false;
        int iW4 = 0;
        int iW5 = 0;
        boolean zN4 = false;
        int iW6 = 0;
        Oc.R1 r12 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 3:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 5:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 6:
                    r12 = (Oc.R1) SafeParcelReader.f(parcel, iU, Oc.R1.CREATOR);
                    break;
                case 7:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 8:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 9:
                    iW5 = SafeParcelReader.w(parcel, iU);
                    break;
                case 10:
                    zN4 = SafeParcelReader.n(parcel, iU);
                    break;
                case 11:
                    iW6 = SafeParcelReader.w(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C7088Mg(iW, zN, iW2, zN2, iW3, r12, zN3, iW4, iW5, zN4, iW6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C7088Mg[i10];
    }
}
