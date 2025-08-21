package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11290j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        v6 v6Var = null;
        String strG3 = null;
        G g10 = null;
        G g11 = null;
        G g12 = null;
        long jZ = 0;
        long jZ2 = 0;
        long jZ3 = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    v6Var = (v6) SafeParcelReader.f(parcel, iU, v6.CREATOR);
                    break;
                case 5:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 6:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 7:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    g10 = (G) SafeParcelReader.f(parcel, iU, G.CREATOR);
                    break;
                case 9:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 10:
                    g11 = (G) SafeParcelReader.f(parcel, iU, G.CREATOR);
                    break;
                case 11:
                    jZ3 = SafeParcelReader.z(parcel, iU);
                    break;
                case 12:
                    g12 = (G) SafeParcelReader.f(parcel, iU, G.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C11282i(strG, strG2, v6Var, jZ, zN, strG3, g10, jZ2, g11, jZ3, g12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C11282i[i10];
    }
}
