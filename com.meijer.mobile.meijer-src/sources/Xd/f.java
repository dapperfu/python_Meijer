package Xd;

import Xd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class f implements Parcelable.Creator<a.b> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.b[] newArray(int i10) {
        return new a.b[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.b createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        boolean zN = false;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 6:
                    iW5 = SafeParcelReader.w(parcel, iU);
                    break;
                case 7:
                    iW6 = SafeParcelReader.w(parcel, iU);
                    break;
                case 8:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new a.b(iW, iW2, iW3, iW4, iW5, iW6, zN, strG);
    }
}
