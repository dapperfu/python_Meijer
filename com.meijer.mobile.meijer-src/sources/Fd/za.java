package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class za implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        String strG11 = null;
        String strG12 = null;
        String strG13 = null;
        String strG14 = null;
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
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    strG6 = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    strG7 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    strG8 = SafeParcelReader.g(parcel, iU);
                    break;
                case 9:
                    strG9 = SafeParcelReader.g(parcel, iU);
                    break;
                case 10:
                    strG10 = SafeParcelReader.g(parcel, iU);
                    break;
                case 11:
                    strG11 = SafeParcelReader.g(parcel, iU);
                    break;
                case 12:
                    strG12 = SafeParcelReader.g(parcel, iU);
                    break;
                case 13:
                    strG13 = SafeParcelReader.g(parcel, iU);
                    break;
                case 14:
                    strG14 = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3410ja(strG, strG2, strG3, strG4, strG5, strG6, strG7, strG8, strG9, strG10, strG11, strG12, strG13, strG14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3410ja[i10];
    }
}
