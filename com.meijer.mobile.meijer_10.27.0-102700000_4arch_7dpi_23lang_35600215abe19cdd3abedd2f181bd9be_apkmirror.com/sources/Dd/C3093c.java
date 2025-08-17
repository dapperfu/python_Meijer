package Dd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: Dd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3093c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3297t5[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        double dQ = 0.0d;
        double dQ2 = 0.0d;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    SafeParcelReader.D(parcel, iU);
                } else {
                    dQ2 = SafeParcelReader.q(parcel, iU);
                }
            } else {
                dQ = SafeParcelReader.q(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C3297t5(dQ, dQ2);
    }
}
