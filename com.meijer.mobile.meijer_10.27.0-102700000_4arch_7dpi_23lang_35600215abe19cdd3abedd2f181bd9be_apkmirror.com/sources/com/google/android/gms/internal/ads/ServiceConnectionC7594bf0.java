package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ServiceConnectionC7594bf0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7807df0 f72847a;

    /* synthetic */ ServiceConnectionC7594bf0(C7807df0 c7807df0, C7700cf0 c7700cf0) {
        this.f72847a = c7807df0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f72847a.f73442c.c("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.f72847a.o(new Runnable() { // from class: com.google.android.gms.internal.ads.Ze0
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                IInterface iInterface;
                InterfaceC7592be0 interfaceC7592be0B9 = AbstractBinderC7485ae0.B9(iBinder);
                ServiceConnectionC7594bf0 serviceConnectionC7594bf0 = this.f72217a;
                serviceConnectionC7594bf0.f72847a.f73449j = interfaceC7592be0B9;
                serviceConnectionC7594bf0.f72847a.f73442c.c("linkToDeath", new Object[0]);
                try {
                    iInterface = serviceConnectionC7594bf0.f72847a.f73449j;
                } catch (RemoteException e10) {
                    serviceConnectionC7594bf0.f72847a.f73442c.b(e10, "linkToDeath failed", new Object[0]);
                }
                if (iInterface == null) {
                    throw null;
                }
                iInterface.asBinder().linkToDeath(serviceConnectionC7594bf0.f72847a.f73447h, 0);
                serviceConnectionC7594bf0.f72847a.f73445f = false;
                synchronized (serviceConnectionC7594bf0.f72847a.f73444e) {
                    try {
                        Iterator it = serviceConnectionC7594bf0.f72847a.f73444e.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        serviceConnectionC7594bf0.f72847a.f73444e.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f72847a.f73442c.c("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.f72847a.o(new Runnable() { // from class: com.google.android.gms.internal.ads.af0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC7594bf0 serviceConnectionC7594bf0 = this.f72459a;
                serviceConnectionC7594bf0.f72847a.f73442c.c("unlinkToDeath", new Object[0]);
                IInterface iInterface = serviceConnectionC7594bf0.f72847a.f73449j;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(serviceConnectionC7594bf0.f72847a.f73447h, 0);
                serviceConnectionC7594bf0.f72847a.f73449j = null;
                serviceConnectionC7594bf0.f72847a.f73445f = false;
            }
        });
    }
}
