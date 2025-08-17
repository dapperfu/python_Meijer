package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6529k extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class a extends yd.c implements InterfaceC6529k {
        public static InterfaceC6529k a2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC6529k ? (InterfaceC6529k) iInterfaceQueryLocalInterface : new t0(iBinder);
        }
    }

    Account zzb() throws RemoteException;
}
