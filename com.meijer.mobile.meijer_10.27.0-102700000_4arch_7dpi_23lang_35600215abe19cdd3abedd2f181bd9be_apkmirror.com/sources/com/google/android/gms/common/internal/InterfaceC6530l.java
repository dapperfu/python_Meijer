package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6530l extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.l$a */
    public static abstract class a extends yd.c implements InterfaceC6530l {
        public static InterfaceC6530l a2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof InterfaceC6530l ? (InterfaceC6530l) iInterfaceQueryLocalInterface : new u0(iBinder);
        }
    }

    void cancel() throws RemoteException;
}
