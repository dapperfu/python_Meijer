package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: com.google.android.gms.internal.ads.Wh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7428Wh extends RemoteCreator {
    public C7428Wh() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8574jh ? (InterfaceC8574jh) iInterfaceQueryLocalInterface : new C8468ih(iBinder);
    }
}
