package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 0.0f;
        LatLng latLng = null;
        String strG = null;
        String strG2 = null;
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        String strG3 = null;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW = 0;
        int iW2 = 0;
        float fS7 = 1.0f;
        float fS8 = 0.5f;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
                    break;
                case 3:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 4:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    iBinderV = SafeParcelReader.v(parcel, iU);
                    break;
                case 6:
                    fS = SafeParcelReader.s(parcel, iU);
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
                    fS3 = SafeParcelReader.s(parcel, iU);
                    break;
                case 12:
                    fS8 = SafeParcelReader.s(parcel, iU);
                    break;
                case 13:
                    fS4 = SafeParcelReader.s(parcel, iU);
                    break;
                case 14:
                    fS7 = SafeParcelReader.s(parcel, iU);
                    break;
                case 15:
                    fS5 = SafeParcelReader.s(parcel, iU);
                    break;
                case 16:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 17:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 18:
                    iBinderV2 = SafeParcelReader.v(parcel, iU);
                    break;
                case 19:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 20:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 21:
                    fS6 = SafeParcelReader.s(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C4467o(latLng, strG, strG2, iBinderV, fS, fS2, zN, zN2, zN3, fS3, fS8, fS4, fS7, fS5, iW, iBinderV2, iW2, strG3, fS6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4467o[i10];
    }
}
