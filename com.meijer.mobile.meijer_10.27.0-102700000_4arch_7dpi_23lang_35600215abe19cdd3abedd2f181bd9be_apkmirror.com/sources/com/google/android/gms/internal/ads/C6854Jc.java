package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14244c;

/* renamed from: com.google.android.gms.internal.ads.Jc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6854Jc extends Lc.c {
    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof C6955Mc ? (C6955Mc) iInterfaceQueryLocalInterface : new C6955Mc(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final C14244c[] getApiFeatures() {
        return Ec.u.f7820b;
    }

    C6854Jc(Context context, Looper looper, AbstractC6521c.a aVar, AbstractC6521c.b bVar) {
        super(C6770Go.a(context), looper, 123, aVar, bVar, null);
    }

    public final boolean c() {
        C14244c[] availableFeatures = getAvailableFeatures();
        if (((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue() && com.google.android.gms.common.util.b.b(availableFeatures, Ec.u.f7819a)) {
            return true;
        }
        return false;
    }

    public final C6955Mc d() throws DeadObjectException {
        return (C6955Mc) super.getService();
    }
}
