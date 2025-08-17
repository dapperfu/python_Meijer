package com.adobe.marketing.mobile.lifecycle;

import Q5.InterfaceC5078j;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5078j f62600a;

    /* renamed from: b, reason: collision with root package name */
    private u f62601b;

    /* renamed from: c, reason: collision with root package name */
    private w f62602c;

    private s c(long j10, long j11, boolean z10) {
        s sVar = new s();
        sVar.d(true);
        sVar.b(z10 ? t.UNKNOWN : t.CLOSE);
        sVar.j(g(j10, j11));
        return sVar;
    }

    private s d(boolean z10, boolean z11) {
        s sVar = new s();
        sVar.f(true);
        if (z10) {
            sVar.e(true);
        } else if (z11) {
            sVar.g(true);
        }
        InterfaceC5078j interfaceC5078j = this.f62600a;
        if (interfaceC5078j == null) {
            Q5.t.a("Lifecycle", "LifecycleV2MetricsBuilder", "Unable to add XDM Application data for app launch due to DeviceInfoService being not initialized.", new Object[0]);
            return sVar;
        }
        sVar.i(interfaceC5078j.c());
        sVar.c(this.f62600a.e());
        sVar.k(h.e(this.f62600a));
        sVar.h(h.d(this.f62600a.v()));
        return sVar;
    }

    private u e() {
        u uVar = this.f62601b;
        if (uVar != null) {
            return uVar;
        }
        if (this.f62600a == null) {
            Q5.t.a("Lifecycle", "LifecycleV2MetricsBuilder", "Unable to add XDM Device data due to DeviceInfoService being not initialized.", new Object[0]);
            return null;
        }
        this.f62601b = new u();
        InterfaceC5078j.b bVarN = this.f62600a.n();
        if (bVarN != null) {
            this.f62601b.f(bVarN.b());
            this.f62601b.e(bVarN.a());
        }
        this.f62601b.g(j.a(this.f62600a.h()));
        this.f62601b.c(this.f62600a.q());
        this.f62601b.d(this.f62600a.f());
        this.f62601b.b(this.f62600a.p());
        return this.f62601b;
    }

    private w f() {
        w wVar = this.f62602c;
        if (wVar != null) {
            return wVar;
        }
        if (this.f62600a == null) {
            Q5.t.a("Lifecycle", "LifecycleV2MetricsBuilder", "Unable to add XDM Environment data due to DeviceInfoService being not initialized.", new Object[0]);
            return null;
        }
        w wVar2 = new w();
        this.f62602c = wVar2;
        wVar2.b(this.f62600a.l());
        this.f62602c.f(j.b(this.f62600a.k()));
        this.f62602c.d(this.f62600a.b());
        this.f62602c.e(this.f62600a.d());
        this.f62602c.c(h.d(this.f62600a.i()));
        return this.f62602c;
    }

    private int g(long j10, long j11) {
        long j12 = 0;
        if (j10 > 0 && j11 > 0 && j11 > j10) {
            j12 = j11 - j10;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j12);
        if (seconds <= 2147483647L) {
            return (int) seconds;
        }
        return 0;
    }

    Map<String, Object> a(long j10, long j11, long j12, boolean z10) {
        y yVar = new y();
        yVar.b(c(j10, j11, z10));
        yVar.e("application.close");
        yVar.f(new Date(j11 > 0 ? j11 : j12));
        return yVar.a();
    }

    Map<String, Object> b(long j10, boolean z10, boolean z11) {
        y yVar = new y();
        yVar.b(d(z10, z11));
        yVar.c(e());
        yVar.d(f());
        yVar.e("application.launch");
        yVar.f(new Date(j10));
        return yVar.a();
    }

    o(InterfaceC5078j interfaceC5078j) {
        this.f62600a = interfaceC5078j;
        if (interfaceC5078j == null) {
            Q5.t.a("Lifecycle", "LifecycleV2MetricsBuilder", "%s (Device Info Services), while creating XDMLifecycleMetricsBuilder.", "Unexpected Null Value");
        }
    }
}
