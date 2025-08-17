package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ce0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC7698ce0 extends BinderC8865nb implements InterfaceC7805de0 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C8972ob.a(parcel, Bundle.CREATOR);
        C8972ob.c(parcel);
        P(bundle);
        return true;
    }

    public AbstractBinderC7698ce0() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }
}
