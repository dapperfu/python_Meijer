package pd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import id.C14720c;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C16418a[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        ArrayList arrayListK = null;
        String strG = null;
        boolean zN = false;
        String strG2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            strG = SafeParcelReader.g(parcel, iU);
                        }
                    } else {
                        strG2 = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    zN = SafeParcelReader.n(parcel, iU);
                }
            } else {
                arrayListK = SafeParcelReader.k(parcel, iU, C14720c.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C16418a(arrayListK, zN, strG2, strG);
    }
}
