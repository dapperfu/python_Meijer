package Jd;

import Ad.C2808c0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3775i[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        ArrayList arrayListK = null;
        int iW = 0;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 4) {
                        SafeParcelReader.D(parcel, iU);
                    } else {
                        strG = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    iW = SafeParcelReader.w(parcel, iU);
                }
            } else {
                arrayListK = SafeParcelReader.k(parcel, iU, C2808c0.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3775i(arrayListK, iW, strG);
    }
}
