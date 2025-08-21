package od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: od.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16113i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C16106b[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        boolean zN = false;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    iW = SafeParcelReader.w(parcel, iU);
                }
            } else {
                zN = SafeParcelReader.n(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C16106b(zN, iW);
    }
}
