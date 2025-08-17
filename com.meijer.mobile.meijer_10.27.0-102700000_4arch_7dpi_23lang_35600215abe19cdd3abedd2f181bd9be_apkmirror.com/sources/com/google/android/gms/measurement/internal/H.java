package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class H implements Parcelable.Creator {
    static void a(G g10, Parcel parcel, int i10) {
        String str = g10.f85021a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.u(parcel, 3, g10.f85022b, i10, false);
        C15137b.w(parcel, 4, g10.f85023c, false);
        C15137b.s(parcel, 5, g10.f85024d);
        C15137b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new G[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        long jZ = 0;
        String strG = null;
        E e10 = null;
        String strG2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 2) {
                if (iM != 3) {
                    if (iM != 4) {
                        if (iM != 5) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            jZ = SafeParcelReader.z(parcel, iU);
                        }
                    } else {
                        strG2 = SafeParcelReader.g(parcel, iU);
                    }
                } else {
                    e10 = (E) SafeParcelReader.f(parcel, iU, E.CREATOR);
                }
            } else {
                strG = SafeParcelReader.g(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new G(strG, e10, strG2, jZ);
    }
}
