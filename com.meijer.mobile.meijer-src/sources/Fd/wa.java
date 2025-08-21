package Fd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class wa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3374ga[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    iW5 = SafeParcelReader.w(parcel, iU);
                    break;
                case 6:
                    iW6 = SafeParcelReader.w(parcel, iU);
                    break;
                case 7:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 8:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3374ga(iW, iW2, iW3, iW4, iW5, iW6, zN, strG);
    }
}
