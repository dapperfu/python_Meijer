package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Dk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC6789Dk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7162Ok f67118a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC8580jk f67119b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f67120c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f67121d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7196Pk f67122e;

    RunnableC6789Dk(C7196Pk c7196Pk, C7162Ok c7162Ok, InterfaceC8580jk interfaceC8580jk, ArrayList arrayList, long j10) {
        this.f67118a = c7162Ok;
        this.f67119b = interfaceC8580jk;
        this.f67120c = arrayList;
        this.f67121d = j10;
        this.f67122e = c7196Pk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Rc.p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.f67122e.f70244a) {
            try {
                Rc.p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.f67118a.a() != -1 && this.f67118a.a() != 1) {
                    if (((Boolean) Oc.A.c().a(C8784lf.f76748B7)).booleanValue()) {
                        this.f67118a.d(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.f67118a.c();
                    }
                    Xj0 xj0 = C7033Kq.f69019f;
                    final InterfaceC8580jk interfaceC8580jk = this.f67119b;
                    Objects.requireNonNull(interfaceC8580jk);
                    xj0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ck
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC8580jk.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(Oc.A.c().a(C8784lf.f77117c));
                    int iA = this.f67118a.a();
                    int i10 = this.f67122e.f70252i;
                    if (this.f67120c.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.f67120c.get(0));
                    }
                    Rc.p0.k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iA + ". Update status(fullLoadTimeout) is " + i10 + str + " ms. Total latency(fullLoadTimeout) is " + (Nc.v.c().a() - this.f67121d) + " ms at timeout. Rejecting.");
                    Rc.p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                Rc.p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
