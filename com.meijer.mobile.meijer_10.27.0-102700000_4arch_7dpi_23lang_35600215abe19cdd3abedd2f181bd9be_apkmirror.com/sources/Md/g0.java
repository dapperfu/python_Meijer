package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4193t[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        ArrayList arrayList = new ArrayList();
        float fS = 0.0f;
        ArrayList arrayListK = null;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW3 = 0;
        float fS2 = 0.0f;
        ArrayList arrayListK2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    arrayListK2 = SafeParcelReader.k(parcel, iU, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.y(parcel, iU, arrayList, g0.class.getClassLoader());
                    break;
                case 4:
                    fS = SafeParcelReader.s(parcel, iU);
                    break;
                case 5:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 6:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 7:
                    fS2 = SafeParcelReader.s(parcel, iU);
                    break;
                case 8:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 10:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 11:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 12:
                    arrayListK = SafeParcelReader.k(parcel, iU, C4190p.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C4193t(arrayListK2, arrayList, fS, iW, iW2, fS2, zN, zN2, zN3, iW3, arrayListK);
    }
}
