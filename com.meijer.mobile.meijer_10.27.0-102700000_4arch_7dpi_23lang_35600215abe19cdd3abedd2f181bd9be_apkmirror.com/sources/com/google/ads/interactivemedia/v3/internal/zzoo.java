package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6521c;

/* loaded from: classes4.dex */
public final class zzoo extends zzlr {
    private final int zze;

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public zzoo(Context context, Looper looper, AbstractC6521c.a aVar, AbstractC6521c.b bVar, int i10) {
        super(context, looper, 116, aVar, bVar, null);
        this.zze = i10;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof zzot ? (zzot) iInterfaceQueryLocalInterface : new zzot(iBinder);
    }

    public final zzot zzp() throws DeadObjectException {
        return (zzot) super.getService();
    }
}
