package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7701bT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f73646a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.a f73647b;

    /* renamed from: c, reason: collision with root package name */
    private final Z50 f73648c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9133ot f73649d;

    /* renamed from: e, reason: collision with root package name */
    private final C9937wN f73650e;

    /* renamed from: f, reason: collision with root package name */
    private C7281Sa0 f73651f;

    public final synchronized void a(View view) {
        C7281Sa0 c7281Sa0 = this.f73651f;
        if (c7281Sa0 != null) {
            Nc.v.b().g(c7281Sa0, view);
        }
    }

    public final synchronized void b() {
        InterfaceC9133ot interfaceC9133ot;
        if (this.f73651f == null || (interfaceC9133ot = this.f73649d) == null) {
            return;
        }
        interfaceC9133ot.L("onSdkImpression", AbstractC8363hh0.d());
    }

    public final synchronized void c() {
        InterfaceC9133ot interfaceC9133ot;
        try {
            C7281Sa0 c7281Sa0 = this.f73651f;
            if (c7281Sa0 == null || (interfaceC9133ot = this.f73649d) == null) {
                return;
            }
            Iterator it = interfaceC9133ot.y().iterator();
            while (it.hasNext()) {
                Nc.v.b().g(c7281Sa0, (View) it.next());
            }
            this.f73649d.L("onSdkLoaded", AbstractC8363hh0.d());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d() {
        return this.f73651f != null;
    }

    public final synchronized boolean e(boolean z10) {
        if (this.f73648c.f72854T) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77123c5)).booleanValue()) {
                if (((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && this.f73649d != null) {
                    if (this.f73651f != null) {
                        Sc.p.g("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!Nc.v.b().c(this.f73646a)) {
                        Sc.p.g("Unable to initialize omid.");
                        return false;
                    }
                    if (this.f73648c.f72856V.b()) {
                        C7281Sa0 c7281Sa0A = Nc.v.b().a(this.f73647b, this.f73649d.zzG(), true);
                        if (((Boolean) Oc.A.c().a(C8784lf.f77179g5)).booleanValue()) {
                            C9937wN c9937wN = this.f73650e;
                            String str = c7281Sa0A != null ? "1" : "0";
                            C9830vN c9830vNA = c9937wN.a();
                            c9830vNA.b("omid_js_session_success", str);
                            c9830vNA.g();
                        }
                        if (c7281Sa0A == null) {
                            Sc.p.g("Unable to create javascript session service.");
                            return false;
                        }
                        Sc.p.f("Created omid javascript session service.");
                        this.f73651f = c7281Sa0A;
                        this.f73649d.e0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void f(C6934Ht c6934Ht) {
        C7281Sa0 c7281Sa0 = this.f73651f;
        if (c7281Sa0 == null || this.f73649d == null) {
            return;
        }
        Nc.v.b().f(c7281Sa0, c6934Ht);
        this.f73651f = null;
        this.f73649d.e0(null);
    }

    C7701bT(Context context, Sc.a aVar, Z50 z50, InterfaceC9133ot interfaceC9133ot, C9937wN c9937wN) {
        this.f73646a = context;
        this.f73647b = aVar;
        this.f73648c = z50;
        this.f73649d = interfaceC9133ot;
        this.f73650e = c9937wN;
    }
}
