package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6654k extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class a extends Ad.c implements InterfaceC6654k {
        public static InterfaceC6654k a2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC6654k ? (InterfaceC6654k) iInterfaceQueryLocalInterface : new t0(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
