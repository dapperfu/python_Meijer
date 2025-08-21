package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import md.C15708b;

/* loaded from: classes6.dex */
public final class H implements Parcelable.Creator {
    static void a(G g10, Parcel parcel, int i10) {
        String str = g10.f85861a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.u(parcel, 3, g10.f85862b, i10, false);
        C15708b.w(parcel, 4, g10.f85863c, false);
        C15708b.s(parcel, 5, g10.f85864d);
        C15708b.b(parcel, iA);
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
