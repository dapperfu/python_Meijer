package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import gd.C14244c;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Scope[] scopeArr = C6525g.f64864o;
        Bundle bundle = new Bundle();
        C14244c[] c14244cArr = C6525g.f64865p;
        C14244c[] c14244cArr2 = c14244cArr;
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
                    c14244cArr = (C14244c[]) SafeParcelReader.j(parcel, iU, C14244c.CREATOR);
                    break;
                case 11:
                    c14244cArr2 = (C14244c[]) SafeParcelReader.j(parcel, iU, C14244c.CREATOR);
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
        return new C6525g(iW, iW2, iW3, strG, iBinderV, scopeArr, bundle, account, c14244cArr, c14244cArr2, zN, iW4, zN2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6525g[i10];
    }

    static void a(C6525g c6525g, Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, c6525g.f64866a);
        C15137b.n(parcel, 2, c6525g.f64867b);
        C15137b.n(parcel, 3, c6525g.f64868c);
        C15137b.w(parcel, 4, c6525g.f64869d, false);
        C15137b.m(parcel, 5, c6525g.f64870e, false);
        C15137b.z(parcel, 6, c6525g.f64871f, i10, false);
        C15137b.e(parcel, 7, c6525g.f64872g, false);
        C15137b.u(parcel, 8, c6525g.f64873h, i10, false);
        C15137b.z(parcel, 10, c6525g.f64874i, i10, false);
        C15137b.z(parcel, 11, c6525g.f64875j, i10, false);
        C15137b.c(parcel, 12, c6525g.f64876k);
        C15137b.n(parcel, 13, c6525g.f64877l);
        C15137b.c(parcel, 14, c6525g.f64878m);
        C15137b.w(parcel, 15, c6525g.B(), false);
        C15137b.b(parcel, iA);
    }
}
