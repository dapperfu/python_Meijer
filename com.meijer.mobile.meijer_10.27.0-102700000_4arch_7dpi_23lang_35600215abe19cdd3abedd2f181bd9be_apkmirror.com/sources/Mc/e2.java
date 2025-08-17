package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class e2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        int iW3 = 0;
        int iW4 = 0;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        boolean zN5 = false;
        boolean zN6 = false;
        boolean zN7 = false;
        boolean zN8 = false;
        boolean zN9 = false;
        String strG = null;
        d2[] d2VarArr = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 6:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 7:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 8:
                    d2VarArr = (d2[]) SafeParcelReader.j(parcel, iU, d2.CREATOR);
                    break;
                case 9:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 10:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 11:
                    zN4 = SafeParcelReader.n(parcel, iU);
                    break;
                case 12:
                    zN5 = SafeParcelReader.n(parcel, iU);
                    break;
                case 13:
                    zN6 = SafeParcelReader.n(parcel, iU);
                    break;
                case 14:
                    zN7 = SafeParcelReader.n(parcel, iU);
                    break;
                case 15:
                    zN8 = SafeParcelReader.n(parcel, iU);
                    break;
                case 16:
                    zN9 = SafeParcelReader.n(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new d2(strG, iW, iW2, zN, iW3, iW4, d2VarArr, zN2, zN3, zN4, zN5, zN6, zN7, zN8, zN9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d2[i10];
    }
}
