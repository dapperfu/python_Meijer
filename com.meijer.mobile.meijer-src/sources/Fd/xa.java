package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class xa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3386ha[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        C3374ga c3374ga = null;
        C3374ga c3374ga2 = null;
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
                    c3374ga = (C3374ga) SafeParcelReader.f(parcel, iU, C3374ga.CREATOR);
                    break;
                case 7:
                    c3374ga2 = (C3374ga) SafeParcelReader.f(parcel, iU, C3374ga.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3386ha(strG, strG2, strG3, strG4, strG5, c3374ga, c3374ga2);
    }
}
