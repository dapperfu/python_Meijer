package Rd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class g implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        byte[] bArrB = null;
        byte[][] bArrC = null;
        byte[][] bArrC2 = null;
        byte[][] bArrC3 = null;
        byte[][] bArrC4 = null;
        int[] iArrD = null;
        byte[][] bArrC5 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    bArrB = SafeParcelReader.b(parcel, iU);
                    break;
                case 4:
                    bArrC = SafeParcelReader.c(parcel, iU);
                    break;
                case 5:
                    bArrC2 = SafeParcelReader.c(parcel, iU);
                    break;
                case 6:
                    bArrC3 = SafeParcelReader.c(parcel, iU);
                    break;
                case 7:
                    bArrC4 = SafeParcelReader.c(parcel, iU);
                    break;
                case 8:
                    iArrD = SafeParcelReader.d(parcel, iU);
                    break;
                case 9:
                    bArrC5 = SafeParcelReader.c(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new a(strG, bArrB, bArrC, bArrC2, bArrC3, bArrC4, iArrD, bArrC5);
    }
}
