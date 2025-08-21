package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6646c;

/* renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9647tj extends Nc.c {
    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof C6720Bj ? (C6720Bj) iInterfaceQueryLocalInterface : new C6720Bj(iBinder);
    }

    C9647tj(Context context, Looper looper, AbstractC6646c.a aVar, AbstractC6646c.b bVar) {
        super(C6895Go.a(context), looper, 166, aVar, bVar, null);
    }

    public final C6720Bj c() throws DeadObjectException {
        return (C6720Bj) super.getService();
    }
}
