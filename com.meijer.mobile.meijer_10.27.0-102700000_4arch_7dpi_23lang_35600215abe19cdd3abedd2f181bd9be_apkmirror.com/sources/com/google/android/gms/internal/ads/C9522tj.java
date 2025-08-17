package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6521c;

/* renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9522tj extends Lc.c {
    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof C6595Bj ? (C6595Bj) iInterfaceQueryLocalInterface : new C6595Bj(iBinder);
    }

    C9522tj(Context context, Looper looper, AbstractC6521c.a aVar, AbstractC6521c.b bVar) {
        super(C6770Go.a(context), looper, 166, aVar, bVar, null);
    }

    public final C6595Bj c() throws DeadObjectException {
        return (C6595Bj) super.getService();
    }
}
