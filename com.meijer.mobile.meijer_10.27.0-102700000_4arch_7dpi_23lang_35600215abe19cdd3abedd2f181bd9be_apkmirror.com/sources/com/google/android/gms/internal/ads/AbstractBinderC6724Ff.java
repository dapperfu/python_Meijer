package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Ff, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6724Ff extends BinderC8865nb implements InterfaceC6758Gf {
    public static InterfaceC6758Gf B9(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC6758Gf ? (InterfaceC6758Gf) iInterfaceQueryLocalInterface : new C6690Ef(iBinder);
    }
}
