package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.q70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9145q70 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C9038p70[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    iW5 = SafeParcelReader.w(parcel, iU);
                    break;
                case 7:
                    iW6 = SafeParcelReader.w(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C9038p70(iW, iW2, iW3, iW4, strG, iW5, iW6);
    }
}
