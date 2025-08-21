package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.df0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7932df0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7425Wf0 f74280a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f74281b;

    /* renamed from: c, reason: collision with root package name */
    private final C8038ef0 f74282c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f74285f;

    /* renamed from: g, reason: collision with root package name */
    private final Intent f74286g;

    /* renamed from: i, reason: collision with root package name */
    private ServiceConnection f74288i;

    /* renamed from: j, reason: collision with root package name */
    private IInterface f74289j;

    /* renamed from: e, reason: collision with root package name */
    private final List f74284e = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final String f74283d = "OverlayDisplayService";

    /* renamed from: h, reason: collision with root package name */
    private final IBinder.DeathRecipient f74287h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.Ve0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f71739a.k();
        }
    };

    public final IInterface c() {
        return this.f74289j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final Runnable runnable) {
        ((Handler) this.f74280a.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.We0
            @Override // java.lang.Runnable
            public final void run() {
                this.f71975a.l(runnable);
            }
        });
    }

    public final void i(final Runnable runnable) {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.Xe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72208a.j(runnable);
            }
        });
    }

    final /* synthetic */ void j(Runnable runnable) {
        if (this.f74289j != null || this.f74285f) {
            if (!this.f74285f) {
                runnable.run();
                return;
            }
            this.f74282c.c("Waiting to bind to the service.", new Object[0]);
            synchronized (this.f74284e) {
                this.f74284e.add(runnable);
            }
            return;
        }
        this.f74282c.c("Initiate binding to the service.", new Object[0]);
        synchronized (this.f74284e) {
            this.f74284e.add(runnable);
        }
        ServiceConnectionC7719bf0 serviceConnectionC7719bf0 = new ServiceConnectionC7719bf0(this, null);
        this.f74288i = serviceConnectionC7719bf0;
        this.f74285f = true;
        if (this.f74281b.bindService(this.f74286g, serviceConnectionC7719bf0, 1)) {
            return;
        }
        this.f74282c.c("Failed to bind to the service.", new Object[0]);
        this.f74285f = false;
        synchronized (this.f74284e) {
            this.f74284e.clear();
        }
    }

    final /* synthetic */ void k() {
        this.f74282c.c("%s : Binder has died.", this.f74283d);
        synchronized (this.f74284e) {
            this.f74284e.clear();
        }
    }

    final /* synthetic */ void m() {
        if (this.f74289j != null) {
            this.f74282c.c("Unbind from service.", new Object[0]);
            Context context = this.f74281b;
            ServiceConnection serviceConnection = this.f74288i;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.f74285f = false;
            this.f74289j = null;
            this.f74288i = null;
            synchronized (this.f74284e) {
                this.f74284e.clear();
            }
        }
    }

    public final void n() {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.Ye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72428a.m();
            }
        });
    }

    C7932df0(Context context, C8038ef0 c8038ef0, String str, Intent intent, C6916He0 c6916He0) {
        this.f74281b = context;
        this.f74282c = c8038ef0;
        final String str2 = "OverlayDisplayService";
        this.f74286g = intent;
        this.f74280a = C7614ag0.a(new InterfaceC7425Wf0(str2) { // from class: com.google.android.gms.internal.ads.Ue0

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f71484a = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                HandlerThread handlerThread = new HandlerThread(this.f71484a, 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    final /* synthetic */ void l(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            this.f74282c.a("error caused by ", e10);
        }
    }
}
