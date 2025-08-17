package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f64854a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC6521c f64855b;

    public e0(AbstractC6521c abstractC6521c, int i10) {
        this.f64855b = abstractC6521c;
        this.f64854a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC6521c abstractC6521c = this.f64855b;
        if (iBinder == null) {
            AbstractC6521c.zzk(abstractC6521c, 16);
            return;
        }
        synchronized (abstractC6521c.zzq) {
            try {
                AbstractC6521c abstractC6521c2 = this.f64855b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC6521c2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6532n)) ? new U(iBinder) : (InterfaceC6532n) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f64855b.zzl(0, null, this.f64854a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f64855b.zzq) {
            this.f64855b.zzr = null;
        }
        AbstractC6521c abstractC6521c = this.f64855b;
        int i10 = this.f64854a;
        Handler handler = abstractC6521c.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
