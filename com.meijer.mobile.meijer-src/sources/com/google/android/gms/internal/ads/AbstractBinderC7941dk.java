package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7941dk extends BinderC8990nb implements InterfaceC8047ek {
    public static InterfaceC8047ek B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8047ek ? (InterfaceC8047ek) iInterfaceQueryLocalInterface : new C7834ck(iBinder);
    }
}
