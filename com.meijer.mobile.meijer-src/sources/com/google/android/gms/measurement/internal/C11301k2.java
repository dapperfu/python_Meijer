package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6646c;

/* renamed from: com.google.android.gms.measurement.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11301k2 extends AbstractC6646c {
    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }

    public C11301k2(Context context, Looper looper, AbstractC6646c.a aVar, AbstractC6646c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4672d ? (InterfaceC4672d) iInterfaceQueryLocalInterface : new C11253e2(iBinder);
    }
}
