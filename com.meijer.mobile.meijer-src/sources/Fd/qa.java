package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class qa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q3[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        U5 u52 = null;
        String strG = null;
        String strG2 = null;
        C3542v6[] c3542v6Arr = null;
        S4[] s4Arr = null;
        String[] strArrH = null;
        C3450n2[] c3450n2Arr = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    u52 = (U5) SafeParcelReader.f(parcel, iU, U5.CREATOR);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    c3542v6Arr = (C3542v6[]) SafeParcelReader.j(parcel, iU, C3542v6.CREATOR);
                    break;
                case 6:
                    s4Arr = (S4[]) SafeParcelReader.j(parcel, iU, S4.CREATOR);
                    break;
                case 7:
                    strArrH = SafeParcelReader.h(parcel, iU);
                    break;
                case 8:
                    c3450n2Arr = (C3450n2[]) SafeParcelReader.j(parcel, iU, C3450n2.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new Q3(u52, strG, strG2, c3542v6Arr, s4Arr, strArrH, c3450n2Arr);
    }
}
