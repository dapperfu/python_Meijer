package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class ya implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3176ia[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        C3224ma c3224ma = null;
        String strG = null;
        String strG2 = null;
        C3236na[] c3236naArr = null;
        C3200ka[] c3200kaArr = null;
        String[] strArrH = null;
        C3140fa[] c3140faArr = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    c3224ma = (C3224ma) SafeParcelReader.f(parcel, iU, C3224ma.CREATOR);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    c3236naArr = (C3236na[]) SafeParcelReader.j(parcel, iU, C3236na.CREATOR);
                    break;
                case 5:
                    c3200kaArr = (C3200ka[]) SafeParcelReader.j(parcel, iU, C3200ka.CREATOR);
                    break;
                case 6:
                    strArrH = SafeParcelReader.h(parcel, iU);
                    break;
                case 7:
                    c3140faArr = (C3140fa[]) SafeParcelReader.j(parcel, iU, C3140fa.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3176ia(c3224ma, strG, strG2, c3236naArr, c3200kaArr, strArrH, c3140faArr);
    }
}
