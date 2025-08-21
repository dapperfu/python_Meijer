package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class Y9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3474p3[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        O2 o22 = null;
        O2 o23 = null;
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
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    o22 = (O2) SafeParcelReader.f(parcel, iU, O2.CREATOR);
                    break;
                case 8:
                    o23 = (O2) SafeParcelReader.f(parcel, iU, O2.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3474p3(strG, strG2, strG3, strG4, strG5, o22, o23);
    }
}
