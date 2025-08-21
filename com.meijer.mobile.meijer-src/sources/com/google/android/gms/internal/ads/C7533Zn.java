package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6646c;

/* renamed from: com.google.android.gms.internal.ads.Zn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7533Zn extends Nc.c {
    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8588jo ? (InterfaceC8588jo) iInterfaceQueryLocalInterface : new C8376ho(iBinder);
    }

    public C7533Zn(Context context, Looper looper, AbstractC6646c.a aVar, AbstractC6646c.b bVar) {
        super(C6895Go.a(context), looper, 8, aVar, bVar, null);
    }

    public final InterfaceC8588jo c() throws DeadObjectException {
        return (InterfaceC8588jo) super.getService();
    }
}
