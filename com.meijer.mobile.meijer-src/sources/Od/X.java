package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        boolean zN2 = false;
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 0.0f;
        float fS7 = 0.0f;
        IBinder iBinderV = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 2:
                    iBinderV = SafeParcelReader.v(parcel, iU);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.f(parcel, iU, LatLng.CREATOR);
                    break;
                case 4:
                    fS = SafeParcelReader.s(parcel, iU);
                    break;
                case 5:
                    fS2 = SafeParcelReader.s(parcel, iU);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.f(parcel, iU, LatLngBounds.CREATOR);
                    break;
                case 7:
                    fS3 = SafeParcelReader.s(parcel, iU);
                    break;
                case 8:
                    fS4 = SafeParcelReader.s(parcel, iU);
                    break;
                case 9:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 10:
                    fS5 = SafeParcelReader.s(parcel, iU);
                    break;
                case 11:
                    fS6 = SafeParcelReader.s(parcel, iU);
                    break;
                case 12:
                    fS7 = SafeParcelReader.s(parcel, iU);
                    break;
                case 13:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C4463k(iBinderV, latLng, fS, fS2, latLngBounds, fS3, fS4, zN, fS5, fS6, fS7, zN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4463k[i10];
    }
}
