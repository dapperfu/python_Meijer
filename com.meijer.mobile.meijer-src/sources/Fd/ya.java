package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class ya implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3398ia[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        C3446ma c3446ma = null;
        String strG = null;
        String strG2 = null;
        C3458na[] c3458naArr = null;
        C3422ka[] c3422kaArr = null;
        String[] strArrH = null;
        C3362fa[] c3362faArr = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    c3446ma = (C3446ma) SafeParcelReader.f(parcel, iU, C3446ma.CREATOR);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    c3458naArr = (C3458na[]) SafeParcelReader.j(parcel, iU, C3458na.CREATOR);
                    break;
                case 5:
                    c3422kaArr = (C3422ka[]) SafeParcelReader.j(parcel, iU, C3422ka.CREATOR);
                    break;
                case 6:
                    strArrH = SafeParcelReader.h(parcel, iU);
                    break;
                case 7:
                    c3362faArr = (C3362fa[]) SafeParcelReader.j(parcel, iU, C3362fa.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3398ia(c3446ma, strG, strG2, c3458naArr, c3422kaArr, strArrH, c3362faArr);
    }
}
