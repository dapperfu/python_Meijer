package Xd;

import Xd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class h implements Parcelable.Creator<a.c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.c[] newArray(int i10) {
        return new a.c[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a.c createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        a.b bVar = null;
        a.b bVar2 = null;
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
                    bVar = (a.b) SafeParcelReader.f(parcel, iU, a.b.CREATOR);
                    break;
                case 8:
                    bVar2 = (a.b) SafeParcelReader.f(parcel, iU, a.b.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new a.c(strG, strG2, strG3, strG4, strG5, bVar, bVar2);
    }
}
