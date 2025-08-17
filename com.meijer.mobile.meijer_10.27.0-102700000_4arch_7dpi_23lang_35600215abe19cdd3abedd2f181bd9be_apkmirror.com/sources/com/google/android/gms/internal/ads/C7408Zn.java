package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6521c;

/* renamed from: com.google.android.gms.internal.ads.Zn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7408Zn extends Lc.c {
    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8463jo ? (InterfaceC8463jo) iInterfaceQueryLocalInterface : new C8251ho(iBinder);
    }

    public C7408Zn(Context context, Looper looper, AbstractC6521c.a aVar, AbstractC6521c.b bVar) {
        super(C6770Go.a(context), looper, 8, aVar, bVar, null);
    }

    public final InterfaceC8463jo c() throws DeadObjectException {
        return (InterfaceC8463jo) super.getService();
    }
}
