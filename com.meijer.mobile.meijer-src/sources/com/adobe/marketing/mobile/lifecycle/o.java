package com.adobe.marketing.mobile.lifecycle;

import R5.InterfaceC5123j;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5123j f63439a;

    /* renamed from: b, reason: collision with root package name */
    private u f63440b;

    /* renamed from: c, reason: collision with root package name */
    private w f63441c;

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
        InterfaceC5123j interfaceC5123j = this.f63439a;
        if (interfaceC5123j == null) {
            R5.t.a("Lifecycle", "LifecycleV2MetricsBuilder", "Unable to add XDM Application data for app launch due to DeviceInfoService being not initialized.", new Object[0]);
            return sVar;
        }
        sVar.i(interfaceC5123j.c());
        sVar.c(this.f63439a.e());
        sVar.k(h.e(this.f63439a));
        sVar.h(h.d(this.f63439a.v()));
        return sVar;
    }

    private u e() {
        u uVar = this.f63440b;
        if (uVar != null) {
            return uVar;
        }
        if (this.f63439a == null) {
            R5.t.a("Lifecycle", "LifecycleV2MetricsBuilder", "Unable to add XDM Device data due to DeviceInfoService being not initialized.", new Object[0]);
            return null;
        }
        this.f63440b = new u();
        InterfaceC5123j.b bVarN = this.f63439a.n();
        if (bVarN != null) {
            this.f63440b.f(bVarN.b());
            this.f63440b.e(bVarN.a());
        }
        this.f63440b.g(j.a(this.f63439a.h()));
        this.f63440b.c(this.f63439a.q());
        this.f63440b.d(this.f63439a.f());
        this.f63440b.b(this.f63439a.p());
        return this.f63440b;
    }

    private w f() {
        w wVar = this.f63441c;
        if (wVar != null) {
            return wVar;
        }
        if (this.f63439a == null) {
            R5.t.a("Lifecycle", "LifecycleV2MetricsBuilder", "Unable to add XDM Environment data due to DeviceInfoService being not initialized.", new Object[0]);
            return null;
        }
        w wVar2 = new w();
        this.f63441c = wVar2;
        wVar2.b(this.f63439a.l());
        this.f63441c.f(j.b(this.f63439a.k()));
        this.f63441c.d(this.f63439a.b());
        this.f63441c.e(this.f63439a.d());
        this.f63441c.c(h.d(this.f63439a.i()));
        return this.f63441c;
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

    o(InterfaceC5123j interfaceC5123j) {
        this.f63439a = interfaceC5123j;
        if (interfaceC5123j == null) {
            R5.t.a("Lifecycle", "LifecycleV2MetricsBuilder", "%s (Device Info Services), while creating XDMLifecycleMetricsBuilder.", "Unexpected Null Value");
        }
    }
}
