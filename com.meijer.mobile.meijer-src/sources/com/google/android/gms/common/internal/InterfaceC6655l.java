package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6655l extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.l$a */
    public static abstract class a extends Ad.c implements InterfaceC6655l {
        public static InterfaceC6655l a2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof InterfaceC6655l ? (InterfaceC6655l) iInterfaceQueryLocalInterface : new u0(iBinder);
        }
    }

    void cancel() throws RemoteException;
}
