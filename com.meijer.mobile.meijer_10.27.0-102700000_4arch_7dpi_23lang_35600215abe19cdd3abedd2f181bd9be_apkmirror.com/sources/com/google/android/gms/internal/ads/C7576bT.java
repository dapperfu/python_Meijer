package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7576bT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72806a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.a f72807b;

    /* renamed from: c, reason: collision with root package name */
    private final Z50 f72808c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9008ot f72809d;

    /* renamed from: e, reason: collision with root package name */
    private final C9812wN f72810e;

    /* renamed from: f, reason: collision with root package name */
    private C7156Sa0 f72811f;

    public final synchronized void a(View view) {
        C7156Sa0 c7156Sa0 = this.f72811f;
        if (c7156Sa0 != null) {
            Lc.v.b().g(c7156Sa0, view);
        }
    }

    public final synchronized void b() {
        InterfaceC9008ot interfaceC9008ot;
        if (this.f72811f == null || (interfaceC9008ot = this.f72809d) == null) {
            return;
        }
        interfaceC9008ot.L("onSdkImpression", AbstractC8238hh0.d());
    }

    public final synchronized void c() {
        InterfaceC9008ot interfaceC9008ot;
        try {
            C7156Sa0 c7156Sa0 = this.f72811f;
            if (c7156Sa0 == null || (interfaceC9008ot = this.f72809d) == null) {
                return;
            }
            Iterator it = interfaceC9008ot.y().iterator();
            while (it.hasNext()) {
                Lc.v.b().g(c7156Sa0, (View) it.next());
            }
            this.f72809d.L("onSdkLoaded", AbstractC8238hh0.d());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d() {
        return this.f72811f != null;
    }

    public final synchronized boolean e(boolean z10) {
        if (this.f72808c.f72014T) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76283c5)).booleanValue()) {
                if (((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && this.f72809d != null) {
                    if (this.f72811f != null) {
                        Qc.p.g("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!Lc.v.b().b(this.f72806a)) {
                        Qc.p.g("Unable to initialize omid.");
                        return false;
                    }
                    if (this.f72808c.f72016V.b()) {
                        C7156Sa0 c7156Sa0F = Lc.v.b().f(this.f72807b, this.f72809d.zzG(), true);
                        if (((Boolean) Mc.A.c().a(C8659lf.f76339g5)).booleanValue()) {
                            C9812wN c9812wN = this.f72810e;
                            String str = c7156Sa0F != null ? "1" : "0";
                            C9705vN c9705vNA = c9812wN.a();
                            c9705vNA.b("omid_js_session_success", str);
                            c9705vNA.g();
                        }
                        if (c7156Sa0F == null) {
                            Qc.p.g("Unable to create javascript session service.");
                            return false;
                        }
                        Qc.p.f("Created omid javascript session service.");
                        this.f72811f = c7156Sa0F;
                        this.f72809d.f0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void f(C6809Ht c6809Ht) {
        C7156Sa0 c7156Sa0 = this.f72811f;
        if (c7156Sa0 == null || this.f72809d == null) {
            return;
        }
        Lc.v.b().e(c7156Sa0, c6809Ht);
        this.f72811f = null;
        this.f72809d.f0(null);
    }

    C7576bT(Context context, Qc.a aVar, Z50 z50, InterfaceC9008ot interfaceC9008ot, C9812wN c9812wN) {
        this.f72806a = context;
        this.f72807b = aVar;
        this.f72808c = z50;
        this.f72809d = interfaceC9008ot;
        this.f72810e = c9812wN;
    }
}
