package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ce0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7823ce0 extends BinderC8990nb implements InterfaceC7930de0 {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C9097ob.a(parcel, Bundle.CREATOR);
        C9097ob.c(parcel);
        P(bundle);
        return true;
    }

    public AbstractBinderC7823ce0() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }
}
