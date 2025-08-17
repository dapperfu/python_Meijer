package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.ads.nq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8895nq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C8788mq[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        Mc.d2 d2Var = null;
        Mc.Y1 y12 = null;
        String strG3 = null;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 2:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    d2Var = (Mc.d2) SafeParcelReader.f(parcel, iU, Mc.d2.CREATOR);
                    break;
                case 4:
                    y12 = (Mc.Y1) SafeParcelReader.f(parcel, iU, Mc.Y1.CREATOR);
                    break;
                case 5:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 6:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C8788mq(strG, strG2, d2Var, y12, iW, strG3);
    }
}
