package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9435rk implements InterfaceC8580jk, InterfaceC8474ik {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9133ot f78897a;

    @Override // com.google.android.gms.internal.ads.InterfaceC8261gk
    public final /* synthetic */ void L(String str, Map map) {
        C8368hk.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final /* synthetic */ void R0(String str, JSONObject jSONObject) {
        C8368hk.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final /* synthetic */ void a(String str, String str2) {
        C8368hk.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8261gk
    public final /* synthetic */ void j(String str, JSONObject jSONObject) {
        C8368hk.b(this, str, jSONObject);
    }

    final /* synthetic */ void B(String str) {
        this.f78897a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7230Qk
    public final void G0(String str, InterfaceC7194Pi interfaceC7194Pi) {
        this.f78897a.h0(str, new C9329qk(this, interfaceC7194Pi));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7230Qk
    public final void H0(String str, final InterfaceC7194Pi interfaceC7194Pi) {
        this.f78897a.o0(str, new com.google.android.gms.common.util.o() { // from class: com.google.android.gms.internal.ads.kk
            @Override // com.google.android.gms.common.util.o
            public final boolean apply(Object obj) {
                InterfaceC7194Pi interfaceC7194Pi2 = (InterfaceC7194Pi) obj;
                if (interfaceC7194Pi2 instanceof C9329qk) {
                    return ((C9329qk) interfaceC7194Pi2).f78676a.equals(interfaceC7194Pi);
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8580jk
    public final void N(String str) {
        Rc.p0.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        V(new Runnable() { // from class: com.google.android.gms.internal.ads.pk
            @Override // java.lang.Runnable
            public final void run() {
                this.f78472a.P(str2);
            }
        });
    }

    final /* synthetic */ void P(String str) {
        this.f78897a.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8580jk
    public final void i(final String str) {
        Rc.p0.k("loadHtml on adWebView from html");
        V(new Runnable() { // from class: com.google.android.gms.internal.ads.ok
            @Override // java.lang.Runnable
            public final void run() {
                this.f78255a.v(str);
            }
        });
    }

    final /* synthetic */ void q(String str) {
        this.f78897a.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8580jk
    public final void s(final String str) {
        Rc.p0.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        V(new Runnable() { // from class: com.google.android.gms.internal.ads.lk
            @Override // java.lang.Runnable
            public final void run() {
                this.f77470a.B(str);
            }
        });
    }

    final /* synthetic */ void v(String str) {
        this.f78897a.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8580jk
    public final void x0(final C9756uk c9756uk) {
        InterfaceC8281gu interfaceC8281guZzN = this.f78897a.zzN();
        Objects.requireNonNull(c9756uk);
        interfaceC8281guZzN.B0(new InterfaceC8174fu() { // from class: com.google.android.gms.internal.ads.mk
            @Override // com.google.android.gms.internal.ads.InterfaceC8174fu
            public final void zza() {
                long jA = Nc.v.c().a();
                C9756uk c9756uk2 = c9756uk;
                final long j10 = c9756uk2.f79738c;
                final ArrayList arrayList = c9756uk2.f79737b;
                arrayList.add(Long.valueOf(jA - j10));
                Rc.p0.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                HandlerC6982Jd0 handlerC6982Jd0 = Rc.D0.f32295l;
                final C7196Pk c7196Pk = c9756uk2.f79736a;
                final C7162Ok c7162Ok = c9756uk2.f79739d;
                final InterfaceC8580jk interfaceC8580jk = c9756uk2.f79740e;
                handlerC6982Jd0.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.vk
                    @Override // java.lang.Runnable
                    public final void run() {
                        c7196Pk.j(c7162Ok, interfaceC8580jk, arrayList, j10);
                    }
                }, ((Integer) Oc.A.c().a(C8784lf.f77103b)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final void zza(final String str) {
        Rc.p0.k("invokeJavascript on adWebView from js");
        V(new Runnable() { // from class: com.google.android.gms.internal.ads.nk
            @Override // java.lang.Runnable
            public final void run() {
                this.f77965a.q(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8580jk
    public final void zzc() {
        this.f78897a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8580jk
    public final boolean zzi() {
        return this.f78897a.M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8580jk
    public final C7264Rk zzj() {
        return new C7264Rk(this);
    }

    public C9435rk(Context context, Sc.a aVar, M9 m92, Nc.a aVar2) throws zzcfj {
        Nc.v.a();
        InterfaceC9133ot interfaceC9133otA = C6798Dt.a(context, C8493iu.a(), "", false, false, null, null, aVar, null, null, null, C7517Zc.a(), null, null, null, null);
        this.f78897a = interfaceC9133otA;
        interfaceC9133otA.zzF().setWillNotDraw(true);
    }

    private static final void V(Runnable runnable) {
        C4447y.b();
        if (Sc.g.w()) {
            Rc.p0.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            Rc.p0.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (!Rc.D0.f32295l.post(runnable)) {
                Sc.p.g("runOnUiThread > the runnable could not be placed to the message queue");
            }
        }
    }
}
