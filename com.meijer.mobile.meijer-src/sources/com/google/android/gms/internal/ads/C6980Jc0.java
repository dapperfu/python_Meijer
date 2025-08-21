package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6646c;

/* renamed from: com.google.android.gms.internal.ads.Jc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6980Jc0 extends Nc.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f68787a;

    @Override // com.google.android.gms.common.internal.AbstractC6646c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return this.f68787a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public C6980Jc0(Context context, Looper looper, AbstractC6646c.a aVar, AbstractC6646c.b bVar, int i10) {
        super(context, looper, 116, aVar, bVar, null);
        this.f68787a = i10;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof C7149Oc0 ? (C7149Oc0) iInterfaceQueryLocalInterface : new C7149Oc0(iBinder);
    }

    public final C7149Oc0 c() throws DeadObjectException {
        return (C7149Oc0) super.getService();
    }
}
