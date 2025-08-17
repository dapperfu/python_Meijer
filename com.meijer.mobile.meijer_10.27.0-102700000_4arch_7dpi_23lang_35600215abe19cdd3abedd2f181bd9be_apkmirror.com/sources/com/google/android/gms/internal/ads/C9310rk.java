package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9310rk implements InterfaceC8455jk, InterfaceC8349ik {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9008ot f78057a;

    @Override // com.google.android.gms.internal.ads.InterfaceC8136gk
    public final /* synthetic */ void L(String str, Map map) {
        C8243hk.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final /* synthetic */ void R0(String str, JSONObject jSONObject) {
        C8243hk.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final /* synthetic */ void a(String str, String str2) {
        C8243hk.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8136gk
    public final /* synthetic */ void j(String str, JSONObject jSONObject) {
        C8243hk.b(this, str, jSONObject);
    }

    final /* synthetic */ void B(String str) {
        this.f78057a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7105Qk
    public final void H0(String str, InterfaceC7069Pi interfaceC7069Pi) {
        this.f78057a.h0(str, new C9204qk(this, interfaceC7069Pi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7105Qk
    public final void I0(String str, final InterfaceC7069Pi interfaceC7069Pi) {
        this.f78057a.o0(str, new com.google.android.gms.common.util.o() { // from class: com.google.android.gms.internal.ads.kk
            @Override // com.google.android.gms.common.util.o
            public final boolean apply(Object obj) {
                InterfaceC7069Pi interfaceC7069Pi2 = (InterfaceC7069Pi) obj;
                if (interfaceC7069Pi2 instanceof C9204qk) {
                    return ((C9204qk) interfaceC7069Pi2).f77836a.equals(interfaceC7069Pi);
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8455jk
    public final void N(String str) {
        Pc.p0.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        V(new Runnable() { // from class: com.google.android.gms.internal.ads.pk
            @Override // java.lang.Runnable
            public final void run() {
                this.f77632a.P(str2);
            }
        });
    }

    final /* synthetic */ void P(String str) {
        this.f78057a.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8455jk
    public final void i(final String str) {
        Pc.p0.k("loadHtml on adWebView from html");
        V(new Runnable() { // from class: com.google.android.gms.internal.ads.ok
            @Override // java.lang.Runnable
            public final void run() {
                this.f77415a.v(str);
            }
        });
    }

    final /* synthetic */ void q(String str) {
        this.f78057a.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8455jk
    public final void s(final String str) {
        Pc.p0.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        V(new Runnable() { // from class: com.google.android.gms.internal.ads.lk
            @Override // java.lang.Runnable
            public final void run() {
                this.f76630a.B(str);
            }
        });
    }

    final /* synthetic */ void v(String str) {
        this.f78057a.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8455jk
    public final void x0(final C9631uk c9631uk) {
        InterfaceC8156gu interfaceC8156guZzN = this.f78057a.zzN();
        Objects.requireNonNull(c9631uk);
        interfaceC8156guZzN.C0(new InterfaceC8049fu() { // from class: com.google.android.gms.internal.ads.mk
            @Override // com.google.android.gms.internal.ads.InterfaceC8049fu
            public final void zza() {
                long jA = Lc.v.c().a();
                C9631uk c9631uk2 = c9631uk;
                final long j10 = c9631uk2.f78898c;
                final ArrayList arrayList = c9631uk2.f78897b;
                arrayList.add(Long.valueOf(jA - j10));
                Pc.p0.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                HandlerC6857Jd0 handlerC6857Jd0 = Pc.D0.f25081l;
                final C7071Pk c7071Pk = c9631uk2.f78896a;
                final C7037Ok c7037Ok = c9631uk2.f78899d;
                final InterfaceC8455jk interfaceC8455jk = c9631uk2.f78900e;
                handlerC6857Jd0.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.vk
                    @Override // java.lang.Runnable
                    public final void run() {
                        c7071Pk.j(c7037Ok, interfaceC8455jk, arrayList, j10);
                    }
                }, ((Integer) Mc.A.c().a(C8659lf.f76263b)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final void zza(final String str) {
        Pc.p0.k("invokeJavascript on adWebView from js");
        V(new Runnable() { // from class: com.google.android.gms.internal.ads.nk
            @Override // java.lang.Runnable
            public final void run() {
                this.f77125a.q(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8455jk
    public final void zzc() {
        this.f78057a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8455jk
    public final boolean zzi() {
        return this.f78057a.M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8455jk
    public final C7139Rk zzj() {
        return new C7139Rk(this);
    }

    public C9310rk(Context context, Qc.a aVar, M9 m92, Lc.a aVar2) throws zzcfj {
        Lc.v.a();
        InterfaceC9008ot interfaceC9008otA = C6673Dt.a(context, C8368iu.a(), "", false, false, null, null, aVar, null, null, null, C7392Zc.a(), null, null, null, null);
        this.f78057a = interfaceC9008otA;
        interfaceC9008otA.zzF().setWillNotDraw(true);
    }

    private static final void V(Runnable runnable) {
        C4169y.b();
        if (Qc.g.w()) {
            Pc.p0.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            Pc.p0.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (!Pc.D0.f25081l.post(runnable)) {
                Qc.p.g("runOnUiThread > the runnable could not be placed to the message queue");
            }
        }
    }
}
