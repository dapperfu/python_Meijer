package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        ArrayList arrayListK = null;
        C4180f c4180f = null;
        C4180f c4180f2 = null;
        ArrayList arrayListK2 = null;
        ArrayList arrayListK3 = null;
        int iW = 0;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW2 = 0;
        float fS = 0.0f;
        float fS2 = 0.0f;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    arrayListK = SafeParcelReader.k(parcel, iU, LatLng.CREATOR);
                    break;
                case 3:
                    fS = SafeParcelReader.s(parcel, iU);
                    break;
                case 4:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 5:
                    fS2 = SafeParcelReader.s(parcel, iU);
                    break;
                case 6:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 7:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 8:
                    zN3 = SafeParcelReader.n(parcel, iU);
                    break;
                case 9:
                    c4180f = (C4180f) SafeParcelReader.f(parcel, iU, C4180f.CREATOR);
                    break;
                case 10:
                    c4180f2 = (C4180f) SafeParcelReader.f(parcel, iU, C4180f.CREATOR);
                    break;
                case 11:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 12:
                    arrayListK2 = SafeParcelReader.k(parcel, iU, C4190p.CREATOR);
                    break;
                case 13:
                    arrayListK3 = SafeParcelReader.k(parcel, iU, D.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C4195v(arrayListK, fS, iW, fS2, zN, zN2, zN3, c4180f, c4180f2, iW2, arrayListK2, arrayListK3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4195v[i10];
    }
}
