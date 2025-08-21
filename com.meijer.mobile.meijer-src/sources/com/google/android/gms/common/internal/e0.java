package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f65694a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC6646c f65695b;

    public e0(AbstractC6646c abstractC6646c, int i10) {
        this.f65695b = abstractC6646c;
        this.f65694a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC6646c abstractC6646c = this.f65695b;
        if (iBinder == null) {
            AbstractC6646c.zzk(abstractC6646c, 16);
            return;
        }
        synchronized (abstractC6646c.zzq) {
            try {
                AbstractC6646c abstractC6646c2 = this.f65695b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC6646c2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6657n)) ? new U(iBinder) : (InterfaceC6657n) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f65695b.zzl(0, null, this.f65694a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f65695b.zzq) {
            this.f65695b.zzr = null;
        }
        AbstractC6646c abstractC6646c = this.f65695b;
        int i10 = this.f65694a;
        Handler handler = abstractC6646c.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
