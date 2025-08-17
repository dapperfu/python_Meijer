package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes4.dex */
public final class d0 extends T {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC6521c f64837a;

    /* renamed from: b, reason: collision with root package name */
    private final int f64838b;

    @Override // com.google.android.gms.common.internal.InterfaceC6531m
    public final void c9(int i10, IBinder iBinder, h0 h0Var) {
        AbstractC6521c abstractC6521c = this.f64837a;
        r.m(abstractC6521c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        r.l(h0Var);
        AbstractC6521c.zzj(abstractC6521c, h0Var);
        e3(i10, iBinder, h0Var.f64881a);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC6531m
    public final void e3(int i10, IBinder iBinder, Bundle bundle) {
        r.m(this.f64837a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f64837a.onPostInitHandler(i10, iBinder, bundle, this.f64838b);
        this.f64837a = null;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC6531m
    public final void n6(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public d0(AbstractC6521c abstractC6521c, int i10) {
        this.f64837a = abstractC6521c;
        this.f64838b = i10;
    }
}
