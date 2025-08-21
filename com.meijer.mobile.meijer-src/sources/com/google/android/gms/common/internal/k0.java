package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import id.C14720c;
import md.C15708b;

/* loaded from: classes4.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Scope[] scopeArr = C6650g.f65704o;
        Bundle bundle = new Bundle();
        C14720c[] c14720cArr = C6650g.f65705p;
        C14720c[] c14720cArr2 = c14720cArr;
        String strG = null;
        IBinder iBinderV = null;
        Account account = null;
        String strG2 = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zN = false;
        int iW4 = 0;
        boolean zN2 = false;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            switch (SafeParcelReader.m(iU)) {
                case 1:
                    iW = SafeParcelReader.w(parcel, iU);
                    break;
                case 2:
                    iW2 = SafeParcelReader.w(parcel, iU);
                    break;
                case 3:
                    iW3 = SafeParcelReader.w(parcel, iU);
                    break;
                case 4:
                    strG = SafeParcelReader.g(parcel, iU);
                    break;
                case 5:
                    iBinderV = SafeParcelReader.v(parcel, iU);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.j(parcel, iU, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, iU);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.f(parcel, iU, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.D(parcel, iU);
                    break;
                case 10:
                    c14720cArr = (C14720c[]) SafeParcelReader.j(parcel, iU, C14720c.CREATOR);
                    break;
                case 11:
                    c14720cArr2 = (C14720c[]) SafeParcelReader.j(parcel, iU, C14720c.CREATOR);
                    break;
                case 12:
                    zN = SafeParcelReader.n(parcel, iU);
                    break;
                case 13:
                    iW4 = SafeParcelReader.w(parcel, iU);
                    break;
                case 14:
                    zN2 = SafeParcelReader.n(parcel, iU);
                    break;
                case 15:
                    strG2 = SafeParcelReader.g(parcel, iU);
                    break;
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new C6650g(iW, iW2, iW3, strG, iBinderV, scopeArr, bundle, account, c14720cArr, c14720cArr2, zN, iW4, zN2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6650g[i10];
    }

    static void a(C6650g c6650g, Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, c6650g.f65706a);
        C15708b.n(parcel, 2, c6650g.f65707b);
        C15708b.n(parcel, 3, c6650g.f65708c);
        C15708b.w(parcel, 4, c6650g.f65709d, false);
        C15708b.m(parcel, 5, c6650g.f65710e, false);
        C15708b.z(parcel, 6, c6650g.f65711f, i10, false);
        C15708b.e(parcel, 7, c6650g.f65712g, false);
        C15708b.u(parcel, 8, c6650g.f65713h, i10, false);
        C15708b.z(parcel, 10, c6650g.f65714i, i10, false);
        C15708b.z(parcel, 11, c6650g.f65715j, i10, false);
        C15708b.c(parcel, 12, c6650g.f65716k);
        C15708b.n(parcel, 13, c6650g.f65717l);
        C15708b.c(parcel, 14, c6650g.f65718m);
        C15708b.w(parcel, 15, c6650g.B(), false);
        C15708b.b(parcel, iA);
    }
}
