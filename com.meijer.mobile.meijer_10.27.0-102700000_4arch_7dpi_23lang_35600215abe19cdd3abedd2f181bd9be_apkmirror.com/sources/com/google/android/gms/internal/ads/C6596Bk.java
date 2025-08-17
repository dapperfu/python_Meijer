package com.google.android.gms.internal.ads;

import Pc.C4557a0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6596Bk implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8455jk f65573a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4557a0 f65574b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7071Pk f65575c;

    C6596Bk(C7071Pk c7071Pk, M9 m92, InterfaceC8455jk interfaceC8455jk, C4557a0 c4557a0) {
        this.f65573a = interfaceC8455jk;
        this.f65574b = c4557a0;
        this.f65575c = c7071Pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        Pc.p0.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.f65575c.f69404a) {
            try {
                Pc.p0.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                Qc.p.f("JS Engine is requesting an update");
                if (this.f65575c.f69412i == 0) {
                    Qc.p.f("Starting reload.");
                    this.f65575c.f69412i = 2;
                    this.f65575c.d(null);
                }
                this.f65573a.I0("/requestReload", (InterfaceC7069Pi) this.f65574b.a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Pc.p0.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
