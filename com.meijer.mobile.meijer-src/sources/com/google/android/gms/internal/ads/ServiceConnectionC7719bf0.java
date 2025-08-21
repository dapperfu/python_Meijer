package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class ServiceConnectionC7719bf0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7932df0 f73687a;

    /* synthetic */ ServiceConnectionC7719bf0(C7932df0 c7932df0, C7825cf0 c7825cf0) {
        this.f73687a = c7932df0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f73687a.f74282c.c("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.f73687a.o(new Runnable() { // from class: com.google.android.gms.internal.ads.Ze0
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                IInterface iInterface;
                InterfaceC7717be0 interfaceC7717be0B9 = AbstractBinderC7610ae0.B9(iBinder);
                ServiceConnectionC7719bf0 serviceConnectionC7719bf0 = this.f73057a;
                serviceConnectionC7719bf0.f73687a.f74289j = interfaceC7717be0B9;
                serviceConnectionC7719bf0.f73687a.f74282c.c("linkToDeath", new Object[0]);
                try {
                    iInterface = serviceConnectionC7719bf0.f73687a.f74289j;
                } catch (RemoteException e10) {
                    serviceConnectionC7719bf0.f73687a.f74282c.b(e10, "linkToDeath failed", new Object[0]);
                }
                if (iInterface == null) {
                    throw null;
                }
                iInterface.asBinder().linkToDeath(serviceConnectionC7719bf0.f73687a.f74287h, 0);
                serviceConnectionC7719bf0.f73687a.f74285f = false;
                synchronized (serviceConnectionC7719bf0.f73687a.f74284e) {
                    try {
                        Iterator it = serviceConnectionC7719bf0.f73687a.f74284e.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        serviceConnectionC7719bf0.f73687a.f74284e.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f73687a.f74282c.c("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.f73687a.o(new Runnable() { // from class: com.google.android.gms.internal.ads.af0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC7719bf0 serviceConnectionC7719bf0 = this.f73299a;
                serviceConnectionC7719bf0.f73687a.f74282c.c("unlinkToDeath", new Object[0]);
                IInterface iInterface = serviceConnectionC7719bf0.f73687a.f74289j;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(serviceConnectionC7719bf0.f73687a.f74287h, 0);
                serviceConnectionC7719bf0.f73687a.f74289j = null;
                serviceConnectionC7719bf0.f73687a.f74285f = false;
            }
        });
    }
}
