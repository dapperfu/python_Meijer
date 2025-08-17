package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7816dk extends BinderC8865nb implements InterfaceC7922ek {
    public static InterfaceC7922ek B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7922ek ? (InterfaceC7922ek) iInterfaceQueryLocalInterface : new C7709ck(iBinder);
    }
}
