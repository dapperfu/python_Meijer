package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import yd.C18206a;

/* loaded from: classes4.dex */
public final class t0 extends C18206a implements InterfaceC6529k {
    @Override // com.google.android.gms.common.internal.InterfaceC6529k
    public final Account zzb() throws RemoteException {
        Parcel parcelA1 = A1(2, b2());
        Account account = (Account) yd.d.a(parcelA1, Account.CREATOR);
        parcelA1.recycle();
        return account;
    }

    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
}
