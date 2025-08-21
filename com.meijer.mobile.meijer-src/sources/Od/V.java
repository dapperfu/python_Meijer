package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        LatLng latLng = null;
        ArrayList arrayListK = null;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        boolean zN2 = false;
        float fS = 0.0f;
        float fS2 = 0.0f;
        double dQ = 0.0d;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
                    break;
                case 3:
                    dQ = SafeParcelReader.q(parcel, iU);
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
                    arrayListK = SafeParcelReader.k(parcel, iU, C4468p.CREATOR);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C4460h(latLng, dQ, fS, iW, iW2, fS2, zN, zN2, arrayListK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4460h[i10];
    }
}
