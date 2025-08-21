package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new com.google.android.gms.maps.model.a[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    fS2 = SafeParcelReader.s(parcel, iU);
                }
            } else {
                fS = SafeParcelReader.s(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new com.google.android.gms.maps.model.a(fS, fS2);
    }
}
