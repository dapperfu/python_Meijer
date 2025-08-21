package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import md.C15708b;

/* loaded from: classes6.dex */
public final class w6 implements Parcelable.Creator {
    static void a(v6 v6Var, Parcel parcel, int i10) {
        int i11 = v6Var.f86765a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.w(parcel, 2, v6Var.f86766b, false);
        C15708b.s(parcel, 3, v6Var.f86767c);
        C15708b.t(parcel, 4, v6Var.f86768d, false);
        C15708b.l(parcel, 5, null, false);
        C15708b.w(parcel, 6, v6Var.f86769e, false);
        C15708b.w(parcel, 7, v6Var.f86770f, false);
        C15708b.j(parcel, 8, v6Var.f86771g, false);
        C15708b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        String strG = null;
        Long lA = null;
        Float fT = null;
        String strG2 = null;
        String strG3 = null;
        Double dR = null;
        long jZ = 0;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 3:
                    jZ = SafeParcelReader.z(parcel, iU);
                    break;
                case 4:
                    lA = SafeParcelReader.A(parcel, iU);
                    break;
                case 5:
                    fT = SafeParcelReader.t(parcel, iU);
                    break;
                case 6:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
                case 7:
                    strG3 = SafeParcelReader.g(parcel, iU);
                    break;
                case 8:
                    dR = SafeParcelReader.r(parcel, iU);
                    break;
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new v6(iW, strG, jZ, lA, fT, strG2, strG3, dR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v6[i10];
    }
}
