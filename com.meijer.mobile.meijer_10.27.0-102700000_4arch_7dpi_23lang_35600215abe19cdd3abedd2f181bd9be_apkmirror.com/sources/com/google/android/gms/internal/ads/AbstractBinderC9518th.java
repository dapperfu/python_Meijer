package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.th, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC9518th extends BinderC8865nb implements InterfaceC9625uh {
    public static InterfaceC9625uh B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9625uh ? (InterfaceC9625uh) iInterfaceQueryLocalInterface : new C9411sh(iBinder);
    }
}
