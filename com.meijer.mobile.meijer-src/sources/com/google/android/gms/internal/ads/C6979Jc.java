package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14720c;

/* renamed from: com.google.android.gms.internal.ads.Jc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6979Jc extends Nc.c {
    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof C7080Mc ? (C7080Mc) iInterfaceQueryLocalInterface : new C7080Mc(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final C14720c[] getApiFeatures() {
        return Gc.u.f11372b;
    }

    C6979Jc(Context context, Looper looper, AbstractC6646c.a aVar, AbstractC6646c.b bVar) {
        super(C6895Go.a(context), looper, 123, aVar, bVar, null);
    }

    public final boolean c() {
        C14720c[] availableFeatures = getAvailableFeatures();
        if (((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue() && com.google.android.gms.common.util.b.b(availableFeatures, Gc.u.f11371a)) {
            return true;
        }
        return false;
    }

    public final C7080Mc d() throws DeadObjectException {
        return (C7080Mc) super.getService();
    }
}
