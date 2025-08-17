package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Dk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC6664Dk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7037Ok f66278a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8455jk f66279b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f66280c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f66281d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7071Pk f66282e;

    RunnableC6664Dk(C7071Pk c7071Pk, C7037Ok c7037Ok, InterfaceC8455jk interfaceC8455jk, ArrayList arrayList, long j10) {
        this.f66278a = c7037Ok;
        this.f66279b = interfaceC8455jk;
        this.f66280c = arrayList;
        this.f66281d = j10;
        this.f66282e = c7071Pk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Pc.p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.f66282e.f69404a) {
            try {
                Pc.p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.f66278a.a() != -1 && this.f66278a.a() != 1) {
                    if (((Boolean) Mc.A.c().a(C8659lf.f75908B7)).booleanValue()) {
                        this.f66278a.d(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.f66278a.c();
                    }
                    Xj0 xj0 = C6908Kq.f68179f;
                    final InterfaceC8455jk interfaceC8455jk = this.f66279b;
                    Objects.requireNonNull(interfaceC8455jk);
                    xj0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ck
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC8455jk.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(Mc.A.c().a(C8659lf.f76277c));
                    int iA = this.f66278a.a();
                    int i10 = this.f66282e.f69412i;
                    if (this.f66280c.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.f66280c.get(0));
                    }
                    Pc.p0.k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iA + ". Update status(fullLoadTimeout) is " + i10 + str + " ms. Total latency(fullLoadTimeout) is " + (Lc.v.c().a() - this.f66281d) + " ms at timeout. Rejecting.");
                    Pc.p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                Pc.p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
