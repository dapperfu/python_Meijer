package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class C6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        int iW = 0;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW2 = 0;
        int iW3 = 0;
        long jZ = 0;
        long jZ2 = 0;
        long jZ3 = 0;
        long jZ4 = 0;
        long jZ5 = 0;
        long jZ6 = 0;
        long jZ7 = 0;
        String strG = "";
        String strG2 = strG;
        String strG3 = strG2;
        String strG4 = strG3;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        Boolean boolO = null;
        ArrayList<String> arrayListI = null;
        String strG11 = null;
        String strG12 = null;
        int iW4 = 100;
        boolean zN4 = true;
        boolean zN5 = true;
        long jZ8 = -2147483648L;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    strG6 = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    strG7 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    strG8 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 7:
                    jZ2 = SafeParcelReader.z(parcel, iU);
                    break;
                case 8:
                    strG9 = SafeParcelReader.g(parcel, iU);
                    break;
                case 9:
                    zN4 = SafeParcelReader.n(parcel, iU);
                    break;
                case 10:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 11:
                    jZ8 = SafeParcelReader.z(parcel, iU);
                    break;
                case 12:
                    strG10 = SafeParcelReader.g(parcel, iU);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 14:
                    jZ3 = SafeParcelReader.z(parcel, iU);
                    break;
                case 15:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 16:
                    zN5 = SafeParcelReader.n(parcel, iU);
                    break;
                case 18:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 21:
                    boolO = SafeParcelReader.o(parcel, iU);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    jZ4 = SafeParcelReader.z(parcel, iU);
                    break;
                case 23:
                    arrayListI = SafeParcelReader.i(parcel, iU);
                    break;
                case 25:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 26:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 27:
                    strG11 = SafeParcelReader.g(parcel, iU);
                    break;
                case 28:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 29:
                    jZ5 = SafeParcelReader.z(parcel, iU);
                    break;
                case 30:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 31:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case com.medallia.digital.mobilesdk.l3.f92486e /* 32 */:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 34:
                    jZ6 = SafeParcelReader.z(parcel, iU);
                    break;
                case 35:
                    strG12 = SafeParcelReader.g(parcel, iU);
                    break;
                case 36:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 37:
                    jZ7 = SafeParcelReader.z(parcel, iU);
                    break;
                case 38:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new B6(strG5, strG6, strG7, strG8, jZ, jZ2, strG9, zN4, zN, jZ8, strG10, jZ3, iW, zN5, zN2, boolO, jZ4, arrayListI, strG, strG2, strG11, zN3, jZ5, iW4, strG3, iW2, jZ6, strG12, strG4, jZ7, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new B6[i10];
    }
}
