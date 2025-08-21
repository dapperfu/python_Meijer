package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes4.dex */
public final class d0 extends T {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC6646c f65677a;

    /* renamed from: b, reason: collision with root package name */
    private final int f65678b;

    @Override // com.google.android.gms.common.internal.InterfaceC6656m
    public final void D6(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC6656m
    public final void d9(int i10, IBinder iBinder, h0 h0Var) {
        AbstractC6646c abstractC6646c = this.f65677a;
        r.m(abstractC6646c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        r.l(h0Var);
        AbstractC6646c.zzj(abstractC6646c, h0Var);
        k3(i10, iBinder, h0Var.f65721a);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC6656m
    public final void k3(int i10, IBinder iBinder, Bundle bundle) {
        r.m(this.f65677a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f65677a.onPostInitHandler(i10, iBinder, bundle, this.f65678b);
        this.f65677a = null;
    }

    public d0(AbstractC6646c abstractC6646c, int i10) {
        this.f65677a = abstractC6646c;
        this.f65678b = i10;
    }
}
