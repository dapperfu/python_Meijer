package ae;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5686a[i10];
    }

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
        int iW = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 2:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 6:
                    strG4 = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    strG5 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    strG6 = SafeParcelReader.g(parcel, iU);
                    break;
                case 9:
                    strG7 = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C5686a(strG, iW, zN, strG2, strG3, strG4, strG5, strG6, strG7);
    }
}
