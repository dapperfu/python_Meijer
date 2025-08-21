package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes4.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new M[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = SafeParcelReader.E(parcel);
        Account account = null;
        int iW = 0;
        int iW2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iE) {
            int iU = SafeParcelReader.u(parcel);
            int iM = SafeParcelReader.m(iU);
            if (iM != 1) {
                if (iM != 2) {
                    if (iM != 3) {
                        if (iM != 4) {
                            SafeParcelReader.D(parcel, iU);
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.f(parcel, iU, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        iW2 = SafeParcelReader.w(parcel, iU);
                    }
                } else {
                    account = (Account) SafeParcelReader.f(parcel, iU, Account.CREATOR);
                }
            } else {
                iW = SafeParcelReader.w(parcel, iU);
            }
        }
        SafeParcelReader.l(parcel, iE);
        return new M(iW, account, iW2, googleSignInAccount);
    }
}
