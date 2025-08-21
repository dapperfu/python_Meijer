package Nc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW = 0;
        boolean zN4 = false;
        boolean zN5 = false;
        boolean zN6 = false;
        float fS = 0.0f;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 3:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 4:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 6:
                    fS = SafeParcelReader.s(parcel, iU);
                    break;
                case 7:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 8:
                    zN4 = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    zN5 = SafeParcelReader.n(parcel, iU);
                    break;
                case 10:
                    zN6 = SafeParcelReader.n(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new l(zN, zN2, strG, zN3, fS, iW, zN4, zN5, zN6);
    }
}
