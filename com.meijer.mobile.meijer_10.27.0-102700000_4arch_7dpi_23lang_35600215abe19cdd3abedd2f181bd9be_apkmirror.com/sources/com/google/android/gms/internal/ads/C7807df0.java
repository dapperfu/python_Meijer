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
final class C7807df0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7300Wf0 f73440a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f73441b;

    /* renamed from: c, reason: collision with root package name */
    private final C7913ef0 f73442c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f73445f;

    /* renamed from: g, reason: collision with root package name */
    private final Intent f73446g;

    /* renamed from: i, reason: collision with root package name */
    private ServiceConnection f73448i;

    /* renamed from: j, reason: collision with root package name */
    private IInterface f73449j;

    /* renamed from: e, reason: collision with root package name */
    private final List f73444e = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final String f73443d = "OverlayDisplayService";

    /* renamed from: h, reason: collision with root package name */
    private final IBinder.DeathRecipient f73447h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.Ve0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f70899a.k();
        }
    };

    public final IInterface c() {
        return this.f73449j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final Runnable runnable) {
        ((Handler) this.f73440a.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.We0
            @Override // java.lang.Runnable
            public final void run() {
                this.f71135a.l(runnable);
            }
        });
    }

    public final void i(final Runnable runnable) {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.Xe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f71368a.j(runnable);
            }
        });
    }

    final /* synthetic */ void j(Runnable runnable) {
        if (this.f73449j != null || this.f73445f) {
            if (!this.f73445f) {
                runnable.run();
                return;
            }
            this.f73442c.c("Waiting to bind to the service.", new Object[0]);
            synchronized (this.f73444e) {
                this.f73444e.add(runnable);
            }
            return;
        }
        this.f73442c.c("Initiate binding to the service.", new Object[0]);
        synchronized (this.f73444e) {
            this.f73444e.add(runnable);
        }
        ServiceConnectionC7594bf0 serviceConnectionC7594bf0 = new ServiceConnectionC7594bf0(this, null);
        this.f73448i = serviceConnectionC7594bf0;
        this.f73445f = true;
        if (this.f73441b.bindService(this.f73446g, serviceConnectionC7594bf0, 1)) {
            return;
        }
        this.f73442c.c("Failed to bind to the service.", new Object[0]);
        this.f73445f = false;
        synchronized (this.f73444e) {
            this.f73444e.clear();
        }
    }

    final /* synthetic */ void k() {
        this.f73442c.c("%s : Binder has died.", this.f73443d);
        synchronized (this.f73444e) {
            this.f73444e.clear();
        }
    }

    final /* synthetic */ void m() {
        if (this.f73449j != null) {
            this.f73442c.c("Unbind from service.", new Object[0]);
            Context context = this.f73441b;
            ServiceConnection serviceConnection = this.f73448i;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.f73445f = false;
            this.f73449j = null;
            this.f73448i = null;
            synchronized (this.f73444e) {
                this.f73444e.clear();
            }
        }
    }

    public final void n() {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.Ye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f71588a.m();
            }
        });
    }

    C7807df0(Context context, C7913ef0 c7913ef0, String str, Intent intent, C6791He0 c6791He0) {
        this.f73441b = context;
        this.f73442c = c7913ef0;
        final String str2 = "OverlayDisplayService";
        this.f73446g = intent;
        this.f73440a = C7489ag0.a(new InterfaceC7300Wf0(str2) { // from class: com.google.android.gms.internal.ads.Ue0

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f70644a = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.InterfaceC7300Wf0
            public final Object zza() {
                HandlerThread handlerThread = new HandlerThread(this.f70644a, 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    final /* synthetic */ void l(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            this.f73442c.a("error caused by ", e10);
        }
    }
}
