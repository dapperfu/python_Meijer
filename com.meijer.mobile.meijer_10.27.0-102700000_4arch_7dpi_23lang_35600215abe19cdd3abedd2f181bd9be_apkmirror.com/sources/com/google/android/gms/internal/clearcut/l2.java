package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6526h;
import com.google.android.gms.common.internal.C6523e;

/* loaded from: classes6.dex */
public final class l2 extends AbstractC6526h<p2> {
    public l2(Context context, Looper looper, C6523e c6523e, e.a aVar, e.b bVar) {
        super(context, looper, 40, c6523e, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof p2 ? (p2) iInterfaceQueryLocalInterface : new q2(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
