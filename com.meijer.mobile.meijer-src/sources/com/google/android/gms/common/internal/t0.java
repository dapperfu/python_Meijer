package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public final class t0 extends Ad.a implements InterfaceC6654k {
    @Override // com.google.android.gms.common.internal.InterfaceC6654k
    public final Account zzb() throws RemoteException {
        Parcel parcelK1 = K1(2, c2());
        Account account = (Account) Ad.d.a(parcelK1, Account.CREATOR);
        parcelK1.recycle();
        return account;
    }

    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
}
