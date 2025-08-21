package com.google.android.gms.internal.ads;

import Rc.C5178a0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6721Bk implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8580jk f66413a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5178a0 f66414b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7196Pk f66415c;

    C6721Bk(C7196Pk c7196Pk, M9 m92, InterfaceC8580jk interfaceC8580jk, C5178a0 c5178a0) {
        this.f66413a = interfaceC8580jk;
        this.f66414b = c5178a0;
        this.f66415c = c7196Pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Rc.p0.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.f66415c.f70244a) {
            try {
                Rc.p0.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                Sc.p.f("JS Engine is requesting an update");
                if (this.f66415c.f70252i == 0) {
                    Sc.p.f("Starting reload.");
                    this.f66415c.f70252i = 2;
                    this.f66415c.d(null);
                }
                this.f66413a.H0("/requestReload", (InterfaceC7194Pi) this.f66414b.a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Rc.p0.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
